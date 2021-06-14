
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
 *         &lt;element name="AddCarrierResponse" type="{www.envmgr.com/LabelService}AddCarrierResponse" minOccurs="0"/&gt;
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
    "addCarrierResponse"
})
@XmlRootElement(name = "AddCarrierResponse")
public class AddCarrierResponse {

    @XmlElement(name = "AddCarrierResponse")
    protected AddCarrierResponseComplex addCarrierResponse;

    /**
     * Obtiene el valor de la propiedad addCarrierResponse.
     * 
     * @return
     *     possible object is
     *     {@link AddCarrierResponseComplex }
     *     
     */
    public AddCarrierResponseComplex getAddCarrierResponse() {
        return addCarrierResponse;
    }

    /**
     * Define el valor de la propiedad addCarrierResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link AddCarrierResponseComplex }
     *     
     */
    public void setAddCarrierResponse(AddCarrierResponseComplex value) {
        this.addCarrierResponse = value;
    }

}
