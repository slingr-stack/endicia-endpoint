
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
 *         &lt;element name="GetNotificationSettingListResponse" type="{www.envmgr.com/LabelService}GetNotificationSettingResult" minOccurs="0"/&gt;
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
    "getNotificationSettingListResponse"
})
@XmlRootElement(name = "GetNotificationSettingXMLResponse")
public class GetNotificationSettingXMLResponse {

    @XmlElement(name = "GetNotificationSettingListResponse")
    protected GetNotificationSettingResult getNotificationSettingListResponse;

    /**
     * Obtiene el valor de la propiedad getNotificationSettingListResponse.
     * 
     * @return
     *     possible object is
     *     {@link GetNotificationSettingResult }
     *     
     */
    public GetNotificationSettingResult getGetNotificationSettingListResponse() {
        return getNotificationSettingListResponse;
    }

    /**
     * Define el valor de la propiedad getNotificationSettingListResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GetNotificationSettingResult }
     *     
     */
    public void setGetNotificationSettingListResponse(GetNotificationSettingResult value) {
        this.getNotificationSettingListResponse = value;
    }

}
