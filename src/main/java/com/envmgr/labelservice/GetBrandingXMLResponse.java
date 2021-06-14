
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
 *         &lt;element name="GetBrandingListResponse" type="{www.envmgr.com/LabelService}GetBrandingResult" minOccurs="0"/&gt;
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
    "getBrandingListResponse"
})
@XmlRootElement(name = "GetBrandingXMLResponse")
public class GetBrandingXMLResponse {

    @XmlElement(name = "GetBrandingListResponse")
    protected GetBrandingResult getBrandingListResponse;

    /**
     * Obtiene el valor de la propiedad getBrandingListResponse.
     * 
     * @return
     *     possible object is
     *     {@link GetBrandingResult }
     *     
     */
    public GetBrandingResult getGetBrandingListResponse() {
        return getBrandingListResponse;
    }

    /**
     * Define el valor de la propiedad getBrandingListResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GetBrandingResult }
     *     
     */
    public void setGetBrandingListResponse(GetBrandingResult value) {
        this.getBrandingListResponse = value;
    }

}
