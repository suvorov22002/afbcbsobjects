//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.02.19 à 03:34:24 PM WAT 
//


package com.afriland.cbsobjects.responses.cbs.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour customerPaymentMethods complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="customerPaymentMethods"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chequeBookFacilitySuspension" type="{http://soprabanking.com/amplitude}char1" minOccurs="0"/&gt;
 *         &lt;element name="chequeBookFacilitySuspensionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="withdrawalOfCreditCard" type="{http://soprabanking.com/amplitude}char1" minOccurs="0"/&gt;
 *         &lt;element name="dateOfWithdrawalOfCreditCard" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerPaymentMethods", propOrder = {
    "chequeBookFacilitySuspension",
    "chequeBookFacilitySuspensionDate",
    "withdrawalOfCreditCard",
    "dateOfWithdrawalOfCreditCard"
})
public class CustomerPaymentMethods {

    protected String chequeBookFacilitySuspension;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar chequeBookFacilitySuspensionDate;
    protected String withdrawalOfCreditCard;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfWithdrawalOfCreditCard;

    /**
     * Obtient la valeur de la propriété chequeBookFacilitySuspension.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChequeBookFacilitySuspension() {
        return chequeBookFacilitySuspension;
    }

    /**
     * Définit la valeur de la propriété chequeBookFacilitySuspension.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChequeBookFacilitySuspension(String value) {
        this.chequeBookFacilitySuspension = value;
    }

    /**
     * Obtient la valeur de la propriété chequeBookFacilitySuspensionDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChequeBookFacilitySuspensionDate() {
        return chequeBookFacilitySuspensionDate;
    }

    /**
     * Définit la valeur de la propriété chequeBookFacilitySuspensionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChequeBookFacilitySuspensionDate(XMLGregorianCalendar value) {
        this.chequeBookFacilitySuspensionDate = value;
    }

    /**
     * Obtient la valeur de la propriété withdrawalOfCreditCard.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithdrawalOfCreditCard() {
        return withdrawalOfCreditCard;
    }

    /**
     * Définit la valeur de la propriété withdrawalOfCreditCard.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithdrawalOfCreditCard(String value) {
        this.withdrawalOfCreditCard = value;
    }

    /**
     * Obtient la valeur de la propriété dateOfWithdrawalOfCreditCard.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfWithdrawalOfCreditCard() {
        return dateOfWithdrawalOfCreditCard;
    }

    /**
     * Définit la valeur de la propriété dateOfWithdrawalOfCreditCard.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfWithdrawalOfCreditCard(XMLGregorianCalendar value) {
        this.dateOfWithdrawalOfCreditCard = value;
    }

}
