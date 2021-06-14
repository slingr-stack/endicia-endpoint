
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
 *         &lt;element name="PostageRateRequest" type="{www.envmgr.com/LabelService}PostageRateRequest" minOccurs="0"/&gt;
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
    "postageRateRequest"
})
@XmlRootElement(name = "CalculatePostageRate")
public class CalculatePostageRate {

    @XmlElement(name = "PostageRateRequest")
    protected PostageRateRequest postageRateRequest;

    /**
     * Obtiene el valor de la propiedad postageRateRequest.
     * 
     * @return
     *     possible object is
     *     {@link PostageRateRequest }
     *     
     */
    public PostageRateRequest getPostageRateRequest() {
        return postageRateRequest;
    }

    /**
     * Define el valor de la propiedad postageRateRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link PostageRateRequest }
     *     
     */
    public void setPostageRateRequest(PostageRateRequest value) {
        this.postageRateRequest = value;
    }

}
