package com.afriland.cbsobjects.responses.cbs.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CorporateGeneralInfo {
    public String tradeNameToDeclare;
    public Object secondTradeNameToDeclare;
    public String companyCreationDate;
    public LegalFormCode legalFormCode;
    public Object statutoryAuditor1;
    public Object statutoryAuditor2;
}
