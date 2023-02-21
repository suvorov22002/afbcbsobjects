//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.02.19 à 03:34:24 PM WAT 
//


package com.afriland.cbsobjects.responses.cbs.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour customerEmailAddress complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="customerEmailAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customer" type="{http://soprabanking.com/amplitude}restrictedCustomer" minOccurs="0"/&gt;
 *         &lt;element name="mailType" type="{http://soprabanking.com/amplitude}mailType" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://soprabanking.com/amplitude}charMax50"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerEmailAddress", propOrder = {
    "customer",
    "mailType",
    "email"
})
public class CustomerEmailAddress {

    protected RestrictedCustomer customer;
    protected MailType mailType;
    @XmlElement(required = true)
    protected String email;

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
     * Obtient la valeur de la propriété mailType.
     * 
     * @return
     *     possible object is
     *     {@link MailType }
     *     
     */
    public MailType getMailType() {
        return mailType;
    }

    /**
     * Définit la valeur de la propriété mailType.
     * 
     * @param value
     *     allowed object is
     *     {@link MailType }
     *     
     */
    public void setMailType(MailType value) {
        this.mailType = value;
    }

    /**
     * Obtient la valeur de la propriété email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Définit la valeur de la propriété email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    @Override
    public String toString() {
        return "CustomerEmailAddress{" +
                "customer=" + customer +
                ", mailType=" + mailType +
                ", email='" + email + '\'' +
                '}';
    }
}
