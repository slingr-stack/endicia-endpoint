
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActualService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActualService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="DeliveryConfirmation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="InsuredMail" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActualService")
public class ActualService {

    @XmlAttribute(name = "DeliveryConfirmation")
    protected String deliveryConfirmation;
    @XmlAttribute(name = "InsuredMail")
    protected String insuredMail;

    /**
     * Gets the value of the deliveryConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryConfirmation() {
        return deliveryConfirmation;
    }

    /**
     * Sets the value of the deliveryConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryConfirmation(String value) {
        this.deliveryConfirmation = value;
    }

    /**
     * Gets the value of the insuredMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredMail() {
        return insuredMail;
    }

    /**
     * Sets the value of the insuredMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredMail(String value) {
        this.insuredMail = value;
    }

}
