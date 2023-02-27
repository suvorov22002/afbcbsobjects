package com.afriland.cbsobjects.responses.cbs.customer;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Situation {
    public com.afriland.cbsobjects.responses.cbs.customer.NationalityCode NationalityCode;
    public com.afriland.cbsobjects.responses.cbs.customer.CountryOfResidence CountryOfResidence;
	public LegalSituation legalSituation;
	protected String applicationDateOfLegalSituation;
}
