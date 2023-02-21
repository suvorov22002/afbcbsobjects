package com.afriland.cbsobjects.dtos.loans;

import java.io.Serializable;

public class LoanFees implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long monEtude;
	private long monConv;
	private long monHuissier;
	private long monMEP;
	private long fraisTotalHT;
	private long fraisTotalTTC;
	
	
	public long getMonEtude() {
		return monEtude;
	}
	public void setMonEtude(long monEtude) {
		this.monEtude = monEtude;
	}
	public long getMonConv() {
		return monConv;
	}
	public void setMonConv(long monConv) {
		this.monConv = monConv;
	}
	public long getMonHuissier() {
		return monHuissier;
	}
	public void setMonHuissier(long monHuissier) {
		this.monHuissier = monHuissier;
	}
	public long getMonMEP() {
		return monMEP;
	}
	public void setMonMEP(long monMEP) {
		this.monMEP = monMEP;
	}
	public long getFraisTotalHT() {
		return fraisTotalHT;
	}
	public void setFraisTotalHT(long fraisTotalBanqHT) {
		this.fraisTotalHT = fraisTotalBanqHT;
	}
	public long getFraisTotalTTC() {
		return fraisTotalTTC;
	}
	public void setFraisTotalTTC(long fraisTotalBanqTTC) {
		this.fraisTotalTTC = fraisTotalBanqTTC;
	}
	
}
