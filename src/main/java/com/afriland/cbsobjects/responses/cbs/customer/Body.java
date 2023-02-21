package com.afriland.cbsobjects.responses.cbs.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
@XmlAccessorType(XmlAccessType.FIELD)
public class Body implements Serializable {
    @XmlElement(name="getCustomerDetailRequestFlow")
    public GetCustomerDetailResponseFlow getCustomerDetailResponseFlow;

    public GetCustomerDetailResponseFlow getGetCustomerDetailResponseFlow() {
        return getCustomerDetailResponseFlow;
    }

    public void setGetCustomerDetailResponseFlow(GetCustomerDetailResponseFlow getCustomerDetailResponseFlow) {
        this.getCustomerDetailResponseFlow = getCustomerDetailResponseFlow;
    }

    @Override
    public String toString() {
        return "Body{" +
                "getCustomerDetailResponseFlow=" + getCustomerDetailResponseFlow +
                '}';
    }
}
