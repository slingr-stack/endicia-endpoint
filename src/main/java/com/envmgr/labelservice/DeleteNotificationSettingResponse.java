
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
 *         &lt;element name="DeleteNotificationSettingResponse" type="{www.envmgr.com/LabelService}DeleteNotificationSettingResult" minOccurs="0"/&gt;
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
    "deleteNotificationSettingResponse"
})
@XmlRootElement(name = "DeleteNotificationSettingResponse")
public class DeleteNotificationSettingResponse {

    @XmlElement(name = "DeleteNotificationSettingResponse")
    protected DeleteNotificationSettingResult deleteNotificationSettingResponse;

    /**
     * Obtiene el valor de la propiedad deleteNotificationSettingResponse.
     * 
     * @return
     *     possible object is
     *     {@link DeleteNotificationSettingResult }
     *     
     */
    public DeleteNotificationSettingResult getDeleteNotificationSettingResponse() {
        return deleteNotificationSettingResponse;
    }

    /**
     * Define el valor de la propiedad deleteNotificationSettingResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteNotificationSettingResult }
     *     
     */
    public void setDeleteNotificationSettingResponse(DeleteNotificationSettingResult value) {
        this.deleteNotificationSettingResponse = value;
    }

}
