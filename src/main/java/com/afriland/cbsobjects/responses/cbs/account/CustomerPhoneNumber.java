//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.02.22 à 03:19:28 PM WAT 
//


package com.afriland.cbsobjects.responses.cbs.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour customerPhoneNumber complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="customerPhoneNumber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customer" type="{http://soprabanking.com/amplitude}restrictedCustomer" minOccurs="0"/&gt;
 *         &lt;element name="phoneType" type="{http://soprabanking.com/amplitude}phoneType" minOccurs="0"/&gt;
 *         &lt;element name="phoneNumber" type="{http://soprabanking.com/amplitude}charMax20"/&gt;
 *         &lt;element name="formatOfTelephoneNumber" type="{http://soprabanking.com/amplitude}formatOfTelephoneNumber" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerPhoneNumber", propOrder = {
    "customer",
    "phoneType",
    "phoneNumber",
    "formatOfTelephoneNumber"
})
public class CustomerPhoneNumber {

    protected RestrictedCustomer customer;
    protected PhoneType phoneType;
    @XmlElement(required = true)
    protected String phoneNumber;
    protected FormatOfTelephoneNumber formatOfTelephoneNumber;

    /**
     * Obtient la valeur de la propriété customer.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedCustomer }
     *     
     */
    public RestrictedCustomer getCustomer() {
        return customer;
    }

    /**
     * Définit la valeur de la propriété customer.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedCustomer }
     *     
     */
    public void setCustomer(RestrictedCustomer value) {
        this.customer = value;
    }

    /**
     * Obtient la valeur de la propriété phoneType.
     * 
     * @return
     *     possible object is
     *     {@link PhoneType }
     *     
     */
    public PhoneType getPhoneType() {
        return phoneType;
    }

    /**
     * Définit la valeur de la propriété phoneType.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneType }
     *     
     */
    public void setPhoneType(PhoneType value) {
        this.phoneType = value;
    }

    /**
     * Obtient la valeur de la propriété phoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Définit la valeur de la propriété phoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Obtient la valeur de la propriété formatOfTelephoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link FormatOfTelephoneNumber }
     *     
     */
    public FormatOfTelephoneNumber getFormatOfTelephoneNumber() {
        return formatOfTelephoneNumber;
    }

    /**
     * Définit la valeur de la propriété formatOfTelephoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatOfTelephoneNumber }
     *     
     */
    public void setFormatOfTelephoneNumber(FormatOfTelephoneNumber value) {
        this.formatOfTelephoneNumber = value;
    }

}
