
package com.envmgr.labelservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NotificationSettingProperties complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NotificationSettingProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Triggers" type="{www.envmgr.com/LabelService}Trigger" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EmailConfig" type="{www.envmgr.com/LabelService}EmailConfig" minOccurs="0"/&gt;
 *         &lt;element name="AllowSMSOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationSettingProperties", propOrder = {
    "triggers",
    "emailConfig",
    "allowSMSOptIn"
})
public class NotificationSettingProperties {

    @XmlElement(name = "Triggers", nillable = true)
    protected List<Trigger> triggers;
    @XmlElement(name = "EmailConfig")
    protected EmailConfig emailConfig;
    @XmlElement(name = "AllowSMSOptIn", required = true, type = Boolean.class, nillable = true)
    protected Boolean allowSMSOptIn;

    /**
     * Gets the value of the triggers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the triggers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTriggers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Trigger }
     * 
     * 
     */
    public List<Trigger> getTriggers() {
        if (triggers == null) {
            triggers = new ArrayList<Trigger>();
        }
        return this.triggers;
    }

    /**
     * Obtiene el valor de la propiedad emailConfig.
     * 
     * @return
     *     possible object is
     *     {@link EmailConfig }
     *     
     */
    public EmailConfig getEmailConfig() {
        return emailConfig;
    }

    /**
     * Define el valor de la propiedad emailConfig.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailConfig }
     *     
     */
    public void setEmailConfig(EmailConfig value) {
        this.emailConfig = value;
    }

    /**
     * Obtiene el valor de la propiedad allowSMSOptIn.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowSMSOptIn() {
        return allowSMSOptIn;
    }

    /**
     * Define el valor de la propiedad allowSMSOptIn.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowSMSOptIn(Boolean value) {
        this.allowSMSOptIn = value;
    }

}
