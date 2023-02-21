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
 * <p>Classe Java pour customerIdPaper complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="customerIdPaper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://soprabanking.com/amplitude}idPaperType" minOccurs="0"/&gt;
 *         &lt;element name="idPaperNumber" type="{http://soprabanking.com/amplitude}charMax20" minOccurs="0"/&gt;
 *         &lt;element name="idPaperDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="idPaperDeliveryPlace" type="{http://soprabanking.com/amplitude}charMax30" minOccurs="0"/&gt;
 *         &lt;element name="organisationWhichDeliver" type="{http://soprabanking.com/amplitude}charMax30" minOccurs="0"/&gt;
 *         &lt;element name="idPaperValidityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="nationalIdentifier" type="{http://soprabanking.com/amplitude}charMax20" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerIdPaper", propOrder = {
    "type",
    "idPaperNumber",
    "idPaperDeliveryDate",
    "idPaperDeliveryPlace",
    "organisationWhichDeliver",
    "idPaperValidityDate",
    "nationalIdentifier"
})
public class CustomerIdPaper {

    protected IdPaperType type;
    protected String idPaperNumber;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar idPaperDeliveryDate;
    protected String idPaperDeliveryPlace;
    protected String organisationWhichDeliver;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar idPaperValidityDate;
    protected String nationalIdentifier;

    /**
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link IdPaperType }
     *     
     */
    public IdPaperType getType() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link IdPaperType }
     *     
     */
    public void setType(IdPaperType value) {
        this.type = value;
    }

    /**
     * Obtient la valeur de la propriété idPaperNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPaperNumber() {
        return idPaperNumber;
    }

    /**
     * Définit la valeur de la propriété idPaperNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPaperNumber(String value) {
        this.idPaperNumber = value;
    }

    /**
     * Obtient la valeur de la propriété idPaperDeliveryDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIdPaperDeliveryDate() {
        return idPaperDeliveryDate;
    }

    /**
     * Définit la valeur de la propriété idPaperDeliveryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIdPaperDeliveryDate(XMLGregorianCalendar value) {
        this.idPaperDeliveryDate = value;
    }

    /**
     * Obtient la valeur de la propriété idPaperDeliveryPlace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPaperDeliveryPlace() {
        return idPaperDeliveryPlace;
    }

    /**
     * Définit la valeur de la propriété idPaperDeliveryPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPaperDeliveryPlace(String value) {
        this.idPaperDeliveryPlace = value;
    }

    /**
     * Obtient la valeur de la propriété organisationWhichDeliver.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationWhichDeliver() {
        return organisationWhichDeliver;
    }

    /**
     * Définit la valeur de la propriété organisationWhichDeliver.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationWhichDeliver(String value) {
        this.organisationWhichDeliver = value;
    }

    /**
     * Obtient la valeur de la propriété idPaperValidityDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIdPaperValidityDate() {
        return idPaperValidityDate;
    }

    /**
     * Définit la valeur de la propriété idPaperValidityDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIdPaperValidityDate(XMLGregorianCalendar value) {
        this.idPaperValidityDate = value;
    }

    /**
     * Obtient la valeur de la propriété nationalIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalIdentifier() {
        return nationalIdentifier;
    }

    /**
     * Définit la valeur de la propriété nationalIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalIdentifier(String value) {
        this.nationalIdentifier = value;
    }

}
