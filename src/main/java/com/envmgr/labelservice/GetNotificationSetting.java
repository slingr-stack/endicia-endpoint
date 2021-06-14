
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
 *         &lt;element name="GetNotificationSettingRequest" type="{www.envmgr.com/LabelService}GetNotificationSettingRequest" minOccurs="0"/&gt;
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
    "getNotificationSettingRequest"
})
@XmlRootElement(name = "GetNotificationSetting")
public class GetNotificationSetting {

    @XmlElement(name = "GetNotificationSettingRequest")
    protected GetNotificationSettingRequest getNotificationSettingRequest;

    /**
     * Obtiene el valor de la propiedad getNotificationSettingRequest.
     * 
     * @return
     *     possible object is
     *     {@link GetNotificationSettingRequest }
     *     
     */
    public GetNotificationSettingRequest getGetNotificationSettingRequest() {
        return getNotificationSettingRequest;
    }

    /**
     * Define el valor de la propiedad getNotificationSettingRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetNotificationSettingRequest }
     *     
     */
    public void setGetNotificationSettingRequest(GetNotificationSettingRequest value) {
        this.getNotificationSettingRequest = value;
    }

}
