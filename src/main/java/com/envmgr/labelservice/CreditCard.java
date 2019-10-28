
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{www.envmgr.com/LabelService}DataValidator"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreditCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardType" type="{www.envmgr.com/LabelService}CreditCardType"/&gt;
 *         &lt;element name="CreditCardMonth" type="{www.envmgr.com/LabelService}CreditCardMonth"/&gt;
 *         &lt;element name="CreditCardYear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CreditCardAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardZip5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardCVV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCard", propOrder = {
    "creditCardNumber",
    "creditCardType",
    "creditCardMonth",
    "creditCardYear",
    "creditCardAddress",
    "creditCardCity",
    "creditCardState",
    "creditCardZip5",
    "creditCardCVV",
    "creditCardCountryCode"
})
public class CreditCard
    extends DataValidator
{

    @XmlElement(name = "CreditCardNumber")
    protected String creditCardNumber;
    @XmlElement(name = "CreditCardType", required = true)
    @XmlSchemaType(name = "string")
    protected CreditCardType creditCardType;
    @XmlElement(name = "CreditCardMonth", required = true)
    @XmlSchemaType(name = "string")
    protected CreditCardMonth creditCardMonth;
    @XmlElement(name = "CreditCardYear")
    protected int creditCardYear;
    @XmlElement(name = "CreditCardAddress")
    protected String creditCardAddress;
    @XmlElement(name = "CreditCardCity")
    protected String creditCardCity;
    @XmlElement(name = "CreditCardState")
    protected String creditCardState;
    @XmlElement(name = "CreditCardZip5")
    protected String creditCardZip5;
    @XmlElement(name = "CreditCardCVV")
    protected String creditCardCVV;
    @XmlElement(name = "CreditCardCountryCode")
    protected String creditCardCountryCode;

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
     * Gets the value of the creditCardMonth property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardMonth }
     *     
     */
    public CreditCardMonth getCreditCardMonth() {
        return creditCardMonth;
    }

    /**
     * Sets the value of the creditCardMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardMonth }
     *     
     */
    public void setCreditCardMonth(CreditCardMonth value) {
        this.creditCardMonth = value;
    }

    /**
     * Gets the value of the creditCardYear property.
     * 
     */
    public int getCreditCardYear() {
        return creditCardYear;
    }

    /**
     * Sets the value of the creditCardYear property.
     * 
     */
    public void setCreditCardYear(int value) {
        this.creditCardYear = value;
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
     * Gets the value of the creditCardZip5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardZip5() {
        return creditCardZip5;
    }

    /**
     * Sets the value of the creditCardZip5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardZip5(String value) {
        this.creditCardZip5 = value;
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

}
