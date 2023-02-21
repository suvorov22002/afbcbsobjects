//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.02.19 à 03:34:24 PM WAT 
//


package com.afriland.cbsobjects.responses.cbs.customer;

import com.afriland.cbsobjects.responses.cbs.customer.Language;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.util.GregorianCalendar;


/**
 * <p>Classe Java pour responseHeader complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="responseHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requestId" type="{http://soprabanking.com/amplitude}charMax50"/&gt;
 *         &lt;element name="responseId" type="{http://soprabanking.com/amplitude}charMax50"/&gt;
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="serviceVersion" type="{http://soprabanking.com/amplitude}charMax10"/&gt;
 *         &lt;element name="language" type="{http://soprabanking.com/amplitude}language" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseHeader", propOrder = {
    "requestId",
    "responseId",
    "timestamp",
    "serviceVersion",
    "language"
})
public class ResponseHeader {

    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(required = true)
    protected String responseId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected GregorianCalendar timestamp;
    @XmlElement(required = true)
    protected String serviceVersion;
    protected Language language;

    /**
     * Obtient la valeur de la propriété requestId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Définit la valeur de la propriété requestId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Obtient la valeur de la propriété responseId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseId() {
        return responseId;
    }

    /**
     * Définit la valeur de la propriété responseId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseId(String value) {
        this.responseId = value;
    }

    /**
     * Obtient la valeur de la propriété timestamp.
     * 
     * @return
     *     possible object is
     *     {@link GregorianCalendar }
     *     
     */
    public GregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Définit la valeur de la propriété timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link GregorianCalendar }
     *     
     */
    public void setTimestamp(GregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Obtient la valeur de la propriété serviceVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceVersion() {
        return serviceVersion;
    }

    /**
     * Définit la valeur de la propriété serviceVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceVersion(String value) {
        this.serviceVersion = value;
    }

    /**
     * Obtient la valeur de la propriété language.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * Définit la valeur de la propriété language.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setLanguage(Language value) {
        this.language = value;
    }

    @Override
    public String toString() {
        return "ResponseHeader{" +
                "requestId='" + requestId + '\n' +
                ", responseId='" + responseId + '\n' +
                ", timestamp=" + timestamp +
                ", serviceVersion='" + serviceVersion + '\n' +
                ", language=" + language +
                '}';
    }
}
