package com.afriland.cbsobjects.responses;

import java.util.ArrayList;
import java.util.List;

import com.afriland.cbsobjects.dtos.customer.Customer;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Classe representant la reponse des clients
 * @author yves_labo
 * @version 1.0
 */
public class CustomerResponse extends ResponseBase {

	/**
	 * 
	 */
	@JsonIgnore
	private static final long serialVersionUID = 1L;

	
	private List<Customer> datas = new ArrayList<Customer>();
	
	

	/**
	 * 
	 */
	public CustomerResponse() {
		super();
	}


	/**
	 * @param code
	 * @param message
	 * @param error
	 * @param datas
	 */
	public CustomerResponse(String code, String message, String error, List<Customer> datas) {
		super();
		this.datas = datas;
		this.setCode(code);
		this.setError(error);
		this.setMessage(message);
	}


	/**
	 * @return the datas
	 */
	public List<Customer> getDatas() {
		return datas;
	}


	/**
	 * @param datas the datas to set
	 */
	public void setDatas(List<Customer> datas) {
		this.datas = datas;
	}


}
