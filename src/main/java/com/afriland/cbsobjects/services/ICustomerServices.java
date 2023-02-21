package com.afriland.cbsobjects.services;

import com.afriland.cbsobjects.dtos.customer.Customer;
import com.afriland.cbsobjects.responses.CustomerResponse;
import com.afriland.cbsobjects.responses.DataResponse;
import com.afriland.cbsobjects.responses.cbs.ClientResponse;
import org.springframework.http.ResponseEntity;

public interface ICustomerServices {

    public ResponseEntity<ClientResponse> getCustomerDetail(String codeclient);

}
