
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateACHInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateACHInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CheckingAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CheckingAccountRoutingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PaymentType" use="required" type="{www.envmgr.com/LabelService}PaymentTypes" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateACHInformation", propOrder = {
    "checkingAccountNumber",
    "checkingAccountRoutingNumber"
})
public class UpdateACHInformation {

    @XmlElement(name = "CheckingAccountNumber")
    protected String checkingAccountNumber;
    @XmlElement(name = "CheckingAccountRoutingNumber")
    protected String checkingAccountRoutingNumber;
    @XmlAttribute(name = "PaymentType", required = true)
    protected PaymentTypes paymentType;

    /**
     * Gets the value of the checkingAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckingAccountNumber() {
        return checkingAccountNumber;
    }

    /**
     * Sets the value of the checkingAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckingAccountNumber(String value) {
        this.checkingAccountNumber = value;
    }

    /**
     * Gets the value of the checkingAccountRoutingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckingAccountRoutingNumber() {
        return checkingAccountRoutingNumber;
    }

    /**
     * Sets the value of the checkingAccountRoutingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckingAccountRoutingNumber(String value) {
        this.checkingAccountRoutingNumber = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypes }
     *     
     */
    public PaymentTypes getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypes }
     *     
     */
    public void setPaymentType(PaymentTypes value) {
        this.paymentType = value;
    }

}
