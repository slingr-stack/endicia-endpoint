
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostageRateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostageRateRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{www.envmgr.com/LabelService}CommonLabelRequestAndPostageRateRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutomationRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Machinable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SortType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Services" type="{www.envmgr.com/LabelService}SpecialServices" minOccurs="0"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="CODAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="InsuredValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegisteredMailValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="EntryFacility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResponseOptions" type="{www.envmgr.com/LabelService}ResponseOptions" minOccurs="0"/&gt;
 *         &lt;element name="OpenAndDistributeFacilityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsConsolidator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryTimeDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrintScanBasedPaymentLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpecialContents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContentsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequesterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertifiedIntermediary" type="{www.envmgr.com/LabelService}CertifiedIntermediary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ResponseVersion" use="required" type="{www.envmgr.com/LabelService}RespVersion" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostageRateRequest", propOrder = {
    "automationRate",
    "machinable",
    "serviceLevel",
    "sortType",
    "services",
    "value",
    "codAmount",
    "insuredValue",
    "registeredMailValue",
    "entryFacility",
    "fromPostalCode",
    "toPostalCode",
    "toCountry",
    "toCountryCode",
    "shipDate",
    "shipTime",
    "responseOptions",
    "openAndDistributeFacilityTypeCode",
    "isConsolidator",
    "deliveryTimeDays",
    "printScanBasedPaymentLabel",
    "specialContents",
    "fromCountryCode",
    "estimatedDeliveryDate",
    "contentsType",
    "requesterID",
    "certifiedIntermediary"
})
public class PostageRateRequest
    extends CommonLabelRequestAndPostageRateRequest
{

    @XmlElement(name = "AutomationRate")
    protected String automationRate;
    @XmlElement(name = "Machinable")
    protected String machinable;
    @XmlElement(name = "ServiceLevel")
    protected String serviceLevel;
    @XmlElement(name = "SortType")
    protected String sortType;
    @XmlElement(name = "Services")
    protected SpecialServices services;
    @XmlElement(name = "Value")
    protected float value;
    @XmlElement(name = "CODAmount", defaultValue = "0")
    protected Double codAmount;
    @XmlElement(name = "InsuredValue")
    protected String insuredValue;
    @XmlElement(name = "RegisteredMailValue", defaultValue = "0")
    protected Double registeredMailValue;
    @XmlElement(name = "EntryFacility")
    protected String entryFacility;
    @XmlElement(name = "FromPostalCode")
    protected String fromPostalCode;
    @XmlElement(name = "ToPostalCode")
    protected String toPostalCode;
    @XmlElement(name = "ToCountry")
    protected String toCountry;
    @XmlElement(name = "ToCountryCode")
    protected String toCountryCode;
    @XmlElement(name = "ShipDate")
    protected String shipDate;
    @XmlElement(name = "ShipTime")
    protected String shipTime;
    @XmlElement(name = "ResponseOptions")
    protected ResponseOptions responseOptions;
    @XmlElement(name = "OpenAndDistributeFacilityTypeCode")
    protected String openAndDistributeFacilityTypeCode;
    @XmlElement(name = "IsConsolidator")
    protected String isConsolidator;
    @XmlElement(name = "DeliveryTimeDays")
    protected String deliveryTimeDays;
    @XmlElement(name = "PrintScanBasedPaymentLabel")
    protected String printScanBasedPaymentLabel;
    @XmlElement(name = "SpecialContents")
    protected String specialContents;
    @XmlElement(name = "FromCountryCode")
    protected String fromCountryCode;
    @XmlElement(name = "EstimatedDeliveryDate")
    protected String estimatedDeliveryDate;
    @XmlElement(name = "ContentsType")
    protected String contentsType;
    @XmlElement(name = "RequesterID")
    protected String requesterID;
    @XmlElement(name = "CertifiedIntermediary")
    protected CertifiedIntermediary certifiedIntermediary;
    @XmlAttribute(name = "ResponseVersion", required = true)
    protected String responseVersion;

    /**
     * Gets the value of the automationRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomationRate() {
        return automationRate;
    }

    /**
     * Sets the value of the automationRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomationRate(String value) {
        this.automationRate = value;
    }

    /**
     * Gets the value of the machinable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMachinable() {
        return machinable;
    }

    /**
     * Sets the value of the machinable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMachinable(String value) {
        this.machinable = value;
    }

    /**
     * Gets the value of the serviceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLevel() {
        return serviceLevel;
    }

    /**
     * Sets the value of the serviceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLevel(String value) {
        this.serviceLevel = value;
    }

    /**
     * Gets the value of the sortType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortType() {
        return sortType;
    }

    /**
     * Sets the value of the sortType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortType(String value) {
        this.sortType = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialServices }
     *     
     */
    public SpecialServices getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialServices }
     *     
     */
    public void setServices(SpecialServices value) {
        this.services = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public float getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * Gets the value of the codAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCODAmount() {
        return codAmount;
    }

    /**
     * Sets the value of the codAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCODAmount(Double value) {
        this.codAmount = value;
    }

    /**
     * Gets the value of the insuredValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredValue() {
        return insuredValue;
    }

    /**
     * Sets the value of the insuredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredValue(String value) {
        this.insuredValue = value;
    }

    /**
     * Gets the value of the registeredMailValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRegisteredMailValue() {
        return registeredMailValue;
    }

    /**
     * Sets the value of the registeredMailValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRegisteredMailValue(Double value) {
        this.registeredMailValue = value;
    }

    /**
     * Gets the value of the entryFacility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryFacility() {
        return entryFacility;
    }

    /**
     * Sets the value of the entryFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryFacility(String value) {
        this.entryFacility = value;
    }

    /**
     * Gets the value of the fromPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromPostalCode() {
        return fromPostalCode;
    }

    /**
     * Sets the value of the fromPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromPostalCode(String value) {
        this.fromPostalCode = value;
    }

    /**
     * Gets the value of the toPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToPostalCode() {
        return toPostalCode;
    }

    /**
     * Sets the value of the toPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToPostalCode(String value) {
        this.toPostalCode = value;
    }

    /**
     * Gets the value of the toCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCountry() {
        return toCountry;
    }

    /**
     * Sets the value of the toCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCountry(String value) {
        this.toCountry = value;
    }

    /**
     * Gets the value of the toCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCountryCode() {
        return toCountryCode;
    }

    /**
     * Sets the value of the toCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCountryCode(String value) {
        this.toCountryCode = value;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipDate(String value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the shipTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipTime() {
        return shipTime;
    }

    /**
     * Sets the value of the shipTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipTime(String value) {
        this.shipTime = value;
    }

    /**
     * Gets the value of the responseOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseOptions }
     *     
     */
    public ResponseOptions getResponseOptions() {
        return responseOptions;
    }

    /**
     * Sets the value of the responseOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseOptions }
     *     
     */
    public void setResponseOptions(ResponseOptions value) {
        this.responseOptions = value;
    }

    /**
     * Gets the value of the openAndDistributeFacilityTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenAndDistributeFacilityTypeCode() {
        return openAndDistributeFacilityTypeCode;
    }

    /**
     * Sets the value of the openAndDistributeFacilityTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenAndDistributeFacilityTypeCode(String value) {
        this.openAndDistributeFacilityTypeCode = value;
    }

    /**
     * Gets the value of the isConsolidator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsConsolidator() {
        return isConsolidator;
    }

    /**
     * Sets the value of the isConsolidator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsConsolidator(String value) {
        this.isConsolidator = value;
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
     * Gets the value of the printScanBasedPaymentLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintScanBasedPaymentLabel() {
        return printScanBasedPaymentLabel;
    }

    /**
     * Sets the value of the printScanBasedPaymentLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintScanBasedPaymentLabel(String value) {
        this.printScanBasedPaymentLabel = value;
    }

    /**
     * Gets the value of the specialContents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialContents() {
        return specialContents;
    }

    /**
     * Sets the value of the specialContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialContents(String value) {
        this.specialContents = value;
    }

    /**
     * Gets the value of the fromCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCountryCode() {
        return fromCountryCode;
    }

    /**
     * Sets the value of the fromCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCountryCode(String value) {
        this.fromCountryCode = value;
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
     * Gets the value of the contentsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentsType() {
        return contentsType;
    }

    /**
     * Sets the value of the contentsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentsType(String value) {
        this.contentsType = value;
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

    /**
     * Gets the value of the responseVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseVersion() {
        return responseVersion;
    }

    /**
     * Sets the value of the responseVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseVersion(String value) {
        this.responseVersion = value;
    }

}
