
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
 *         &lt;element name="GetNotificationSettingResponse" type="{www.envmgr.com/LabelService}CreateNotificationSettingResult" minOccurs="0"/&gt;
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
    "getNotificationSettingResponse"
})
@XmlRootElement(name = "CreateNotificationSettingResponse")
public class CreateNotificationSettingResponse {

    @XmlElement(name = "GetNotificationSettingResponse")
    protected CreateNotificationSettingResult getNotificationSettingResponse;

    /**
     * Obtiene el valor de la propiedad getNotificationSettingResponse.
     * 
     * @return
     *     possible object is
     *     {@link CreateNotificationSettingResult }
     *     
     */
    public CreateNotificationSettingResult getGetNotificationSettingResponse() {
        return getNotificationSettingResponse;
    }

    /**
     * Define el valor de la propiedad getNotificationSettingResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateNotificationSettingResult }
     *     
     */
    public void setGetNotificationSettingResponse(CreateNotificationSettingResult value) {
        this.getNotificationSettingResponse = value;
    }

}
