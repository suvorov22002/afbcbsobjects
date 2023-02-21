package com.afriland.cbsobjects.dtos.loans;

import java.io.Serializable;

public class Loan implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String age;
	private String ord;
	private String dmep;
	private long monEch;
	private long monDebloc;
	private String echeance;
	private String eve;
	private String numPret;
	private long monPret;
	private long frais;
	private double taux;
	private long duree;
	private int tech;
	private String eta;
	private String typ;
	private long teg;
	private long totalTraite;
	private String totalTraiteFormat;
	private long cumulAmor;
	private String cumulAmorFormat;
	private String key;
	/**
	 * Montant total engagement couvert
	 */
	private double mntc;
	/**
	 * Liste des garanties
	 */
	private String listGar;
	/**
	 * Encours restant
	 */
	private double encours;
	/**
	 * Exposition nette
	 */
	private double expoNet;
	/**
	 * String 1ère échéance
	 */
	private String dpec;
	
	/**
	 * Nombre d'échéance
	 */
	private int nbe;
	/**
	 * Numéro d'ordre avenant
	 */
	private int ave;
	
	private boolean mep;
	
	public String getDmep() {
		return dmep;
	}
	public void setDmep(String dmep) {
		this.dmep = dmep;
	}
	public long getMonEch() {
		return monEch;
	}
	public void setMonEch(long monEch) {
		this.monEch = monEch;
	}
	
	public long getMonDebloc() {
		return monDebloc;
	}
	public void setMonDebloc(long monDebloc) {
		this.monDebloc = monDebloc;
	}
	public String getEcheance() {
		return echeance;
	}
	public void setEcheance(String echeance) {
		this.echeance = echeance;
	}
	public String getNumPret() {
		return numPret;
	}
	public void setNumPret(String numPret) {
		this.numPret = numPret;
	}
	public long getMonPret() {
		return monPret;
	}
	public void setMonPret(long monPret) {
		this.monPret = monPret;
	}
	public long getFrais() {
		return frais;
	}
	public void setFrais(long frais) {
		this.frais = frais;
	}
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	public long getDuree() {
		return duree;
	}
	public void setDuree(long duree) {
		this.duree = duree;
	}
	public String getEta() {
		return eta;
	}
	public void setEta(String eta) {
		this.eta = eta;
	}
	public int getNbe() {
		return nbe;
	}
	public void setNbe(int nbe) {
		this.nbe = nbe;
	}
	public int getAve() {
		return ave;
	}
	public void setAve(int ave) {
		this.ave = ave;
	}
	public String getEve() {
		return eve;
	}
	public void setEve(String eve) {
		this.eve = eve;
	}
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	public String getDpec() {
		return dpec;
	}
	public void setDpec(String dpec) {
		this.dpec = dpec;
	}
	public long getTeg() {
		return teg;
	}
	public void setTeg(long teg) {
		this.teg = teg;
	}
	public int getTech() {
		return tech;
	}
	public void setTech(int tech) {
		this.tech = tech;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getOrd() {
		return ord;
	}
	public void setOrd(String ord) {
		this.ord = ord;
	}
	public double getMntc() {
		return mntc;
	}
	public void setMntc(double mntc) {
		this.mntc = mntc;
	}
	public String getListGar() {
		return listGar;
	}
	public void setListGar(String listGar) {
		this.listGar = listGar;
	}
	public double getEncours() {
		return encours;
	}
	public void setEncours(double res) {
		this.encours = res;
	}
	public double getExpoNet() {
		return expoNet;
	}
	public void setExpoNet(double expoNet) {
		this.expoNet = expoNet;
	}
	public long getTotalTraite() {
		return totalTraite;
	}
	public void setTotalTraite(long totalTraite) {
		this.totalTraite = totalTraite;
	}
	public String getTotalTraiteFormat() {
		return totalTraiteFormat;
	}
	public void setTotalTraiteFormat(String totalTraiteFormat) {
		this.totalTraiteFormat = totalTraiteFormat;
	}
	public long getCumulAmor() {
		return cumulAmor;
	}
	public void setCumulAmor(long cumulAmor) {
		this.cumulAmor = cumulAmor;
	}
	public String getCumulAmorFormat() {
		return cumulAmorFormat;
	}
	public void setCumulAmorFormat(String cumulAmorFormat) {
		this.cumulAmorFormat = cumulAmorFormat;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public boolean isMep() {
		return mep;
	}
	public void setMep(boolean mep) {
		this.mep = mep;
	}
	
}
