
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CreditCard complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad creditCardMonth.
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
     * Define el valor de la propiedad creditCardMonth.
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
     * Obtiene el valor de la propiedad creditCardYear.
     * 
     */
    public int getCreditCardYear() {
        return creditCardYear;
    }

    /**
     * Define el valor de la propiedad creditCardYear.
     * 
     */
    public void setCreditCardYear(int value) {
        this.creditCardYear = value;
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
     * Obtiene el valor de la propiedad creditCardZip5.
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
     * Define el valor de la propiedad creditCardZip5.
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

}
