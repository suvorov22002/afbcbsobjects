package com.afriland.cbsobjects.responses.cbs.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LegalInformation {
    public String tradeRegisterNumber;
    public String tradeRegisterDeliveryPlace;
    public String licenseNumber;
    public String deliveryDateOfTradeRegister;
    public String validityDateOfLicense;
}
