package com.afriland.cbsobjects.responses.cbs;

import com.afriland.cbsobjects.dtos.customer.Client;
import com.afriland.cbsobjects.dtos.customer.Customer;
import com.afriland.cbsobjects.responses.ResponseBase;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class ClientResponse extends ResponseBase {

    /**
     *
     */
    @JsonIgnore
    private static final long serialVersionUID = 1L;


    private List<Client> datas = new ArrayList<>();



    /**
     *
     */
    public ClientResponse() {
        super();
    }


    /**
     * @param code
     * @param message
     * @param error
     * @param datas
     */
    public ClientResponse(String code, String message, String error, List<Client> datas) {
        super();
        this.datas = datas;
        this.setCode(code);
        this.setError(error);
        this.setMessage(message);
    }


    /**
     * @return the datas
     */
    public List<Client> getDatas() {
        return datas;
    }


    /**
     * @param datas the datas to set
     */
    public void setDatas(List<Client> datas) {
        this.datas = datas;
    }


}
