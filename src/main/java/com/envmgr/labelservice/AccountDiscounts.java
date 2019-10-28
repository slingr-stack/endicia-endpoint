
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountDiscounts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountDiscounts"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PriorityMail" type="{www.envmgr.com/LabelService}Discounts" minOccurs="0"/&gt;
 *         &lt;element name="PMExpress" type="{www.envmgr.com/LabelService}Discounts" minOccurs="0"/&gt;
 *         &lt;element name="FCPS" type="{www.envmgr.com/LabelService}Discounts" minOccurs="0"/&gt;
 *         &lt;element name="PMI" type="{www.envmgr.com/LabelService}DiscountRates" minOccurs="0"/&gt;
 *         &lt;element name="EMI" type="{www.envmgr.com/LabelService}DiscountRates" minOccurs="0"/&gt;
 *         &lt;element name="FCPIS" type="{www.envmgr.com/LabelService}DiscountRates" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountDiscounts", propOrder = {
    "priorityMail",
    "pmExpress",
    "fcps",
    "pmi",
    "emi",
    "fcpis"
})
public class AccountDiscounts {

    @XmlElement(name = "PriorityMail")
    protected Discounts priorityMail;
    @XmlElement(name = "PMExpress")
    protected Discounts pmExpress;
    @XmlElement(name = "FCPS")
    protected Discounts fcps;
    @XmlElement(name = "PMI")
    protected DiscountRates pmi;
    @XmlElement(name = "EMI")
    protected DiscountRates emi;
    @XmlElement(name = "FCPIS")
    protected DiscountRates fcpis;

    /**
     * Gets the value of the priorityMail property.
     * 
     * @return
     *     possible object is
     *     {@link Discounts }
     *     
     */
    public Discounts getPriorityMail() {
        return priorityMail;
    }

    /**
     * Sets the value of the priorityMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Discounts }
     *     
     */
    public void setPriorityMail(Discounts value) {
        this.priorityMail = value;
    }

    /**
     * Gets the value of the pmExpress property.
     * 
     * @return
     *     possible object is
     *     {@link Discounts }
     *     
     */
    public Discounts getPMExpress() {
        return pmExpress;
    }

    /**
     * Sets the value of the pmExpress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Discounts }
     *     
     */
    public void setPMExpress(Discounts value) {
        this.pmExpress = value;
    }

    /**
     * Gets the value of the fcps property.
     * 
     * @return
     *     possible object is
     *     {@link Discounts }
     *     
     */
    public Discounts getFCPS() {
        return fcps;
    }

    /**
     * Sets the value of the fcps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Discounts }
     *     
     */
    public void setFCPS(Discounts value) {
        this.fcps = value;
    }

    /**
     * Gets the value of the pmi property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountRates }
     *     
     */
    public DiscountRates getPMI() {
        return pmi;
    }

    /**
     * Sets the value of the pmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountRates }
     *     
     */
    public void setPMI(DiscountRates value) {
        this.pmi = value;
    }

    /**
     * Gets the value of the emi property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountRates }
     *     
     */
    public DiscountRates getEMI() {
        return emi;
    }

    /**
     * Sets the value of the emi property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountRates }
     *     
     */
    public void setEMI(DiscountRates value) {
        this.emi = value;
    }

    /**
     * Gets the value of the fcpis property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountRates }
     *     
     */
    public DiscountRates getFCPIS() {
        return fcpis;
    }

    /**
     * Sets the value of the fcpis property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountRates }
     *     
     */
    public void setFCPIS(DiscountRates value) {
        this.fcpis = value;
    }

}
