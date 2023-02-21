package com.afriland.cbsobjects.implementations;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;

import com.afriland.cbsobjects.dtos.customer.Client;
import com.afriland.cbsobjects.dtos.customer.Customer;
import com.afriland.cbsobjects.enums.MessageResponse;
import com.afriland.cbsobjects.responses.CustomerResponse;
import com.afriland.cbsobjects.responses.DataResponse;
import com.afriland.cbsobjects.responses.cbs.ClientResponse;
import com.afriland.cbsobjects.responses.cbs.customer.*;
import com.afriland.cbsobjects.services.ICustomerServices;
import com.afriland.cbsobjects.services.ITokenServices;
import com.afriland.cbsobjects.utils.CustomClientHttpRequestFactory;
import com.afriland.cbsobjects.utils.DateUtil;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
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

    @Autowired
    private ITokenServices tokenService;


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

    public ResponseEntity<ClientResponse> getCustomerDetail(String codeclient){


            List<Client> responses = new ArrayList<>();

            try {
                Path archDirVenti = Paths.get("uploads", "customerResponse3.xml");
                File file = new File(archDirVenti.toUri());

                String content = Files.readString(archDirVenti);
            //    log.info("Process file content: " + content);
            //    String reduceContent = StringUtils.substringBetween(content, "<SOAP-ENV:Body>", "</SOAP-ENV:Body>");
            //    log.info("Process file reduceContent: " + reduceContent.strip());

                JacksonXmlModule module = new JacksonXmlModule();
                module.setDefaultUseWrapper(false);
                XmlMapper xmlMapper = new XmlMapper(module);
                xmlMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT,DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY );

                Envelope envelope = xmlMapper.readValue(content, Envelope.class);
                log.info("Process file value: " + new Gson().toJson(envelope));


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


                // CustomerDetailResponse
                Optional<GetCustomerDetailResponse> optGetCustomerDetailResponse = Optional.ofNullable(customerDetailResponseFlow.getGetCustomerDetailResponse());
                if(optGetCustomerDetailResponse.isEmpty()){
                    return new ResponseEntity<>(new ClientResponse(Integer.toString(HttpStatus.INTERNAL_SERVER_ERROR.value()),
                            HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), MessageResponse.NULL_OBJET.value(), responses), HttpStatus.EXPECTATION_FAILED);
                }

                GetCustomerDetailResponse customerDetailResponse = optGetCustomerDetailResponse.get();

                Client client = new Client();
                client.setMatricule(customerDetailResponse.getCustomerCode());
                client.setCustomerName(customerDetailResponse.getNameToReturn());
                client.setDepartementNaissance(customerDetailResponse.getSpecificInformation()
                        .getIndividualSpecInfo().getBirth().getBirthCounty());

                try{
                    client.setSegment(customerDetailResponse.getGeneralAttributes().getSegment().getCode());
                }
                catch(Exception e) {
                    client.setSegment("");
                }

                try{
                    List<CustomerAddressDetail> adresse = customerDetailResponse.getAddressesDetail().getCustomerAddressDetail();
                    if(!adresse.isEmpty()){

                        client.setAdresse1(adresse.get(0).getAddressLine1());
                        client.setAdresse2(adresse.get(0).getAddressLine2());
                        client.setAdresse3(adresse.get(0).getAddressLine3());

                    }
                }
                catch(Exception e){
                    client.setAdresse1("");
                    client.setAdresse2("");
                    client.setAdresse3("");
                }

                client.setProfil(customerDetailResponse.getActiveProfile().getActiveProfile().getDesignation());
                client.setCodeProfil(customerDetailResponse.getActiveProfile().getActiveProfile().getCode());

                // TODO: Add Exception catching
                client.setAgenceClient(customerDetailResponse.getGeneralAttributes().getBranchCode().getDesignation());
                client.setCodeAgenceClient(customerDetailResponse.getGeneralAttributes().getBranchCode().getCode());

                client.setSexe(customerDetailResponse.getSpecificInformation().getIndividualSpecInfo().getBirth().getHolderSex());
                client.setCodeGes(customerDetailResponse.getGeneralAttributes().getCustomerOfficer().getCode());
                client.setNomGes(customerDetailResponse.getGeneralAttributes().getCustomerOfficer().getName());
                client.setTypeClient(customerDetailResponse.getCustomerType());
                client.setTypePieceIdentite(customerDetailResponse.getSpecificInformation()
                        .getIndividualSpecInfo().getIdPaper().getType().getCode());

                // TODO: forme juridique, categorie interne, titre
                client.setFormeJuridique("");
                client.setCategorieInterne(customerDetailResponse.getGeneralAttributes().getInternalCategoryCode().getDesignation());
                client.setCodeCategorieInterne(customerDetailResponse.getGeneralAttributes().getInternalCategoryCode().getCode());

                client.setTitre(customerDetailResponse.getFreeFieldCode3().getCode());
                client.setCategorieBanqueCentrale(customerDetailResponse.getReportingAttributes().getEconomicAgentCode().getDesignation());
                client.setSecteurActivite(customerDetailResponse.getReportingAttributes().getActivityFieldCode().getDesignation());
                client.setPaysResidence(customerDetailResponse.getSituation().getCountryOfResidence().getDesignation());
                client.setUtiCreation(customerDetailResponse.getAdditionnalInformation().getUserWhoCreated());
                client.setDateCreation(DateUtil.parse(customerDetailResponse.getAdditionnalInformation().getCreationDate(),
                        DateUtil.DATE_HOUR_FORMAT_UP));
                client.setUtiModification(customerDetailResponse.getAdditionnalInformation().getUserWhoInitiated());
                client.setDateModification(DateUtil.parse(customerDetailResponse.getAdditionnalInformation().getLastModificationDate(),
                        DateUtil.DATE_HOUR_FORMAT_UP));
                client.setNomMere(customerDetailResponse.getSpecificInformation()
                        .getIndividualSpecInfo().getOtherAttributes().getHolderMotherName());
                try{
                    List<CustomerFreeAttributeDetail> customerFreeAttributeDetail =  customerDetailResponse.getFreeAttributesDetail()
                            .getCustomerFreeAttributeDetail();

                    client.setPrenomMere(customerFreeAttributeDetail.get(0).getAdditionalDataValue().getAlphanumeric());
                    client.setPrenomPere(customerFreeAttributeDetail.get(3).getAdditionalDataValue().getAlphanumeric());
                    client.setNomPere(customerFreeAttributeDetail.get(2).getAdditionalDataValue().getAlphanumeric());

                }
                catch(Exception e) {
                    client.setPrenomMere("");
                    client.setPrenomPere("");
                    client.setNomPere("");
                }

                // TODO: raison sociale
                client.setRaisonSociale("");
                client.setRaisonSociale2("");

                client.setRegistreCommerce("");
                client.setNumeroPatente("");
                client.setValiditePatente("");
                client.setGroupe("");
                client.setNumeroIdentiteSociale("");
                client.setNumeroIdentiteFiscale("");
                client.setNumeroCasier("");
                client.setEmailClient(customerDetailResponse.getEmailAdresses().getCustomerEmailAddress().getEmail());
                client.setResidence("");
                client.setPaysResidence(customerDetailResponse.getSituation().getCountryOfResidence().getDesignation());
                client.setLangue(customerDetailResponse.getLanguage().getDesignation());
                client.setIntitule(customerDetailResponse.getTitleCode().getDesignation());

                client.setNom(customerDetailResponse.getLastname());
                client.setNomSimple(customerDetailResponse.getLastname());
                client.setPrenom(customerDetailResponse.getSpecificInformation().getIndividualSpecInfo()
                        .getIndividualGeneralInfo().getFirstname());
                client.setNomJeuneFille("");
                client.setNationalite(customerDetailResponse.getSituation().getNationalityCode().getDesignation());
                client.setTypePiece(customerDetailResponse.getSpecificInformation()
                        .getIndividualSpecInfo().getIdPaper().getType().getCode());
                client.setNumeroPiece(customerDetailResponse.getSpecificInformation().getIndividualSpecInfo()
                        .getIdPaper().getIdPaperNumber());
                client.setDateDelivPiece(DateUtil.parse(customerDetailResponse.getSpecificInformation().getIndividualSpecInfo()
                        .getIdPaper().getIdPaperDeliveryDate(), DateUtil.DATE_HOUR_FORMAT_UP));
                client.setLieudelivPiece(customerDetailResponse.getSpecificInformation().getIndividualSpecInfo()
                        .getIdPaper().getIdPaperDeliveryPlace());
                client.setDateValiditePiece(DateUtil.parse(customerDetailResponse.getSpecificInformation().getIndividualSpecInfo()
                        .getIdPaper().getIdPaperValidityDate(), DateUtil.DATE_HOUR_FORMAT_UP));
                client.setDateNaissance(DateUtil.parse(customerDetailResponse.getSpecificInformation().getIndividualSpecInfo()
                        .getBirth().getBirthDate(), DateUtil.DATE_HOUR_FORMAT_UP));
                client.setVilleNaissance(customerDetailResponse.getSpecificInformation().getIndividualSpecInfo().getBirth()
                        .getBirthCity());
                client.setPaysNaiss(customerDetailResponse.getSpecificInformation().getIndividualSpecInfo().getBirth()
                        .getBirthCountry().getDesignation());

                try{
                    List<CustomerPhoneNumber> customerPhoneNumber = customerDetailResponse.getPhoneNumbers().getCustomerPhoneNumber();
                    Optional<CustomerPhoneNumber> optCustomerPhoneNumber1 = Optional.ofNullable(customerPhoneNumber.get(0));
                    Optional<CustomerPhoneNumber> optCustomerPhoneNumber2 = Optional.ofNullable(customerPhoneNumber.get(1));
                    if(!optCustomerPhoneNumber1.isEmpty()) {
                        client.setNumTelephone1(optCustomerPhoneNumber1.get().getPhoneNumber());
                    }
                    if(!optCustomerPhoneNumber2.isEmpty()) {
                        client.setNumTelephone2(optCustomerPhoneNumber2.get().getPhoneNumber());
                    }
                }
                catch(Exception e){
                    client.setNumTelephone1("");
                    client.setNumTelephone2("");
                }

                client.setTelDir("");
                client.setEmailDir("");
                client.setProfession("");
                client.setRevenu("");
                client.setRegimeMat("");
                client.setEmployeur("");
                client.setSitmat(customerDetailResponse.getSpecificInformation().getIndividualSpecInfo()
                        .getIndividualGeneralInfo().getFamilyStatusCode().getDesignation());
                // TODO request to specificInformation->individualSpecInfo->family->spouseCode
                client.setNomConjoint("");
                try {
                    client.setDateNaissanceConj(DateUtil.parse("", DateUtil.DATE_HOUR_FORMAT_UP));
                }
                catch(Exception e){
                    log.info(e.getMessage());
                }
                client.setVilleNaissanceConj("");

                // TODO: lien cotitulaires de comptes
                client.setTypeLienCotitu("");
                client.setNumCompte("");

                // TODO: raison sociale
                client.setRaisonSocial("");
                client.setSiegeSocial("");
                client.setSigle("");
                client.setSecteurActivite("");
                client.setNumImmatri("");
                client.setDateImmatri(DateUtil.parse("", DateUtil.DATE_HOUR_FORMAT_UP));
                client.setLieuImmatri("");
                client.setAutoriteImm("");
                client.setNumIdentSocial("");
                client.setNumContribuable("");
                client.setDateNumContri(DateUtil.parse("", DateUtil.DATE_HOUR_FORMAT_UP));
                client.setLieuNumContri("");
                client.setNumPatente("");
                client.setDateValPatente(DateUtil.parse("", DateUtil.DATE_HOUR_FORMAT_UP));
                client.setLieuNumPatente("");

                try{
                    client.setChiffreAffaire(Double.parseDouble(""));
                }
                catch(Exception e){
                    client.setChiffreAffaire(0.0);
                }

                try{
                    client.setEffectif(Integer.parseInt(""));
                }
                catch(Exception e){
                    client.setEffectif(0);
                }

                client.setOrigineFonds("");
                client.setTel("");
                client.setSiteWeb("");
                client.setFax("");
                client.setLocalisation1("");
                client.setLocalisation2("");
                client.setVille("");
                client.setNomContact("");
                client.setPrenomContact("");
                client.setTelContact("");
                client.setEmailContact("");
                client.setNomDir1("");
                client.setNationaliteDir1("");
                client.setTypePieceDir1("");
                client.setNumeroPieceDir1("");
                client.setLieudelivPieceDir1("");

                try{
                    client.setDateDelivPieceDir1(DateUtil.parse("", DateUtil.DATE_HOUR_FORMAT_UP));
                    client.setDateValiditePieceDir1(DateUtil.parse("", DateUtil.DATE_HOUR_FORMAT_UP));
                    client.setDateNaissanceDir1(DateUtil.parse("", DateUtil.DATE_HOUR_FORMAT_UP));
                }
                catch(Exception e) {
                    log.info(e.getMessage());
                }
                client.setVilleNaissanceDir1("");
                client.setPaysNaissDir1("");
                client.setNumTelephoneDir1("");
                client.setEmailDir1("");
                client.setIntituleDir1("");
                client.setFonctionDir1("");
                client.setNomDir2("");
                client.setNationaliteDir2("");
                client.setTypePieceDir2("");
                client.setNumeroPieceDir2("");
                client.setLieudelivPieceDir2("");

                try{
                    client.setDateDelivPieceDir2(DateUtil.parse("", DateUtil.DATE_HOUR_FORMAT_UP));
                    client.setDateValiditePieceDir2(DateUtil.parse("", DateUtil.DATE_HOUR_FORMAT_UP));
                    client.setDateNaissanceDir1(DateUtil.parse("", DateUtil.DATE_HOUR_FORMAT_UP));
                }
                catch(Exception e){
                    log.info(e.getMessage());
                }
                client.setVilleNaissanceDir2("");
                client.setPaysNaissDir2("");
                client.setNumTelephoneDir2("");
                client.setEmailDir2("");
                client.setIntituleDir2("");
                client.setFonctionDir2("");
                client.setDateDelivPieceDir1Modif("");
                client.setDateValiditePieceDir1Modif("");
                client.setDateNaissanceDir1Modif("");
                client.setDateDelivPieceDir2Modif("");
                client.setDateValiditePieceDir2Modif("");
                client.setDateNaissanceDir2Modif("");
                client.setAutresContact(new ArrayList<>());
                client.setAutresDirigeants(new ArrayList<>());

                responses.add(client);

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        return new ResponseEntity<ClientResponse>(new ClientResponse(Integer.toString(HttpStatus.OK.value()),
                HttpStatus.OK.getReasonPhrase() + " : " + MessageResponse.SUCCESSFULL_OPERATION, "", responses),
                HttpStatus.OK);
    }
    public ResponseEntity<CustomerResponse> getCustomerDetail2(String codeclient){
        List<Customer> responses = new ArrayList<>();

        try {
            String check = checkBuildedCurrentObject("getCustomerDetail", codeclient);
            if (StringUtils.isNotBlank(check)) {
                return new ResponseEntity<>(new CustomerResponse(Integer.toString(HttpStatus.PRECONDITION_FAILED.value()), HttpStatus.PRECONDITION_FAILED.getReasonPhrase() + " : " + check, "", responses), HttpStatus.PRECONDITION_FAILED);
            }

            RestTemplate restTemplate = new RestTemplate(new CustomClientHttpRequestFactory(1200, 1200, true));

            // create headers
            HttpHeaders headers = new HttpHeaders();

            // TODO: Check for a 401 after every API request
            // TODO: Get a new token - once only
            // TODO: Retry the API request - once only
            //get token
            ResponseEntity<DataResponse> responseToken = tokenService.getToken();
            DataResponse dataResponse = responseToken.getBody();
            String token = dataResponse.getData();

            System.out.println("*********** token *********** : " + token);
            headers.setBearerAuth(token);
            headers.set("SOAPAction","getCustomerDetail");
            headers.setContentType(MediaType.APPLICATION_XML);
            String xml = payloadAIFGetCustomerId(codeclient);
            System.out.println(xml);
            HttpEntity entity = new HttpEntity<String>(xml, headers);

            // send POST request
            ResponseEntity<String> response = restTemplate.exchange(url_base+"/getCustomerDetail", HttpMethod.POST, entity, String.class);
            String responseString =response.getBody();
            System.out.println("*********** responseString *********** : " + responseString);


        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<CustomerResponse>(new CustomerResponse(Integer.toString(HttpStatus.INTERNAL_SERVER_ERROR.value()), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), e.getMessage(), responses), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return null;
    }

}
