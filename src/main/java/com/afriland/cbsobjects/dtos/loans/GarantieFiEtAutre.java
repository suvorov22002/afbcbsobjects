package com.afriland.cbsobjects.dtos.loans;

import java.io.Serializable;

public class GarantieFiEtAutre implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private double garFi;
	private double autreGar;
	public double getGarFi() {
		return garFi;
	}
	public void setGarFi(double garFi) {
		this.garFi = garFi;
	}
	public double getAutreGar() {
		return autreGar;
	}
	public void setAutreGar(double autreGar) {
		this.autreGar = autreGar;
	}
	
}
