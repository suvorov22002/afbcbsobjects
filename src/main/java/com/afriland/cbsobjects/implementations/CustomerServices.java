package com.afriland.cbsobjects.implementations;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;

import com.afriland.cbsobjects.dtos.customer.Client;
import com.afriland.cbsobjects.dtos.customer.Customer;
import com.afriland.cbsobjects.dtos.others.TokenCBS;
import com.afriland.cbsobjects.enums.MessageResponse;
import com.afriland.cbsobjects.responses.CustomerResponse;
import com.afriland.cbsobjects.responses.DataResponse;
import com.afriland.cbsobjects.responses.cbs.ClientResponse;
import com.afriland.cbsobjects.responses.cbs.customer.*;
import com.afriland.cbsobjects.services.ICustomerServices;
import com.afriland.cbsobjects.services.ITokenServices;
import com.afriland.cbsobjects.utils.CustomClientHttpRequestFactory;
import com.afriland.cbsobjects.utils.DateUtil;
import com.afriland.cbsobjects.utils.ObjectCustomerMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import org.springframework.core.env.Environment;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPMessage;

@Slf4j
@Service("customerservice")
@Transactional
public class CustomerServices implements ICustomerServices {

    private final Environment env = null;

    @Value("${url.base}")
    private String url_base;

    @Value("${langue.code}")
    private String langue_code;

    @Value("${original.name}")
    private String original_name;

    @Value("${user.code}")
    private String user_code;

    private final ITokenServices tokenService;
    private final ObjectCustomerMapper objectCustomerMapper;

    public CustomerServices(ITokenServices tokenService, ObjectCustomerMapper objectCustomerMapper){
        this.tokenService = tokenService;
        this.objectCustomerMapper = objectCustomerMapper;
    }

    public String getBaseLocation() {
        return env.getProperty("FILE_PORTAL_HOME"); //get the default config directory location
    }

    public static Properties readPropertiesFile(String fileName) throws IOException {
        FileInputStream fis = null;
        Properties prop = null;

        try {
            fis = new FileInputStream(fileName);
            prop = new Properties();
            prop.load(fis);
        } catch(FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        } finally {
            fis.close();
        }

        return prop;
    }


    public String checkBuildedCurrentObject(String method, String codeclient) {
        String result = "";

        if (StringUtils.isBlank(url_base)){
            result = MessageResponse.NULL_PROPERTY + " (url_base)";
        }
        if (StringUtils.isBlank(langue_code)) {
            result = MessageResponse.NULL_PROPERTY + " (langue_code)";
        }
        if (StringUtils.isBlank(original_name)){
            result = MessageResponse.NULL_PROPERTY + " (original_name)";
        }
        if (StringUtils.isBlank(user_code)) {
            result = MessageResponse.NULL_PROPERTY + " (user_code)";
        }
        if("getCustomerDetail".equals(method)){
            if (StringUtils.isBlank(codeclient)) {
                result = MessageResponse.NULL_PROPERTY + " (codeclient)";
            }
        }
        return result;
    }


    public String payloadAIFGetCustomerId(String codeclient) {
        String dateNow = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss").format(new Date());
        return "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:amp=\"http://soprabanking.com/amplitude\">\n" +
                "<soapenv:Header/> \n" +
                "<soapenv:Body>\n" +
                "<amp:getCustomerDetailRequestFlow>\n" +
                "<amp:requestHeader>\n" +
                "<amp:requestId>1</amp:requestId>\n" +
                "<amp:serviceName>getCustomerDetail</amp:serviceName>\n" +
                "<amp:timestamp>"+dateNow+"</amp:timestamp>\n" +
                "<amp:originalName>"+original_name+"</amp:originalName>\n" +
                "<amp:languageCode>"+langue_code+"</amp:languageCode>\n" +
                "<amp:userCode>"+user_code+"</amp:userCode>\n" +
                "</amp:requestHeader>\n" +
                "<amp:getCustomerDetailRequest>\n" +
                "<amp:customerIdentifier>\n" +
                "<amp:customerCode>" + codeclient + "</amp:customerCode>\n" +
                "</amp:customerIdentifier>\n" +
                "</amp:getCustomerDetailRequest>\n" +
                "</amp:getCustomerDetailRequestFlow>\n" +
                "</soapenv:Body> \n" +
                "</soapenv:Envelope>";
    }

    public ResponseEntity<ClientResponse> getCustomerDetailMapper(String content){

            List<Client> responses = new ArrayList<>();

            try {
                /*
                    Path archDirVenti = Paths.get("uploads", "customerResponseTyp3.xml");
                    File file = new File(archDirVenti.toUri());
                    content = Files.readString(archDirVenti);
                */

                // Removing space at the beginning and the end of responseString
                content.stripLeading();
                content.stripTrailing();

                JacksonXmlModule module = new JacksonXmlModule();
                module.setDefaultUseWrapper(false);
                XmlMapper xmlMapper = new XmlMapper(module);
                xmlMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT,DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY );
                xmlMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

                Envelope envelope = xmlMapper.readValue(content, Envelope.class);


                Optional<Body> optBody = Optional.ofNullable(envelope.getBody());
                if(optBody.isEmpty()) return new ResponseEntity<ClientResponse>(new ClientResponse(Integer.toString(HttpStatus.INTERNAL_SERVER_ERROR.value()),
                        HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), MessageResponse.NULL_OBJET.value(), responses), HttpStatus.INTERNAL_SERVER_ERROR);
                Body body = optBody.get();

