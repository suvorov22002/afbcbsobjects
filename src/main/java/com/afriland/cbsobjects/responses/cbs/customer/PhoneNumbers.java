package com.afriland.cbsobjects.responses.cbs.customer;

import lombok.Data;

import java.util.List;

@Data
public class PhoneNumbers {
    protected List<CustomerPhoneNumber> customerPhoneNumber;
}
