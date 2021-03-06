
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PostageRateRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
 *         &lt;element name="EstimatedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContentsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NoWeekendDelivery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequesterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertifiedIntermediary" type="{www.envmgr.com/LabelService}CertifiedIntermediary" minOccurs="0"/&gt;
 *         &lt;element name="FromName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnAddress4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromZIP4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToAddress4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToZIP4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToDeliveryPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "estimatedDeliveryDate",
    "contentsType",
    "noWeekendDelivery",
    "carrier",
    "requesterID",
    "certifiedIntermediary",
    "fromName",
    "fromCompany",
    "returnAddress1",
    "returnAddress2",
    "returnAddress3",
    "returnAddress4",
    "fromCity",
    "fromState",
    "fromZIP4",
    "fromCountryCode",
    "fromPhone",
    "fromEMail",
    "toName",
    "toCompany",
    "toAddress1",
    "toAddress2",
    "toAddress3",
    "toAddress4",
    "toCity",
    "toState",
    "toZIP4",
    "toDeliveryPoint",
    "toPhone",
    "toEMail"
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
    @XmlElement(name = "EstimatedDeliveryDate")
    protected String estimatedDeliveryDate;
    @XmlElement(name = "ContentsType")
    protected String contentsType;
    @XmlElement(name = "NoWeekendDelivery")
    protected String noWeekendDelivery;
    @XmlElement(name = "Carrier")
    protected String carrier;
    @XmlElement(name = "RequesterID")
    protected String requesterID;
    @XmlElement(name = "CertifiedIntermediary")
    protected CertifiedIntermediary certifiedIntermediary;
    @XmlElement(name = "FromName")
    protected String fromName;
    @XmlElement(name = "FromCompany")
    protected String fromCompany;
    @XmlElement(name = "ReturnAddress1")
    protected String returnAddress1;
    @XmlElement(name = "ReturnAddress2")
    protected String returnAddress2;
    @XmlElement(name = "ReturnAddress3")
    protected String returnAddress3;
    @XmlElement(name = "ReturnAddress4")
    protected String returnAddress4;
    @XmlElement(name = "FromCity")
    protected String fromCity;
    @XmlElement(name = "FromState")
    protected String fromState;
    @XmlElement(name = "FromZIP4")
    protected String fromZIP4;
    @XmlElement(name = "FromCountryCode")
    protected String fromCountryCode;
    @XmlElement(name = "FromPhone")
    protected String fromPhone;
    @XmlElement(name = "FromEMail")
    protected String fromEMail;
    @XmlElement(name = "ToName")
    protected String toName;
    @XmlElement(name = "ToCompany")
    protected String toCompany;
    @XmlElement(name = "ToAddress1")
    protected String toAddress1;
    @XmlElement(name = "ToAddress2")
    protected String toAddress2;
    @XmlElement(name = "ToAddress3")
    protected String toAddress3;
    @XmlElement(name = "ToAddress4")
    protected String toAddress4;
    @XmlElement(name = "ToCity")
    protected String toCity;
    @XmlElement(name = "ToState")
    protected String toState;
    @XmlElement(name = "ToZIP4")
    protected String toZIP4;
    @XmlElement(name = "ToDeliveryPoint")
    protected String toDeliveryPoint;
    @XmlElement(name = "ToPhone")
    protected String toPhone;
    @XmlElement(name = "ToEMail")
    protected String toEMail;
    @XmlAttribute(name = "ResponseVersion", required = true)
    protected String responseVersion;

    /**
     * Obtiene el valor de la propiedad automationRate.
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
     * Define el valor de la propiedad automationRate.
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
     * Obtiene el valor de la propiedad machinable.
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
     * Define el valor de la propiedad machinable.
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
     * Obtiene el valor de la propiedad serviceLevel.
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
     * Define el valor de la propiedad serviceLevel.
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
     * Obtiene el valor de la propiedad sortType.
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
     * Define el valor de la propiedad sortType.
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
     * Obtiene el valor de la propiedad services.
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
     * Define el valor de la propiedad services.
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
     * Obtiene el valor de la propiedad value.
     * 
     */
    public float getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad codAmount.
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
     * Define el valor de la propiedad codAmount.
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
     * Obtiene el valor de la propiedad insuredValue.
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
     * Define el valor de la propiedad insuredValue.
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
     * Obtiene el valor de la propiedad registeredMailValue.
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
     * Define el valor de la propiedad registeredMailValue.
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
     * Obtiene el valor de la propiedad entryFacility.
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
     * Define el valor de la propiedad entryFacility.
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
     * Obtiene el valor de la propiedad fromPostalCode.
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
     * Define el valor de la propiedad fromPostalCode.
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
     * Obtiene el valor de la propiedad toPostalCode.
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
     * Define el valor de la propiedad toPostalCode.
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
     * Obtiene el valor de la propiedad toCountry.
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
     * Define el valor de la propiedad toCountry.
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
     * Obtiene el valor de la propiedad toCountryCode.
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
     * Define el valor de la propiedad toCountryCode.
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
     * Obtiene el valor de la propiedad shipDate.
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
     * Define el valor de la propiedad shipDate.
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
     * Obtiene el valor de la propiedad shipTime.
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
     * Define el valor de la propiedad shipTime.
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
     * Obtiene el valor de la propiedad responseOptions.
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
     * Define el valor de la propiedad responseOptions.
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
     * Obtiene el valor de la propiedad openAndDistributeFacilityTypeCode.
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
     * Define el valor de la propiedad openAndDistributeFacilityTypeCode.
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
     * Obtiene el valor de la propiedad isConsolidator.
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
     * Define el valor de la propiedad isConsolidator.
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
     * Obtiene el valor de la propiedad printScanBasedPaymentLabel.
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
     * Define el valor de la propiedad printScanBasedPaymentLabel.
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
     * Obtiene el valor de la propiedad specialContents.
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
     * Define el valor de la propiedad specialContents.
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
     * Obtiene el valor de la propiedad contentsType.
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
     * Define el valor de la propiedad contentsType.
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
     * Obtiene el valor de la propiedad noWeekendDelivery.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoWeekendDelivery() {
        return noWeekendDelivery;
    }

    /**
     * Define el valor de la propiedad noWeekendDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoWeekendDelivery(String value) {
        this.noWeekendDelivery = value;
    }

    /**
     * Obtiene el valor de la propiedad carrier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Define el valor de la propiedad carrier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
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
     * Obtiene el valor de la propiedad certifiedIntermediary.
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
     * Define el valor de la propiedad certifiedIntermediary.
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
     * Obtiene el valor de la propiedad fromName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromName() {
        return fromName;
    }

    /**
     * Define el valor de la propiedad fromName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromName(String value) {
        this.fromName = value;
    }

    /**
     * Obtiene el valor de la propiedad fromCompany.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCompany() {
        return fromCompany;
    }

    /**
     * Define el valor de la propiedad fromCompany.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCompany(String value) {
        this.fromCompany = value;
    }

    /**
     * Obtiene el valor de la propiedad returnAddress1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnAddress1() {
        return returnAddress1;
    }

    /**
     * Define el valor de la propiedad returnAddress1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnAddress1(String value) {
        this.returnAddress1 = value;
    }

    /**
     * Obtiene el valor de la propiedad returnAddress2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnAddress2() {
        return returnAddress2;
    }

    /**
     * Define el valor de la propiedad returnAddress2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnAddress2(String value) {
        this.returnAddress2 = value;
    }

    /**
     * Obtiene el valor de la propiedad returnAddress3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnAddress3() {
        return returnAddress3;
    }

    /**
     * Define el valor de la propiedad returnAddress3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnAddress3(String value) {
        this.returnAddress3 = value;
    }

    /**
     * Obtiene el valor de la propiedad returnAddress4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnAddress4() {
        return returnAddress4;
    }

    /**
     * Define el valor de la propiedad returnAddress4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnAddress4(String value) {
        this.returnAddress4 = value;
    }

    /**
     * Obtiene el valor de la propiedad fromCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCity() {
        return fromCity;
    }

    /**
     * Define el valor de la propiedad fromCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCity(String value) {
        this.fromCity = value;
    }

    /**
     * Obtiene el valor de la propiedad fromState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromState() {
        return fromState;
    }

    /**
     * Define el valor de la propiedad fromState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromState(String value) {
        this.fromState = value;
    }

    /**
     * Obtiene el valor de la propiedad fromZIP4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromZIP4() {
        return fromZIP4;
    }

    /**
     * Define el valor de la propiedad fromZIP4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromZIP4(String value) {
        this.fromZIP4 = value;
    }

    /**
     * Obtiene el valor de la propiedad fromCountryCode.
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
     * Define el valor de la propiedad fromCountryCode.
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
     * Obtiene el valor de la propiedad fromPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromPhone() {
        return fromPhone;
    }

    /**
     * Define el valor de la propiedad fromPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromPhone(String value) {
        this.fromPhone = value;
    }

    /**
     * Obtiene el valor de la propiedad fromEMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromEMail() {
        return fromEMail;
    }

    /**
     * Define el valor de la propiedad fromEMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromEMail(String value) {
        this.fromEMail = value;
    }

    /**
     * Obtiene el valor de la propiedad toName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToName() {
        return toName;
    }

    /**
     * Define el valor de la propiedad toName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToName(String value) {
        this.toName = value;
    }

    /**
     * Obtiene el valor de la propiedad toCompany.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCompany() {
        return toCompany;
    }

    /**
     * Define el valor de la propiedad toCompany.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCompany(String value) {
        this.toCompany = value;
    }

    /**
     * Obtiene el valor de la propiedad toAddress1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToAddress1() {
        return toAddress1;
    }

    /**
     * Define el valor de la propiedad toAddress1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToAddress1(String value) {
        this.toAddress1 = value;
    }

    /**
     * Obtiene el valor de la propiedad toAddress2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToAddress2() {
        return toAddress2;
    }

    /**
     * Define el valor de la propiedad toAddress2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToAddress2(String value) {
        this.toAddress2 = value;
    }

    /**
     * Obtiene el valor de la propiedad toAddress3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToAddress3() {
        return toAddress3;
    }

    /**
     * Define el valor de la propiedad toAddress3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToAddress3(String value) {
        this.toAddress3 = value;
    }

    /**
     * Obtiene el valor de la propiedad toAddress4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToAddress4() {
        return toAddress4;
    }

    /**
     * Define el valor de la propiedad toAddress4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToAddress4(String value) {
        this.toAddress4 = value;
    }

    /**
     * Obtiene el valor de la propiedad toCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCity() {
        return toCity;
    }

    /**
     * Define el valor de la propiedad toCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCity(String value) {
        this.toCity = value;
    }

    /**
     * Obtiene el valor de la propiedad toState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToState() {
        return toState;
    }

    /**
     * Define el valor de la propiedad toState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToState(String value) {
        this.toState = value;
    }

    /**
     * Obtiene el valor de la propiedad toZIP4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToZIP4() {
        return toZIP4;
    }

    /**
     * Define el valor de la propiedad toZIP4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToZIP4(String value) {
        this.toZIP4 = value;
    }

    /**
     * Obtiene el valor de la propiedad toDeliveryPoint.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToDeliveryPoint() {
        return toDeliveryPoint;
    }

    /**
     * Define el valor de la propiedad toDeliveryPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDeliveryPoint(String value) {
        this.toDeliveryPoint = value;
    }

    /**
     * Obtiene el valor de la propiedad toPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToPhone() {
        return toPhone;
    }

    /**
     * Define el valor de la propiedad toPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToPhone(String value) {
        this.toPhone = value;
    }

    /**
     * Obtiene el valor de la propiedad toEMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToEMail() {
        return toEMail;
    }

    /**
     * Define el valor de la propiedad toEMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToEMail(String value) {
        this.toEMail = value;
    }

    /**
     * Obtiene el valor de la propiedad responseVersion.
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
     * Define el valor de la propiedad responseVersion.
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
