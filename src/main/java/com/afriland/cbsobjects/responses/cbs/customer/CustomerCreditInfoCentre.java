//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.02.19 à 03:34:24 PM WAT 
//


package com.afriland.cbsobjects.responses.cbs.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour customerCreditInfoCentre complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="customerCreditInfoCentre"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerRelationshipRisk" type="{http://soprabanking.com/amplitude}customerRelationshipRiskLevel" minOccurs="0"/&gt;
 *         &lt;element name="validationDateOfCustomerRelationshipRisk" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="userCodewhoValidatedcustomerRelationshipRisk" type="{http://soprabanking.com/amplitude}charMax10" minOccurs="0"/&gt;
 *         &lt;element name="creditInfoCentreRegistrationNumber" type="{http://soprabanking.com/amplitude}charMax20" minOccurs="0"/&gt;
 *         &lt;element name="creditInfoCentreCodeToDeclare" type="{http://soprabanking.com/amplitude}creditInfoCentreCodeToDeclare" minOccurs="0"/&gt;
 *         &lt;element name="creditInfoCentreKey" type="{http://soprabanking.com/amplitude}char1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerCreditInfoCentre", propOrder = {
    "customerRelationshipRisk",
    "validationDateOfCustomerRelationshipRisk",
    "userCodewhoValidatedcustomerRelationshipRisk",
    "creditInfoCentreRegistrationNumber",
    "creditInfoCentreCodeToDeclare",
    "creditInfoCentreKey"
})
public class CustomerCreditInfoCentre {

    protected CustomerRelationshipRiskLevel customerRelationshipRisk;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validationDateOfCustomerRelationshipRisk;
    protected String userCodewhoValidatedcustomerRelationshipRisk;
    protected String creditInfoCentreRegistrationNumber;
    protected String creditInfoCentreCodeToDeclare;
    protected String creditInfoCentreKey;

    /**
     * Obtient la valeur de la propriété customerRelationshipRisk.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRelationshipRiskLevel }
     *     
     */
    public CustomerRelationshipRiskLevel getCustomerRelationshipRisk() {
        return customerRelationshipRisk;
    }

    /**
     * Définit la valeur de la propriété customerRelationshipRisk.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRelationshipRiskLevel }
     *     
     */
    public void setCustomerRelationshipRisk(CustomerRelationshipRiskLevel value) {
        this.customerRelationshipRisk = value;
    }

    /**
     * Obtient la valeur de la propriété validationDateOfCustomerRelationshipRisk.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidationDateOfCustomerRelationshipRisk() {
        return validationDateOfCustomerRelationshipRisk;
    }

    /**
     * Définit la valeur de la propriété validationDateOfCustomerRelationshipRisk.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidationDateOfCustomerRelationshipRisk(XMLGregorianCalendar value) {
        this.validationDateOfCustomerRelationshipRisk = value;
    }

    /**
     * Obtient la valeur de la propriété userCodewhoValidatedcustomerRelationshipRisk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCodewhoValidatedcustomerRelationshipRisk() {
        return userCodewhoValidatedcustomerRelationshipRisk;
    }

    /**
     * Définit la valeur de la propriété userCodewhoValidatedcustomerRelationshipRisk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCodewhoValidatedcustomerRelationshipRisk(String value) {
        this.userCodewhoValidatedcustomerRelationshipRisk = value;
    }

    /**
     * Obtient la valeur de la propriété creditInfoCentreRegistrationNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditInfoCentreRegistrationNumber() {
        return creditInfoCentreRegistrationNumber;
    }

    /**
     * Définit la valeur de la propriété creditInfoCentreRegistrationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditInfoCentreRegistrationNumber(String value) {
        this.creditInfoCentreRegistrationNumber = value;
    }

    /**
     * Obtient la valeur de la propriété creditInfoCentreCodeToDeclare.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditInfoCentreCodeToDeclare() {
        return creditInfoCentreCodeToDeclare;
    }

    /**
     * Définit la valeur de la propriété creditInfoCentreCodeToDeclare.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditInfoCentreCodeToDeclare(String value) {
        this.creditInfoCentreCodeToDeclare = value;
    }

    /**
     * Obtient la valeur de la propriété creditInfoCentreKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditInfoCentreKey() {
        return creditInfoCentreKey;
    }

    /**
     * Définit la valeur de la propriété creditInfoCentreKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditInfoCentreKey(String value) {
        this.creditInfoCentreKey = value;
    }

}
