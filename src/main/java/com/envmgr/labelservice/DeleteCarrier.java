
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
 *         &lt;element name="DeleteCarrierRequest" type="{www.envmgr.com/LabelService}DeleteCarrierRequest" minOccurs="0"/&gt;
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
    "deleteCarrierRequest"
})
@XmlRootElement(name = "DeleteCarrier")
public class DeleteCarrier {

    @XmlElement(name = "DeleteCarrierRequest")
    protected DeleteCarrierRequest deleteCarrierRequest;

    /**
     * Obtiene el valor de la propiedad deleteCarrierRequest.
     * 
     * @return
     *     possible object is
     *     {@link DeleteCarrierRequest }
     *     
     */
    public DeleteCarrierRequest getDeleteCarrierRequest() {
        return deleteCarrierRequest;
    }

    /**
     * Define el valor de la propiedad deleteCarrierRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteCarrierRequest }
     *     
     */
    public void setDeleteCarrierRequest(DeleteCarrierRequest value) {
        this.deleteCarrierRequest = value;
    }

}
