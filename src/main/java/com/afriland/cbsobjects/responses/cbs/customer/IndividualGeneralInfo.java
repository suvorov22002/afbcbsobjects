package com.afriland.cbsobjects.responses.cbs.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class IndividualGeneralInfo {
    protected String firstname;
    protected Object middlename;
    protected Object thirdname;
    protected FamilyStatusCode familyStatusCode;
    protected HolderLegalCapacity holderLegalCapacity;
}
