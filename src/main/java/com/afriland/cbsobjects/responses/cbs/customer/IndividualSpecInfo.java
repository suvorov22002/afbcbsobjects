package com.afriland.cbsobjects.responses.cbs.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndividualSpecInfo {
    protected IndividualGeneralInfo individualGeneralInfo;
    protected Birth birth;
    protected IdPaper idPaper;
    protected Family family;
    protected OtherAttributes otherAttributes;
}
