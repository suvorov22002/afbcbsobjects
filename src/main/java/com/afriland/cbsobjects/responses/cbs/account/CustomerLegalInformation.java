//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.02.22 à 03:19:28 PM WAT 
//


package com.afriland.cbsobjects.responses.cbs.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour customerLegalInformation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="customerLegalInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeRegisterNumber" type="{http://soprabanking.com/amplitude}charMax20" minOccurs="0"/&gt;
 *         &lt;element name="deliveryDateOfTradeRegister" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="tradeRegisterDeliveryPlace" type="{http://soprabanking.com/amplitude}charMax30" minOccurs="0"/&gt;
 *         &lt;element name="validityDateOfTradeRegister" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="chamberOfCommerceCode" type="{http://soprabanking.com/amplitude}chamberOfCommerce" minOccurs="0"/&gt;
 *         &lt;element name="licenseNumber" type="{http://soprabanking.com/amplitude}charMax20" minOccurs="0"/&gt;
 *         &lt;element name="validityDateOfLicense" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerLegalInformation", propOrder = {
    "tradeRegisterNumber",
    "deliveryDateOfTradeRegister",
    "tradeRegisterDeliveryPlace",
    "validityDateOfTradeRegister",
    "chamberOfCommerceCode",
    "licenseNumber",
    "validityDateOfLicense"
})
public class CustomerLegalInformation {

    protected String tradeRegisterNumber;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deliveryDateOfTradeRegister;
    protected String tradeRegisterDeliveryPlace;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validityDateOfTradeRegister;
    protected ChamberOfCommerce chamberOfCommerceCode;
    protected String licenseNumber;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validityDateOfLicense;

    /**
     * Obtient la valeur de la propriété tradeRegisterNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeRegisterNumber() {
        return tradeRegisterNumber;
    }

    /**
     * Définit la valeur de la propriété tradeRegisterNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeRegisterNumber(String value) {
        this.tradeRegisterNumber = value;
    }

    /**
     * Obtient la valeur de la propriété deliveryDateOfTradeRegister.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryDateOfTradeRegister() {
        return deliveryDateOfTradeRegister;
    }

    /**
     * Définit la valeur de la propriété deliveryDateOfTradeRegister.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryDateOfTradeRegister(XMLGregorianCalendar value) {
        this.deliveryDateOfTradeRegister = value;
    }

    /**
     * Obtient la valeur de la propriété tradeRegisterDeliveryPlace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeRegisterDeliveryPlace() {
        return tradeRegisterDeliveryPlace;
    }

    /**
     * Définit la valeur de la propriété tradeRegisterDeliveryPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeRegisterDeliveryPlace(String value) {
        this.tradeRegisterDeliveryPlace = value;
    }

    /**
     * Obtient la valeur de la propriété validityDateOfTradeRegister.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidityDateOfTradeRegister() {
        return validityDateOfTradeRegister;
    }

    /**
     * Définit la valeur de la propriété validityDateOfTradeRegister.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidityDateOfTradeRegister(XMLGregorianCalendar value) {
        this.validityDateOfTradeRegister = value;
    }

    /**
     * Obtient la valeur de la propriété chamberOfCommerceCode.
     * 
     * @return
     *     possible object is
     *     {@link ChamberOfCommerce }
     *     
     */
    public ChamberOfCommerce getChamberOfCommerceCode() {
        return chamberOfCommerceCode;
    }

    /**
     * Définit la valeur de la propriété chamberOfCommerceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ChamberOfCommerce }
     *     
     */
    public void setChamberOfCommerceCode(ChamberOfCommerce value) {
        this.chamberOfCommerceCode = value;
    }

    /**
     * Obtient la valeur de la propriété licenseNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Définit la valeur de la propriété licenseNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNumber(String value) {
        this.licenseNumber = value;
    }

    /**
     * Obtient la valeur de la propriété validityDateOfLicense.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidityDateOfLicense() {
        return validityDateOfLicense;
    }

    /**
     * Définit la valeur de la propriété validityDateOfLicense.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidityDateOfLicense(XMLGregorianCalendar value) {
        this.validityDateOfLicense = value;
    }

}
