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


/**
 * <p>Classe Java pour customerOtherAttributes complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="customerOtherAttributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="holderMotherName" type="{http://soprabanking.com/amplitude}charMax67" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerOtherAttributes", propOrder = {
    "holderMotherName"
})
public class CustomerOtherAttributes {

    protected String holderMotherName;

    /**
     * Obtient la valeur de la propriété holderMotherName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderMotherName() {
        return holderMotherName;
    }

    /**
     * Définit la valeur de la propriété holderMotherName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderMotherName(String value) {
        this.holderMotherName = value;
    }

}
