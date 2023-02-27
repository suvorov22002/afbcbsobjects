package com.afriland.cbsobjects.responses.cbs.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CorporateSpecInfo {

    public CorporateGeneralInfo corporateGeneralInfo;
    public CorporateId corporateId;
    public LegalInformation legalInformation;
    public GroupAndJob groupAndJob;

}
