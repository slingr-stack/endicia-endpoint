
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
 *         &lt;element name="DeleteBrandingResponse" type="{www.envmgr.com/LabelService}DeleteBrandingResult" minOccurs="0"/&gt;
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
    "deleteBrandingResponse"
})
@XmlRootElement(name = "DeleteBrandingXMLResponse")
public class DeleteBrandingXMLResponse {

    @XmlElement(name = "DeleteBrandingResponse")
    protected DeleteBrandingResult deleteBrandingResponse;

    /**
     * Obtiene el valor de la propiedad deleteBrandingResponse.
     * 
     * @return
     *     possible object is
     *     {@link DeleteBrandingResult }
     *     
     */
    public DeleteBrandingResult getDeleteBrandingResponse() {
        return deleteBrandingResponse;
    }

    /**
     * Define el valor de la propiedad deleteBrandingResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteBrandingResult }
     *     
     */
    public void setDeleteBrandingResponse(DeleteBrandingResult value) {
        this.deleteBrandingResponse = value;
    }

}
