package com.afriland.cbsobjects.dtos.loans;

import java.io.Serializable;

public class Engagement implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String age;
	
	public String ncp;
	/**
	 * Numéro garantie
	 */
	public String ngar;
	/**
	 * Numéro engagement
	 */
	public String neng;
	/**
	 * Montant affecté à la garantie
	 */
	public double mntg;
	/**
	 * Montant de l'engagement en devise nationale
	 */
	public double nmnte;
	
	
	
	
	/**
	 * 
	 */
	public Engagement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getNgar() {
		return ngar;
	}
	public void setNgar(String ngar) {
		this.ngar = ngar;
	}
	public String getNeng() {
		return neng;
	}
	public void setNeng(String neng) {
		this.neng = neng;
	}
	public double getMntg() {
		return mntg;
	}
	public void setMntg(double mntg) {
		this.mntg = mntg;
	}
	public double getNmnte() {
		return nmnte;
	}
	public void setNmnte(double nmnte) {
		this.nmnte = nmnte;
	}
	public String getNcp() {
		return ncp;
	}
	public void setNcp(String ncp) {
		this.ncp = ncp;
	}
	
}
