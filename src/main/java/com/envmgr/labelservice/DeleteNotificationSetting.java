
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
 *         &lt;element name="DeleteNotificationSettingRequest" type="{www.envmgr.com/LabelService}DeleteNotificationSettingRequest" minOccurs="0"/&gt;
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
    "deleteNotificationSettingRequest"
})
@XmlRootElement(name = "DeleteNotificationSetting")
public class DeleteNotificationSetting {

    @XmlElement(name = "DeleteNotificationSettingRequest")
    protected DeleteNotificationSettingRequest deleteNotificationSettingRequest;

    /**
     * Obtiene el valor de la propiedad deleteNotificationSettingRequest.
     * 
     * @return
     *     possible object is
     *     {@link DeleteNotificationSettingRequest }
     *     
     */
    public DeleteNotificationSettingRequest getDeleteNotificationSettingRequest() {
        return deleteNotificationSettingRequest;
    }

    /**
     * Define el valor de la propiedad deleteNotificationSettingRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteNotificationSettingRequest }
     *     
     */
    public void setDeleteNotificationSettingRequest(DeleteNotificationSettingRequest value) {
        this.deleteNotificationSettingRequest = value;
    }

}
