package com.afriland.cbsobjects.responses;

import com.afriland.cbsobjects.dtos.customer.Customer;
import com.afriland.cbsobjects.dtos.others.TokenCBS;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe representant la reponse du Token
 * @author yves_labo
 * @version 1.0
 */
public class TokenCBSResponse extends ResponseBase {

	/**
	 *
	 */
	@JsonIgnore
	private static final long serialVersionUID = 1L;


	private List<TokenCBS> datas = new ArrayList<TokenCBS>();



	/**
	 *
	 */
	public TokenCBSResponse() {
		super();
	}


	/**
	 * @param code
	 * @param message
	 * @param error
	 * @param datas
	 */
	public TokenCBSResponse(String code, String message, String error, List<TokenCBS> datas) {
		super();
		this.datas = datas;
		this.setCode(code);
		this.setError(error);
		this.setMessage(message);
	}


	/**
	 * @return the datas
	 */
	public List<TokenCBS> getDatas() {
		return datas;
	}


	/**
	 * @param datas the datas to set
	 */
	public void setDatas(List<TokenCBS> datas) {
		this.datas = datas;
	}


}
