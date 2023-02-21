package com.afriland.cbsobjects.dtos.loans;

import java.io.Serializable;
import java.util.Date;

public class EcheancePret implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int num;
	private Date dva;
	private long amo_cal;
	private long inte;
	private long tin;
	private long tot_ech;
	private long res;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Date getDva() {
		return dva;
	}
	public void setDva(Date dva) {
		this.dva = dva;
	}
	public long getAmo_cal() {
		return amo_cal;
	}
	public void setAmo_cal(long amo_cal) {
		this.amo_cal = amo_cal;
	}
	public long getInte() {
		return inte;
	}
	public void setInte(long inte) {
		this.inte = inte;
	}
	public long getTin() {
		return tin;
	}
	public void setTin(long tin) {
		this.tin = tin;
	}
	public long getTot_ech() {
		return tot_ech;
	}
	public void setTot_ech(long tot_ech) {
		this.tot_ech = tot_ech;
	}
	public long getRes() {
		return res;
	}
	public void setRes(long res) {
		this.res = res;
	}
	
}
