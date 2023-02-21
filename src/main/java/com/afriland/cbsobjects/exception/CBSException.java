package com.afriland.cbsobjects.exception;

import com.afriland.cbsobjects.enums.CBSResponceCode;

public class CBSException extends Exception{
	/**
	 * Default Serial UID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default Constuctor
	 */
	public CBSException() {}
	
	/**
	 * Code du message
	 */
	protected CBSResponceCode code;
	
	/**
	 * Message de l'exception
	 */
	protected String message;
	
	/**
	 * @param code
	 */
	public CBSException(CBSResponceCode code) {
		super();
		this.code = code;
		this.message = code.name();
	}
	
	/**
	 * @param code
	 * @param message
	 */
	public CBSException(CBSResponceCode code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	/**
	 * @return the code
	 */
	public CBSResponceCode getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(CBSResponceCode code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
