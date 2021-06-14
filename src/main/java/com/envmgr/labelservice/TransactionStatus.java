
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TransactionStatus complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransactionStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionStatus", propOrder = {
    "statusEvent",
    "statusDescription",
    "deliveryDateTime"
})
public class TransactionStatus {

    @XmlElement(name = "StatusEvent")
    protected String statusEvent;
    @XmlElement(name = "StatusDescription")
    protected String statusDescription;
    @XmlElement(name = "DeliveryDateTime")
    protected String deliveryDateTime;

    /**
     * Obtiene el valor de la propiedad statusEvent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusEvent() {
        return statusEvent;
    }

    /**
     * Define el valor de la propiedad statusEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusEvent(String value) {
        this.statusEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad statusDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * Define el valor de la propiedad statusDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescription(String value) {
        this.statusDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad deliveryDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryDateTime() {
        return deliveryDateTime;
    }

    /**
     * Define el valor de la propiedad deliveryDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDateTime(String value) {
        this.deliveryDateTime = value;
    }

}
