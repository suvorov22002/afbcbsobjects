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
 * <p>Classe Java pour getCustomerDetailResponseFlow complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getCustomerDetailResponseFlow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="responseHeader" type="{http://soprabanking.com/amplitude}responseHeader"/&gt;
 *         &lt;element name="responseStatus" type="{http://soprabanking.com/amplitude}responseStatus"/&gt;
 *         &lt;element name="getCustomerDetailResponse" type="{http://soprabanking.com/amplitude}getCustomerDetailResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerDetailResponseFlow", propOrder = {
    "responseHeader",
    "responseStatus",
    "getCustomerDetailResponse"
})
public class GetCustomerDetailResponseFlow {

    @XmlElement(required = true)
    protected ResponseHeader responseHeader;
    @XmlElement(required = true)
    protected ResponseStatus responseStatus;
    protected GetCustomerDetailResponse getCustomerDetailResponse;


    /**
     * Obtient la valeur de la propriété responseHeader.
     * 
     * @return
     *     possible object is
     *     {@link ResponseHeader }
     *     
     */
    public ResponseHeader getResponseHeader() {
        return responseHeader;
    }

    /**
     * Définit la valeur de la propriété responseHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseHeader }
     *     
     */
    public void setResponseHeader(ResponseHeader value) {
        this.responseHeader = value;
    }

    /**
     * Obtient la valeur de la propriété responseStatus.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatus }
     *     
     */
    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    /**
     * Définit la valeur de la propriété responseStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatus }
     *     
     */
    public void setResponseStatus(ResponseStatus value) {
        this.responseStatus = value;
    }

    /**
     * Obtient la valeur de la propriété getCustomerDetailResponse.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomerDetailResponse }
     *     
     */
    public GetCustomerDetailResponse getGetCustomerDetailResponse() {
        return getCustomerDetailResponse;
    }

    /**
     * Définit la valeur de la propriété getCustomerDetailResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomerDetailResponse }
     *     
     */
    public void setGetCustomerDetailResponse(GetCustomerDetailResponse value) {
        this.getCustomerDetailResponse = value;
    }

    @Override
    public String toString() {
        return "GetCustomerDetailResponseFlow{" +
                "responseHeader=" + responseHeader +
                ", responseStatus=" + responseStatus +
                ", getCustomerDetailResponse=" + getCustomerDetailResponse +
                '}';
    }
}
