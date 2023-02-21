package com.afriland.cbsobjects.dtos.customer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe utilisé pour modéliser un co-titulaire d'un compte joint
 * @author Yves LABO
 */
public class Cotitulaire implements Comparable<Cotitulaire>{


	private String cli;

	private String tco;

	private int numOrdre;

	private String nom;

	private String pre;

	private String typeLien;

	public String getCli() {
		return cli;
	}

	public void setCli(String cli) {
		this.cli = cli;
	}

	public String getTco() {
		return tco;
	}

	public void setTco(String tco) {
		this.tco = tco;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPre() {
		return pre;
	}

	public void setPre(String pre) {
		this.pre = pre;
	}

	public boolean estClient(){
		return "C".equalsIgnoreCase(tco);
	}

	public boolean estTier(){
		return "T".equalsIgnoreCase(tco);
	}

	public int getNumOrdre() {
		return numOrdre;
	}

	public void setNumOrdre(int numOrdre) {
		this.numOrdre = numOrdre;
	}

	public String getTypeLien() {
		return typeLien;
	}

	public void setTypeLien(String typeLien) {
		this.typeLien = typeLien;
	}

	@Override
	public int compareTo(Cotitulaire o) {
		return this.numOrdre - o.numOrdre;
	}

	public String getFullName(){
		return (nom != null && pre != null) ? nom+" "+pre : nom;
	}

	@Override
	public String toString() {
		return "Cotitulaire{" + "cli=" + cli + ", tco=" + tco + ", numOrdre=" + numOrdre + ", nom=" + nom + ", pre=" + pre + ", typeLien=" + typeLien + '}';
	}

}
