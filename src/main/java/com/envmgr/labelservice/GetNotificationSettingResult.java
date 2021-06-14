
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetNotificationSettingResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetNotificationSettingResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequesterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NotificationSettings" type="{www.envmgr.com/LabelService}ArrayOfNotificationSetting" minOccurs="0"/&gt;
 *         &lt;element name="DefaultNotificationSettingID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNotificationSettingResult", propOrder = {
    "status",
    "errorMessage",
    "requesterID",
    "notificationSettings",
    "defaultNotificationSettingID"
})
public class GetNotificationSettingResult {

    @XmlElement(name = "Status")
    protected int status;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "RequesterID")
    protected String requesterID;
    @XmlElement(name = "NotificationSettings")
    protected ArrayOfNotificationSetting notificationSettings;
    @XmlElement(name = "DefaultNotificationSettingID")
    protected String defaultNotificationSettingID;

    /**
     * Obtiene el valor de la propiedad status.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad errorMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Define el valor de la propiedad errorMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad requesterID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterID() {
        return requesterID;
    }

    /**
     * Define el valor de la propiedad requesterID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterID(String value) {
        this.requesterID = value;
    }

    /**
     * Obtiene el valor de la propiedad notificationSettings.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNotificationSetting }
     *     
     */
    public ArrayOfNotificationSetting getNotificationSettings() {
        return notificationSettings;
    }

    /**
     * Define el valor de la propiedad notificationSettings.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNotificationSetting }
     *     
     */
    public void setNotificationSettings(ArrayOfNotificationSetting value) {
        this.notificationSettings = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultNotificationSettingID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultNotificationSettingID() {
        return defaultNotificationSettingID;
    }

    /**
     * Define el valor de la propiedad defaultNotificationSettingID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultNotificationSettingID(String value) {
        this.defaultNotificationSettingID = value;
    }

}
