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


/**
 * <p>Classe Java pour customerFreeAttributeInfo complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="customerFreeAttributeInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://soprabanking.com/amplitude}charMax10" minOccurs="0"/&gt;
 *         &lt;element name="designation" type="{http://soprabanking.com/amplitude}charMax30" minOccurs="0"/&gt;
 *         &lt;element name="dataFormat" type="{http://soprabanking.com/amplitude}freeAttributeFormat" minOccurs="0"/&gt;
 *         &lt;element name="totalLengthIfAlpha" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numberOfDecimalsIfAmountOrRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="managementMethod" type="{http://soprabanking.com/amplitude}additionalDataManagementMethod" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerFreeAttributeInfo", propOrder = {
    "code",
    "designation",
    "dataFormat",
    "totalLengthIfAlpha",
    "numberOfDecimalsIfAmountOrRate",
    "managementMethod"
})
public class CustomerFreeAttributeInfo {

    protected String code;
    protected String designation;
    @XmlSchemaType(name = "string")
    protected FreeAttributeFormat dataFormat;
    protected Integer totalLengthIfAlpha;
    protected Integer numberOfDecimalsIfAmountOrRate;
    protected String managementMethod;

    /**
     * Obtient la valeur de la propriété code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Définit la valeur de la propriété code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Obtient la valeur de la propriété designation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Définit la valeur de la propriété designation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignation(String value) {
        this.designation = value;
    }

    /**
     * Obtient la valeur de la propriété dataFormat.
     * 
     * @return
     *     possible object is
     *     {@link FreeAttributeFormat }
     *     
     */
    public FreeAttributeFormat getDataFormat() {
        return dataFormat;
    }

    /**
     * Définit la valeur de la propriété dataFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeAttributeFormat }
     *     
     */
    public void setDataFormat(FreeAttributeFormat value) {
        this.dataFormat = value;
    }

    /**
     * Obtient la valeur de la propriété totalLengthIfAlpha.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalLengthIfAlpha() {
        return totalLengthIfAlpha;
    }

    /**
     * Définit la valeur de la propriété totalLengthIfAlpha.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalLengthIfAlpha(Integer value) {
        this.totalLengthIfAlpha = value;
    }

    /**
     * Obtient la valeur de la propriété numberOfDecimalsIfAmountOrRate.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfDecimalsIfAmountOrRate() {
        return numberOfDecimalsIfAmountOrRate;
    }

    /**
     * Définit la valeur de la propriété numberOfDecimalsIfAmountOrRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfDecimalsIfAmountOrRate(Integer value) {
        this.numberOfDecimalsIfAmountOrRate = value;
    }

    /**
     * Obtient la valeur de la propriété managementMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementMethod() {
        return managementMethod;
    }

    /**
     * Définit la valeur de la propriété managementMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementMethod(String value) {
        this.managementMethod = value;
    }

}
