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
 * <p>Classe Java pour fatcaStatus complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="fatcaStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fatcaStatusCode" type="{http://soprabanking.com/amplitude}fatcaStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="designation" type="{http://soprabanking.com/amplitude}charMax30" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fatcaStatus", propOrder = {
    "fatcaStatusCode",
    "designation"
})
public class FatcaStatus {

    protected String fatcaStatusCode;
    protected String designation;

    /**
     * Obtient la valeur de la propriété fatcaStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatcaStatusCode() {
        return fatcaStatusCode;
    }

    /**
     * Définit la valeur de la propriété fatcaStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatcaStatusCode(String value) {
        this.fatcaStatusCode = value;
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

}