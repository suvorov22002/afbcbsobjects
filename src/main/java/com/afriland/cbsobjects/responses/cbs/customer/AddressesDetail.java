package com.afriland.cbsobjects.responses.cbs.customer;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class AddressesDetail {
    @XmlElement(name="customerAddressDetail")
    public List<CustomerAddressDetail> customerAddressDetail;


}
