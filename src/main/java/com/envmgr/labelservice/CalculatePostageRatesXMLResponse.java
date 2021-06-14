
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PostageRatesResponse" type="{www.envmgr.com/LabelService}PostageRatesResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "postageRatesResponse"
})
@XmlRootElement(name = "CalculatePostageRatesXMLResponse")
public class CalculatePostageRatesXMLResponse {

    @XmlElement(name = "PostageRatesResponse")
    protected PostageRatesResponse postageRatesResponse;

    /**
     * Obtiene el valor de la propiedad postageRatesResponse.
     * 
     * @return
     *     possible object is
     *     {@link PostageRatesResponse }
     *     
     */
    public PostageRatesResponse getPostageRatesResponse() {
        return postageRatesResponse;
    }

    /**
     * Define el valor de la propiedad postageRatesResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link PostageRatesResponse }
     *     
     */
    public void setPostageRatesResponse(PostageRatesResponse value) {
        this.postageRatesResponse = value;
    }

}
