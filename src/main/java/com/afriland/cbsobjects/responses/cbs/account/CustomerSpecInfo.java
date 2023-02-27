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
 * <p>Classe Java pour customerSpecInfo complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="customerSpecInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="individualSpecInfo" type="{http://soprabanking.com/amplitude}customerIndividualSpecInfo" minOccurs="0"/&gt;
 *         &lt;element name="corporateSpecInfo" type="{http://soprabanking.com/amplitude}customerCorporateSpecInfo" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerSpecInfo", propOrder = {
    "individualSpecInfo",
    "corporateSpecInfo"
})
public class CustomerSpecInfo {

    protected CustomerIndividualSpecInfo individualSpecInfo;
    protected CustomerCorporateSpecInfo corporateSpecInfo;

    /**
     * Obtient la valeur de la propriété individualSpecInfo.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIndividualSpecInfo }
     *     
     */
    public CustomerIndividualSpecInfo getIndividualSpecInfo() {
        return individualSpecInfo;
    }

    /**
     * Définit la valeur de la propriété individualSpecInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIndividualSpecInfo }
     *     
     */
    public void setIndividualSpecInfo(CustomerIndividualSpecInfo value) {
        this.individualSpecInfo = value;
    }

    /**
     * Obtient la valeur de la propriété corporateSpecInfo.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCorporateSpecInfo }
     *     
     */
    public CustomerCorporateSpecInfo getCorporateSpecInfo() {
        return corporateSpecInfo;
    }

    /**
     * Définit la valeur de la propriété corporateSpecInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCorporateSpecInfo }
     *     
     */
    public void setCorporateSpecInfo(CustomerCorporateSpecInfo value) {
        this.corporateSpecInfo = value;
    }

}
