package com.afriland.cbsobjects.responses.cbs.customer;

import lombok.Data;

@Data
public class IdPaper {
    protected Type type;
    protected String idPaperNumber;
    protected String idPaperDeliveryDate;
    protected String idPaperDeliveryPlace;
    protected String organisationWhichDeliver;
    protected String idPaperValidityDate;
    protected Object nationalIdentifier;
}
