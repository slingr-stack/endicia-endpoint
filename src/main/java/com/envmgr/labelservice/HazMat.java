
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HazMat complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HazMat"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HazMatDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HazMatPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazMat", propOrder = {
    "hazMatDescription",
    "hazMatPhone"
})
public class HazMat {

    @XmlElement(name = "HazMatDescription")
    protected String hazMatDescription;
    @XmlElement(name = "HazMatPhone")
    protected String hazMatPhone;

    /**
     * Obtiene el valor de la propiedad hazMatDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazMatDescription() {
        return hazMatDescription;
    }

    /**
     * Define el valor de la propiedad hazMatDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazMatDescription(String value) {
        this.hazMatDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad hazMatPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazMatPhone() {
        return hazMatPhone;
    }

    /**
     * Define el valor de la propiedad hazMatPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazMatPhone(String value) {
        this.hazMatPhone = value;
    }

}
