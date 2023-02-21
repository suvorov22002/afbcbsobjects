package com.afriland.cbsobjects.responses.cbs.customer;

import lombok.Data;

@Data
public class GeneralAttributes {
    protected BranchCode branchCode;
    protected CustomerOfficer customerOfficer;
    protected QualityCode qualityCode;
    protected boolean taxableCustomer;
    protected InternalCategoryCode internalCategoryCode;
    protected Segment segment;
    protected Object statisticNumber;
    protected Object sponsorCustomerCode;
}
