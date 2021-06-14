
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UpdateNotificationSettingRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UpdateNotificationSettingRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{www.envmgr.com/LabelService}DataValidator"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequesterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertifiedIntermediary" type="{www.envmgr.com/LabelService}CertifiedIntermediary" minOccurs="0"/&gt;
 *         &lt;element name="NotificationSetting" type="{www.envmgr.com/LabelService}NotificationSetting" minOccurs="0"/&gt;
 *         &lt;element name="SetAsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateNotificationSettingRequest", propOrder = {
    "requesterID",
    "certifiedIntermediary",
    "notificationSetting",
    "setAsDefault"
})
public class UpdateNotificationSettingRequest
    extends DataValidator
{

    @XmlElement(name = "RequesterID")
    protected String requesterID;
    @XmlElement(name = "CertifiedIntermediary")
    protected CertifiedIntermediary certifiedIntermediary;
    @XmlElement(name = "NotificationSetting")
    protected NotificationSetting notificationSetting;
    @XmlElement(name = "SetAsDefault")
    protected boolean setAsDefault;

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
     * Obtiene el valor de la propiedad certifiedIntermediary.
     * 
     * @return
     *     possible object is
     *     {@link CertifiedIntermediary }
     *     
     */
    public CertifiedIntermediary getCertifiedIntermediary() {
        return certifiedIntermediary;
    }

    /**
     * Define el valor de la propiedad certifiedIntermediary.
     * 
     * @param value
     *     allowed object is
     *     {@link CertifiedIntermediary }
     *     
     */
    public void setCertifiedIntermediary(CertifiedIntermediary value) {
        this.certifiedIntermediary = value;
    }

    /**
     * Obtiene el valor de la propiedad notificationSetting.
     * 
     * @return
     *     possible object is
     *     {@link NotificationSetting }
     *     
     */
    public NotificationSetting getNotificationSetting() {
        return notificationSetting;
    }

    /**
     * Define el valor de la propiedad notificationSetting.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationSetting }
     *     
     */
    public void setNotificationSetting(NotificationSetting value) {
        this.notificationSetting = value;
    }

    /**
     * Obtiene el valor de la propiedad setAsDefault.
     * 
     */
    public boolean isSetAsDefault() {
        return setAsDefault;
    }

    /**
     * Define el valor de la propiedad setAsDefault.
     * 
     */
    public void setSetAsDefault(boolean value) {
        this.setAsDefault = value;
    }

}
