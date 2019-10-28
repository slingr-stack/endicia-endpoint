
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscountRates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountRates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Discount" use="required" type="{www.envmgr.com/LabelService}MailDiscount" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountRates")
public class DiscountRates {

    @XmlAttribute(name = "Discount", required = true)
    protected MailDiscount discount;

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

}
