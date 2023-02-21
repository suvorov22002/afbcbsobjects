package com.afriland.cbsobjects.dtos.loans;

import java.io.Serializable;

public class GarantieAffectee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Situation de l'engagement
	 */
	private String sit;
	/**
	 * Nature de l'engagement
	 */
	private String natEng;
	/**
	 * numéro de la garantie
	 */
	private String ngar;
	/**
	 * Montant engagement couvert
	 */
	private double mntc;
	/**
	 * Montant de la garantie affectée à l'engagement
	 */
	private double mntg;
	public String getSit() {
		return sit;
	}
	public void setSit(String sit) {
		this.sit = sit;
	}
	public String getNatEng() {
		return natEng;
	}
	public void setNatEng(String natEng) {
		this.natEng = natEng;
	}
	public String getNgar() {
		return ngar;
	}
	public void setNgar(String ngar) {
		this.ngar = ngar;
	}
	public double getMntc() {
		return mntc;
	}
	public void setMntc(double mntc) {
		this.mntc = mntc;
	}
	public double getMntg() {
		return mntg;
	}
	public void setMntg(double mntg) {
		this.mntg = mntg;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(mntc);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(mntg);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((natEng == null) ? 0 : natEng.hashCode());
		result = prime * result + ((ngar == null) ? 0 : ngar.hashCode());
		result = prime * result + ((sit == null) ? 0 : sit.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GarantieAffectee other = (GarantieAffectee) obj;
		if (Double.doubleToLongBits(mntc) != Double.doubleToLongBits(other.mntc))
			return false;
		if (Double.doubleToLongBits(mntg) != Double.doubleToLongBits(other.mntg))
			return false;
		if (natEng == null) {
			if (other.natEng != null)
				return false;
		} else if (!natEng.equals(other.natEng))
			return false;
		if (ngar == null) {
			if (other.ngar != null)
				return false;
		} else if (!ngar.equals(other.ngar))
			return false;
		if (sit == null) {
			if (other.sit != null)
				return false;
		} else if (!sit.equals(other.sit))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "GarantieAffectee [sit=" + sit + ", natEng=" + natEng + ", ngar=" + ngar + ", mntc=" + mntc + ", mntg="
				+ mntg + "]";
	}
	
}
