
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
 *         &lt;element name="GetBrandingRequest" type="{www.envmgr.com/LabelService}GetBrandingRequest" minOccurs="0"/&gt;
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
    "getBrandingRequest"
})
@XmlRootElement(name = "GetBranding")
public class GetBranding {

    @XmlElement(name = "GetBrandingRequest")
    protected GetBrandingRequest getBrandingRequest;

    /**
     * Obtiene el valor de la propiedad getBrandingRequest.
     * 
     * @return
     *     possible object is
     *     {@link GetBrandingRequest }
     *     
     */
    public GetBrandingRequest getGetBrandingRequest() {
        return getBrandingRequest;
    }

    /**
     * Define el valor de la propiedad getBrandingRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetBrandingRequest }
     *     
     */
    public void setGetBrandingRequest(GetBrandingRequest value) {
        this.getBrandingRequest = value;
    }

}
