//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.02.22 à 03:19:28 PM WAT 
//


package com.afriland.cbsobjects.responses.cbs.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour customerCorporateId complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="customerCorporateId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nationalIdentifier" type="{http://soprabanking.com/amplitude}charMax20" minOccurs="0"/&gt;
 *         &lt;element name="socialIdentityNumber" type="{http://soprabanking.com/amplitude}charMax20" minOccurs="0"/&gt;
 *         &lt;element name="taxIdentityNumber" type="{http://soprabanking.com/amplitude}charMax20" minOccurs="0"/&gt;
 *         &lt;element name="abbreviation" type="{http://soprabanking.com/amplitude}charMax20" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerCorporateId", propOrder = {
    "nationalIdentifier",
    "socialIdentityNumber",
    "taxIdentityNumber",
    "abbreviation"
})
public class CustomerCorporateId {

    protected String nationalIdentifier;
    protected String socialIdentityNumber;
    protected String taxIdentityNumber;
    protected String abbreviation;

    /**
     * Obtient la valeur de la propriété nationalIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalIdentifier() {
        return nationalIdentifier;
    }

    /**
     * Définit la valeur de la propriété nationalIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalIdentifier(String value) {
        this.nationalIdentifier = value;
    }

    /**
     * Obtient la valeur de la propriété socialIdentityNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialIdentityNumber() {
        return socialIdentityNumber;
    }

    /**
     * Définit la valeur de la propriété socialIdentityNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialIdentityNumber(String value) {
        this.socialIdentityNumber = value;
    }

    /**
     * Obtient la valeur de la propriété taxIdentityNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdentityNumber() {
        return taxIdentityNumber;
    }

    /**
     * Définit la valeur de la propriété taxIdentityNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIdentityNumber(String value) {
        this.taxIdentityNumber = value;
    }

    /**
     * Obtient la valeur de la propriété abbreviation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Définit la valeur de la propriété abbreviation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbreviation(String value) {
        this.abbreviation = value;
    }

}
