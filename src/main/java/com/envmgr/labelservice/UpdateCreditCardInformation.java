
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UpdateCreditCardInformation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad creditCardNumber.
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
     * Define el valor de la propiedad creditCardNumber.
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
     * Obtiene el valor de la propiedad creditCardCVV.
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
     * Define el valor de la propiedad creditCardCVV.
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
     * Obtiene el valor de la propiedad creditCardAddress.
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
     * Define el valor de la propiedad creditCardAddress.
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
     * Obtiene el valor de la propiedad creditCardAddress2.
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
     * Define el valor de la propiedad creditCardAddress2.
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
     * Obtiene el valor de la propiedad creditCardAddress3.
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
     * Define el valor de la propiedad creditCardAddress3.
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
     * Obtiene el valor de la propiedad creditCardCity.
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
     * Define el valor de la propiedad creditCardCity.
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
     * Obtiene el valor de la propiedad creditCardState.
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
     * Define el valor de la propiedad creditCardState.
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
     * Obtiene el valor de la propiedad creditCardZipCode.
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
     * Define el valor de la propiedad creditCardZipCode.
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
     * Obtiene el valor de la propiedad creditCardCountryCode.
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
     * Define el valor de la propiedad creditCardCountryCode.
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
     * Obtiene el valor de la propiedad creditCardType.
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
     * Define el valor de la propiedad creditCardType.
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
     * Obtiene el valor de la propiedad creditCardExpMonth.
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
     * Define el valor de la propiedad creditCardExpMonth.
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
     * Obtiene el valor de la propiedad creditCardExpYear.
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
     * Define el valor de la propiedad creditCardExpYear.
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
     * Obtiene el valor de la propiedad paymentType.
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
     * Define el valor de la propiedad paymentType.
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
