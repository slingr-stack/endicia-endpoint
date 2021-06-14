
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
 *         &lt;element name="UpdateBrandingResponse" type="{www.envmgr.com/LabelService}UpdateBrandingResult" minOccurs="0"/&gt;
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
    "updateBrandingResponse"
})
@XmlRootElement(name = "UpdateBrandingResponse")
public class UpdateBrandingResponse {

    @XmlElement(name = "UpdateBrandingResponse")
    protected UpdateBrandingResult updateBrandingResponse;

    /**
     * Obtiene el valor de la propiedad updateBrandingResponse.
     * 
     * @return
     *     possible object is
     *     {@link UpdateBrandingResult }
     *     
     */
    public UpdateBrandingResult getUpdateBrandingResponse() {
        return updateBrandingResponse;
    }

    /**
     * Define el valor de la propiedad updateBrandingResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateBrandingResult }
     *     
     */
    public void setUpdateBrandingResponse(UpdateBrandingResult value) {
        this.updateBrandingResponse = value;
    }

}
