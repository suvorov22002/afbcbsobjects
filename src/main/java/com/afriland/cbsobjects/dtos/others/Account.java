package com.afriland.cbsobjects.dtos.others;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Account implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String ncp;
	private String age;
	private String dev;
	private String cha;
	private String clc;
	private String cli;
	private String inti;
	private String ife;
	private String cfe;
	private Date dou;
	private Date dmo;
	private Double sde;
	private Double sin;
	private String typ;
	private String suf;
	private String utic;
	private String uti;
	
	

	/**
	 * 
	 */
	public Account() {
		super();
	}


	public Account(ResultSet rs) throws SQLException {
		super();
		this.ncp = rs.getString("ncp");
		this.age = rs.getString("age");
		this.dev = rs.getString("dev");
		this.cha = rs.getString("cha");
		this.clc = rs.getString("clc");
		this.cli = rs.getString("cli");
		this.inti = rs.getString("inti");
		this.ife = rs.getString("ife");
		this.dou = rs.getDate("dou");
		this.cfe = rs.getString("cfe");
		this.sde = rs.getDouble("sde");
		this.sin = rs.getDouble("sin");
		this.typ = rs.getString("typ");
		this.suf = rs.getString("suf");
	}

	

	/**
	 * @return the typ
	 */
	public String getTyp() {
		return typ;
	}


	/**
	 * @param typ the typ to set
	 */
	public void setTyp(String typ) {
		this.typ = typ;
	}


	/**
	 * @return the sde
	 */
	public Double getSde() {
		return sde;
	}


	/**
	 * @param sde the sde to set
	 */
	public void setSde(Double sde) {
		this.sde = sde;
	}


	/**
	 * @return the suf
	 */
	public String getSuf() {
		return suf;
	}


	/**
	 * @param suf the suf to set
	 */
	public void setSuf(String suf) {
		this.suf = suf;
	}


	/**
	 * @return the ncp
	 */
	public String getNcp() {
		return ncp;
	}


	/**
	 * @param ncp the ncp to set
	 */
	public void setNcp(String ncp) {
		this.ncp = ncp;
	}


	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}


	/**
	 * @return the dev
	 */
	public String getDev() {
		return dev;
	}


	/**
	 * @param dev the dev to set
	 */
	public void setDev(String dev) {
		this.dev = dev;
	}


	/**
	 * @return the cha
	 */
	public String getCha() {
		return cha;
	}


	/**
	 * @param cha the cha to set
	 */
	public void setCha(String cha) {
		this.cha = cha;
	}


	/**
	 * @return the clc
	 */
	public String getClc() {
		return clc;
	}


	/**
	 * @param clc the clc to set
	 */
	public void setClc(String clc) {
		this.clc = clc;
	}


	/**
	 * @return the cli
	 */
	public String getCli() {
		return cli;
	}


	/**
	 * @param cli the cli to set
	 */
	public void setCli(String cli) {
		this.cli = cli;
	}


	/**
	 * @return the inti
	 */
	public String getInti() {
		return inti;
	}


	/**
	 * @param inti the inti to set
	 */
	public void setInti(String inti) {
		this.inti = inti;
	}


	/**
	 * @return the ife
	 */
	public String getIfe() {
		return ife;
	}


	/**
	 * @param ife the ife to set
	 */
	public void setIfe(String ife) {
		this.ife = ife;
	}


	/**
	 * @return the cfe
	 */
	public String getCfe() {
		return cfe;
	}


	/**
	 * @param cfe the cfe to set
	 */
	public void setCfe(String cfe) {
		this.cfe = cfe;
	}


	/**
	 * @return the dou
	 */
	public Date getDou() {
		return dou;
	}


	/**
	 * @param dou the dou to set
	 */
	public void setDou(Date dou) {
		this.dou = dou;
	}

	
	/**
	 * @return the dmo
	 */
	public Date getDmo() {
		return dmo;
	}


	/**
	 * @param dmo the dmo to set
	 */
	public void setDmo(Date dmo) {
		this.dmo = dmo;
	}
	

	/**
	 * @return the sin
	 */
	public Double getSin() {
		return sin;
	}


	/**
	 * @param sin the sin to set
	 */
	public void setSin(Double sin) {
		this.sin = sin;
	}


	/**
	 * @return the utic
	 */
	public String getUtic() {
		return utic;
	}


	/**
	 * @param utic the utic to set
	 */
	public void setUtic(String utic) {
		this.utic = utic;
	}


	/**
	 * @return the uti
	 */
	public String getUti() {
		return uti;
	}


	/**
	 * @param uti the uti to set
	 */
	public void setUti(String uti) {
		this.uti = uti;
	}
	
}
