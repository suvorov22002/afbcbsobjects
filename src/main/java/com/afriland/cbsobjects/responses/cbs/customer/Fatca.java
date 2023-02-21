package com.afriland.cbsobjects.responses.cbs.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Fatca {
    public FatcaStatus FatcaStatus;
    public com.afriland.cbsobjects.responses.cbs.customer.CrsStatus CrsStatus;
}
