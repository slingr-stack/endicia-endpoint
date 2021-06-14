
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Transaction complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad pic.
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
     * Define el valor de la propiedad pic.
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
     * Obtiene el valor de la propiedad transactionID.
     * 
     */
    public long getTransactionID() {
        return transactionID;
    }

    /**
     * Define el valor de la propiedad transactionID.
     * 
     */
    public void setTransactionID(long value) {
        this.transactionID = value;
    }

    /**
     * Obtiene el valor de la propiedad pieceID.
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
     * Define el valor de la propiedad pieceID.
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
     * Obtiene el valor de la propiedad amount.
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
     * Define el valor de la propiedad amount.
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
     * Obtiene el valor de la propiedad weight.
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
     * Define el valor de la propiedad weight.
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
     * Obtiene el valor de la propiedad toAddress.
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
     * Define el valor de la propiedad toAddress.
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
     * Obtiene el valor de la propiedad fromAddress.
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
     * Define el valor de la propiedad fromAddress.
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
     * Obtiene el valor de la propiedad costCenter.
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
     * Define el valor de la propiedad costCenter.
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
     * Obtiene el valor de la propiedad referenceID.
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
     * Define el valor de la propiedad referenceID.
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
     * Obtiene el valor de la propiedad retailAccountID.
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
     * Define el valor de la propiedad retailAccountID.
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
     * Obtiene el valor de la propiedad retailAmount.
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
     * Define el valor de la propiedad retailAmount.
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
     * Obtiene el valor de la propiedad contractID.
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
     * Define el valor de la propiedad contractID.
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
     * Obtiene el valor de la propiedad status.
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
     * Define el valor de la propiedad status.
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
     * Obtiene el valor de la propiedad zone.
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
     * Define el valor de la propiedad zone.
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
     * Obtiene el valor de la propiedad cubicFt.
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
     * Define el valor de la propiedad cubicFt.
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
     * Obtiene el valor de la propiedad refundDetails.
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
     * Define el valor de la propiedad refundDetails.
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
     * Obtiene el valor de la propiedad adjustmentsDetails.
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
     * Define el valor de la propiedad adjustmentsDetails.
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
     * Obtiene el valor de la propiedad transactionType.
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
     * Define el valor de la propiedad transactionType.
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
     * Obtiene el valor de la propiedad transactionDateTime.
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
     * Define el valor de la propiedad transactionDateTime.
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
     * Obtiene el valor de la propiedad postmarkDate.
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
     * Define el valor de la propiedad postmarkDate.
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
     * Obtiene el valor de la propiedad refundStatus.
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
     * Define el valor de la propiedad refundStatus.
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
     * Obtiene el valor de la propiedad purchaseType.
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
     * Define el valor de la propiedad purchaseType.
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
