package com.afriland.cbsobjects.services;

import org.springframework.http.ResponseEntity;
import com.afriland.cbsobjects.responses.DataResponse;


public interface ITokenServices {

    public ResponseEntity<DataResponse>  getToken();

}
