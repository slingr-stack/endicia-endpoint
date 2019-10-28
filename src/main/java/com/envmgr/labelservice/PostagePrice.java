
package com.envmgr.labelservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostagePrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostagePrice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MailClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Postage" type="{www.envmgr.com/LabelService}Postage" minOccurs="0"/&gt;
 *         &lt;element name="Fees" type="{www.envmgr.com/LabelService}Fees" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryTimeDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DdpRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="LabelCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "PostagePrice", propOrder = {
    "mailClass",
    "postage",
    "fees",
    "deliveryTimeDays",
    "estimatedDeliveryDate",
    "ddpRate",
    "labelCategory"
})
public class PostagePrice {

    @XmlElement(name = "MailClass")
    protected String mailClass;
    @XmlElement(name = "Postage")
    protected Postage postage;
    @XmlElement(name = "Fees")
    protected Fees fees;
    @XmlElement(name = "DeliveryTimeDays")
    protected String deliveryTimeDays;
    @XmlElement(name = "EstimatedDeliveryDate")
    protected String estimatedDeliveryDate;
    @XmlElement(name = "DdpRate", required = true)
    protected BigDecimal ddpRate;
    @XmlElement(name = "LabelCategory")
    protected String labelCategory;
    @XmlAttribute(name = "TotalAmount", required = true)
    protected BigDecimal totalAmount;

    /**
     * Gets the value of the mailClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailClass() {
        return mailClass;
    }

    /**
     * Sets the value of the mailClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailClass(String value) {
        this.mailClass = value;
    }

    /**
     * Gets the value of the postage property.
     * 
     * @return
     *     possible object is
     *     {@link Postage }
     *     
     */
    public Postage getPostage() {
        return postage;
    }

    /**
     * Sets the value of the postage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Postage }
     *     
     */
    public void setPostage(Postage value) {
        this.postage = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link Fees }
     *     
     */
    public Fees getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fees }
     *     
     */
    public void setFees(Fees value) {
        this.fees = value;
    }

    /**
     * Gets the value of the deliveryTimeDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryTimeDays() {
        return deliveryTimeDays;
    }

    /**
     * Sets the value of the deliveryTimeDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryTimeDays(String value) {
        this.deliveryTimeDays = value;
    }

    /**
     * Gets the value of the estimatedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    /**
     * Sets the value of the estimatedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedDeliveryDate(String value) {
        this.estimatedDeliveryDate = value;
    }

    /**
     * Gets the value of the ddpRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDdpRate() {
        return ddpRate;
    }

    /**
     * Sets the value of the ddpRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDdpRate(BigDecimal value) {
        this.ddpRate = value;
    }

    /**
     * Gets the value of the labelCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelCategory() {
        return labelCategory;
    }

    /**
     * Sets the value of the labelCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelCategory(String value) {
        this.labelCategory = value;
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