                // CustomerDetailResponseFlow
                Optional<GetCustomerDetailResponseFlow> optCustomerDetailResponseFlow = Optional.ofNullable(body.getGetCustomerDetailResponseFlow());
                if (optCustomerDetailResponseFlow.isEmpty()) {
                    return new ResponseEntity<ClientResponse>(new ClientResponse(Integer.toString(HttpStatus.INTERNAL_SERVER_ERROR.value()),
                            HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), MessageResponse.NULL_OBJET.value(), responses), HttpStatus.INTERNAL_SERVER_ERROR);
                }

                GetCustomerDetailResponseFlow customerDetailResponseFlow = optCustomerDetailResponseFlow.get();

                // RequestHeader
                Optional<ResponseHeader> optionalResponseHeader = Optional.ofNullable(customerDetailResponseFlow.getResponseHeader());
                if(optionalResponseHeader.isEmpty()) {
                    return new ResponseEntity<ClientResponse>(new ClientResponse(Integer.toString(HttpStatus.INTERNAL_SERVER_ERROR.value()),
                            HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), MessageResponse.NULL_OBJET.value(), responses), HttpStatus.INTERNAL_SERVER_ERROR);
                }

                ResponseHeader responseHeader = optionalResponseHeader.get();
                //log.info(responseHeader.toString());
                log.info(new Gson().toJson(responseHeader));

                // ResponseStatus
                Optional<ResponseStatus> optResponseStatus = Optional.ofNullable(customerDetailResponseFlow.getResponseStatus());
                if(optResponseStatus.isEmpty()){
                    return new ResponseEntity<ClientResponse>(new ClientResponse(Integer.toString(HttpStatus.INTERNAL_SERVER_ERROR.value()),
                            HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), MessageResponse.NULL_OBJET.value(), responses), HttpStatus.INTERNAL_SERVER_ERROR);
                }

                ResponseStatus responseStatus = optResponseStatus.get();
                String codeStatus = responseStatus.getStatusCode();
                switch (codeStatus) {
                    case "-1":
                        return new ResponseEntity<ClientResponse>(new ClientResponse(Integer.toString(HttpStatus.INTERNAL_SERVER_ERROR.value()), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase() + " : " + MessageResponse.FAILED_OPERATION, responseStatus.getMessages().toString(), responses), HttpStatus.INTERNAL_SERVER_ERROR);
                    case "1":
                        return new ResponseEntity<ClientResponse>(new ClientResponse(Integer.toString(HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST.getReasonPhrase() + " : " + MessageResponse.FAILED_OPERATION, responseStatus.getMessages().toString(), responses), HttpStatus.BAD_REQUEST);

                }

                // CustomerDetailResponse perform
                Optional<GetCustomerDetailResponse> optGetCustomerDetailResponse = Optional.ofNullable(customerDetailResponseFlow.getGetCustomerDetailResponse());
                if(optGetCustomerDetailResponse.isEmpty()){
                    return new ResponseEntity<>(new ClientResponse(Integer.toString(HttpStatus.INTERNAL_SERVER_ERROR.value()),
                            HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), MessageResponse.NULL_OBJET.value(), responses), HttpStatus.EXPECTATION_FAILED);
                }

                GetCustomerDetailResponse customerDetailResponse = optGetCustomerDetailResponse.get();
                responses.add(objectCustomerMapper.apply(customerDetailResponse));


            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        return new ResponseEntity<ClientResponse>(new ClientResponse(Integer.toString(HttpStatus.OK.value()),
                HttpStatus.OK.getReasonPhrase() + " : " + MessageResponse.SUCCESSFULL_OPERATION, "", responses),
                HttpStatus.OK);
    }
    public ResponseEntity<ClientResponse> getCustomerDetail(String codeClient){

        List<Client> responses = new ArrayList<>();

        try {
            String check = checkBuildedCurrentObject("getCustomerDetail", codeClient);
            if (StringUtils.isNotBlank(check)) {
                return new ResponseEntity<>(new ClientResponse(Integer.toString(HttpStatus.PRECONDITION_FAILED.value()),
                        HttpStatus.PRECONDITION_FAILED.getReasonPhrase() + " : " + check, "", responses), HttpStatus.PRECONDITION_FAILED);
            }

            RestTemplate restTemplate = new RestTemplate(new CustomClientHttpRequestFactory(1200, 3000, true));
            // create headers
            HttpHeaders headers = new HttpHeaders();

            // TODO: 2- Get a new token - once only
            //get token
            ResponseEntity<DataResponse> responseToken = tokenService.getToken();
            DataResponse dataResponse = responseToken.getBody();
            String token = dataResponse.getData();
            System.out.println("*********** token *********** : " + token);

            // TODO: 3- Retry the API request - once only

            // TODO: 1- Check for a 401 after every API request

            headers.setBearerAuth(token);
            headers.set("SOAPAction","getCustomerDetail");
            headers.setContentType(MediaType.APPLICATION_XML);
            String xml = payloadAIFGetCustomerId(codeClient);
            System.out.println(xml);
            HttpEntity entity = new HttpEntity<>(xml, headers);

            // send POST request
            ResponseEntity<String> response = restTemplate.exchange(url_base+"/getCustomerDetail", HttpMethod.POST, entity, String.class);
            System.out.println("*********** response *********** : " + response);
            String responseString =response.getBody();
            System.out.println("*********** responseString *********** : " + responseString);



            return getCustomerDetailMapper(responseString);



        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<ClientResponse>(new ClientResponse(Integer.toString(HttpStatus.INTERNAL_SERVER_ERROR.value()), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), e.getMessage(), responses), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
