
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ContentBlock complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ContentBlock"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContentBlockType" type="{www.envmgr.com/LabelService}ContentBlockType"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentBlock", propOrder = {
    "contentBlockType",
    "value"
})
public class ContentBlock {

    @XmlElement(name = "ContentBlockType", required = true)
    @XmlSchemaType(name = "string")
    protected ContentBlockType contentBlockType;
    @XmlElement(name = "Value", required = true, nillable = true)
    protected String value;

    /**
     * Obtiene el valor de la propiedad contentBlockType.
     * 
     * @return
     *     possible object is
     *     {@link ContentBlockType }
     *     
     */
    public ContentBlockType getContentBlockType() {
        return contentBlockType;
    }

    /**
     * Define el valor de la propiedad contentBlockType.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentBlockType }
     *     
     */
    public void setContentBlockType(ContentBlockType value) {
        this.contentBlockType = value;
    }

    /**
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
