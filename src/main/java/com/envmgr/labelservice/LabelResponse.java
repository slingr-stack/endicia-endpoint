
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LabelResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RefundStatus" type="{www.envmgr.com/LabelService}RefundStatus"/&gt;
 *         &lt;element name="RefundStatusMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PicNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TransactionId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="PieceNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelResponse", propOrder = {
    "refundStatus",
    "refundStatusMessage"
})
public class LabelResponse {

    @XmlElement(name = "RefundStatus", required = true)
    @XmlSchemaType(name = "string")
    protected RefundStatus refundStatus;
    @XmlElement(name = "RefundStatusMessage")
    protected String refundStatusMessage;
    @XmlAttribute(name = "PicNumber")
    protected String picNumber;
    @XmlAttribute(name = "TransactionId", required = true)
    protected long transactionId;
    @XmlAttribute(name = "PieceNumber", required = true)
    protected int pieceNumber;

    /**
     * Gets the value of the refundStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RefundStatus }
     *     
     */
    public RefundStatus getRefundStatus() {
        return refundStatus;
    }

    /**
     * Sets the value of the refundStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundStatus }
     *     
     */
    public void setRefundStatus(RefundStatus value) {
        this.refundStatus = value;
    }

    /**
     * Gets the value of the refundStatusMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundStatusMessage() {
        return refundStatusMessage;
    }

    /**
     * Sets the value of the refundStatusMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundStatusMessage(String value) {
        this.refundStatusMessage = value;
    }

    /**
     * Gets the value of the picNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPicNumber() {
        return picNumber;
    }

    /**
     * Sets the value of the picNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPicNumber(String value) {
        this.picNumber = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     */
    public long getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     */
    public void setTransactionId(long value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the pieceNumber property.
     * 
     */
    public int getPieceNumber() {
        return pieceNumber;
    }

    /**
     * Sets the value of the pieceNumber property.
     * 
     */
    public void setPieceNumber(int value) {
        this.pieceNumber = value;
    }

}
