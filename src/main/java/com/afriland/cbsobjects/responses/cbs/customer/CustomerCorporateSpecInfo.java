//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.02.19 à 03:34:24 PM WAT 
//


package com.afriland.cbsobjects.responses.cbs.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour customerCorporateSpecInfo complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="customerCorporateSpecInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="corporateGeneralInfo" type="{http://soprabanking.com/amplitude}customerCorporateGeneralInfo" minOccurs="0"/&gt;
 *         &lt;element name="corporateId" type="{http://soprabanking.com/amplitude}customerCorporateId" minOccurs="0"/&gt;
 *         &lt;element name="legalInformation" type="{http://soprabanking.com/amplitude}customerLegalInformation" minOccurs="0"/&gt;
 *         &lt;element name="groupAndJob" type="{http://soprabanking.com/amplitude}customerGroupAndJob" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerCorporateSpecInfo", propOrder = {
    "corporateGeneralInfo",
    "corporateId",
    "legalInformation",
    "groupAndJob"
})
public class CustomerCorporateSpecInfo {

    protected CustomerCorporateGeneralInfo corporateGeneralInfo;
    protected CustomerCorporateId corporateId;
    protected CustomerLegalInformation legalInformation;
    protected CustomerGroupAndJob groupAndJob;

    /**
     * Obtient la valeur de la propriété corporateGeneralInfo.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCorporateGeneralInfo }
     *     
     */
    public CustomerCorporateGeneralInfo getCorporateGeneralInfo() {
        return corporateGeneralInfo;
    }

    /**
     * Définit la valeur de la propriété corporateGeneralInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCorporateGeneralInfo }
     *     
     */
    public void setCorporateGeneralInfo(CustomerCorporateGeneralInfo value) {
        this.corporateGeneralInfo = value;
    }

    /**
     * Obtient la valeur de la propriété corporateId.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCorporateId }
     *     
     */
    public CustomerCorporateId getCorporateId() {
        return corporateId;
    }

    /**
     * Définit la valeur de la propriété corporateId.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCorporateId }
     *     
     */
    public void setCorporateId(CustomerCorporateId value) {
        this.corporateId = value;
    }

    /**
     * Obtient la valeur de la propriété legalInformation.
     * 
     * @return
     *     possible object is
     *     {@link CustomerLegalInformation }
     *     
     */
    public CustomerLegalInformation getLegalInformation() {
        return legalInformation;
    }

    /**
     * Définit la valeur de la propriété legalInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerLegalInformation }
     *     
     */
    public void setLegalInformation(CustomerLegalInformation value) {
        this.legalInformation = value;
    }

    /**
     * Obtient la valeur de la propriété groupAndJob.
     * 
     * @return
     *     possible object is
     *     {@link CustomerGroupAndJob }
     *     
     */
    public CustomerGroupAndJob getGroupAndJob() {
        return groupAndJob;
    }

    /**
     * Définit la valeur de la propriété groupAndJob.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerGroupAndJob }
     *     
     */
    public void setGroupAndJob(CustomerGroupAndJob value) {
        this.groupAndJob = value;
    }

}
