package com.afriland.cbsobjects.responses.cbs.customer;

import lombok.Data;

import java.util.Date;

@Data
public class AdditionnalInformation {
    protected String DeletionCode;
    protected String UserWhoCreated;
    protected String UserWhoInitiated;
    protected String CreationDate;
    protected String LastModificationDate;
    protected int ModificationSheetNumber;
    protected String RealTimeTransferCode;
}
