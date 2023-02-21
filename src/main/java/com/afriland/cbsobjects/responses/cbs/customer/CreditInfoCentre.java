package com.afriland.cbsobjects.responses.cbs.customer;

import lombok.Data;

@Data
public class CreditInfoCentre {
    protected CustomerRelationshipRisk customerRelationshipRisk;
    protected String validationDateOfCustomerRelationshipRisk;
    protected String userCodewhoValidatedcustomerRelationshipRisk;
    protected int creditInfoCentreRegistrationNumber;
    protected Object creditInfoCentreKey;
}
