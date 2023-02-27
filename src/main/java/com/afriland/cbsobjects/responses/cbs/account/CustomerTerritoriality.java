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
 * <p>Classe Java pour customerTerritoriality complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="customerTerritoriality"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="territorialityCode" type="{http://soprabanking.com/amplitude}territorialityCode" minOccurs="0"/&gt;
 *         &lt;element name="spouseTerritorialityCode" type="{http://soprabanking.com/amplitude}territorialityCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerTerritoriality", propOrder = {
    "territorialityCode",
    "spouseTerritorialityCode"
})
public class CustomerTerritoriality {

    protected TerritorialityCode territorialityCode;
    protected TerritorialityCode spouseTerritorialityCode;

    /**
     * Obtient la valeur de la propriété territorialityCode.
     * 
     * @return
     *     possible object is
     *     {@link TerritorialityCode }
     *     
     */
    public TerritorialityCode getTerritorialityCode() {
        return territorialityCode;
    }

    /**
     * Définit la valeur de la propriété territorialityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TerritorialityCode }
     *     
     */
    public void setTerritorialityCode(TerritorialityCode value) {
        this.territorialityCode = value;
    }

    /**
     * Obtient la valeur de la propriété spouseTerritorialityCode.
     * 
     * @return
     *     possible object is
     *     {@link TerritorialityCode }
     *     
     */
    public TerritorialityCode getSpouseTerritorialityCode() {
        return spouseTerritorialityCode;
    }

    /**
     * Définit la valeur de la propriété spouseTerritorialityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TerritorialityCode }
     *     
     */
    public void setSpouseTerritorialityCode(TerritorialityCode value) {
        this.spouseTerritorialityCode = value;
    }

}
