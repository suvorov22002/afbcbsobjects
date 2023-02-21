package com.afriland.cbsobjects.responses;


import com.fasterxml.jackson.annotation.JsonIgnore;


public class DataResponse extends ResponseBase {

	/**
	 * 
	 */
	@JsonIgnore
	private static final long serialVersionUID = 1L;

	private String data;


	/**
	 *
	 */
	public DataResponse() {
		super();
	}

	public DataResponse(String code, String error, String message, String data) {
		super(code, error, message);
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}

