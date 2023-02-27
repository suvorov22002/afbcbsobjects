package com.afriland.cbsobjects.services;

import com.afriland.cbsobjects.responses.CustomerLeaderServicesResponse;
import org.springframework.http.ResponseEntity;

public interface ICustomerLeaderServices {

    public ResponseEntity<CustomerLeaderServicesResponse> getCustomerLeaderDetail(String codeclient);

}
