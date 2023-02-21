package com.afriland.cbsobjects.dtos.transactions;


import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;

import com.afriland.cbsobjects.dtos.others.AbstractValidFrom;
import com.afriland.cbsobjects.enums.CBSResponceCode;
import com.afriland.cbsobjects.enums.TransactionStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Transactions
 * @author Yves LABO
 * @version 1.0            
 */
@JsonIgnoreProperties({"referencenumber", "referenceevent", "partiversante", "raison", "posted", "modnuit", "recycle", "recycledate", "compenser", "exceptionlib", "host", "path", "queryParameters"})
public class Transactions extends AbstractValidFrom{

	/**
	 * Default Serial UID
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String makeIndex(){
		return RandomStringUtils.randomAlphanumeric(20).toUpperCase();
	}
	
	/**
	 * Operation
	 */
	private String typeOperation;
	
	/**
	 * Montant
	 */
	private Double amount = 0d;
	
	/**
	 * Numero de compte
	 */
	private String accountDebit;
	
	/**
	 * Numero de compte
	 */
	private String accountCredit;
	
	private String referencenumber;
	
	private String referenceevent;
		
	/**
	 * partiversante
	 */
	private String partiversante;
		
	/**
	 * Raison
	 */
	private String raison;
	
	/**
	 * Date de l'operation
	 */
	private Date date = new Date();
		
	/**
	 * Etat de la transaction
	 */
	private TransactionStatus status = TransactionStatus.PROCESSING;
	
	/**
	 * Determine si la transaction a ete postee dans le Core Banking ou non
	 */
	private Boolean posted = Boolean.FALSE;
	
	private Boolean modnuit = Boolean.FALSE;
	
	private Boolean recycle = Boolean.FALSE;
	
	private Date recycledate;
	
	/**
	 * Determine 
	 */
	private Boolean compenser = Boolean.FALSE;
	
	/**
	 * 
	 */
	private String exceptionlib;
	
	/**
	 * 
	 */
	private CBSResponceCode execeptonCose;
	
	private String host;
	
	private String path;
	
	private String queryParameters;
	

	/**
	 * 
	 */
	public Transactions() {
		super();
	}
		
	
	
	/**
	 * @param accountDebit the accountDebit to set
	 */
	public void setAccountDebit(String accountDebit) {
		this.accountDebit = accountDebit;
	}


	/**
	 * @param accountCredit the accountCredit to set
	 */
	public void setAccountCredit(String accountCredit) {
		this.accountCredit = accountCredit;
	}


	/**
	 * @return the host
	 */
	@JsonIgnore
	public String getHost() {
		return host;
	}

	/**
	 * @param host the host to set
	 */
	public void setHost(String host) {
		this.host = host;
	}

	/**
	 * @return the referenceevent
	 */
	@JsonIgnore
	public String getReferenceevent() {
		return referenceevent;
	}


	/**
	 * @param referenceevent the referenceevent to set
	 */
	public void setReferenceevent(String referenceevent) {
		this.referenceevent = referenceevent;
	}


	/**
	 * @return the path
	 */
	@JsonIgnore
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * @return the queryParameters
	 */
	@JsonIgnore
	public String getQueryParameters() {
		return queryParameters;
	}

	/**
	 * @param queryParameters the queryParameters to set
	 */
	public void setQueryParameters(String queryParameters) {
		this.queryParameters = queryParameters;
	}

	/**
	 * @return the referencenumber
	 */
	@JsonIgnore
	public String getReferencenumber() {
		return referencenumber;
	}

	/**
	 * @param referencenumber the referencenumber to set
	 */
	public void setReferencenumber(String referencenumber) {
		this.referencenumber = referencenumber;
	}

	/**
	 * @return the exceptionlib
	 */
	@JsonIgnore
	public String getExceptionlib() {
		return exceptionlib;
	}

	/**
	 * @param exceptionlib the exceptionlib to set
	 */
	public void setExceptionlib(String exceptionlib) {
		this.exceptionlib = exceptionlib;
	}

	/**
	 * @return the execeptonCose
	 */
	@JsonIgnore
	public CBSResponceCode getExeceptonCose() {
		return execeptonCose;
	}

	/**
	 * @param execeptonCose the execeptonCose to set
	 */
	public void setExeceptonCose(CBSResponceCode execeptonCose) {
		this.execeptonCose = execeptonCose;
		this.exceptionlib = execeptonCose.name();
	}

	/**
	 * @return the typeOperation
	 */
	public String getTypeOperation() {
		return typeOperation;
	}

	/**
	 * @param typeOperation the typeOperation to set
	 */
	public void setTypeOperation(String typeOperation) {
		this.typeOperation = typeOperation;
	}

	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * @return the partiversante
	 */
	@JsonIgnore
	public String getPartiversante() {
		if(partiversante == null ) {
			partiversante ="";
		}
		return partiversante;
	}

	/**
	 * @param partiversante the partiversante to set
	 */
	public void setPartiversante(String partiversante) {
		this.partiversante = partiversante;
	}

	/**
	 * @return the raison
	 */
	@JsonIgnore
	public String getRaison() {
		return raison;
	}

	/**
	 * @param raison the raison to set
	 */
	public void setRaison(String raison) {
		this.raison = raison;
	}
	
	/**
	 * @return the accountDebit
	 */
	public String getAccountDebit() {
		return accountDebit;
	}

	/**
	 * @return the accountCredit
	 */
	public String getAccountCredit() {
		return accountCredit;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the status
	 */
	public TransactionStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(TransactionStatus status) {
		this.status = status;
	}

	/**
	 * @return the posted
	 */
	@JsonIgnore
	public Boolean getPosted() {
		return posted;
	}

	/**
	 * @param posted the posted to set
	 */
	public void setPosted(Boolean posted) {
		this.posted = posted;
	}

	/**
	 * @return the compenser
	 */
	@JsonIgnore
	public Boolean getCompenser() {
		return compenser;
	}

	/**
	 * @param compenser the compenser to set
	 */
	public void setCompenser(Boolean compenser) {
		this.compenser = compenser;
	}

	
	/**
	 * @return the modnuit
	 */
	@JsonIgnore
	public Boolean getModnuit() {
		return modnuit;
	}

	/**
	 * @param modnuit the modnuit to set
	 */
	public void setModnuit(Boolean modnuit) {
		this.modnuit = modnuit;
	}

	/**
	 * @return the recycle
	 */
	@JsonIgnore
	public Boolean getRecycle() {
		return recycle;
	}

	/**
	 * @param recycle the recycle to set
	 */
	public void setRecycle(Boolean recycle) {
		this.recycle = recycle;
	}

	/**
	 * @return the recycledate
	 */
	@JsonIgnore
	public Date getRecycledate() {
		return recycledate;
	}

	/**
	 * @param recycledate the recycledate to set
	 */
	public void setRecycledate(Date recycledate) {
		this.recycledate = recycledate;
	}
		
}
