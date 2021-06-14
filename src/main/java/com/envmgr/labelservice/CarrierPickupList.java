
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CarrierPickupList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CarrierPickupList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carrierPickupListDetails" type="{www.envmgr.com/LabelService}ArrayOfCarrierPickupListDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierPickupList", propOrder = {
    "carrierPickupListDetails"
})
public class CarrierPickupList {

    protected ArrayOfCarrierPickupListDetail carrierPickupListDetails;

    /**
     * Obtiene el valor de la propiedad carrierPickupListDetails.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCarrierPickupListDetail }
     *     
     */
    public ArrayOfCarrierPickupListDetail getCarrierPickupListDetails() {
        return carrierPickupListDetails;
    }

    /**
     * Define el valor de la propiedad carrierPickupListDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCarrierPickupListDetail }
     *     
     */
    public void setCarrierPickupListDetails(ArrayOfCarrierPickupListDetail value) {
        this.carrierPickupListDetails = value;
    }

}
