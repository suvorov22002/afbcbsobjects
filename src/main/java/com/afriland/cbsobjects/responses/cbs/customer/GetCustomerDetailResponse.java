//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.02.19 à 03:34:24 PM WAT 
//


package com.afriland.cbsobjects.responses.cbs.customer;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getCustomerDetailResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getCustomerDetailResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerCode" type="{http://soprabanking.com/amplitude}charMax15" minOccurs="0"/&gt;
 *         &lt;element name="customerType" type="{http://soprabanking.com/amplitude}customerType" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://soprabanking.com/amplitude}language" minOccurs="0"/&gt;
 *         &lt;element name="titleCode" type="{http://soprabanking.com/amplitude}titleCode" minOccurs="0"/&gt;
 *         &lt;element name="lastname" type="{http://soprabanking.com/amplitude}charMax36" minOccurs="0"/&gt;
 *         &lt;element name="nameToReturn" type="{http://soprabanking.com/amplitude}charMax67" minOccurs="0"/&gt;
 *         &lt;element name="abbreviation" type="{http://soprabanking.com/amplitude}charMax20" minOccurs="0"/&gt;
 *         &lt;element name="freeFieldCode1" type="{http://soprabanking.com/amplitude}customerFreeField1" minOccurs="0"/&gt;
 *         &lt;element name="freeFieldCode2" type="{http://soprabanking.com/amplitude}customerFreeField2" minOccurs="0"/&gt;
 *         &lt;element name="freeFieldCode3" type="{http://soprabanking.com/amplitude}customerFreeField3" minOccurs="0"/&gt;
 *         &lt;element name="externalIdentifier" type="{http://soprabanking.com/amplitude}charMax25" minOccurs="0"/&gt;
 *         &lt;element name="situation" type="{http://soprabanking.com/amplitude}customerSituation" minOccurs="0"/&gt;
 *         &lt;element name="fatca" type="{http://soprabanking.com/amplitude}customerFatca" minOccurs="0"/&gt;
 *         &lt;element name="specificInformation" type="{http://soprabanking.com/amplitude}customerSpecInfo" minOccurs="0"/&gt;
 *         &lt;element name="generalAttributes" type="{http://soprabanking.com/amplitude}customerGeneralAttributes" minOccurs="0"/&gt;
 *         &lt;element name="reportingAttributes" type="{http://soprabanking.com/amplitude}customerReportingAttributes" minOccurs="0"/&gt;
 *         &lt;element name="paymentMethods" type="{http://soprabanking.com/amplitude}customerPaymentMethods" minOccurs="0"/&gt;
 *         &lt;element name="additionnalInformation" type="{http://soprabanking.com/amplitude}customerAdditionalInformation" minOccurs="0"/&gt;
 *         &lt;element name="addressesDetail" type="{http://soprabanking.com/amplitude}getCustomerAddressDetailResponse" minOccurs="0"/&gt;
 *         &lt;element name="phoneNumbers" type="{http://soprabanking.com/amplitude}getCustomerPhoneNumberListResponse" minOccurs="0"/&gt;
 *         &lt;element name="emailAdresses" type="{http://soprabanking.com/amplitude}getCustomerEmailAddressListResponse" minOccurs="0"/&gt;
 *         &lt;element name="freeAttributesDetail" type="{http://soprabanking.com/amplitude}customerFreeAttributesDetail" minOccurs="0"/&gt;
 *         &lt;element name="activeProfile" type="{http://soprabanking.com/amplitude}getCustomerActiveProfileResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerDetailResponse", propOrder = {
    "customerCode",
    "customerType",
    "language",
    "titleCode",
    "lastname",
    "nameToReturn",
    "abbreviation",
    "freeFieldCode1",
    "freeFieldCode2",
    "freeFieldCode3",
    "externalIdentifier",
    "situation",
    "fatca",
    "specificInformation",
    "generalAttributes",
    "reportingAttributes",
    "paymentMethods",
    "additionnalInformation",
    "addressesDetail",
    "phoneNumbers",
    "emailAdresses",
    "freeAttributesDetail",
    "activeProfile"
})
public class GetCustomerDetailResponse {

    protected String customerCode;
    protected String customerType;
    protected Language language;
    protected TitleCode titleCode;
    protected String lastname;
    protected String nameToReturn;
    protected Object abbreviation;
    protected FreeFieldCode1 freeFieldCode1;
    protected FreeFieldCode2 freeFieldCode2;
    protected FreeFieldCode3 freeFieldCode3;
	protected String externalIdentifier;
    protected Situation situation;
    protected Fatca fatca;
    protected SpecificInformation specificInformation;
    protected GeneralAttributes generalAttributes;
    protected ReportingAttributes reportingAttributes;
    protected PaymentMethods paymentMethods;
    protected AdditionnalInformation additionnalInformation;
    protected AddressesDetail addressesDetail;
    protected PhoneNumbers phoneNumbers;
    protected EmailAdresses emailAdresses;
    protected FreeAttributesDetail freeAttributesDetail;
    protected ActiveProfile activeProfile;

    

}
