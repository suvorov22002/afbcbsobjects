package com.afriland.cbsobjects.implementations;


import com.afriland.cbsobjects.dtos.others.TokenCBS;
import com.afriland.cbsobjects.enums.MessageResponse;
import com.afriland.cbsobjects.responses.DataResponse;
import com.afriland.cbsobjects.services.ITokenServices;
import com.afriland.cbsobjects.utils.CustomClientHttpRequestFactory;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

@Service("tokenservice")
@Transactional
public class TokenServices implements ITokenServices {

    private final Environment env = null;

    @Value("${url.token}")
    private String url_token;

    @Value("${client.id}")
    private String client_id;

    @Value("${client.secret}")
    private String client_secret;

    @Value("${scope}")
    private String scope;


    public ResponseEntity<DataResponse> getToken() {
        String result = "";

        try {
            //*** getParameterSevrvice();

            String check = checkBuildedCurrentObject();
            if (StringUtils.isNotBlank(check)) {
                return new ResponseEntity<>(new DataResponse(Integer.toString(HttpStatus.PRECONDITION_FAILED.value()), HttpStatus.PRECONDITION_FAILED.getReasonPhrase() + " : " + check, "", result), HttpStatus.PRECONDITION_FAILED);
            }

            RestTemplate restTemplate = new RestTemplate(new CustomClientHttpRequestFactory(1200, 1200, true));
            // create headers
            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Type", "application/x-www-form-urlencoded");

            String input = "grant_type=client_credentials&client_id="+client_id+"&client_secret="+client_secret+"&scope="+scope;

            HttpEntity<String> request = new HttpEntity<String>(input, headers);

            // send POST request
            ResponseEntity<TokenCBS> response = restTemplate.postForEntity(url_token, request, TokenCBS.class);

            TokenCBS token = response.getBody();
            result = token.getAccess_token();

            if (StringUtils.isNotBlank(result)) {
                return new ResponseEntity<DataResponse>(new DataResponse(Integer.toString(HttpStatus.OK.value()), HttpStatus.OK.getReasonPhrase() + " : " + MessageResponse.SUCCESSFULL_OPERATION, "", result), HttpStatus.OK);
            }
            return new ResponseEntity<DataResponse>(new DataResponse(Integer.toString(HttpStatus.NOT_IMPLEMENTED.value()), HttpStatus.NOT_IMPLEMENTED.getReasonPhrase() + " : " + MessageResponse.NULL_OBJET, "", result), HttpStatus.NOT_IMPLEMENTED);

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<DataResponse>(new DataResponse(Integer.toString(HttpStatus.INTERNAL_SERVER_ERROR.value()), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), e.getMessage(), result), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    public String checkBuildedCurrentObject() {
        String result = "";

        if (StringUtils.isBlank(url_token)){
            result = MessageResponse.NULL_PROPERTY + " (url_token)";
        }
        if (StringUtils.isBlank(client_id)) {
            result = MessageResponse.NULL_PROPERTY + " (client_id)";
        }
        if (StringUtils.isBlank(client_secret)){
            result = MessageResponse.NULL_PROPERTY + " (client_secret)";
        }
        if (StringUtils.isBlank(scope)) {
            result = MessageResponse.NULL_PROPERTY + " (scope)";
        }
        return result;
    }


    public String getBaseLocation() {
        return env.getProperty("FILE_PORTAL_HOME"); //get the default config directory location
    }


    public Properties readPropertiesFile(String fileName) throws IOException {
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


    public void getParameterSevrvice() throws IOException {
        try {
            //Get parameters properties
            Properties prop = readPropertiesFile(getBaseLocation() + File.separator + "globalConfig.properties");
            url_token = prop.getProperty("url_token");
            client_id = prop.getProperty("client_id");
            client_secret = prop.getProperty("client_secret");
            scope = prop.getProperty("scope");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
