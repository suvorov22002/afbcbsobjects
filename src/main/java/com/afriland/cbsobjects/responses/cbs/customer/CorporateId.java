package com.afriland.cbsobjects.responses.cbs.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CorporateId {
    public Object nationalIdentifier;
    public Object socialIdentityNumber;
    public Object taxIdentityNumber;
    public String abbreviation;
}
