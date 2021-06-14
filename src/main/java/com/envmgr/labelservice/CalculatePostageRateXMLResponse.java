
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
 *         &lt;element name="PostageRateResponse" type="{www.envmgr.com/LabelService}PostageRateResponse" minOccurs="0"/&gt;
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
    "postageRateResponse"
})
@XmlRootElement(name = "CalculatePostageRateXMLResponse")
public class CalculatePostageRateXMLResponse {

    @XmlElement(name = "PostageRateResponse")
    protected PostageRateResponse postageRateResponse;

    /**
     * Obtiene el valor de la propiedad postageRateResponse.
     * 
     * @return
     *     possible object is
     *     {@link PostageRateResponse }
     *     
     */
    public PostageRateResponse getPostageRateResponse() {
        return postageRateResponse;
    }

    /**
     * Define el valor de la propiedad postageRateResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link PostageRateResponse }
     *     
     */
    public void setPostageRateResponse(PostageRateResponse value) {
        this.postageRateResponse = value;
    }

}
