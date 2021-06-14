
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TransactionListingsRequestOptions complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad startDateTime.
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
     * Define el valor de la propiedad startDateTime.
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
     * Obtiene el valor de la propiedad endDateTime.
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
     * Define el valor de la propiedad endDateTime.
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
     * Obtiene el valor de la propiedad shipFromZip.
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
     * Define el valor de la propiedad shipFromZip.
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
     * Obtiene el valor de la propiedad shipToZip.
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
     * Define el valor de la propiedad shipToZip.
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
     * Obtiene el valor de la propiedad transactionType.
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
     * Define el valor de la propiedad transactionType.
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
     * Obtiene el valor de la propiedad startingTransactionID.
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
     * Define el valor de la propiedad startingTransactionID.
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
     * Obtiene el valor de la propiedad purchaseType.
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
     * Define el valor de la propiedad purchaseType.
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
