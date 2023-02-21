package com.afriland.cbsobjects.responses.cbs.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Family {
    protected String spouseType;
    protected int spouseCode;
    protected int numberOfChildren;
    protected Object customerFamilyRelationshipCode;
}
