
package com.envmgr.labelservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelRequestResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LabelRequestResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Base64LabelImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Label" type="{www.envmgr.com/LabelService}ImageSet" minOccurs="0"/&gt;
 *         &lt;element name="CustomsForm" type="{www.envmgr.com/LabelService}ImageSet" minOccurs="0"/&gt;
 *         &lt;element name="PIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomsNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FinalPostage" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TransactionDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostmarkDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostageBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CostCenter" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HfpFacilityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HfpFacilityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HfpFacilityAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HfpFacilityCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HfpFacilityState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HfpFacilityPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HfpFacilityZIP4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostagePrice" type="{www.envmgr.com/LabelService}PostagePrice" minOccurs="0"/&gt;
 *         &lt;element name="RequesterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceID2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceID3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceID4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CostCenterAlphaNumeric" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Indicium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BarcodeDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BarcodeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Banner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RDC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoutingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryTimeDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DHLInboundSortCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DHLOutboundSortCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DHLDestMailTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DHLMailType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DHLITVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DHLServiceLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriorityMailExpressCommitments" type="{www.envmgr.com/LabelService}ArrayOfCommitment" minOccurs="0"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResellerInformation" type="{www.envmgr.com/LabelService}ResellerInformation" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SDRValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelRequestResponse", propOrder = {
    "status",
    "errorMessage",
    "base64LabelImage",
    "label",
    "customsForm",
    "pic",
    "customsNumber",
    "trackingNumber",
    "finalPostage",
    "transactionID",
    "transactionDateTime",
    "postmarkDate",
    "postageBalance",
    "referenceID",
    "costCenter",
    "hfpFacilityID",
    "hfpFacilityName",
    "hfpFacilityAddress1",
    "hfpFacilityCity",
    "hfpFacilityState",
    "hfpFacilityPostalCode",
    "hfpFacilityZIP4",
    "postagePrice",
    "requesterID",
    "referenceID2",
    "referenceID3",
    "referenceID4",
    "costCenterAlphaNumeric",
    "indicium",
    "barcodeDisplay",
    "barcodeNumber",
    "banner",
    "rdc",
    "routingNumber",
    "deliveryTimeDays",
    "dhlInboundSortCode",
    "dhlOutboundSortCode",
    "dhlDestMailTerminal",
    "dhlMailType",
    "dhlitVersion",
    "dhlServiceLevel",
    "priorityMailExpressCommitments",
    "sequenceNumber",
    "resellerInformation",
    "estimatedDeliveryDate",
    "sdrValue",
    "nassCode"
})
public class LabelRequestResponse {

