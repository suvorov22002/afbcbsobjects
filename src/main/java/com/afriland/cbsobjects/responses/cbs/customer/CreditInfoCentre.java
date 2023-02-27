package com.afriland.cbsobjects.responses.cbs.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditInfoCentre {
    protected CustomerRelationshipRisk customerRelationshipRisk;
    protected String validationDateOfCustomerRelationshipRisk;
    protected String userCodewhoValidatedcustomerRelationshipRisk;
    protected int creditInfoCentreRegistrationNumber;
    protected String creditInfoCentreKey;

    protected String creditInfoCentreCodeToDeclare;
}
