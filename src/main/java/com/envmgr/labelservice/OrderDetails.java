
package com.envmgr.labelservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para OrderDetails complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrderDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingAndHandlingPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="TotalDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="TotalTaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="OrderItems" type="{www.envmgr.com/LabelService}ArrayOfOrderItem" minOccurs="0"/&gt;
 *         &lt;element name="OrderCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderDetails", propOrder = {
    "orderDate",
    "orderNumber",
    "shippingAndHandlingPrice",
    "totalDiscountAmount",
    "totalTaxAmount",
    "orderItems",
    "orderCurrency"
})
public class OrderDetails {

    @XmlElement(name = "OrderDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderDate;
    @XmlElement(name = "OrderNumber")
    protected String orderNumber;
    @XmlElement(name = "ShippingAndHandlingPrice", required = true, nillable = true)
    protected BigDecimal shippingAndHandlingPrice;
    @XmlElement(name = "TotalDiscountAmount", required = true, nillable = true)
    protected BigDecimal totalDiscountAmount;
    @XmlElement(name = "TotalTaxAmount", required = true, nillable = true)
    protected BigDecimal totalTaxAmount;
    @XmlElement(name = "OrderItems")
    protected ArrayOfOrderItem orderItems;
    @XmlElement(name = "OrderCurrency")
    protected String orderCurrency;

    /**
     * Obtiene el valor de la propiedad orderDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Define el valor de la propiedad orderDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

    /**
     * Obtiene el valor de la propiedad orderNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Define el valor de la propiedad orderNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingAndHandlingPrice.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShippingAndHandlingPrice() {
        return shippingAndHandlingPrice;
    }

    /**
     * Define el valor de la propiedad shippingAndHandlingPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShippingAndHandlingPrice(BigDecimal value) {
        this.shippingAndHandlingPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad totalDiscountAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDiscountAmount() {
        return totalDiscountAmount;
    }

    /**
     * Define el valor de la propiedad totalDiscountAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDiscountAmount(BigDecimal value) {
        this.totalDiscountAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTaxAmount() {
        return totalTaxAmount;
    }

    /**
     * Define el valor de la propiedad totalTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTaxAmount(BigDecimal value) {
        this.totalTaxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad orderItems.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderItem }
     *     
     */
    public ArrayOfOrderItem getOrderItems() {
        return orderItems;
    }

    /**
     * Define el valor de la propiedad orderItems.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderItem }
     *     
     */
    public void setOrderItems(ArrayOfOrderItem value) {
        this.orderItems = value;
    }

    /**
     * Obtiene el valor de la propiedad orderCurrency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderCurrency() {
        return orderCurrency;
    }

    /**
     * Define el valor de la propiedad orderCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderCurrency(String value) {
        this.orderCurrency = value;
    }

}
