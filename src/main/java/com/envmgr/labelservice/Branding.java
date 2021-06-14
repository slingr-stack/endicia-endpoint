
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Branding complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Branding"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BrandingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BrandingProperties" type="{www.envmgr.com/LabelService}BrandingProperties" minOccurs="0"/&gt;
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Branding", propOrder = {
    "brandingId",
    "brandingProperties",
    "reference"
})
public class Branding {

    @XmlElement(name = "BrandingId")
    protected String brandingId;
    @XmlElement(name = "BrandingProperties")
    protected BrandingProperties brandingProperties;
    @XmlElement(name = "Reference")
    protected String reference;

    /**
     * Obtiene el valor de la propiedad brandingId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandingId() {
        return brandingId;
    }

    /**
     * Define el valor de la propiedad brandingId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandingId(String value) {
        this.brandingId = value;
    }

    /**
     * Obtiene el valor de la propiedad brandingProperties.
     * 
     * @return
     *     possible object is
     *     {@link BrandingProperties }
     *     
     */
    public BrandingProperties getBrandingProperties() {
        return brandingProperties;
    }

    /**
     * Define el valor de la propiedad brandingProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandingProperties }
     *     
     */
    public void setBrandingProperties(BrandingProperties value) {
        this.brandingProperties = value;
    }

    /**
     * Obtiene el valor de la propiedad reference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Define el valor de la propiedad reference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

}
