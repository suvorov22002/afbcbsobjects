//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.02.19 à 03:34:24 PM WAT 
//


package com.afriland.cbsobjects.responses.cbs.customer;

import com.afriland.cbsobjects.responses.cbs.customer.CustomerIdentifier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getCustomerDetailRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getCustomerDetailRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerIdentifier" type="{http://soprabanking.com/amplitude}customerIdentifier"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerDetailRequest", propOrder = {
    "customerIdentifier"
})
public class GetCustomerDetailRequest {

    @XmlElement(required = true)
    protected CustomerIdentifier customerIdentifier;

    /**
     * Obtient la valeur de la propriété customerIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIdentifier }
     *     
     */
    public CustomerIdentifier getCustomerIdentifier() {
        return customerIdentifier;
    }

    /**
     * Définit la valeur de la propriété customerIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIdentifier }
     *     
     */
    public void setCustomerIdentifier(CustomerIdentifier value) {
        this.customerIdentifier = value;
    }

}
