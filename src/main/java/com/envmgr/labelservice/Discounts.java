
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Discounts complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad discount.
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
     * Define el valor de la propiedad discount.
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
     * Obtiene el valor de la propiedad cubicPricing.
     * 
     */
    public boolean isCubicPricing() {
        return cubicPricing;
    }

    /**
     * Define el valor de la propiedad cubicPricing.
     * 
     */
    public void setCubicPricing(boolean value) {
        this.cubicPricing = value;
    }

    /**
     * Obtiene el valor de la propiedad flatRatePaddedEnvelope.
     * 
     */
    public boolean isFlatRatePaddedEnvelope() {
        return flatRatePaddedEnvelope;
    }

    /**
     * Define el valor de la propiedad flatRatePaddedEnvelope.
     * 
     */
    public void setFlatRatePaddedEnvelope(boolean value) {
        this.flatRatePaddedEnvelope = value;
    }

    /**
     * Obtiene el valor de la propiedad halfPoundRate.
     * 
     */
    public boolean isHalfPoundRate() {
        return halfPoundRate;
    }

    /**
     * Define el valor de la propiedad halfPoundRate.
     * 
     */
    public void setHalfPoundRate(boolean value) {
        this.halfPoundRate = value;
    }

    /**
     * Obtiene el valor de la propiedad regionalRateBox.
     * 
     */
    public boolean isRegionalRateBox() {
        return regionalRateBox;
    }

    /**
     * Define el valor de la propiedad regionalRateBox.
     * 
     */
    public void setRegionalRateBox(boolean value) {
        this.regionalRateBox = value;
    }

    /**
     * Obtiene el valor de la propiedad openAndDistribute.
     * 
     */
    public boolean isOpenAndDistribute() {
        return openAndDistribute;
    }

    /**
     * Define el valor de la propiedad openAndDistribute.
     * 
     */
    public void setOpenAndDistribute(boolean value) {
        this.openAndDistribute = value;
    }

}
