package com.afriland.cbsobjects.responses.cbs.customer;

import com.afriland.cbsobjects.responses.cbs.customer.Body;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name="Envelope", namespace="http://schemas.xmlsoap.org/soap/envelope/")
//@XmlRootElement(name="Envelope")
public class Envelope implements Serializable {
    public com.afriland.cbsobjects.responses.cbs.customer.Body Body;

    public Envelope() {
    }

    public Envelope(Body body) {
        Body = body;
    }

    @XmlElement(name="Body")
    public Body getBody() {
        return Body;
    }

    public void setBody(Body body) {
        Body = body;
    }

    @Override
    public String toString() {
        return "Envelope{" +
                "Body=" + Body +
                '}';
    }
}
