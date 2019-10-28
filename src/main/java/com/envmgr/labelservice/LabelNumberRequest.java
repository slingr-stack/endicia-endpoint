
package com.envmgr.labelservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import core.labelnumberservice.CustomsInfo;


/**
 * <p>Java class for LabelNumberRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LabelNumberRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{www.envmgr.com/LabelService}DataValidator"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LabelNumberSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PassPhrase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientMailerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PTSActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LabelDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MailClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Postage" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Fees" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Zone" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Pricing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriceTier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Container" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Machinable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SortType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeclaredValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="COD" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CODFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CODAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="FromName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromZip5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromZip4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EntryFacility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToPOBox" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DestinationFacility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SurchargeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SurchargeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SurchargeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{LabelNumberService.Core}CustomsInfo" minOccurs="0"/&gt;
 *         &lt;element name="ComputeRDC" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ReturnService" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ReShipment" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AdultSignature" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AdultSignatureRestricted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ExpressMailMerchandiseInsurance" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ParcelAirlift" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SpecialHandling" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="HoldForPickup" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OpenAndDistribute" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CertifiedMail" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DeliveryConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SignatureConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RegisteredMail" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PassiveEnrouteScan" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RestrictedDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ExpressMail" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ExpeditedReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MerchandiseReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MerchandiseReturnWithDeliveryConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DayCertainDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="NewFormat" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SMSEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SMSPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertifiedMailFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DeliveryConfirmationFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="MerchandiseReturnFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DayCertainDeliveryFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="MerchandiseReturnWithDeliveryConfirmationFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="OpenAndDistributeFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PassiveEnrouteScanFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RegisteredMailFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SignatureConfirmationFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SignatureServiceFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ExpressMailFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ExpeditedReturnFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="AdultSignatureFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="AdultSignatureRestrictedFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="GroupedExtraServicesFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="IsConsolidator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsEvs" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ConsolidatorPrefId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ChargedFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="InternationalPicnumberPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ScanBasedPayment" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OutboundScanBasedPayment" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SignatureService" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="FlagGenerate" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ToCarrierRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpecialContents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LiveAnimalSurcharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="FragileHandlingSurcharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PermitNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SbpUseCommercialConstruct" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PicMailerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromDeliveryPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToDeliveryPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsBalloonRate" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SoftwareID" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="IsTerritories" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsBarcodeZIP4Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="POZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Returns" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ConsolidatorAccountId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IsDimWeighted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MarketPlacePartnerID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Test" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelNumberRequest", propOrder = {
    "labelNumberSource",
    "accountID",
    "passPhrase",
    "clientMailerID",
    "ptsActionCode",
    "labelDate",
    "mailClass",
    "postage",
    "fees",
    "weight",
    "zone",
    "pricing",
    "priceTier",
    "container",
    "machinable",
    "sortType",
    "declaredValue",
    "cod",
    "codFee",
    "codAmount",
    "fromName",
    "fromCompany",
    "fromAddress1",
    "fromAddress2",
    "fromCity",
    "fromState",
    "fromZip5",
    "fromZip4",
    "fromPhone",
    "fromEmail",
    "entryFacility",
    "toName",
    "toCompany",
    "toAddress1",
    "toAddress2",
    "toCity",
    "toState",
    "toPostalCode",
    "toCountryCode",
    "toPhone",
    "toFax",
    "toEmail",
    "toPOBox",
    "destinationFacility",
    "referenceID",
    "surchargeType",
    "surchargeAmount",
    "surchargeDescription",
    "customsInfo",
    "computeRDC",
    "returnService",
    "reShipment",
    "adultSignature",
    "adultSignatureRestricted",
    "expressMailMerchandiseInsurance",
    "parcelAirlift",
    "specialHandling",
    "holdForPickup",
    "openAndDistribute",
    "certifiedMail",
    "deliveryConfirmation",
    "signatureConfirmation",
    "registeredMail",
    "passiveEnrouteScan",
    "restrictedDelivery",
    "expressMail",
    "expeditedReturn",
    "merchandiseReturn",
    "merchandiseReturnWithDeliveryConfirmation",
    "dayCertainDelivery",
    "newFormat",
    "smsEmail",
    "smsPhone",
    "certifiedMailFee",
    "deliveryConfirmationFee",
    "merchandiseReturnFee",
    "dayCertainDeliveryFee",
    "merchandiseReturnWithDeliveryConfirmationFee",
    "openAndDistributeFee",
    "passiveEnrouteScanFee",
    "registeredMailFee",
    "signatureConfirmationFee",
    "signatureServiceFee",
    "expressMailFee",
    "expeditedReturnFee",
    "adultSignatureFee",
    "adultSignatureRestrictedFee",
    "groupedExtraServicesFee",
    "isConsolidator",
    "isEvs",
    "consolidatorPrefId",
    "chargedFee",
    "internationalPicnumberPrefix",
    "scanBasedPayment",
    "outboundScanBasedPayment",
    "signatureService",
    "length",
    "width",
    "height",
    "value",
    "flagGenerate",
    "toCarrierRoute",
    "specialContents",
    "liveAnimalSurcharge",
    "fragileHandlingSurcharge",
    "permitNumber",
    "sbpUseCommercialConstruct",
    "picMailerID",
    "fromDeliveryPoint",
    "toDeliveryPoint",
    "isBalloonRate",
    "softwareID",
    "isTerritories",
    "isBarcodeZIP4Enabled",
    "poZipCode",
    "returns",
    "consolidatorAccountId",
    "isDimWeighted",
    "marketPlacePartnerID"
})
@XmlSeeAlso({
    PicNumberRequest.class
})
public abstract class LabelNumberRequest
    extends DataValidator
{

    @XmlElement(name = "LabelNumberSource")
    protected String labelNumberSource;
    @XmlElement(name = "AccountID")
    protected String accountID;
    @XmlElement(name = "PassPhrase")
    protected String passPhrase;
    @XmlElement(name = "ClientMailerID")
    protected String clientMailerID;
    @XmlElement(name = "PTSActionCode")
    protected String ptsActionCode;
    @XmlElement(name = "LabelDate")
    protected String labelDate;
    @XmlElement(name = "MailClass")
    protected String mailClass;
    @XmlElement(name = "Postage", required = true)
    protected BigDecimal postage;
    @XmlElement(name = "Fees", required = true)
    protected BigDecimal fees;
    @XmlElement(name = "Weight", required = true)
    protected BigDecimal weight;
    @XmlElement(name = "Zone")
    protected int zone;
    @XmlElement(name = "Pricing")
    protected String pricing;
    @XmlElement(name = "PriceTier")
    protected String priceTier;
    @XmlElement(name = "Container")
    protected String container;
    @XmlElement(name = "Machinable")
    protected boolean machinable;
    @XmlElement(name = "SortType")
    protected String sortType;
    @XmlElement(name = "DeclaredValue", required = true)
    protected BigDecimal declaredValue;
    @XmlElement(name = "COD")
    protected boolean cod;
    @XmlElement(name = "CODFee", required = true)
    protected BigDecimal codFee;
    @XmlElement(name = "CODAmount", required = true)
    protected BigDecimal codAmount;
    @XmlElement(name = "FromName")
    protected String fromName;
    @XmlElement(name = "FromCompany")
    protected String fromCompany;
    @XmlElement(name = "FromAddress1")
    protected String fromAddress1;
    @XmlElement(name = "FromAddress2")
    protected String fromAddress2;
    @XmlElement(name = "FromCity")
    protected String fromCity;
    @XmlElement(name = "FromState")
    protected String fromState;
    @XmlElement(name = "FromZip5")
    protected String fromZip5;
    @XmlElement(name = "FromZip4")
    protected String fromZip4;
    @XmlElement(name = "FromPhone")
    protected String fromPhone;
    @XmlElement(name = "FromEmail")
    protected String fromEmail;
    @XmlElement(name = "EntryFacility")
    protected String entryFacility;
    @XmlElement(name = "ToName")
    protected String toName;
    @XmlElement(name = "ToCompany")
    protected String toCompany;
    @XmlElement(name = "ToAddress1")
    protected String toAddress1;
    @XmlElement(name = "ToAddress2")
    protected String toAddress2;
    @XmlElement(name = "ToCity")
    protected String toCity;
    @XmlElement(name = "ToState")
    protected String toState;
    @XmlElement(name = "ToPostalCode")
    protected String toPostalCode;
    @XmlElement(name = "ToCountryCode")
    protected String toCountryCode;
    @XmlElement(name = "ToPhone")
    protected String toPhone;
    @XmlElement(name = "ToFax")
    protected String toFax;
    @XmlElement(name = "ToEmail")
    protected String toEmail;
    @XmlElement(name = "ToPOBox")
    protected boolean toPOBox;
    @XmlElement(name = "DestinationFacility")
    protected String destinationFacility;
    @XmlElement(name = "ReferenceID")
    protected String referenceID;
    @XmlElement(name = "SurchargeType")
    protected String surchargeType;
    @XmlElement(name = "SurchargeAmount", required = true)
    protected BigDecimal surchargeAmount;
    @XmlElement(name = "SurchargeDescription")
    protected String surchargeDescription;
    @XmlElement(name = "CustomsInfo", namespace = "LabelNumberService.Core")
    protected CustomsInfo customsInfo;
    @XmlElement(name = "ComputeRDC")
    protected boolean computeRDC;
    @XmlElement(name = "ReturnService")
    protected boolean returnService;
    @XmlElement(name = "ReShipment")
    protected boolean reShipment;
    @XmlElement(name = "AdultSignature")
    protected boolean adultSignature;
    @XmlElement(name = "AdultSignatureRestricted")
    protected boolean adultSignatureRestricted;
    @XmlElement(name = "ExpressMailMerchandiseInsurance")
    protected boolean expressMailMerchandiseInsurance;
    @XmlElement(name = "ParcelAirlift")
    protected boolean parcelAirlift;
    @XmlElement(name = "SpecialHandling")
    protected boolean specialHandling;
    @XmlElement(name = "HoldForPickup")
    protected boolean holdForPickup;
    @XmlElement(name = "OpenAndDistribute")
    protected boolean openAndDistribute;
    @XmlElement(name = "CertifiedMail")
    protected boolean certifiedMail;
    @XmlElement(name = "DeliveryConfirmation")
    protected boolean deliveryConfirmation;
    @XmlElement(name = "SignatureConfirmation")
    protected boolean signatureConfirmation;
    @XmlElement(name = "RegisteredMail")
    protected boolean registeredMail;
    @XmlElement(name = "PassiveEnrouteScan")
    protected boolean passiveEnrouteScan;
    @XmlElement(name = "RestrictedDelivery")
    protected boolean restrictedDelivery;
    @XmlElement(name = "ExpressMail")
    protected boolean expressMail;
    @XmlElement(name = "ExpeditedReturn")
    protected boolean expeditedReturn;
    @XmlElement(name = "MerchandiseReturn")
    protected boolean merchandiseReturn;
    @XmlElement(name = "MerchandiseReturnWithDeliveryConfirmation")
    protected boolean merchandiseReturnWithDeliveryConfirmation;
    @XmlElement(name = "DayCertainDelivery")
    protected boolean dayCertainDelivery;
    @XmlElement(name = "NewFormat")
    protected boolean newFormat;
    @XmlElement(name = "SMSEmail")
    protected String smsEmail;
    @XmlElement(name = "SMSPhone")
    protected String smsPhone;
    @XmlElement(name = "CertifiedMailFee", required = true)
    protected BigDecimal certifiedMailFee;
    @XmlElement(name = "DeliveryConfirmationFee", required = true)
    protected BigDecimal deliveryConfirmationFee;
    @XmlElement(name = "MerchandiseReturnFee", required = true)
    protected BigDecimal merchandiseReturnFee;
    @XmlElement(name = "DayCertainDeliveryFee", required = true)
    protected BigDecimal dayCertainDeliveryFee;
    @XmlElement(name = "MerchandiseReturnWithDeliveryConfirmationFee", required = true)
    protected BigDecimal merchandiseReturnWithDeliveryConfirmationFee;
    @XmlElement(name = "OpenAndDistributeFee", required = true)
    protected BigDecimal openAndDistributeFee;
    @XmlElement(name = "PassiveEnrouteScanFee", required = true)
    protected BigDecimal passiveEnrouteScanFee;
    @XmlElement(name = "RegisteredMailFee", required = true)
    protected BigDecimal registeredMailFee;
    @XmlElement(name = "SignatureConfirmationFee", required = true)
    protected BigDecimal signatureConfirmationFee;
    @XmlElement(name = "SignatureServiceFee", required = true)
    protected BigDecimal signatureServiceFee;
    @XmlElement(name = "ExpressMailFee", required = true)
    protected BigDecimal expressMailFee;
    @XmlElement(name = "ExpeditedReturnFee", required = true)
    protected BigDecimal expeditedReturnFee;
    @XmlElement(name = "AdultSignatureFee", required = true)
    protected BigDecimal adultSignatureFee;
    @XmlElement(name = "AdultSignatureRestrictedFee", required = true)
    protected BigDecimal adultSignatureRestrictedFee;
    @XmlElement(name = "GroupedExtraServicesFee", required = true)
    protected BigDecimal groupedExtraServicesFee;
    @XmlElement(name = "IsConsolidator")
    protected boolean isConsolidator;
    @XmlElement(name = "IsEvs")
    protected boolean isEvs;
    @XmlElement(name = "ConsolidatorPrefId")
    protected int consolidatorPrefId;
    @XmlElement(name = "ChargedFee", required = true)
    protected BigDecimal chargedFee;
    @XmlElement(name = "InternationalPicnumberPrefix")
    protected String internationalPicnumberPrefix;
    @XmlElement(name = "ScanBasedPayment")
    protected boolean scanBasedPayment;
    @XmlElement(name = "OutboundScanBasedPayment")
    protected boolean outboundScanBasedPayment;
    @XmlElement(name = "SignatureService")
    protected boolean signatureService;
    @XmlElement(name = "Length", required = true)
    protected BigDecimal length;
    @XmlElement(name = "Width", required = true)
    protected BigDecimal width;
    @XmlElement(name = "Height", required = true)
    protected BigDecimal height;
    @XmlElement(name = "Value")
    protected float value;
    @XmlElement(name = "FlagGenerate")
    protected boolean flagGenerate;
    @XmlElement(name = "ToCarrierRoute")
    protected String toCarrierRoute;
    @XmlElement(name = "SpecialContents")
    protected String specialContents;
    @XmlElement(name = "LiveAnimalSurcharge", required = true)
    protected BigDecimal liveAnimalSurcharge;
    @XmlElement(name = "FragileHandlingSurcharge", required = true)
    protected BigDecimal fragileHandlingSurcharge;
    @XmlElement(name = "PermitNumber")
    protected String permitNumber;
    @XmlElement(name = "SbpUseCommercialConstruct")
    protected boolean sbpUseCommercialConstruct;
    @XmlElement(name = "PicMailerID")
    protected String picMailerID;
    @XmlElement(name = "FromDeliveryPoint")
    protected String fromDeliveryPoint;
    @XmlElement(name = "ToDeliveryPoint")
    protected String toDeliveryPoint;
    @XmlElement(name = "IsBalloonRate")
    protected boolean isBalloonRate;
    @XmlElement(name = "SoftwareID")
    @XmlSchemaType(name = "unsignedInt")
    protected long softwareID;
    @XmlElement(name = "IsTerritories")
    protected boolean isTerritories;
    @XmlElement(name = "IsBarcodeZIP4Enabled")
    protected boolean isBarcodeZIP4Enabled;
    @XmlElement(name = "POZipCode")
    protected String poZipCode;
    @XmlElement(name = "Returns")
    protected boolean returns;
    @XmlElement(name = "ConsolidatorAccountId")
    protected int consolidatorAccountId;
    @XmlElement(name = "IsDimWeighted")
    protected boolean isDimWeighted;
    @XmlElement(name = "MarketPlacePartnerID", required = true, type = Short.class, nillable = true)
    @XmlSchemaType(name = "unsignedByte")
    protected Short marketPlacePartnerID;
    @XmlAttribute(name = "Test", required = true)
    protected boolean test;

    /**
     * Gets the value of the labelNumberSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelNumberSource() {
        return labelNumberSource;
    }

    /**
     * Sets the value of the labelNumberSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelNumberSource(String value) {
        this.labelNumberSource = value;
    }

    /**
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountID(String value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the passPhrase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassPhrase() {
        return passPhrase;
    }

    /**
     * Sets the value of the passPhrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassPhrase(String value) {
        this.passPhrase = value;
    }

    /**
     * Gets the value of the clientMailerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientMailerID() {
        return clientMailerID;
    }

    /**
     * Sets the value of the clientMailerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientMailerID(String value) {
        this.clientMailerID = value;
    }

    /**
     * Gets the value of the ptsActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTSActionCode() {
        return ptsActionCode;
    }

    /**
     * Sets the value of the ptsActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTSActionCode(String value) {
        this.ptsActionCode = value;
    }

    /**
     * Gets the value of the labelDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelDate() {
        return labelDate;
    }

    /**
     * Sets the value of the labelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelDate(String value) {
        this.labelDate = value;
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
     * Gets the value of the postage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPostage() {
        return postage;
    }

    /**
     * Sets the value of the postage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPostage(BigDecimal value) {
        this.postage = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFees(BigDecimal value) {
        this.fees = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeight(BigDecimal value) {
        this.weight = value;
    }

    /**
     * Gets the value of the zone property.
     * 
     */
    public int getZone() {
        return zone;
    }

    /**
     * Sets the value of the zone property.
     * 
     */
    public void setZone(int value) {
        this.zone = value;
    }

    /**
     * Gets the value of the pricing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricing() {
        return pricing;
    }

    /**
     * Sets the value of the pricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricing(String value) {
        this.pricing = value;
    }

    /**
     * Gets the value of the priceTier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceTier() {
        return priceTier;
    }

    /**
     * Sets the value of the priceTier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceTier(String value) {
        this.priceTier = value;
    }

    /**
     * Gets the value of the container property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainer() {
        return container;
    }

    /**
     * Sets the value of the container property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainer(String value) {
        this.container = value;
    }

    /**
     * Gets the value of the machinable property.
     * 
     */
    public boolean isMachinable() {
        return machinable;
    }

    /**
     * Sets the value of the machinable property.
     * 
     */
    public void setMachinable(boolean value) {
        this.machinable = value;
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
     * Gets the value of the declaredValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeclaredValue() {
        return declaredValue;
    }

    /**
     * Sets the value of the declaredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeclaredValue(BigDecimal value) {
        this.declaredValue = value;
    }

    /**
     * Gets the value of the cod property.
     * 
     */
    public boolean isCOD() {
        return cod;
    }

    /**
     * Sets the value of the cod property.
     * 
     */
    public void setCOD(boolean value) {
        this.cod = value;
    }

    /**
     * Gets the value of the codFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCODFee() {
        return codFee;
    }

    /**
     * Sets the value of the codFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCODFee(BigDecimal value) {
        this.codFee = value;
    }

    /**
     * Gets the value of the codAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCODAmount() {
        return codAmount;
    }

    /**
     * Sets the value of the codAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCODAmount(BigDecimal value) {
        this.codAmount = value;
    }

    /**
     * Gets the value of the fromName property.
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
     * Sets the value of the fromName property.
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
     * Gets the value of the fromCompany property.
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
     * Sets the value of the fromCompany property.
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
     * Gets the value of the fromAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromAddress1() {
        return fromAddress1;
    }

    /**
     * Sets the value of the fromAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromAddress1(String value) {
        this.fromAddress1 = value;
    }

    /**
     * Gets the value of the fromAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromAddress2() {
        return fromAddress2;
    }

    /**
     * Sets the value of the fromAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromAddress2(String value) {
        this.fromAddress2 = value;
    }

    /**
     * Gets the value of the fromCity property.
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
     * Sets the value of the fromCity property.
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
     * Gets the value of the fromState property.
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
     * Sets the value of the fromState property.
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
     * Gets the value of the fromZip5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromZip5() {
        return fromZip5;
    }

    /**
     * Sets the value of the fromZip5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromZip5(String value) {
        this.fromZip5 = value;
    }

    /**
     * Gets the value of the fromZip4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromZip4() {
        return fromZip4;
    }

    /**
     * Sets the value of the fromZip4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromZip4(String value) {
        this.fromZip4 = value;
    }

    /**
     * Gets the value of the fromPhone property.
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
     * Sets the value of the fromPhone property.
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
     * Gets the value of the fromEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromEmail() {
        return fromEmail;
    }

    /**
     * Sets the value of the fromEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromEmail(String value) {
        this.fromEmail = value;
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
     * Gets the value of the toName property.
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
     * Sets the value of the toName property.
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
     * Gets the value of the toCompany property.
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
     * Sets the value of the toCompany property.
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
     * Gets the value of the toAddress1 property.
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
     * Sets the value of the toAddress1 property.
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
     * Gets the value of the toAddress2 property.
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
     * Sets the value of the toAddress2 property.
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
     * Gets the value of the toCity property.
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
     * Sets the value of the toCity property.
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
     * Gets the value of the toState property.
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
     * Sets the value of the toState property.
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
     * Gets the value of the toPhone property.
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
     * Sets the value of the toPhone property.
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
     * Gets the value of the toFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToFax() {
        return toFax;
    }

    /**
     * Sets the value of the toFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToFax(String value) {
        this.toFax = value;
    }

    /**
     * Gets the value of the toEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToEmail() {
        return toEmail;
    }

    /**
     * Sets the value of the toEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToEmail(String value) {
        this.toEmail = value;
    }

    /**
     * Gets the value of the toPOBox property.
     * 
     */
    public boolean isToPOBox() {
        return toPOBox;
    }

    /**
     * Sets the value of the toPOBox property.
     * 
     */
    public void setToPOBox(boolean value) {
        this.toPOBox = value;
    }

    /**
     * Gets the value of the destinationFacility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationFacility() {
        return destinationFacility;
    }

    /**
     * Sets the value of the destinationFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationFacility(String value) {
        this.destinationFacility = value;
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
     * Gets the value of the surchargeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurchargeType() {
        return surchargeType;
    }

    /**
     * Sets the value of the surchargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurchargeType(String value) {
        this.surchargeType = value;
    }

    /**
     * Gets the value of the surchargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSurchargeAmount() {
        return surchargeAmount;
    }

    /**
     * Sets the value of the surchargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSurchargeAmount(BigDecimal value) {
        this.surchargeAmount = value;
    }

    /**
     * Gets the value of the surchargeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurchargeDescription() {
        return surchargeDescription;
    }

    /**
     * Sets the value of the surchargeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurchargeDescription(String value) {
        this.surchargeDescription = value;
    }

    /**
     * Gets the value of the customsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsInfo }
     *     
     */
    public CustomsInfo getCustomsInfo() {
        return customsInfo;
    }

    /**
     * Sets the value of the customsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsInfo }
     *     
     */
    public void setCustomsInfo(CustomsInfo value) {
        this.customsInfo = value;
    }

    /**
     * Gets the value of the computeRDC property.
     * 
     */
    public boolean isComputeRDC() {
        return computeRDC;
    }

    /**
     * Sets the value of the computeRDC property.
     * 
     */
    public void setComputeRDC(boolean value) {
        this.computeRDC = value;
    }

    /**
     * Gets the value of the returnService property.
     * 
     */
    public boolean isReturnService() {
        return returnService;
    }

    /**
     * Sets the value of the returnService property.
     * 
     */
    public void setReturnService(boolean value) {
        this.returnService = value;
    }

    /**
     * Gets the value of the reShipment property.
     * 
     */
    public boolean isReShipment() {
        return reShipment;
    }

    /**
     * Sets the value of the reShipment property.
     * 
     */
    public void setReShipment(boolean value) {
        this.reShipment = value;
    }

    /**
     * Gets the value of the adultSignature property.
     * 
     */
    public boolean isAdultSignature() {
        return adultSignature;
    }

    /**
     * Sets the value of the adultSignature property.
     * 
     */
    public void setAdultSignature(boolean value) {
        this.adultSignature = value;
    }

    /**
     * Gets the value of the adultSignatureRestricted property.
     * 
     */
    public boolean isAdultSignatureRestricted() {
        return adultSignatureRestricted;
    }

    /**
     * Sets the value of the adultSignatureRestricted property.
     * 
     */
    public void setAdultSignatureRestricted(boolean value) {
        this.adultSignatureRestricted = value;
    }

    /**
     * Gets the value of the expressMailMerchandiseInsurance property.
     * 
     */
    public boolean isExpressMailMerchandiseInsurance() {
        return expressMailMerchandiseInsurance;
    }

    /**
     * Sets the value of the expressMailMerchandiseInsurance property.
     * 
     */
    public void setExpressMailMerchandiseInsurance(boolean value) {
        this.expressMailMerchandiseInsurance = value;
    }

    /**
     * Gets the value of the parcelAirlift property.
     * 
     */
    public boolean isParcelAirlift() {
        return parcelAirlift;
    }

    /**
     * Sets the value of the parcelAirlift property.
     * 
     */
    public void setParcelAirlift(boolean value) {
        this.parcelAirlift = value;
    }

    /**
     * Gets the value of the specialHandling property.
     * 
     */
    public boolean isSpecialHandling() {
        return specialHandling;
    }

    /**
     * Sets the value of the specialHandling property.
     * 
     */
    public void setSpecialHandling(boolean value) {
        this.specialHandling = value;
    }

    /**
     * Gets the value of the holdForPickup property.
     * 
     */
    public boolean isHoldForPickup() {
        return holdForPickup;
    }

    /**
     * Sets the value of the holdForPickup property.
     * 
     */
    public void setHoldForPickup(boolean value) {
        this.holdForPickup = value;
    }

    /**
     * Gets the value of the openAndDistribute property.
     * 
     */
    public boolean isOpenAndDistribute() {
        return openAndDistribute;
    }

    /**
     * Sets the value of the openAndDistribute property.
     * 
     */
    public void setOpenAndDistribute(boolean value) {
        this.openAndDistribute = value;
    }

    /**
     * Gets the value of the certifiedMail property.
     * 
     */
    public boolean isCertifiedMail() {
        return certifiedMail;
    }

    /**
     * Sets the value of the certifiedMail property.
     * 
     */
    public void setCertifiedMail(boolean value) {
        this.certifiedMail = value;
    }

    /**
     * Gets the value of the deliveryConfirmation property.
     * 
     */
    public boolean isDeliveryConfirmation() {
        return deliveryConfirmation;
    }

    /**
     * Sets the value of the deliveryConfirmation property.
     * 
     */
    public void setDeliveryConfirmation(boolean value) {
        this.deliveryConfirmation = value;
    }

    /**
     * Gets the value of the signatureConfirmation property.
     * 
     */
    public boolean isSignatureConfirmation() {
        return signatureConfirmation;
    }

    /**
     * Sets the value of the signatureConfirmation property.
     * 
     */
    public void setSignatureConfirmation(boolean value) {
        this.signatureConfirmation = value;
    }

    /**
     * Gets the value of the registeredMail property.
     * 
     */
    public boolean isRegisteredMail() {
        return registeredMail;
    }

    /**
     * Sets the value of the registeredMail property.
     * 
     */
    public void setRegisteredMail(boolean value) {
        this.registeredMail = value;
    }

    /**
     * Gets the value of the passiveEnrouteScan property.
     * 
     */
    public boolean isPassiveEnrouteScan() {
        return passiveEnrouteScan;
    }

    /**
     * Sets the value of the passiveEnrouteScan property.
     * 
     */
    public void setPassiveEnrouteScan(boolean value) {
        this.passiveEnrouteScan = value;
    }

    /**
     * Gets the value of the restrictedDelivery property.
     * 
     */
    public boolean isRestrictedDelivery() {
        return restrictedDelivery;
    }

    /**
     * Sets the value of the restrictedDelivery property.
     * 
     */
    public void setRestrictedDelivery(boolean value) {
        this.restrictedDelivery = value;
    }

    /**
     * Gets the value of the expressMail property.
     * 
     */
    public boolean isExpressMail() {
        return expressMail;
    }

    /**
     * Sets the value of the expressMail property.
     * 
     */
    public void setExpressMail(boolean value) {
        this.expressMail = value;
    }

    /**
     * Gets the value of the expeditedReturn property.
     * 
     */
    public boolean isExpeditedReturn() {
        return expeditedReturn;
    }

    /**
     * Sets the value of the expeditedReturn property.
     * 
     */
    public void setExpeditedReturn(boolean value) {
        this.expeditedReturn = value;
    }

    /**
     * Gets the value of the merchandiseReturn property.
     * 
     */
    public boolean isMerchandiseReturn() {
        return merchandiseReturn;
    }

    /**
     * Sets the value of the merchandiseReturn property.
     * 
     */
    public void setMerchandiseReturn(boolean value) {
        this.merchandiseReturn = value;
    }

    /**
     * Gets the value of the merchandiseReturnWithDeliveryConfirmation property.
     * 
     */
    public boolean isMerchandiseReturnWithDeliveryConfirmation() {
        return merchandiseReturnWithDeliveryConfirmation;
    }

    /**
     * Sets the value of the merchandiseReturnWithDeliveryConfirmation property.
     * 
     */
    public void setMerchandiseReturnWithDeliveryConfirmation(boolean value) {
        this.merchandiseReturnWithDeliveryConfirmation = value;
    }

    /**
     * Gets the value of the dayCertainDelivery property.
     * 
     */
    public boolean isDayCertainDelivery() {
        return dayCertainDelivery;
    }

    /**
     * Sets the value of the dayCertainDelivery property.
     * 
     */
    public void setDayCertainDelivery(boolean value) {
        this.dayCertainDelivery = value;
    }

    /**
     * Gets the value of the newFormat property.
     * 
     */
    public boolean isNewFormat() {
        return newFormat;
    }

    /**
     * Sets the value of the newFormat property.
     * 
     */
    public void setNewFormat(boolean value) {
        this.newFormat = value;
    }

    /**
     * Gets the value of the smsEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMSEmail() {
        return smsEmail;
    }

    /**
     * Sets the value of the smsEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMSEmail(String value) {
        this.smsEmail = value;
    }

    /**
     * Gets the value of the smsPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMSPhone() {
        return smsPhone;
    }

    /**
     * Sets the value of the smsPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMSPhone(String value) {
        this.smsPhone = value;
    }

    /**
     * Gets the value of the certifiedMailFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCertifiedMailFee() {
        return certifiedMailFee;
    }

    /**
     * Sets the value of the certifiedMailFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCertifiedMailFee(BigDecimal value) {
        this.certifiedMailFee = value;
    }

    /**
     * Gets the value of the deliveryConfirmationFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeliveryConfirmationFee() {
        return deliveryConfirmationFee;
    }

    /**
     * Sets the value of the deliveryConfirmationFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeliveryConfirmationFee(BigDecimal value) {
        this.deliveryConfirmationFee = value;
    }

    /**
     * Gets the value of the merchandiseReturnFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMerchandiseReturnFee() {
        return merchandiseReturnFee;
    }

    /**
     * Sets the value of the merchandiseReturnFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMerchandiseReturnFee(BigDecimal value) {
        this.merchandiseReturnFee = value;
    }

    /**
     * Gets the value of the dayCertainDeliveryFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDayCertainDeliveryFee() {
        return dayCertainDeliveryFee;
    }

    /**
     * Sets the value of the dayCertainDeliveryFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDayCertainDeliveryFee(BigDecimal value) {
        this.dayCertainDeliveryFee = value;
    }

    /**
     * Gets the value of the merchandiseReturnWithDeliveryConfirmationFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMerchandiseReturnWithDeliveryConfirmationFee() {
        return merchandiseReturnWithDeliveryConfirmationFee;
    }

    /**
     * Sets the value of the merchandiseReturnWithDeliveryConfirmationFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMerchandiseReturnWithDeliveryConfirmationFee(BigDecimal value) {
        this.merchandiseReturnWithDeliveryConfirmationFee = value;
    }

    /**
     * Gets the value of the openAndDistributeFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpenAndDistributeFee() {
        return openAndDistributeFee;
    }

    /**
     * Sets the value of the openAndDistributeFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpenAndDistributeFee(BigDecimal value) {
        this.openAndDistributeFee = value;
    }

    /**
     * Gets the value of the passiveEnrouteScanFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPassiveEnrouteScanFee() {
        return passiveEnrouteScanFee;
    }

    /**
     * Sets the value of the passiveEnrouteScanFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPassiveEnrouteScanFee(BigDecimal value) {
        this.passiveEnrouteScanFee = value;
    }

    /**
     * Gets the value of the registeredMailFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRegisteredMailFee() {
        return registeredMailFee;
    }

    /**
     * Sets the value of the registeredMailFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRegisteredMailFee(BigDecimal value) {
        this.registeredMailFee = value;
    }

    /**
     * Gets the value of the signatureConfirmationFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSignatureConfirmationFee() {
        return signatureConfirmationFee;
    }

    /**
     * Sets the value of the signatureConfirmationFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSignatureConfirmationFee(BigDecimal value) {
        this.signatureConfirmationFee = value;
    }

    /**
     * Gets the value of the signatureServiceFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSignatureServiceFee() {
        return signatureServiceFee;
    }

    /**
     * Sets the value of the signatureServiceFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSignatureServiceFee(BigDecimal value) {
        this.signatureServiceFee = value;
    }

    /**
     * Gets the value of the expressMailFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExpressMailFee() {
        return expressMailFee;
    }

    /**
     * Sets the value of the expressMailFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExpressMailFee(BigDecimal value) {
        this.expressMailFee = value;
    }

    /**
     * Gets the value of the expeditedReturnFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExpeditedReturnFee() {
        return expeditedReturnFee;
    }

    /**
     * Sets the value of the expeditedReturnFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExpeditedReturnFee(BigDecimal value) {
        this.expeditedReturnFee = value;
    }

    /**
     * Gets the value of the adultSignatureFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdultSignatureFee() {
        return adultSignatureFee;
    }

    /**
     * Sets the value of the adultSignatureFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdultSignatureFee(BigDecimal value) {
        this.adultSignatureFee = value;
    }

    /**
     * Gets the value of the adultSignatureRestrictedFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdultSignatureRestrictedFee() {
        return adultSignatureRestrictedFee;
    }

    /**
     * Sets the value of the adultSignatureRestrictedFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdultSignatureRestrictedFee(BigDecimal value) {
        this.adultSignatureRestrictedFee = value;
    }

    /**
     * Gets the value of the groupedExtraServicesFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGroupedExtraServicesFee() {
        return groupedExtraServicesFee;
    }

    /**
     * Sets the value of the groupedExtraServicesFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGroupedExtraServicesFee(BigDecimal value) {
        this.groupedExtraServicesFee = value;
    }

    /**
     * Gets the value of the isConsolidator property.
     * 
     */
    public boolean isIsConsolidator() {
        return isConsolidator;
    }

    /**
     * Sets the value of the isConsolidator property.
     * 
     */
    public void setIsConsolidator(boolean value) {
        this.isConsolidator = value;
    }

    /**
     * Gets the value of the isEvs property.
     * 
     */
    public boolean isIsEvs() {
        return isEvs;
    }

    /**
     * Sets the value of the isEvs property.
     * 
     */
    public void setIsEvs(boolean value) {
        this.isEvs = value;
    }

    /**
     * Gets the value of the consolidatorPrefId property.
     * 
     */
    public int getConsolidatorPrefId() {
        return consolidatorPrefId;
    }

    /**
     * Sets the value of the consolidatorPrefId property.
     * 
     */
    public void setConsolidatorPrefId(int value) {
        this.consolidatorPrefId = value;
    }

    /**
     * Gets the value of the chargedFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChargedFee() {
        return chargedFee;
    }

    /**
     * Sets the value of the chargedFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChargedFee(BigDecimal value) {
        this.chargedFee = value;
    }

    /**
     * Gets the value of the internationalPicnumberPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalPicnumberPrefix() {
        return internationalPicnumberPrefix;
    }

    /**
     * Sets the value of the internationalPicnumberPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalPicnumberPrefix(String value) {
        this.internationalPicnumberPrefix = value;
    }

    /**
     * Gets the value of the scanBasedPayment property.
     * 
     */
    public boolean isScanBasedPayment() {
        return scanBasedPayment;
    }

    /**
     * Sets the value of the scanBasedPayment property.
     * 
     */
    public void setScanBasedPayment(boolean value) {
        this.scanBasedPayment = value;
    }

    /**
     * Gets the value of the outboundScanBasedPayment property.
     * 
     */
    public boolean isOutboundScanBasedPayment() {
        return outboundScanBasedPayment;
    }

    /**
     * Sets the value of the outboundScanBasedPayment property.
     * 
     */
    public void setOutboundScanBasedPayment(boolean value) {
        this.outboundScanBasedPayment = value;
    }

    /**
     * Gets the value of the signatureService property.
     * 
     */
    public boolean isSignatureService() {
        return signatureService;
    }

    /**
     * Sets the value of the signatureService property.
     * 
     */
    public void setSignatureService(boolean value) {
        this.signatureService = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLength(BigDecimal value) {
        this.length = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWidth(BigDecimal value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeight(BigDecimal value) {
        this.height = value;
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
     * Gets the value of the flagGenerate property.
     * 
     */
    public boolean isFlagGenerate() {
        return flagGenerate;
    }

    /**
     * Sets the value of the flagGenerate property.
     * 
     */
    public void setFlagGenerate(boolean value) {
        this.flagGenerate = value;
    }

    /**
     * Gets the value of the toCarrierRoute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCarrierRoute() {
        return toCarrierRoute;
    }

    /**
     * Sets the value of the toCarrierRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCarrierRoute(String value) {
        this.toCarrierRoute = value;
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
     * Gets the value of the liveAnimalSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLiveAnimalSurcharge() {
        return liveAnimalSurcharge;
    }

    /**
     * Sets the value of the liveAnimalSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLiveAnimalSurcharge(BigDecimal value) {
        this.liveAnimalSurcharge = value;
    }

    /**
     * Gets the value of the fragileHandlingSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFragileHandlingSurcharge() {
        return fragileHandlingSurcharge;
    }

    /**
     * Sets the value of the fragileHandlingSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFragileHandlingSurcharge(BigDecimal value) {
        this.fragileHandlingSurcharge = value;
    }

    /**
     * Gets the value of the permitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermitNumber() {
        return permitNumber;
    }

    /**
     * Sets the value of the permitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermitNumber(String value) {
        this.permitNumber = value;
    }

    /**
     * Gets the value of the sbpUseCommercialConstruct property.
     * 
     */
    public boolean isSbpUseCommercialConstruct() {
        return sbpUseCommercialConstruct;
    }

    /**
     * Sets the value of the sbpUseCommercialConstruct property.
     * 
     */
    public void setSbpUseCommercialConstruct(boolean value) {
        this.sbpUseCommercialConstruct = value;
    }

    /**
     * Gets the value of the picMailerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPicMailerID() {
        return picMailerID;
    }

    /**
     * Sets the value of the picMailerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPicMailerID(String value) {
        this.picMailerID = value;
    }

    /**
     * Gets the value of the fromDeliveryPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromDeliveryPoint() {
        return fromDeliveryPoint;
    }

    /**
     * Sets the value of the fromDeliveryPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromDeliveryPoint(String value) {
        this.fromDeliveryPoint = value;
    }

    /**
     * Gets the value of the toDeliveryPoint property.
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
     * Sets the value of the toDeliveryPoint property.
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
     * Gets the value of the isBalloonRate property.
     * 
     */
    public boolean isIsBalloonRate() {
        return isBalloonRate;
    }

    /**
     * Sets the value of the isBalloonRate property.
     * 
     */
    public void setIsBalloonRate(boolean value) {
        this.isBalloonRate = value;
    }

    /**
     * Gets the value of the softwareID property.
     * 
     */
    public long getSoftwareID() {
        return softwareID;
    }

    /**
     * Sets the value of the softwareID property.
     * 
     */
    public void setSoftwareID(long value) {
        this.softwareID = value;
    }

    /**
     * Gets the value of the isTerritories property.
     * 
     */
    public boolean isIsTerritories() {
        return isTerritories;
    }

    /**
     * Sets the value of the isTerritories property.
     * 
     */
    public void setIsTerritories(boolean value) {
        this.isTerritories = value;
    }

    /**
     * Gets the value of the isBarcodeZIP4Enabled property.
     * 
     */
    public boolean isIsBarcodeZIP4Enabled() {
        return isBarcodeZIP4Enabled;
    }

    /**
     * Sets the value of the isBarcodeZIP4Enabled property.
     * 
     */
    public void setIsBarcodeZIP4Enabled(boolean value) {
        this.isBarcodeZIP4Enabled = value;
    }

    /**
     * Gets the value of the poZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOZipCode() {
        return poZipCode;
    }

    /**
     * Sets the value of the poZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOZipCode(String value) {
        this.poZipCode = value;
    }

    /**
     * Gets the value of the returns property.
     * 
     */
    public boolean isReturns() {
        return returns;
    }

    /**
     * Sets the value of the returns property.
     * 
     */
    public void setReturns(boolean value) {
        this.returns = value;
    }

    /**
     * Gets the value of the consolidatorAccountId property.
     * 
     */
    public int getConsolidatorAccountId() {
        return consolidatorAccountId;
    }

    /**
     * Sets the value of the consolidatorAccountId property.
     * 
     */
    public void setConsolidatorAccountId(int value) {
        this.consolidatorAccountId = value;
    }

    /**
     * Gets the value of the isDimWeighted property.
     * 
     */
    public boolean isIsDimWeighted() {
        return isDimWeighted;
    }

    /**
     * Sets the value of the isDimWeighted property.
     * 
     */
    public void setIsDimWeighted(boolean value) {
        this.isDimWeighted = value;
    }

    /**
     * Gets the value of the marketPlacePartnerID property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMarketPlacePartnerID() {
        return marketPlacePartnerID;
    }

    /**
     * Sets the value of the marketPlacePartnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMarketPlacePartnerID(Short value) {
        this.marketPlacePartnerID = value;
    }

    /**
     * Gets the value of the test property.
     * 
     */
    public boolean isTest() {
        return test;
    }

    /**
     * Sets the value of the test property.
     * 
     */
    public void setTest(boolean value) {
        this.test = value;
    }

}
