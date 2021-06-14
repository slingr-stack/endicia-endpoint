
package com.envmgr.labelservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LabelRequestResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
 *         &lt;element name="FormURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LabelCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LabelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "nassCode",
    "formURL",
    "labelCategory",
    "labelID"
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
    @XmlElement(name = "FormURL")
    protected String formURL;
    @XmlElement(name = "LabelCategory")
    protected String labelCategory;
    @XmlElement(name = "LabelID")
    protected String labelID;

    /**
     * Obtiene el valor de la propiedad status.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad errorMessage.
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
     * Define el valor de la propiedad errorMessage.
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
     * Obtiene el valor de la propiedad base64LabelImage.
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
     * Define el valor de la propiedad base64LabelImage.
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
     * Obtiene el valor de la propiedad label.
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
     * Define el valor de la propiedad label.
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
     * Obtiene el valor de la propiedad customsForm.
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
     * Define el valor de la propiedad customsForm.
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
     * Obtiene el valor de la propiedad customsNumber.
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
     * Define el valor de la propiedad customsNumber.
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
     * Obtiene el valor de la propiedad trackingNumber.
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
     * Define el valor de la propiedad trackingNumber.
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
     * Obtiene el valor de la propiedad finalPostage.
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
     * Define el valor de la propiedad finalPostage.
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
     * Obtiene el valor de la propiedad transactionID.
     * 
     */
    public int getTransactionID() {
        return transactionID;
    }

    /**
     * Define el valor de la propiedad transactionID.
     * 
     */
    public void setTransactionID(int value) {
        this.transactionID = value;
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
     * Obtiene el valor de la propiedad postageBalance.
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
     * Define el valor de la propiedad postageBalance.
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
     * Obtiene el valor de la propiedad costCenter.
     * 
     */
    public int getCostCenter() {
        return costCenter;
    }

    /**
     * Define el valor de la propiedad costCenter.
     * 
     */
    public void setCostCenter(int value) {
        this.costCenter = value;
    }

    /**
     * Obtiene el valor de la propiedad hfpFacilityID.
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
     * Define el valor de la propiedad hfpFacilityID.
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
     * Obtiene el valor de la propiedad hfpFacilityName.
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
     * Define el valor de la propiedad hfpFacilityName.
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
     * Obtiene el valor de la propiedad hfpFacilityAddress1.
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
     * Define el valor de la propiedad hfpFacilityAddress1.
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
     * Obtiene el valor de la propiedad hfpFacilityCity.
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
     * Define el valor de la propiedad hfpFacilityCity.
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
     * Obtiene el valor de la propiedad hfpFacilityState.
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
     * Define el valor de la propiedad hfpFacilityState.
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
     * Obtiene el valor de la propiedad hfpFacilityPostalCode.
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
     * Define el valor de la propiedad hfpFacilityPostalCode.
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
     * Obtiene el valor de la propiedad hfpFacilityZIP4.
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
     * Define el valor de la propiedad hfpFacilityZIP4.
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
     * Obtiene el valor de la propiedad postagePrice.
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
     * Define el valor de la propiedad postagePrice.
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
     * Obtiene el valor de la propiedad requesterID.
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
     * Define el valor de la propiedad requesterID.
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
     * Obtiene el valor de la propiedad referenceID2.
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
     * Define el valor de la propiedad referenceID2.
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
     * Obtiene el valor de la propiedad referenceID3.
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
     * Define el valor de la propiedad referenceID3.
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
     * Obtiene el valor de la propiedad referenceID4.
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
     * Define el valor de la propiedad referenceID4.
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
     * Obtiene el valor de la propiedad costCenterAlphaNumeric.
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
     * Define el valor de la propiedad costCenterAlphaNumeric.
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
     * Obtiene el valor de la propiedad indicium.
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
     * Define el valor de la propiedad indicium.
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
     * Obtiene el valor de la propiedad barcodeDisplay.
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
     * Define el valor de la propiedad barcodeDisplay.
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
     * Obtiene el valor de la propiedad barcodeNumber.
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
     * Define el valor de la propiedad barcodeNumber.
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
     * Obtiene el valor de la propiedad banner.
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
     * Define el valor de la propiedad banner.
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
     * Obtiene el valor de la propiedad rdc.
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
     * Define el valor de la propiedad rdc.
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
     * Obtiene el valor de la propiedad routingNumber.
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
     * Define el valor de la propiedad routingNumber.
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
     * Obtiene el valor de la propiedad deliveryTimeDays.
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
     * Define el valor de la propiedad deliveryTimeDays.
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
     * Obtiene el valor de la propiedad dhlInboundSortCode.
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
     * Define el valor de la propiedad dhlInboundSortCode.
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
     * Obtiene el valor de la propiedad dhlOutboundSortCode.
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
     * Define el valor de la propiedad dhlOutboundSortCode.
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
     * Obtiene el valor de la propiedad dhlDestMailTerminal.
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
     * Define el valor de la propiedad dhlDestMailTerminal.
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
     * Obtiene el valor de la propiedad dhlMailType.
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
     * Define el valor de la propiedad dhlMailType.
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
     * Obtiene el valor de la propiedad dhlitVersion.
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
     * Define el valor de la propiedad dhlitVersion.
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
     * Obtiene el valor de la propiedad dhlServiceLevel.
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
     * Define el valor de la propiedad dhlServiceLevel.
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
     * Obtiene el valor de la propiedad priorityMailExpressCommitments.
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
     * Define el valor de la propiedad priorityMailExpressCommitments.
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
     * Obtiene el valor de la propiedad sequenceNumber.
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
     * Define el valor de la propiedad sequenceNumber.
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
     * Obtiene el valor de la propiedad resellerInformation.
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
     * Define el valor de la propiedad resellerInformation.
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
     * Obtiene el valor de la propiedad estimatedDeliveryDate.
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
     * Define el valor de la propiedad estimatedDeliveryDate.
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
     * Obtiene el valor de la propiedad sdrValue.
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
     * Define el valor de la propiedad sdrValue.
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
     * Obtiene el valor de la propiedad nassCode.
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
     * Define el valor de la propiedad nassCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNassCode(String value) {
        this.nassCode = value;
    }

    /**
     * Obtiene el valor de la propiedad formURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormURL() {
        return formURL;
    }

    /**
     * Define el valor de la propiedad formURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormURL(String value) {
        this.formURL = value;
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
     * Obtiene el valor de la propiedad labelID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelID() {
        return labelID;
    }

    /**
     * Define el valor de la propiedad labelID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelID(String value) {
        this.labelID = value;
    }

}
