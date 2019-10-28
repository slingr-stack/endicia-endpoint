
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTransactionsListingRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTransactionsListingRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{www.envmgr.com/LabelService}DataValidator"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestOptions" type="{www.envmgr.com/LabelService}TransactionListingsRequestOptions" minOccurs="0"/&gt;
 *         &lt;element name="PicNumbers" type="{www.envmgr.com/LabelService}ArrayOfString6" minOccurs="0"/&gt;
 *         &lt;element name="PieceIDs" type="{www.envmgr.com/LabelService}ArrayOfString7" minOccurs="0"/&gt;
 *         &lt;element name="TransactionIDs" type="{www.envmgr.com/LabelService}ArrayOfString8" minOccurs="0"/&gt;
 *         &lt;element name="CostCenters" type="{www.envmgr.com/LabelService}ArrayOfString9" minOccurs="0"/&gt;
 *         &lt;element name="IncludeTracking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IncludeFromAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IncludeAdjustmentDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequesterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertifiedIntermediary" type="{www.envmgr.com/LabelService}CertifiedIntermediary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTransactionsListingRequest", propOrder = {
    "requestID",
    "requestOptions",
    "picNumbers",
    "pieceIDs",
    "transactionIDs",
    "costCenters",
    "includeTracking",
    "includeFromAddress",
    "includeAdjustmentDetails",
    "requesterID",
    "certifiedIntermediary"
})
public class GetTransactionsListingRequest
    extends DataValidator
{

    @XmlElement(name = "RequestID")
    protected String requestID;
    @XmlElement(name = "RequestOptions")
    protected TransactionListingsRequestOptions requestOptions;
    @XmlElement(name = "PicNumbers")
    protected ArrayOfString6 picNumbers;
    @XmlElement(name = "PieceIDs")
    protected ArrayOfString7 pieceIDs;
    @XmlElement(name = "TransactionIDs")
    protected ArrayOfString8 transactionIDs;
    @XmlElement(name = "CostCenters")
    protected ArrayOfString9 costCenters;
    @XmlElement(name = "IncludeTracking")
    protected String includeTracking;
    @XmlElement(name = "IncludeFromAddress")
    protected String includeFromAddress;
    @XmlElement(name = "IncludeAdjustmentDetails")
    protected String includeAdjustmentDetails;
    @XmlElement(name = "RequesterID")
    protected String requesterID;
    @XmlElement(name = "CertifiedIntermediary")
    protected CertifiedIntermediary certifiedIntermediary;

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the requestOptions property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionListingsRequestOptions }
     *     
     */
    public TransactionListingsRequestOptions getRequestOptions() {
        return requestOptions;
    }

    /**
     * Sets the value of the requestOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionListingsRequestOptions }
     *     
     */
    public void setRequestOptions(TransactionListingsRequestOptions value) {
        this.requestOptions = value;
    }

    /**
     * Gets the value of the picNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString6 }
     *     
     */
    public ArrayOfString6 getPicNumbers() {
        return picNumbers;
    }

    /**
     * Sets the value of the picNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString6 }
     *     
     */
    public void setPicNumbers(ArrayOfString6 value) {
        this.picNumbers = value;
    }

    /**
     * Gets the value of the pieceIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString7 }
     *     
     */
    public ArrayOfString7 getPieceIDs() {
        return pieceIDs;
    }

    /**
     * Sets the value of the pieceIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString7 }
     *     
     */
    public void setPieceIDs(ArrayOfString7 value) {
        this.pieceIDs = value;
    }

    /**
     * Gets the value of the transactionIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString8 }
     *     
     */
    public ArrayOfString8 getTransactionIDs() {
        return transactionIDs;
    }

    /**
     * Sets the value of the transactionIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString8 }
     *     
     */
    public void setTransactionIDs(ArrayOfString8 value) {
        this.transactionIDs = value;
    }

    /**
     * Gets the value of the costCenters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString9 }
     *     
     */
    public ArrayOfString9 getCostCenters() {
        return costCenters;
    }

    /**
     * Sets the value of the costCenters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString9 }
     *     
     */
    public void setCostCenters(ArrayOfString9 value) {
        this.costCenters = value;
    }

    /**
     * Gets the value of the includeTracking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeTracking() {
        return includeTracking;
    }

    /**
     * Sets the value of the includeTracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeTracking(String value) {
        this.includeTracking = value;
    }

    /**
     * Gets the value of the includeFromAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeFromAddress() {
        return includeFromAddress;
    }

    /**
     * Sets the value of the includeFromAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeFromAddress(String value) {
        this.includeFromAddress = value;
    }

    /**
     * Gets the value of the includeAdjustmentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeAdjustmentDetails() {
        return includeAdjustmentDetails;
    }

    /**
     * Sets the value of the includeAdjustmentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeAdjustmentDetails(String value) {
        this.includeAdjustmentDetails = value;
    }

    /**
     * Gets the value of the requesterID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterID() {
        return requesterID;
    }

    /**
     * Sets the value of the requesterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterID(String value) {
        this.requesterID = value;
    }

    /**
     * Gets the value of the certifiedIntermediary property.
     * 
     * @return
     *     possible object is
     *     {@link CertifiedIntermediary }
     *     
     */
    public CertifiedIntermediary getCertifiedIntermediary() {
        return certifiedIntermediary;
    }

    /**
     * Sets the value of the certifiedIntermediary property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertifiedIntermediary }
     *     
     */
    public void setCertifiedIntermediary(CertifiedIntermediary value) {
        this.certifiedIntermediary = value;
    }

}
