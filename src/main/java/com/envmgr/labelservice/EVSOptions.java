
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eVSOptions complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eVSOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PermitNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eVSMailerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eVSOptions", propOrder = {
    "permitNumber",
    "evsMailerId"
})
public class EVSOptions {

    @XmlElement(name = "PermitNumber")
    protected String permitNumber;
    @XmlElement(name = "eVSMailerId")
    protected String evsMailerId;

    /**
     * Obtiene el valor de la propiedad permitNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermitNumber() {
        return permitNumber;
    }

    /**
     * Define el valor de la propiedad permitNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermitNumber(String value) {
        this.permitNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad evsMailerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVSMailerId() {
        return evsMailerId;
    }

    /**
     * Define el valor de la propiedad evsMailerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVSMailerId(String value) {
        this.evsMailerId = value;
    }

}
