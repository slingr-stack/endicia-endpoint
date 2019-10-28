
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Discounts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Discounts"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Discount" use="required" type="{www.envmgr.com/LabelService}MailDiscount" /&gt;
 *       &lt;attribute name="CubicPricing" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="FlatRatePaddedEnvelope" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="HalfPoundRate" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RegionalRateBox" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="OpenAndDistribute" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Discounts")
public class Discounts {

    @XmlAttribute(name = "Discount", required = true)
    protected MailDiscount discount;
    @XmlAttribute(name = "CubicPricing", required = true)
    protected boolean cubicPricing;
    @XmlAttribute(name = "FlatRatePaddedEnvelope", required = true)
    protected boolean flatRatePaddedEnvelope;
    @XmlAttribute(name = "HalfPoundRate", required = true)
    protected boolean halfPoundRate;
    @XmlAttribute(name = "RegionalRateBox", required = true)
    protected boolean regionalRateBox;
    @XmlAttribute(name = "OpenAndDistribute", required = true)
    protected boolean openAndDistribute;

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link MailDiscount }
     *     
     */
    public MailDiscount getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailDiscount }
     *     
     */
    public void setDiscount(MailDiscount value) {
        this.discount = value;
    }

    /**
     * Gets the value of the cubicPricing property.
     * 
     */
    public boolean isCubicPricing() {
        return cubicPricing;
    }

    /**
     * Sets the value of the cubicPricing property.
     * 
     */
    public void setCubicPricing(boolean value) {
        this.cubicPricing = value;
    }

    /**
     * Gets the value of the flatRatePaddedEnvelope property.
     * 
     */
    public boolean isFlatRatePaddedEnvelope() {
        return flatRatePaddedEnvelope;
    }

    /**
     * Sets the value of the flatRatePaddedEnvelope property.
     * 
     */
    public void setFlatRatePaddedEnvelope(boolean value) {
        this.flatRatePaddedEnvelope = value;
    }

    /**
     * Gets the value of the halfPoundRate property.
     * 
     */
    public boolean isHalfPoundRate() {
        return halfPoundRate;
    }

    /**
     * Sets the value of the halfPoundRate property.
     * 
     */
    public void setHalfPoundRate(boolean value) {
        this.halfPoundRate = value;
    }

    /**
     * Gets the value of the regionalRateBox property.
     * 
     */
    public boolean isRegionalRateBox() {
        return regionalRateBox;
    }

    /**
     * Sets the value of the regionalRateBox property.
     * 
     */
    public void setRegionalRateBox(boolean value) {
        this.regionalRateBox = value;
    }

    /**
     * Gets the value of the openAndDistribute property.
     * 
     */
    public boolean isOpenAndDistribute() {
        return openAndDistribute;
    }

    /**
     * Sets the value of the openAndDistribute property.
     * 
     */
    public void setOpenAndDistribute(boolean value) {
        this.openAndDistribute = value;
    }

}
