
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateCreditCardInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateCreditCardInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreditCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardCVV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardType" type="{www.envmgr.com/LabelService}CreditCardType"/&gt;
 *         &lt;element name="CreditCardExpMonth" type="{www.envmgr.com/LabelService}CreditCardMonth"/&gt;
 *         &lt;element name="CreditCardExpYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "UpdateCreditCardInformation", propOrder = {
    "creditCardNumber",
    "creditCardCVV",
    "creditCardAddress",
    "creditCardAddress2",
    "creditCardAddress3",
    "creditCardCity",
    "creditCardState",
    "creditCardZipCode",
    "creditCardCountryCode",
    "creditCardType",
    "creditCardExpMonth",
    "creditCardExpYear"
})
public class UpdateCreditCardInformation {

    @XmlElement(name = "CreditCardNumber")
    protected String creditCardNumber;
    @XmlElement(name = "CreditCardCVV")
    protected String creditCardCVV;
    @XmlElement(name = "CreditCardAddress")
    protected String creditCardAddress;
    @XmlElement(name = "CreditCardAddress2")
    protected String creditCardAddress2;
    @XmlElement(name = "CreditCardAddress3")
    protected String creditCardAddress3;
    @XmlElement(name = "CreditCardCity")
    protected String creditCardCity;
    @XmlElement(name = "CreditCardState")
    protected String creditCardState;
    @XmlElement(name = "CreditCardZipCode")
    protected String creditCardZipCode;
    @XmlElement(name = "CreditCardCountryCode")
    protected String creditCardCountryCode;
    @XmlElement(name = "CreditCardType", required = true)
    @XmlSchemaType(name = "string")
    protected CreditCardType creditCardType;
    @XmlElement(name = "CreditCardExpMonth", required = true)
    @XmlSchemaType(name = "string")
    protected CreditCardMonth creditCardExpMonth;
    @XmlElement(name = "CreditCardExpYear")
    protected String creditCardExpYear;
    @XmlAttribute(name = "PaymentType", required = true)
    protected PaymentTypes paymentType;

    /**
     * Gets the value of the creditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * Sets the value of the creditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumber(String value) {
        this.creditCardNumber = value;
    }

    /**
     * Gets the value of the creditCardCVV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardCVV() {
        return creditCardCVV;
    }

    /**
     * Sets the value of the creditCardCVV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardCVV(String value) {
        this.creditCardCVV = value;
    }

    /**
     * Gets the value of the creditCardAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardAddress() {
        return creditCardAddress;
    }

    /**
     * Sets the value of the creditCardAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardAddress(String value) {
        this.creditCardAddress = value;
    }

    /**
     * Gets the value of the creditCardAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardAddress2() {
        return creditCardAddress2;
    }

    /**
     * Sets the value of the creditCardAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardAddress2(String value) {
        this.creditCardAddress2 = value;
    }

    /**
     * Gets the value of the creditCardAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardAddress3() {
        return creditCardAddress3;
    }

    /**
     * Sets the value of the creditCardAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardAddress3(String value) {
        this.creditCardAddress3 = value;
    }

    /**
     * Gets the value of the creditCardCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardCity() {
        return creditCardCity;
    }

    /**
     * Sets the value of the creditCardCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardCity(String value) {
        this.creditCardCity = value;
    }

    /**
     * Gets the value of the creditCardState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardState() {
        return creditCardState;
    }

    /**
     * Sets the value of the creditCardState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardState(String value) {
        this.creditCardState = value;
    }

    /**
     * Gets the value of the creditCardZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardZipCode() {
        return creditCardZipCode;
    }

    /**
     * Sets the value of the creditCardZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardZipCode(String value) {
        this.creditCardZipCode = value;
    }

    /**
     * Gets the value of the creditCardCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardCountryCode() {
        return creditCardCountryCode;
    }

    /**
     * Sets the value of the creditCardCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardCountryCode(String value) {
        this.creditCardCountryCode = value;
    }

    /**
     * Gets the value of the creditCardType property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardType }
     *     
     */
    public CreditCardType getCreditCardType() {
        return creditCardType;
    }

    /**
     * Sets the value of the creditCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardType }
     *     
     */
    public void setCreditCardType(CreditCardType value) {
        this.creditCardType = value;
    }

    /**
     * Gets the value of the creditCardExpMonth property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardMonth }
     *     
     */
    public CreditCardMonth getCreditCardExpMonth() {
        return creditCardExpMonth;
    }

    /**
     * Sets the value of the creditCardExpMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardMonth }
     *     
     */
    public void setCreditCardExpMonth(CreditCardMonth value) {
        this.creditCardExpMonth = value;
    }

    /**
     * Gets the value of the creditCardExpYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardExpYear() {
        return creditCardExpYear;
    }

    /**
     * Sets the value of the creditCardExpYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardExpYear(String value) {
        this.creditCardExpYear = value;
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
