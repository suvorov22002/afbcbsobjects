package com.afriland.cbsobjects.responses.cbs.customer.phones;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Body {
    public GetCustomerPhoneNumberListResponseFlow getCustomerPhoneNumberListResponseFlow;

}
