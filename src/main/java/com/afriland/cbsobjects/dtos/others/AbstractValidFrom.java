package com.afriland.cbsobjects.dtos.others;


import java.io.Serializable;
import java.util.Date;

import com.afriland.cbsobjects.utils.FormatedValidFrom;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.MappedSuperclass;


@JsonIgnoreProperties({"validFrom", "validTo"})
@MappedSuperclass
public abstract class AbstractValidFrom implements Serializable {

	private static final long serialVersionUID = 4489907096383508015L;

	/** The id. */
	private String id = null;
	
	/** The version. */
	private Integer version = 0;

	/** The valid from. */
	private Date validFrom = new Date();

	/** The valid to. */
	private Date validTo;

	
	public abstract String makeIndex();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@JsonIgnore
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@JsonIgnore
	public Date getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	@JsonIgnore
	public Date getValidTo() {
		return validTo;
	}

	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		if (id != null) {
			return id.equals(((AbstractValidFrom) that).id);
		}
		return super.equals(that);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		if (id != null) {
			return id.hashCode();
		}
		return super.hashCode();
	}

	public boolean isValid(Date date){
		return validFrom!=null && (validFrom.before(date) || validFrom.equals(date)) && (validTo==null || validTo.after(date));
	}
	
	public String makeId(Date validFrom){
		return makeIndex() +"_"  +FormatedValidFrom.format(validFrom);
	}
}
