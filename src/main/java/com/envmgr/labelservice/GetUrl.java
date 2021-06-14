
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
 *         &lt;element name="GetUrlRequest" type="{www.envmgr.com/LabelService}GetUrlRequest" minOccurs="0"/&gt;
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
    "getUrlRequest"
})
@XmlRootElement(name = "GetUrl")
public class GetUrl {

    @XmlElement(name = "GetUrlRequest")
    protected GetUrlRequest getUrlRequest;

    /**
     * Obtiene el valor de la propiedad getUrlRequest.
     * 
     * @return
     *     possible object is
     *     {@link GetUrlRequest }
     *     
     */
    public GetUrlRequest getGetUrlRequest() {
        return getUrlRequest;
    }

    /**
     * Define el valor de la propiedad getUrlRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUrlRequest }
     *     
     */
    public void setGetUrlRequest(GetUrlRequest value) {
        this.getUrlRequest = value;
    }

}
