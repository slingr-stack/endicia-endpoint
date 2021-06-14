
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NotificationSetting complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NotificationSetting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NotificationSettingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NotificationSettingProperties" type="{www.envmgr.com/LabelService}NotificationSettingProperties" minOccurs="0"/&gt;
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationSetting", propOrder = {
    "notificationSettingId",
    "notificationSettingProperties",
    "reference"
})
public class NotificationSetting {

    @XmlElement(name = "NotificationSettingId")
    protected String notificationSettingId;
    @XmlElement(name = "NotificationSettingProperties")
    protected NotificationSettingProperties notificationSettingProperties;
    @XmlElement(name = "Reference")
    protected String reference;

    /**
     * Obtiene el valor de la propiedad notificationSettingId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationSettingId() {
        return notificationSettingId;
    }

    /**
     * Define el valor de la propiedad notificationSettingId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationSettingId(String value) {
        this.notificationSettingId = value;
    }

    /**
     * Obtiene el valor de la propiedad notificationSettingProperties.
     * 
     * @return
     *     possible object is
     *     {@link NotificationSettingProperties }
     *     
     */
    public NotificationSettingProperties getNotificationSettingProperties() {
        return notificationSettingProperties;
    }

    /**
     * Define el valor de la propiedad notificationSettingProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationSettingProperties }
     *     
     */
    public void setNotificationSettingProperties(NotificationSettingProperties value) {
        this.notificationSettingProperties = value;
    }

    /**
     * Obtiene el valor de la propiedad reference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Define el valor de la propiedad reference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

}
