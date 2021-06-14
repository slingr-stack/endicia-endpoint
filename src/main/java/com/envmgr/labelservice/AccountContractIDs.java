
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AccountContractIDs complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccountContractIDs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DomesticCID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InternationalCID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountContractIDs", propOrder = {
    "domesticCID",
    "internationalCID"
})
public class AccountContractIDs {

    @XmlElement(name = "DomesticCID")
    protected String domesticCID;
    @XmlElement(name = "InternationalCID")
    protected String internationalCID;

    /**
     * Obtiene el valor de la propiedad domesticCID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomesticCID() {
        return domesticCID;
    }

    /**
     * Define el valor de la propiedad domesticCID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomesticCID(String value) {
        this.domesticCID = value;
    }

    /**
     * Obtiene el valor de la propiedad internationalCID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalCID() {
        return internationalCID;
    }

    /**
     * Define el valor de la propiedad internationalCID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalCID(String value) {
        this.internationalCID = value;
    }

}
