
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
 *         &lt;element name="CreateNotificationSettingRequest" type="{www.envmgr.com/LabelService}CreateNotificationSettingRequest" minOccurs="0"/&gt;
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
    "createNotificationSettingRequest"
})
@XmlRootElement(name = "CreateNotificationSetting")
public class CreateNotificationSetting {

    @XmlElement(name = "CreateNotificationSettingRequest")
    protected CreateNotificationSettingRequest createNotificationSettingRequest;

    /**
     * Obtiene el valor de la propiedad createNotificationSettingRequest.
     * 
     * @return
     *     possible object is
     *     {@link CreateNotificationSettingRequest }
     *     
     */
    public CreateNotificationSettingRequest getCreateNotificationSettingRequest() {
        return createNotificationSettingRequest;
    }

    /**
     * Define el valor de la propiedad createNotificationSettingRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateNotificationSettingRequest }
     *     
     */
    public void setCreateNotificationSettingRequest(CreateNotificationSettingRequest value) {
        this.createNotificationSettingRequest = value;
    }

}
