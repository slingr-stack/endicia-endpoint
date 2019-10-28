
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cod3816 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cod3816"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AS3816" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USPSCA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PMExpressReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OptionalEndorsement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cod3816", propOrder = {
    "as3816",
    "uspsca",
    "pmExpressReturn",
    "optionalEndorsement",
    "returnName",
    "returnCompany",
    "returnAddress1",
    "returnAddress2",
    "returnCity",
    "returnState",
    "returnPostalCode"
})
public class Cod3816 {

    @XmlElement(name = "AS3816")
    protected String as3816;
    @XmlElement(name = "USPSCA")
    protected String uspsca;
    @XmlElement(name = "PMExpressReturn")
    protected String pmExpressReturn;
    @XmlElement(name = "OptionalEndorsement")
    protected String optionalEndorsement;
    @XmlElement(name = "ReturnName")
    protected String returnName;
    @XmlElement(name = "ReturnCompany")
    protected String returnCompany;
    @XmlElement(name = "ReturnAddress1")
    protected String returnAddress1;
    @XmlElement(name = "ReturnAddress2")
    protected String returnAddress2;
    @XmlElement(name = "ReturnCity")
    protected String returnCity;
    @XmlElement(name = "ReturnState")
    protected String returnState;
    @XmlElement(name = "ReturnPostalCode")
    protected String returnPostalCode;

    /**
     * Gets the value of the as3816 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAS3816() {
        return as3816;
    }

    /**
     * Sets the value of the as3816 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAS3816(String value) {
        this.as3816 = value;
    }

    /**
     * Gets the value of the uspsca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSPSCA() {
        return uspsca;
    }

    /**
     * Sets the value of the uspsca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSPSCA(String value) {
        this.uspsca = value;
    }

    /**
     * Gets the value of the pmExpressReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMExpressReturn() {
        return pmExpressReturn;
    }

    /**
     * Sets the value of the pmExpressReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMExpressReturn(String value) {
        this.pmExpressReturn = value;
    }

    /**
     * Gets the value of the optionalEndorsement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalEndorsement() {
        return optionalEndorsement;
    }

    /**
     * Sets the value of the optionalEndorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionalEndorsement(String value) {
        this.optionalEndorsement = value;
    }

    /**
     * Gets the value of the returnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnName() {
        return returnName;
    }

    /**
     * Sets the value of the returnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnName(String value) {
        this.returnName = value;
    }

    /**
     * Gets the value of the returnCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCompany() {
        return returnCompany;
    }

    /**
     * Sets the value of the returnCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCompany(String value) {
        this.returnCompany = value;
    }

    /**
     * Gets the value of the returnAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnAddress1() {
        return returnAddress1;
    }

    /**
     * Sets the value of the returnAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnAddress1(String value) {
        this.returnAddress1 = value;
    }

    /**
     * Gets the value of the returnAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnAddress2() {
        return returnAddress2;
    }

    /**
     * Sets the value of the returnAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnAddress2(String value) {
        this.returnAddress2 = value;
    }

    /**
     * Gets the value of the returnCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCity() {
        return returnCity;
    }

    /**
     * Sets the value of the returnCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCity(String value) {
        this.returnCity = value;
    }

    /**
     * Gets the value of the returnState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnState() {
        return returnState;
    }

    /**
     * Sets the value of the returnState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnState(String value) {
        this.returnState = value;
    }

    /**
     * Gets the value of the returnPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnPostalCode() {
        return returnPostalCode;
    }

    /**
     * Sets the value of the returnPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnPostalCode(String value) {
        this.returnPostalCode = value;
    }

}
