
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
 *         &lt;element name="UpdateBrandingRequest" type="{www.envmgr.com/LabelService}UpdateBrandingRequest" minOccurs="0"/&gt;
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
    "updateBrandingRequest"
})
@XmlRootElement(name = "UpdateBranding")
public class UpdateBranding {

    @XmlElement(name = "UpdateBrandingRequest")
    protected UpdateBrandingRequest updateBrandingRequest;

    /**
     * Obtiene el valor de la propiedad updateBrandingRequest.
     * 
     * @return
     *     possible object is
     *     {@link UpdateBrandingRequest }
     *     
     */
    public UpdateBrandingRequest getUpdateBrandingRequest() {
        return updateBrandingRequest;
    }

    /**
     * Define el valor de la propiedad updateBrandingRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateBrandingRequest }
     *     
     */
    public void setUpdateBrandingRequest(UpdateBrandingRequest value) {
        this.updateBrandingRequest = value;
    }

}
