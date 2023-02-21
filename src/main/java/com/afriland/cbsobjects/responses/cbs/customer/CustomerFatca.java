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
 * <p>Classe Java pour customerFatca complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="customerFatca"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fatcaStatus" type="{http://soprabanking.com/amplitude}fatcaStatus" minOccurs="0"/&gt;
 *         &lt;element name="fatcaStatusDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="fatcaStatusUpdateUser" type="{http://soprabanking.com/amplitude}user" minOccurs="0"/&gt;
 *         &lt;element name="crsStatus" type="{http://soprabanking.com/amplitude}crsStatus" minOccurs="0"/&gt;
 *         &lt;element name="crsStatusDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="crsStatusUpdateUser" type="{http://soprabanking.com/amplitude}user" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerFatca", propOrder = {
    "fatcaStatus",
    "fatcaStatusDate",
    "fatcaStatusUpdateUser",
    "crsStatus",
    "crsStatusDate",
    "crsStatusUpdateUser"
})
public class CustomerFatca {

    protected FatcaStatus fatcaStatus;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fatcaStatusDate;
    protected User fatcaStatusUpdateUser;
    protected CrsStatus crsStatus;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar crsStatusDate;
    protected User crsStatusUpdateUser;

    /**
     * Obtient la valeur de la propriété fatcaStatus.
     * 
     * @return
     *     possible object is
     *     {@link FatcaStatus }
     *     
     */
    public FatcaStatus getFatcaStatus() {
        return fatcaStatus;
    }

    /**
     * Définit la valeur de la propriété fatcaStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link FatcaStatus }
     *     
     */
    public void setFatcaStatus(FatcaStatus value) {
        this.fatcaStatus = value;
    }

    /**
     * Obtient la valeur de la propriété fatcaStatusDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFatcaStatusDate() {
        return fatcaStatusDate;
    }

    /**
     * Définit la valeur de la propriété fatcaStatusDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFatcaStatusDate(XMLGregorianCalendar value) {
        this.fatcaStatusDate = value;
    }

    /**
     * Obtient la valeur de la propriété fatcaStatusUpdateUser.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getFatcaStatusUpdateUser() {
        return fatcaStatusUpdateUser;
    }

    /**
     * Définit la valeur de la propriété fatcaStatusUpdateUser.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setFatcaStatusUpdateUser(User value) {
        this.fatcaStatusUpdateUser = value;
    }

    /**
     * Obtient la valeur de la propriété crsStatus.
     * 
     * @return
     *     possible object is
     *     {@link CrsStatus }
     *     
     */
    public CrsStatus getCrsStatus() {
        return crsStatus;
    }

    /**
     * Définit la valeur de la propriété crsStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link CrsStatus }
     *     
     */
    public void setCrsStatus(CrsStatus value) {
        this.crsStatus = value;
    }

    /**
     * Obtient la valeur de la propriété crsStatusDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCrsStatusDate() {
        return crsStatusDate;
    }

    /**
     * Définit la valeur de la propriété crsStatusDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCrsStatusDate(XMLGregorianCalendar value) {
        this.crsStatusDate = value;
    }

    /**
     * Obtient la valeur de la propriété crsStatusUpdateUser.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getCrsStatusUpdateUser() {
        return crsStatusUpdateUser;
    }

    /**
     * Définit la valeur de la propriété crsStatusUpdateUser.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setCrsStatusUpdateUser(User value) {
        this.crsStatusUpdateUser = value;
    }

}
