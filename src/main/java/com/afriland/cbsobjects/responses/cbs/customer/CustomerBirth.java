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
import java.util.GregorianCalendar;


/**
 * <p>Classe Java pour customerBirth complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="customerBirth"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="holderSex" type="{http://soprabanking.com/amplitude}sex" minOccurs="0"/&gt;
 *         &lt;element name="maidenName" type="{http://soprabanking.com/amplitude}charMax36" minOccurs="0"/&gt;
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="birthCity" type="{http://soprabanking.com/amplitude}charMax30" minOccurs="0"/&gt;
 *         &lt;element name="birthCounty" type="{http://soprabanking.com/amplitude}charMax30" minOccurs="0"/&gt;
 *         &lt;element name="birthRegion" type="{http://soprabanking.com/amplitude}charMax50" minOccurs="0"/&gt;
 *         &lt;element name="birthCountry" type="{http://soprabanking.com/amplitude}country" minOccurs="0"/&gt;
 *         &lt;element name="birthTownCode" type="{http://soprabanking.com/amplitude}charMax6" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerBirth", propOrder = {
    "holderSex",
    "maidenName",
    "birthDate",
    "birthCity",
    "birthCounty",
    "birthRegion",
    "birthCountry",
    "birthTownCode"
})
public class CustomerBirth {

    protected String holderSex;
    protected String maidenName;
   // @XmlSchemaType(name = "date")
    protected String birthDate;
    protected String birthCity;
    protected String birthCounty;
    protected String birthRegion;
    protected Country birthCountry;
    protected String birthTownCode;

    /**
     * Obtient la valeur de la propriété holderSex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderSex() {
        return holderSex;
    }

    /**
     * Définit la valeur de la propriété holderSex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderSex(String value) {
        this.holderSex = value;
    }

    /**
     * Obtient la valeur de la propriété maidenName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaidenName() {
        return maidenName;
    }

    /**
     * Définit la valeur de la propriété maidenName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaidenName(String value) {
        this.maidenName = value;
    }

    /**
     * Obtient la valeur de la propriété birthDate.
     * 
     * @return
     *     possible object is
     *     {@link GregorianCalendar }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Définit la valeur de la propriété birthDate.
     * 
     * @param value
     *     allowed object is
     *     {@link GregorianCalendar }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Obtient la valeur de la propriété birthCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthCity() {
        return birthCity;
    }

    /**
     * Définit la valeur de la propriété birthCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthCity(String value) {
        this.birthCity = value;
    }

    /**
     * Obtient la valeur de la propriété birthCounty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthCounty() {
        return birthCounty;
    }

    /**
     * Définit la valeur de la propriété birthCounty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthCounty(String value) {
        this.birthCounty = value;
    }

    /**
     * Obtient la valeur de la propriété birthRegion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthRegion() {
        return birthRegion;
    }

    /**
     * Définit la valeur de la propriété birthRegion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthRegion(String value) {
        this.birthRegion = value;
    }

    /**
     * Obtient la valeur de la propriété birthCountry.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getBirthCountry() {
        return birthCountry;
    }

    /**
     * Définit la valeur de la propriété birthCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setBirthCountry(Country value) {
        this.birthCountry = value;
    }

    /**
     * Obtient la valeur de la propriété birthTownCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthTownCode() {
        return birthTownCode;
    }

    /**
     * Définit la valeur de la propriété birthTownCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthTownCode(String value) {
        this.birthTownCode = value;
    }

}
