
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
 *         &lt;element name="CreateShipmentNotificationRequest" type="{www.envmgr.com/LabelService}CreateShipmentNotificationRequest" minOccurs="0"/&gt;
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
    "createShipmentNotificationRequest"
})
@XmlRootElement(name = "CreateShipmentNotification")
public class CreateShipmentNotification {

    @XmlElement(name = "CreateShipmentNotificationRequest")
    protected CreateShipmentNotificationRequest createShipmentNotificationRequest;

    /**
     * Obtiene el valor de la propiedad createShipmentNotificationRequest.
     * 
     * @return
     *     possible object is
     *     {@link CreateShipmentNotificationRequest }
     *     
     */
    public CreateShipmentNotificationRequest getCreateShipmentNotificationRequest() {
        return createShipmentNotificationRequest;
    }

    /**
     * Define el valor de la propiedad createShipmentNotificationRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateShipmentNotificationRequest }
     *     
     */
    public void setCreateShipmentNotificationRequest(CreateShipmentNotificationRequest value) {
        this.createShipmentNotificationRequest = value;
    }

}
