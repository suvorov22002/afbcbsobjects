package com.afriland.cbsobjects.responses;

import com.afriland.cbsobjects.dtos.customer.Customer;
import com.afriland.cbsobjects.responses.cbs.customer.GetCustomerPhoneNumberListResponse;

import java.util.ArrayList;
import java.util.List;

public class CustomerPhoneNumberResponse extends ResponseBase{

    private List<GetCustomerPhoneNumberListResponse> datas = new ArrayList<>();

    public CustomerPhoneNumberResponse() {
        super();
    }


    /**
     * @param code
     * @param message
     * @param error
     * @param datas
     */
    public CustomerPhoneNumberResponse(String code, String message, String error, List<GetCustomerPhoneNumberListResponse> datas) {
        super();
        this.datas = datas;
        this.setCode(code);
        this.setError(error);
        this.setMessage(message);
    }


    /**
     * @return the datas
     */
    public List<GetCustomerPhoneNumberListResponse> getDatas() {
        return datas;
    }


    /**
     * @param datas the datas to set
     */
    public void setDatas(List<GetCustomerPhoneNumberListResponse> datas) {
        this.datas = datas;
    }

}
