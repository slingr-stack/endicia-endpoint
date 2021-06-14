
package com.envmgr.labelservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PostagePrice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
 *         &lt;element name="Surcharge" type="{www.envmgr.com/LabelService}Surcharge" minOccurs="0"/&gt;
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
    "labelCategory",
    "surcharge"
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
    @XmlElement(name = "Surcharge")
    protected Surcharge surcharge;
    @XmlAttribute(name = "TotalAmount", required = true)
    protected BigDecimal totalAmount;

    /**
     * Obtiene el valor de la propiedad mailClass.
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
     * Define el valor de la propiedad mailClass.
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
     * Obtiene el valor de la propiedad postage.
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
     * Define el valor de la propiedad postage.
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
     * Obtiene el valor de la propiedad fees.
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
     * Define el valor de la propiedad fees.
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
     * Obtiene el valor de la propiedad deliveryTimeDays.
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
     * Define el valor de la propiedad deliveryTimeDays.
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
     * Obtiene el valor de la propiedad estimatedDeliveryDate.
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
     * Define el valor de la propiedad estimatedDeliveryDate.
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
     * Obtiene el valor de la propiedad ddpRate.
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
     * Define el valor de la propiedad ddpRate.
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
     * Obtiene el valor de la propiedad labelCategory.
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
     * Define el valor de la propiedad labelCategory.
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
     * Obtiene el valor de la propiedad surcharge.
     * 
     * @return
     *     possible object is
     *     {@link Surcharge }
     *     
     */
    public Surcharge getSurcharge() {
        return surcharge;
    }

    /**
     * Define el valor de la propiedad surcharge.
     * 
     * @param value
     *     allowed object is
     *     {@link Surcharge }
     *     
     */
    public void setSurcharge(Surcharge value) {
        this.surcharge = value;
    }

    /**
     * Obtiene el valor de la propiedad totalAmount.
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
     * Define el valor de la propiedad totalAmount.
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
