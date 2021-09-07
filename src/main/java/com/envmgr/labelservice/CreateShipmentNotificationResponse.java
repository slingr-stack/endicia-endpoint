
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
 *         &lt;element name="GetShipmentNotificationResponse" type="{www.envmgr.com/LabelService}CreateShipmentNotificationResult" minOccurs="0"/&gt;
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
    "getShipmentNotificationResponse"
})
@XmlRootElement(name = "CreateShipmentNotificationResponse")
public class CreateShipmentNotificationResponse {

    @XmlElement(name = "GetShipmentNotificationResponse")
    protected CreateShipmentNotificationResult getShipmentNotificationResponse;

    /**
     * Obtiene el valor de la propiedad getShipmentNotificationResponse.
     * 
     * @return
     *     possible object is
     *     {@link CreateShipmentNotificationResult }
     *     
     */
    public CreateShipmentNotificationResult getGetShipmentNotificationResponse() {
        return getShipmentNotificationResponse;
    }

    /**
     * Define el valor de la propiedad getShipmentNotificationResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateShipmentNotificationResult }
     *     
     */
    public void setGetShipmentNotificationResponse(CreateShipmentNotificationResult value) {
        this.getShipmentNotificationResponse = value;
    }

}
