
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transaction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="PieceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MailClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToAddress" type="{www.envmgr.com/LabelService}TransactionAddress" minOccurs="0"/&gt;
 *         &lt;element name="FromAddress" type="{www.envmgr.com/LabelService}TransactionAddress" minOccurs="0"/&gt;
 *         &lt;element name="CostCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RetailAccountID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RetailAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContractID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{www.envmgr.com/LabelService}TransactionStatus" minOccurs="0"/&gt;
 *         &lt;element name="Zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CubicFt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RefundDetails" type="{www.envmgr.com/LabelService}TransactionRefundDetails" minOccurs="0"/&gt;
 *         &lt;element name="AdjustmentsDetails" type="{www.envmgr.com/LabelService}ArrayOfAdjustment" minOccurs="0"/&gt;
 *         &lt;element name="LabelCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TransactionType" use="required" type="{www.envmgr.com/LabelService}TransactionType" /&gt;
 *       &lt;attribute name="TransactionDateTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PostmarkDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RefundStatus" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PurchaseType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction", propOrder = {
    "pic",
    "transactionID",
    "pieceID",
    "amount",
    "weight",
    "mailClass",
    "toAddress",
    "fromAddress",
    "costCenter",
    "referenceID",
    "retailAccountID",
    "retailAmount",
    "contractID",
    "status",
    "zone",
    "cubicFt",
    "refundDetails",
    "adjustmentsDetails",
    "labelCategory"
})
public class Transaction {

    @XmlElement(name = "PIC")
    protected String pic;
    @XmlElement(name = "TransactionID")
    protected long transactionID;
    @XmlElement(name = "PieceID")
    protected String pieceID;
    @XmlElement(name = "Amount")
    protected String amount;
    @XmlElement(name = "Weight")
    protected String weight;
    @XmlElement(name = "MailClass")
    protected String mailClass;
    @XmlElement(name = "ToAddress")
    protected TransactionAddress toAddress;
    @XmlElement(name = "FromAddress")
    protected TransactionAddress fromAddress;
    @XmlElement(name = "CostCenter")
    protected String costCenter;
    @XmlElement(name = "ReferenceID")
    protected String referenceID;
    @XmlElement(name = "RetailAccountID")
    protected String retailAccountID;
    @XmlElement(name = "RetailAmount")
    protected String retailAmount;
    @XmlElement(name = "ContractID")
    protected String contractID;
    @XmlElement(name = "Status")
    protected TransactionStatus status;
    @XmlElement(name = "Zone")
    protected String zone;
    @XmlElement(name = "CubicFt")
    protected String cubicFt;
    @XmlElement(name = "RefundDetails")
    protected TransactionRefundDetails refundDetails;
    @XmlElement(name = "AdjustmentsDetails")
    protected ArrayOfAdjustment adjustmentsDetails;
    @XmlElement(name = "LabelCategory")
    protected String labelCategory;
    @XmlAttribute(name = "TransactionType", required = true)
    protected TransactionType transactionType;
    @XmlAttribute(name = "TransactionDateTime")
    protected String transactionDateTime;
    @XmlAttribute(name = "PostmarkDate")
    protected String postmarkDate;
    @XmlAttribute(name = "RefundStatus")
    protected String refundStatus;
    @XmlAttribute(name = "PurchaseType")
    protected String purchaseType;

    /**
     * Gets the value of the pic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIC() {
        return pic;
    }

    /**
     * Sets the value of the pic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIC(String value) {
        this.pic = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     */
    public long getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     */
    public void setTransactionID(long value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the pieceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPieceID() {
        return pieceID;
    }

    /**
     * Sets the value of the pieceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPieceID(String value) {
        this.pieceID = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeight(String value) {
        this.weight = value;
    }

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
     * Gets the value of the toAddress property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAddress }
     *     
     */
    public TransactionAddress getToAddress() {
        return toAddress;
    }

    /**
     * Sets the value of the toAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAddress }
     *     
     */
    public void setToAddress(TransactionAddress value) {
        this.toAddress = value;
    }

    /**
     * Gets the value of the fromAddress property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAddress }
     *     
     */
    public TransactionAddress getFromAddress() {
        return fromAddress;
    }

    /**
     * Sets the value of the fromAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAddress }
     *     
     */
    public void setFromAddress(TransactionAddress value) {
        this.fromAddress = value;
    }

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
     * Gets the value of the retailAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetailAccountID() {
        return retailAccountID;
    }

    /**
     * Sets the value of the retailAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetailAccountID(String value) {
        this.retailAccountID = value;
    }

    /**
     * Gets the value of the retailAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetailAmount() {
        return retailAmount;
    }

    /**
     * Sets the value of the retailAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetailAmount(String value) {
        this.retailAmount = value;
    }

    /**
     * Gets the value of the contractID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractID() {
        return contractID;
    }

    /**
     * Sets the value of the contractID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractID(String value) {
        this.contractID = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus }
     *     
     */
    public TransactionStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus }
     *     
     */
    public void setStatus(TransactionStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the zone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZone() {
        return zone;
    }

    /**
     * Sets the value of the zone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZone(String value) {
        this.zone = value;
    }

    /**
     * Gets the value of the cubicFt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubicFt() {
        return cubicFt;
    }

    /**
     * Sets the value of the cubicFt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubicFt(String value) {
        this.cubicFt = value;
    }

    /**
     * Gets the value of the refundDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionRefundDetails }
     *     
     */
    public TransactionRefundDetails getRefundDetails() {
        return refundDetails;
    }

    /**
     * Sets the value of the refundDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionRefundDetails }
     *     
     */
    public void setRefundDetails(TransactionRefundDetails value) {
        this.refundDetails = value;
    }

    /**
     * Gets the value of the adjustmentsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdjustment }
     *     
     */
    public ArrayOfAdjustment getAdjustmentsDetails() {
        return adjustmentsDetails;
    }

    /**
     * Sets the value of the adjustmentsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdjustment }
     *     
     */
    public void setAdjustmentsDetails(ArrayOfAdjustment value) {
        this.adjustmentsDetails = value;
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
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType }
     *     
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     *     
     */
    public void setTransactionType(TransactionType value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the transactionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDateTime() {
        return transactionDateTime;
    }

    /**
     * Sets the value of the transactionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDateTime(String value) {
        this.transactionDateTime = value;
    }

    /**
     * Gets the value of the postmarkDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostmarkDate() {
        return postmarkDate;
    }

    /**
     * Sets the value of the postmarkDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostmarkDate(String value) {
        this.postmarkDate = value;
    }

    /**
     * Gets the value of the refundStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundStatus() {
        return refundStatus;
    }

    /**
     * Sets the value of the refundStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundStatus(String value) {
        this.refundStatus = value;
    }

    /**
     * Gets the value of the purchaseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseType() {
        return purchaseType;
    }

    /**
     * Sets the value of the purchaseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseType(String value) {
        this.purchaseType = value;
    }

}
