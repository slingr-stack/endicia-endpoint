
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Colors complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Colors"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Primary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Secondary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tertiary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Colors", propOrder = {
    "primary",
    "secondary",
    "tertiary"
})
public class Colors {

    @XmlElement(name = "Primary")
    protected String primary;
    @XmlElement(name = "Secondary")
    protected String secondary;
    @XmlElement(name = "Tertiary")
    protected String tertiary;

    /**
     * Obtiene el valor de la propiedad primary.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimary() {
        return primary;
    }

    /**
     * Define el valor de la propiedad primary.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimary(String value) {
        this.primary = value;
    }

    /**
     * Obtiene el valor de la propiedad secondary.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondary() {
        return secondary;
    }

    /**
     * Define el valor de la propiedad secondary.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondary(String value) {
        this.secondary = value;
    }

    /**
     * Obtiene el valor de la propiedad tertiary.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTertiary() {
        return tertiary;
    }

    /**
     * Define el valor de la propiedad tertiary.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTertiary(String value) {
        this.tertiary = value;
    }

}
