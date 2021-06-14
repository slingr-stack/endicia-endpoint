
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
 *         &lt;element name="DeleteCarrierResponse" type="{www.envmgr.com/LabelService}DeleteCarrierResponse" minOccurs="0"/&gt;
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
    "deleteCarrierResponse"
})
@XmlRootElement(name = "DeleteCarrierResponse")
public class DeleteCarrierResponse {

    @XmlElement(name = "DeleteCarrierResponse")
    protected DeleteCarrierResponseComplex deleteCarrierResponse;

    /**
     * Obtiene el valor de la propiedad deleteCarrierResponse.
     * 
     * @return
     *     possible object is
     *     {@link DeleteCarrierResponseComplex }
     *     
     */
    public DeleteCarrierResponseComplex getDeleteCarrierResponse() {
        return deleteCarrierResponse;
    }

    /**
     * Define el valor de la propiedad deleteCarrierResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteCarrierResponseComplex }
     *     
     */
    public void setDeleteCarrierResponse(DeleteCarrierResponseComplex value) {
        this.deleteCarrierResponse = value;
    }

}
