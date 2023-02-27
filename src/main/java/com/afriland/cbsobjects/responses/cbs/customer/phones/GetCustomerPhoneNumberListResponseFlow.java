package com.afriland.cbsobjects.responses.cbs.customer.phones;

import com.afriland.cbsobjects.responses.cbs.customer.GetCustomerPhoneNumberListResponse;
import com.afriland.cbsobjects.responses.cbs.customer.ResponseHeader;
import com.afriland.cbsobjects.responses.cbs.customer.ResponseStatus;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerDetailResponseFlow", propOrder = {
        "responseHeader",
        "responseStatus",
        "getCustomerPhoneNumberListResponse"
})
public class GetCustomerPhoneNumberListResponseFlow {

    @XmlElement(required = true)
    protected ResponseHeader responseHeader;
    @XmlElement(required = true)
    protected ResponseStatus responseStatus;
    protected GetCustomerPhoneNumberListResponse getCustomerPhoneNumberListResponse;
}
