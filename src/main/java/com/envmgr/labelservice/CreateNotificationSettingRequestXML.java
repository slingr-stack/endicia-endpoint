
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
 *         &lt;element name="CreateNotificationSettingRequestXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "createNotificationSettingRequestXML"
})
@XmlRootElement(name = "CreateNotificationSettingRequestXML")
public class CreateNotificationSettingRequestXML {

    @XmlElement(name = "CreateNotificationSettingRequestXML")
    protected String createNotificationSettingRequestXML;

    /**
     * Obtiene el valor de la propiedad createNotificationSettingRequestXML.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateNotificationSettingRequestXML() {
        return createNotificationSettingRequestXML;
    }

    /**
     * Define el valor de la propiedad createNotificationSettingRequestXML.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateNotificationSettingRequestXML(String value) {
        this.createNotificationSettingRequestXML = value;
    }

}
