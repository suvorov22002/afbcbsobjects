package com.afriland.cbsobjects.implementations;

import com.afriland.cbsobjects.enums.MessageResponse;
import com.afriland.cbsobjects.responses.CustomerPhoneNumberResponse;
import com.afriland.cbsobjects.responses.cbs.ClientResponse;
import com.afriland.cbsobjects.responses.cbs.customer.GetCustomerDetailResponseFlow;
import com.afriland.cbsobjects.responses.cbs.customer.ResponseStatus;
import com.afriland.cbsobjects.responses.cbs.customer.phones.Body;
import com.afriland.cbsobjects.responses.cbs.customer.GetCustomerPhoneNumberListResponse;
import com.afriland.cbsobjects.responses.cbs.customer.phones.GetCustomerPhoneNumberListResponseFlow;
import com.afriland.cbsobjects.services.ICustomerPhoneList;
import com.afriland.cbsobjects.services.ITokenServices;
import com.afriland.cbsobjects.utils.BodyMapper;
import com.afriland.cbsobjects.utils.ObjectCustomerMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service("customerPhoneList")
public class CustomerPhoneService implements ICustomerPhoneList {

    @Value("${application.url.base}")
    private String url_base;

    @Value("${application.langue.code")
    private String langue_code;

    @Value("$application.client.id")
    private String original_name;

    @Value("${application.user.code}")
    private String user_code;

    private final ITokenServices tokenService;
    private final ObjectCustomerMapper objectCustomerMapper;

    public CustomerPhoneService(ITokenServices tokenService, ObjectCustomerMapper objectCustomerMapper){
        this.tokenService = tokenService;
        this.objectCustomerMapper = objectCustomerMapper;
    }

    private String checkBuildedCurrentObject(String method, String codeclient) {
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
        if("getCustomerPhoneNumberList".equals(method)){
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
                "<amp:getCustomerPhoneNumberListRequestFlow>\n" +
                "<amp:requestHeader>\n" +
                "<amp:requestId>1</amp:requestId>\n" +
                "<amp:serviceName>getCustomerDetail</amp:serviceName>\n" +
                "<amp:timestamp>"+dateNow+"</amp:timestamp>\n" +
                "<amp:originalName>"+original_name+"</amp:originalName>\n" +
                "<amp:languageCode>"+langue_code+"</amp:languageCode>\n" +
                "<amp:userCode>"+user_code+"</amp:userCode>\n" +
                "</amp:requestHeader>\n" +
                "<amp:getCustomerPhoneNumberListRequest>\n" +
                "<amp:customer>\n" +
                "<amp:customerNumber>" + codeclient + "</amp:customerNumber>\n" +
                "</amp:customer>\n" +
                "</amp:getCustomerPhoneNumberListRequest>\n" +
                "</amp:getCustomerPhoneNumberListRequestFlow>\n" +
                "</soapenv:Body> \n" +
                "</soapenv:Envelope>";
    }


    public ResponseEntity<CustomerPhoneNumberResponse> getCustomerPhoneMapper(String content){

        List<GetCustomerPhoneNumberListResponse> responses = new ArrayList<>();

        try{
            Body body = BodyMapper.responseBody(content);

            if(body != null) {

                Optional<GetCustomerPhoneNumberListResponseFlow> optCustomerPhoneListResponseFlow = Optional.ofNullable(body
                        .getGetCustomerPhoneNumberListResponseFlow());
                if (optCustomerPhoneListResponseFlow.isEmpty()) {
                    return new ResponseEntity<>(new CustomerPhoneNumberResponse(Integer.toString(HttpStatus.INTERNAL_SERVER_ERROR.value()),
                            HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), MessageResponse.NULL_OBJET.value(), responses),
                            HttpStatus.INTERNAL_SERVER_ERROR);
                }

                GetCustomerPhoneNumberListResponseFlow customerPhoneNumberListResponseFlow = optCustomerPhoneListResponseFlow.get();

                // ResponseStatus
                Optional<ResponseStatus> optResponseStatus = Optional.ofNullable(customerPhoneNumberListResponseFlow.getResponseStatus());
                if(optResponseStatus.isEmpty()){
                    return new ResponseEntity<>(new CustomerPhoneNumberResponse(Integer.toString(HttpStatus.INTERNAL_SERVER_ERROR.value()),
                            HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), MessageResponse.NULL_OBJET.value(), responses),
                            HttpStatus.INTERNAL_SERVER_ERROR);
                }

                ResponseStatus responseStatus = optResponseStatus.get();
                String codeStatus = responseStatus.getStatusCode();
                switch (codeStatus) {
                    case "-1":
                        return new ResponseEntity<ClientResponse>(new ClientResponse(Integer.toString(HttpStatus.INTERNAL_SERVER_ERROR.value()), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase() + " : " + MessageResponse.FAILED_OPERATION, responseStatus.getMessages().toString(), responses), HttpStatus.INTERNAL_SERVER_ERROR);
                    case "1":
                        return new ResponseEntity<ClientResponse>(new ClientResponse(Integer.toString(HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST.getReasonPhrase() + " : " + MessageResponse.FAILED_OPERATION, responseStatus.getMessages().toString(), responses), HttpStatus.BAD_REQUEST);

                }



            }
        }
        catch(Exception e){
            log.error(e.getMessage());
        }

        return null;
    }
    @Override
    public ResponseEntity<CustomerPhoneNumberResponse> getCustomerPhoneList(String codeclient) {
        return null;
    }
}
