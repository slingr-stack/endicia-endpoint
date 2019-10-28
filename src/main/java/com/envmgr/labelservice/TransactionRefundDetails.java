
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionRefundDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionRefundDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RefundRequestedDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RefundRequestType" type="{www.envmgr.com/LabelService}RefundType"/&gt;
 *         &lt;element name="RefundRequestedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RefundStatus" type="{www.envmgr.com/LabelService}TransactionRefundStatus"/&gt;
 *         &lt;element name="RefundProcessedDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RefundedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionRefundDetails", propOrder = {
    "refundRequestedDateTime",
    "refundRequestType",
    "refundRequestedBy",
    "refundStatus",
    "refundProcessedDateTime",
    "refundedAmount"
})
public class TransactionRefundDetails {

    @XmlElement(name = "RefundRequestedDateTime")
    protected String refundRequestedDateTime;
    @XmlElement(name = "RefundRequestType", required = true)
    @XmlSchemaType(name = "string")
    protected RefundType refundRequestType;
    @XmlElement(name = "RefundRequestedBy")
    protected String refundRequestedBy;
    @XmlElement(name = "RefundStatus", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected TransactionRefundStatus refundStatus;
    @XmlElement(name = "RefundProcessedDateTime")
    protected String refundProcessedDateTime;
    @XmlElement(name = "RefundedAmount")
    protected String refundedAmount;

    /**
     * Gets the value of the refundRequestedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundRequestedDateTime() {
        return refundRequestedDateTime;
    }

    /**
     * Sets the value of the refundRequestedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundRequestedDateTime(String value) {
        this.refundRequestedDateTime = value;
    }

    /**
     * Gets the value of the refundRequestType property.
     * 
     * @return
     *     possible object is
     *     {@link RefundType }
     *     
     */
    public RefundType getRefundRequestType() {
        return refundRequestType;
    }

    /**
     * Sets the value of the refundRequestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundType }
     *     
     */
    public void setRefundRequestType(RefundType value) {
        this.refundRequestType = value;
    }

    /**
     * Gets the value of the refundRequestedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundRequestedBy() {
        return refundRequestedBy;
    }

    /**
     * Sets the value of the refundRequestedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundRequestedBy(String value) {
        this.refundRequestedBy = value;
    }

    /**
     * Gets the value of the refundStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionRefundStatus }
     *     
     */
    public TransactionRefundStatus getRefundStatus() {
        return refundStatus;
    }

    /**
     * Sets the value of the refundStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionRefundStatus }
     *     
     */
    public void setRefundStatus(TransactionRefundStatus value) {
        this.refundStatus = value;
    }

    /**
     * Gets the value of the refundProcessedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundProcessedDateTime() {
        return refundProcessedDateTime;
    }

    /**
     * Sets the value of the refundProcessedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundProcessedDateTime(String value) {
        this.refundProcessedDateTime = value;
    }

    /**
     * Gets the value of the refundedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundedAmount() {
        return refundedAmount;
    }

    /**
     * Sets the value of the refundedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundedAmount(String value) {
        this.refundedAmount = value;
    }

}
