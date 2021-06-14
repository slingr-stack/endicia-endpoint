
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
 *         &lt;element name="UpdateNotificationSettingRequest" type="{www.envmgr.com/LabelService}UpdateNotificationSettingRequest" minOccurs="0"/&gt;
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
    "updateNotificationSettingRequest"
})
@XmlRootElement(name = "UpdateNotificationSetting")
public class UpdateNotificationSetting {

    @XmlElement(name = "UpdateNotificationSettingRequest")
    protected UpdateNotificationSettingRequest updateNotificationSettingRequest;

    /**
     * Obtiene el valor de la propiedad updateNotificationSettingRequest.
     * 
     * @return
     *     possible object is
     *     {@link UpdateNotificationSettingRequest }
     *     
     */
    public UpdateNotificationSettingRequest getUpdateNotificationSettingRequest() {
        return updateNotificationSettingRequest;
    }

    /**
     * Define el valor de la propiedad updateNotificationSettingRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateNotificationSettingRequest }
     *     
     */
    public void setUpdateNotificationSettingRequest(UpdateNotificationSettingRequest value) {
        this.updateNotificationSettingRequest = value;
    }

}
