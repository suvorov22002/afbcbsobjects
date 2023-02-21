package com.afriland.cbsobjects.dtos.customer;

public class Customer extends CustomerParticulier {

	
	private String tcli;

	/**
	 * 
	 */
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cotitulaire
	 */
	public Customer(Cotitulaire cotitulaire) {
		super(cotitulaire);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param tcli
	 */
	public Customer(String tcli) {
		super();
		this.tcli = tcli;
	}

	/**
	 * @return the tcli
	 */
	public String getTcli() {
		return tcli;
	}

	/**
	 * @param tcli the tcli to set
	 */
	public void setTcli(String tcli) {
		this.tcli = tcli;
	}
	

}
