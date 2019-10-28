
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionListingsRequestOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionListingsRequestOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="CostCenter" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ShipFromZip" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ShipToZip" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TransactionType" use="required" type="{www.envmgr.com/LabelService}GetTransactionsType" /&gt;
 *       &lt;attribute name="StartingTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RefundStatus" use="required" type="{www.envmgr.com/LabelService}TransactionRefundStatus" /&gt;
 *       &lt;attribute name="PurchaseType" use="required" type="{www.envmgr.com/LabelService}GetPurchaseType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionListingsRequestOptions")
public class TransactionListingsRequestOptions {

    @XmlAttribute(name = "CostCenter")
    protected String costCenter;
    @XmlAttribute(name = "StartDateTime")
    protected String startDateTime;
    @XmlAttribute(name = "EndDateTime")
    protected String endDateTime;
    @XmlAttribute(name = "ShipFromZip")
    protected String shipFromZip;
    @XmlAttribute(name = "ShipToZip")
    protected String shipToZip;
    @XmlAttribute(name = "ReferenceID")
    protected String referenceID;
    @XmlAttribute(name = "TransactionType", required = true)
    protected GetTransactionsType transactionType;
    @XmlAttribute(name = "StartingTransactionID")
    protected String startingTransactionID;
    @XmlAttribute(name = "RefundStatus", required = true)
    protected TransactionRefundStatus refundStatus;
    @XmlAttribute(name = "PurchaseType", required = true)
    protected GetPurchaseType purchaseType;

    /**
     * Gets the value of the costCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenter() {
        return costCenter;
    }

    /**
     * Sets the value of the costCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenter(String value) {
        this.costCenter = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDateTime(String value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDateTime(String value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the shipFromZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipFromZip() {
        return shipFromZip;
    }

    /**
     * Sets the value of the shipFromZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipFromZip(String value) {
        this.shipFromZip = value;
    }

    /**
     * Gets the value of the shipToZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToZip() {
        return shipToZip;
    }

    /**
     * Sets the value of the shipToZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToZip(String value) {
        this.shipToZip = value;
    }

    /**
     * Gets the value of the referenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceID() {
        return referenceID;
    }

    /**
     * Sets the value of the referenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceID(String value) {
        this.referenceID = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link GetTransactionsType }
     *     
     */
    public GetTransactionsType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTransactionsType }
     *     
     */
    public void setTransactionType(GetTransactionsType value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the startingTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartingTransactionID() {
        return startingTransactionID;
    }

    /**
     * Sets the value of the startingTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartingTransactionID(String value) {
        this.startingTransactionID = value;
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
     * Gets the value of the purchaseType property.
     * 
     * @return
     *     possible object is
     *     {@link GetPurchaseType }
     *     
     */
    public GetPurchaseType getPurchaseType() {
        return purchaseType;
    }

    /**
     * Sets the value of the purchaseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPurchaseType }
     *     
     */
    public void setPurchaseType(GetPurchaseType value) {
        this.purchaseType = value;
    }

}
