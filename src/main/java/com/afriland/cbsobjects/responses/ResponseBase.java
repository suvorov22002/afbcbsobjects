package com.afriland.cbsobjects.responses;


import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonIgnore;



public class ResponseBase implements Serializable {

	/**
	 * 
	 */
	@JsonIgnore
	private static final long serialVersionUID = 1L;

	private String code; 

	private String error;
	
	private String message;

	public ResponseBase() {
	}

	public ResponseBase(String code, String error, String message) {
		this.code = code;
		this.error = error;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
