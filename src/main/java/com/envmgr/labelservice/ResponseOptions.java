
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResponseOptions complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResponseOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="PostagePrice" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseOptions")
public class ResponseOptions {

    @XmlAttribute(name = "PostagePrice")
    protected String postagePrice;

    /**
     * Obtiene el valor de la propiedad postagePrice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostagePrice() {
        return postagePrice;
    }

    /**
     * Define el valor de la propiedad postagePrice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostagePrice(String value) {
        this.postagePrice = value;
    }

}
