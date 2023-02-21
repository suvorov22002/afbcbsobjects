package com.afriland.cbsobjects.dtos.loans;

import java.io.Serializable;
import java.util.Date;

public class Garantie implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String ref;
	private Date dech;
	private double mon;
	private String sit;
	private String nat;
	private String type;
	private String prop;
	
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public Date getDech() {
		return dech;
	}
	public void setDech(Date dech) {
		this.dech = dech;
	}
	public double getMon() {
		return mon;
	}
	public void setMon(double mon) {
		this.mon = mon;
	}
	public String getSit() {
		return sit;
	}
	public void setSit(String sit) {
		this.sit = sit;
	}
	public String getNat() {
		return nat;
	}
	public void setNat(String nat) {
		this.nat = nat;
	}
	public String getType() {
		return type;
	}
	public void setType(String reelle) {
		this.type = reelle;
	}
	public String getProp() {
		return prop;
	}
	public void setProp(String prop) {
		this.prop = prop;
	}
	
}
