
package com.envmgr.labelservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Postage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Postage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MailService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntraBMC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pricing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DimWeighting" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TotalAmount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Postage", propOrder = {
    "mailService",
    "zone",
    "intraBMC",
    "pricing",
    "dimWeighting"
})
public class Postage {

    @XmlElement(name = "MailService")
    protected String mailService;
    @XmlElement(name = "Zone")
    protected String zone;
    @XmlElement(name = "IntraBMC")
    protected String intraBMC;
    @XmlElement(name = "Pricing")
    protected String pricing;
    @XmlElement(name = "DimWeighting")
    protected boolean dimWeighting;
    @XmlAttribute(name = "TotalAmount", required = true)
    protected BigDecimal totalAmount;

    /**
     * Gets the value of the mailService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailService() {
        return mailService;
    }

    /**
     * Sets the value of the mailService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailService(String value) {
        this.mailService = value;
    }

    /**
     * Gets the value of the zone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZone() {
        return zone;
    }

    /**
     * Sets the value of the zone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZone(String value) {
        this.zone = value;
    }

    /**
     * Gets the value of the intraBMC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntraBMC() {
        return intraBMC;
    }

    /**
     * Sets the value of the intraBMC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntraBMC(String value) {
        this.intraBMC = value;
    }

    /**
     * Gets the value of the pricing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricing() {
        return pricing;
    }

    /**
     * Sets the value of the pricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricing(String value) {
        this.pricing = value;
    }

    /**
     * Gets the value of the dimWeighting property.
     * 
     */
    public boolean isDimWeighting() {
        return dimWeighting;
    }

    /**
     * Sets the value of the dimWeighting property.
     * 
     */
    public void setDimWeighting(boolean value) {
        this.dimWeighting = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
    }

}
