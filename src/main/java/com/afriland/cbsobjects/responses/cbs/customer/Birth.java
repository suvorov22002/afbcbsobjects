package com.afriland.cbsobjects.responses.cbs.customer;

import lombok.Data;

@Data
public class Birth {
    protected String holderSex;
    protected Object maidenName;
    protected String birthDate;
    protected String birthCity;
    protected String birthCounty;
    protected Object birthRegion;
    protected BirthCountry birthCountry;
    protected Object birthTownCode;
}
