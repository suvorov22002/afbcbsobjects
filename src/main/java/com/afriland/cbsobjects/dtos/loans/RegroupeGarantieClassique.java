package com.afriland.cbsobjects.dtos.loans;

import java.io.Serializable;

public class RegroupeGarantieClassique implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private double dat;
	private double bdc;
	private double hypoth;
	private double autre;
	
	public double getDat() {
		return dat;
	}
	public void setDat(double dat) {
		this.dat = dat;
	}
	public double getBdc() {
		return bdc;
	}
	public void setBdc(double bdc) {
		this.bdc = bdc;
	}
	public double getHypoth() {
		return hypoth;
	}
	public void setHypoth(double hypoth) {
		this.hypoth = hypoth;
	}
	public double getAutre() {
		return autre;
	}
	public void setAutre(double autre) {
		this.autre = autre;
	}
	
}
