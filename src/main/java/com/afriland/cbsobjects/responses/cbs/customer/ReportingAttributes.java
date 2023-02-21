package com.afriland.cbsobjects.responses.cbs.customer;

import com.afriland.cbsobjects.responses.cbs.customer.ActivityFieldCode;
import com.afriland.cbsobjects.responses.cbs.customer.CreditInfoCentre;
import com.afriland.cbsobjects.responses.cbs.customer.EconomicAgentCode;
import lombok.Data;

@Data
public class ReportingAttributes {
    protected EconomicAgentCode economicAgentCode;
    protected ActivityFieldCode activityFieldCode;
    protected String gradingAgreement;
    protected double gradingAgreementAmount;
    protected String securityIssuer;
    protected String internationalOperationsIndicator;
    protected CreditInfoCentre creditInfoCentre;
}
