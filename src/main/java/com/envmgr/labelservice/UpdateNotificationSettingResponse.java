
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
 *         &lt;element name="UpdateNotificationSettingResponse" type="{www.envmgr.com/LabelService}UpdateNotificationSettingResult" minOccurs="0"/&gt;
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
    "updateNotificationSettingResponse"
})
@XmlRootElement(name = "UpdateNotificationSettingResponse")
public class UpdateNotificationSettingResponse {

    @XmlElement(name = "UpdateNotificationSettingResponse")
    protected UpdateNotificationSettingResult updateNotificationSettingResponse;

    /**
     * Obtiene el valor de la propiedad updateNotificationSettingResponse.
     * 
     * @return
     *     possible object is
     *     {@link UpdateNotificationSettingResult }
     *     
     */
    public UpdateNotificationSettingResult getUpdateNotificationSettingResponse() {
        return updateNotificationSettingResponse;
    }

    /**
     * Define el valor de la propiedad updateNotificationSettingResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateNotificationSettingResult }
     *     
     */
    public void setUpdateNotificationSettingResponse(UpdateNotificationSettingResult value) {
        this.updateNotificationSettingResponse = value;
    }

}