    @XmlElement(name = "Status")
    protected int status;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "Base64LabelImage")
    protected String base64LabelImage;
    @XmlElement(name = "Label")
    protected ImageSet label;
    @XmlElement(name = "CustomsForm")
    protected ImageSet customsForm;
    @XmlElement(name = "PIC")
    protected String pic;
    @XmlElement(name = "CustomsNumber")
    protected String customsNumber;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "FinalPostage", required = true)
    protected BigDecimal finalPostage;
    @XmlElement(name = "TransactionID")
    protected int transactionID;
    @XmlElement(name = "TransactionDateTime")
    protected String transactionDateTime;
    @XmlElement(name = "PostmarkDate")
    protected String postmarkDate;
    @XmlElement(name = "PostageBalance", required = true)
    protected BigDecimal postageBalance;
    @XmlElement(name = "ReferenceID")
    protected String referenceID;
    @XmlElement(name = "CostCenter")
    protected int costCenter;
    @XmlElement(name = "HfpFacilityID")
    protected String hfpFacilityID;
    @XmlElement(name = "HfpFacilityName")
    protected String hfpFacilityName;
    @XmlElement(name = "HfpFacilityAddress1")
    protected String hfpFacilityAddress1;
    @XmlElement(name = "HfpFacilityCity")
    protected String hfpFacilityCity;
    @XmlElement(name = "HfpFacilityState")
    protected String hfpFacilityState;
    @XmlElement(name = "HfpFacilityPostalCode")
    protected String hfpFacilityPostalCode;
    @XmlElement(name = "HfpFacilityZIP4")
    protected String hfpFacilityZIP4;
    @XmlElement(name = "PostagePrice")
    protected PostagePrice postagePrice;
    @XmlElement(name = "RequesterID")
    protected String requesterID;
    @XmlElement(name = "ReferenceID2")
    protected String referenceID2;
    @XmlElement(name = "ReferenceID3")
    protected String referenceID3;
    @XmlElement(name = "ReferenceID4")
    protected String referenceID4;
    @XmlElement(name = "CostCenterAlphaNumeric")
    protected String costCenterAlphaNumeric;
    @XmlElement(name = "Indicium")
    protected String indicium;
    @XmlElement(name = "BarcodeDisplay")
    protected String barcodeDisplay;
    @XmlElement(name = "BarcodeNumber")
    protected String barcodeNumber;
    @XmlElement(name = "Banner")
    protected String banner;
    @XmlElement(name = "RDC")
    protected String rdc;
    @XmlElement(name = "RoutingNumber")
    protected String routingNumber;
    @XmlElement(name = "DeliveryTimeDays")
    protected String deliveryTimeDays;
    @XmlElement(name = "DHLInboundSortCode")
    protected String dhlInboundSortCode;
    @XmlElement(name = "DHLOutboundSortCode")
    protected String dhlOutboundSortCode;
    @XmlElement(name = "DHLDestMailTerminal")
    protected String dhlDestMailTerminal;
    @XmlElement(name = "DHLMailType")
    protected String dhlMailType;
    @XmlElement(name = "DHLITVersion")
    protected String dhlitVersion;
    @XmlElement(name = "DHLServiceLevel")
    protected String dhlServiceLevel;
    @XmlElement(name = "PriorityMailExpressCommitments")
    protected ArrayOfCommitment priorityMailExpressCommitments;
    @XmlElement(name = "SequenceNumber")
    protected String sequenceNumber;
    @XmlElement(name = "ResellerInformation")
    protected ResellerInformation resellerInformation;
    @XmlElement(name = "EstimatedDeliveryDate")
    protected String estimatedDeliveryDate;
    @XmlElement(name = "SDRValue")
    protected String sdrValue;
    @XmlElement(name = "NassCode")
    protected String nassCode;

    /**
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the base64LabelImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase64LabelImage() {
        return base64LabelImage;
    }

    /**
     * Sets the value of the base64LabelImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase64LabelImage(String value) {
        this.base64LabelImage = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link ImageSet }
     *     
     */
    public ImageSet getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageSet }
     *     
     */
    public void setLabel(ImageSet value) {
        this.label = value;
    }

    /**
     * Gets the value of the customsForm property.
     * 
     * @return
     *     possible object is
     *     {@link ImageSet }
     *     
     */
    public ImageSet getCustomsForm() {
        return customsForm;
    }

    /**
     * Sets the value of the customsForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageSet }
     *     
     */
    public void setCustomsForm(ImageSet value) {
        this.customsForm = value;
    }

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
     * Gets the value of the customsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsNumber() {
        return customsNumber;
    }

    /**
     * Sets the value of the customsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsNumber(String value) {
        this.customsNumber = value;
    }

    /**
     * Gets the value of the trackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Sets the value of the trackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * Gets the value of the finalPostage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFinalPostage() {
        return finalPostage;
    }

    /**
     * Sets the value of the finalPostage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFinalPostage(BigDecimal value) {
        this.finalPostage = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     */
    public int getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     */
    public void setTransactionID(int value) {
        this.transactionID = value;
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
     * Gets the value of the postageBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPostageBalance() {
        return postageBalance;
    }

    /**
     * Sets the value of the postageBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPostageBalance(BigDecimal value) {
        this.postageBalance = value;
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
     * Gets the value of the costCenter property.
     * 
     */
    public int getCostCenter() {
        return costCenter;
    }

    /**
     * Sets the value of the costCenter property.
     * 
     */
    public void setCostCenter(int value) {
        this.costCenter = value;
    }

    /**
     * Gets the value of the hfpFacilityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHfpFacilityID() {
        return hfpFacilityID;
    }

    /**
     * Sets the value of the hfpFacilityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHfpFacilityID(String value) {
        this.hfpFacilityID = value;
    }

    /**
     * Gets the value of the hfpFacilityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHfpFacilityName() {
        return hfpFacilityName;
    }

    /**
     * Sets the value of the hfpFacilityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHfpFacilityName(String value) {
        this.hfpFacilityName = value;
    }

    /**
     * Gets the value of the hfpFacilityAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHfpFacilityAddress1() {
        return hfpFacilityAddress1;
    }

    /**
     * Sets the value of the hfpFacilityAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHfpFacilityAddress1(String value) {
        this.hfpFacilityAddress1 = value;
    }

    /**
     * Gets the value of the hfpFacilityCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHfpFacilityCity() {
        return hfpFacilityCity;
    }

    /**
     * Sets the value of the hfpFacilityCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHfpFacilityCity(String value) {
        this.hfpFacilityCity = value;
    }

    /**
     * Gets the value of the hfpFacilityState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHfpFacilityState() {
        return hfpFacilityState;
    }

    /**
     * Sets the value of the hfpFacilityState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHfpFacilityState(String value) {
        this.hfpFacilityState = value;
    }

    /**
     * Gets the value of the hfpFacilityPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHfpFacilityPostalCode() {
        return hfpFacilityPostalCode;
    }

    /**
     * Sets the value of the hfpFacilityPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHfpFacilityPostalCode(String value) {
        this.hfpFacilityPostalCode = value;
    }

    /**
     * Gets the value of the hfpFacilityZIP4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHfpFacilityZIP4() {
        return hfpFacilityZIP4;
    }

    /**
     * Sets the value of the hfpFacilityZIP4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHfpFacilityZIP4(String value) {
        this.hfpFacilityZIP4 = value;
    }

    /**
     * Gets the value of the postagePrice property.
     * 
     * @return
     *     possible object is
     *     {@link PostagePrice }
     *     
     */
    public PostagePrice getPostagePrice() {
        return postagePrice;
    }

    /**
     * Sets the value of the postagePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostagePrice }
     *     
     */
    public void setPostagePrice(PostagePrice value) {
        this.postagePrice = value;
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
     * Gets the value of the referenceID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceID2() {
        return referenceID2;
    }

    /**
     * Sets the value of the referenceID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceID2(String value) {
        this.referenceID2 = value;
    }

    /**
     * Gets the value of the referenceID3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceID3() {
        return referenceID3;
    }

    /**
     * Sets the value of the referenceID3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceID3(String value) {
        this.referenceID3 = value;
    }

    /**
     * Gets the value of the referenceID4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceID4() {
        return referenceID4;
    }

    /**
     * Sets the value of the referenceID4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceID4(String value) {
        this.referenceID4 = value;
    }

    /**
     * Gets the value of the costCenterAlphaNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenterAlphaNumeric() {
        return costCenterAlphaNumeric;
    }

    /**
     * Sets the value of the costCenterAlphaNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenterAlphaNumeric(String value) {
        this.costCenterAlphaNumeric = value;
    }

    /**
     * Gets the value of the indicium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicium() {
        return indicium;
    }

    /**
     * Sets the value of the indicium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicium(String value) {
        this.indicium = value;
    }

    /**
     * Gets the value of the barcodeDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarcodeDisplay() {
        return barcodeDisplay;
    }

    /**
     * Sets the value of the barcodeDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarcodeDisplay(String value) {
        this.barcodeDisplay = value;
    }

    /**
     * Gets the value of the barcodeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarcodeNumber() {
        return barcodeNumber;
    }

    /**
     * Sets the value of the barcodeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarcodeNumber(String value) {
        this.barcodeNumber = value;
    }

    /**
     * Gets the value of the banner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanner() {
        return banner;
    }

    /**
     * Sets the value of the banner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanner(String value) {
        this.banner = value;
    }

    /**
     * Gets the value of the rdc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRDC() {
        return rdc;
    }

    /**
     * Sets the value of the rdc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRDC(String value) {
        this.rdc = value;
    }

    /**
     * Gets the value of the routingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingNumber() {
        return routingNumber;
    }

    /**
     * Sets the value of the routingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingNumber(String value) {
        this.routingNumber = value;
    }

    /**
     * Gets the value of the deliveryTimeDays property.
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
     * Sets the value of the deliveryTimeDays property.
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
     * Gets the value of the dhlInboundSortCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDHLInboundSortCode() {
        return dhlInboundSortCode;
    }

    /**
     * Sets the value of the dhlInboundSortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDHLInboundSortCode(String value) {
        this.dhlInboundSortCode = value;
    }

    /**
     * Gets the value of the dhlOutboundSortCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDHLOutboundSortCode() {
        return dhlOutboundSortCode;
    }

    /**
     * Sets the value of the dhlOutboundSortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDHLOutboundSortCode(String value) {
        this.dhlOutboundSortCode = value;
    }

    /**
     * Gets the value of the dhlDestMailTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDHLDestMailTerminal() {
        return dhlDestMailTerminal;
    }

    /**
     * Sets the value of the dhlDestMailTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDHLDestMailTerminal(String value) {
        this.dhlDestMailTerminal = value;
    }

    /**
     * Gets the value of the dhlMailType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDHLMailType() {
        return dhlMailType;
    }

    /**
     * Sets the value of the dhlMailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDHLMailType(String value) {
        this.dhlMailType = value;
    }

    /**
     * Gets the value of the dhlitVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDHLITVersion() {
        return dhlitVersion;
    }

    /**
     * Sets the value of the dhlitVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDHLITVersion(String value) {
        this.dhlitVersion = value;
    }

    /**
     * Gets the value of the dhlServiceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDHLServiceLevel() {
        return dhlServiceLevel;
    }

    /**
     * Sets the value of the dhlServiceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDHLServiceLevel(String value) {
        this.dhlServiceLevel = value;
    }

    /**
     * Gets the value of the priorityMailExpressCommitments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommitment }
     *     
     */
    public ArrayOfCommitment getPriorityMailExpressCommitments() {
        return priorityMailExpressCommitments;
    }

    /**
     * Sets the value of the priorityMailExpressCommitments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommitment }
     *     
     */
    public void setPriorityMailExpressCommitments(ArrayOfCommitment value) {
        this.priorityMailExpressCommitments = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumber(String value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the resellerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ResellerInformation }
     *     
     */
    public ResellerInformation getResellerInformation() {
        return resellerInformation;
    }

    /**
     * Sets the value of the resellerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResellerInformation }
     *     
     */
    public void setResellerInformation(ResellerInformation value) {
        this.resellerInformation = value;
    }

    /**
     * Gets the value of the estimatedDeliveryDate property.
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
     * Sets the value of the estimatedDeliveryDate property.
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
     * Gets the value of the sdrValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDRValue() {
        return sdrValue;
    }

    /**
     * Sets the value of the sdrValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDRValue(String value) {
        this.sdrValue = value;
    }

    /**
     * Gets the value of the nassCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNassCode() {
        return nassCode;
    }

    /**
     * Sets the value of the nassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNassCode(String value) {
        this.nassCode = value;
    }

}
