package com.afriland.cbsobjects.services;

import com.afriland.cbsobjects.responses.CustomerPhoneNumberResponse;
import com.afriland.cbsobjects.responses.cbs.ClientResponse;
import com.afriland.cbsobjects.responses.cbs.customer.CustomerPhoneNumber;
import org.springframework.http.ResponseEntity;

public interface ICustomerPhoneList {
    ResponseEntity<CustomerPhoneNumberResponse> getCustomerPhoneList(String codeclient);
}
