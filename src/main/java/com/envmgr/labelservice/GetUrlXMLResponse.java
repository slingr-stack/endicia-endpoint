
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
 *         &lt;element name="GetUrlResponse" type="{www.envmgr.com/LabelService}GetUrlResult" minOccurs="0"/&gt;
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
    "getUrlResponse"
})
@XmlRootElement(name = "GetUrlXMLResponse")
public class GetUrlXMLResponse {

    @XmlElement(name = "GetUrlResponse")
    protected GetUrlResult getUrlResponse;

    /**
     * Obtiene el valor de la propiedad getUrlResponse.
     * 
     * @return
     *     possible object is
     *     {@link GetUrlResult }
     *     
     */
    public GetUrlResult getGetUrlResponse() {
        return getUrlResponse;
    }

    /**
     * Define el valor de la propiedad getUrlResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUrlResult }
     *     
     */
    public void setGetUrlResponse(GetUrlResult value) {
        this.getUrlResponse = value;
    }

}
