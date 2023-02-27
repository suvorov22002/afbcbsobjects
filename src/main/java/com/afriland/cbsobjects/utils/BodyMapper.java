package com.afriland.cbsobjects.utils;

import com.afriland.cbsobjects.responses.cbs.customer.Envelope;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

@Slf4j
public class BodyMapper {

    public static <T> T responseBody(String contentResponse) {

        try{
            Path archDirVenti = Paths.get("uploads", "customerResponseTyp3.xml");
            File file = new File(archDirVenti.toUri());
            contentResponse = Files.readString(archDirVenti);

//            contentResponse.stripLeading();
//            contentResponse.stripTrailing();

            JacksonXmlModule module = new JacksonXmlModule();
            module.setDefaultUseWrapper(false);
            XmlMapper xmlMapper = new XmlMapper(module);
            xmlMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT,DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY );
            xmlMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

            Envelope envelope = xmlMapper.readValue(contentResponse, Envelope.class);

            Optional<T> optBody = (Optional<T>) Optional.ofNullable(envelope.getBody());

            if(!optBody.isEmpty()) {
                T body = optBody.get();
                return body;
            }

        }
        catch(Exception e){
            log.error(e.getMessage());
        }

        return null;

    }
}
