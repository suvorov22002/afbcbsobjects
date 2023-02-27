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
 * <p>Classe Java pour customerSituation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="customerSituation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nationalityCode" type="{http://soprabanking.com/amplitude}nationality" minOccurs="0"/&gt;
 *         &lt;element name="countryOfResidence" type="{http://soprabanking.com/amplitude}country" minOccurs="0"/&gt;
 *         &lt;element name="legalSituation" type="{http://soprabanking.com/amplitude}legalSituation" minOccurs="0"/&gt;
 *         &lt;element name="applicationDateOflegalSituation" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerSituation", propOrder = {
    "nationalityCode",
    "countryOfResidence",
    "legalSituation",
    "applicationDateOflegalSituation"
})
public class CustomerSituation {

    protected Nationality nationalityCode;
    protected Country countryOfResidence;
    protected LegalSituation legalSituation;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar applicationDateOflegalSituation;

    /**
     * Obtient la valeur de la propriété nationalityCode.
     * 
     * @return
     *     possible object is
     *     {@link Nationality }
     *     
     */
    public Nationality getNationalityCode() {
        return nationalityCode;
    }

    /**
     * Définit la valeur de la propriété nationalityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Nationality }
     *     
     */
    public void setNationalityCode(Nationality value) {
        this.nationalityCode = value;
    }

    /**
     * Obtient la valeur de la propriété countryOfResidence.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountryOfResidence() {
        return countryOfResidence;
    }

    /**
     * Définit la valeur de la propriété countryOfResidence.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountryOfResidence(Country value) {
        this.countryOfResidence = value;
    }

    /**
     * Obtient la valeur de la propriété legalSituation.
     * 
     * @return
     *     possible object is
     *     {@link LegalSituation }
     *     
     */
    public LegalSituation getLegalSituation() {
        return legalSituation;
    }

    /**
     * Définit la valeur de la propriété legalSituation.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalSituation }
     *     
     */
    public void setLegalSituation(LegalSituation value) {
        this.legalSituation = value;
    }

    /**
     * Obtient la valeur de la propriété applicationDateOflegalSituation.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplicationDateOflegalSituation() {
        return applicationDateOflegalSituation;
    }

    /**
     * Définit la valeur de la propriété applicationDateOflegalSituation.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplicationDateOflegalSituation(XMLGregorianCalendar value) {
        this.applicationDateOflegalSituation = value;
    }

}
