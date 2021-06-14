
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TransactionRefundDetails complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad refundRequestedDateTime.
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
     * Define el valor de la propiedad refundRequestedDateTime.
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
     * Obtiene el valor de la propiedad refundRequestType.
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
     * Define el valor de la propiedad refundRequestType.
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
     * Obtiene el valor de la propiedad refundRequestedBy.
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
     * Define el valor de la propiedad refundRequestedBy.
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
     * Obtiene el valor de la propiedad refundStatus.
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
     * Define el valor de la propiedad refundStatus.
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
     * Obtiene el valor de la propiedad refundProcessedDateTime.
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
     * Define el valor de la propiedad refundProcessedDateTime.
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
     * Obtiene el valor de la propiedad refundedAmount.
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
     * Define el valor de la propiedad refundedAmount.
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
