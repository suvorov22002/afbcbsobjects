//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.02.22 à 03:19:28 PM WAT 
//


package com.afriland.cbsobjects.responses.cbs.account;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour additionalDataValue complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="additionalDataValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="alphanumeric" type="{http://soprabanking.com/amplitude}charMax40" minOccurs="0"/&gt;
 *         &lt;element name="amountOrRate" type="{http://soprabanking.com/amplitude}decimal22_7" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "additionalDataValue", propOrder = {
    "alphanumeric",
    "amountOrRate",
    "date"
})
public class AdditionalDataValue {

    protected String alphanumeric;
    protected BigDecimal amountOrRate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;

    /**
     * Obtient la valeur de la propriété alphanumeric.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlphanumeric() {
        return alphanumeric;
    }

    /**
     * Définit la valeur de la propriété alphanumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlphanumeric(String value) {
        this.alphanumeric = value;
    }

    /**
     * Obtient la valeur de la propriété amountOrRate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountOrRate() {
        return amountOrRate;
    }

    /**
     * Définit la valeur de la propriété amountOrRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountOrRate(BigDecimal value) {
        this.amountOrRate = value;
    }

    /**
     * Obtient la valeur de la propriété date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Définit la valeur de la propriété date.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

}
