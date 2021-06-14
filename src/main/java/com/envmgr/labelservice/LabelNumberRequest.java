
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
 * <p>Clase Java para LabelNumberRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad labelNumberSource.
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
     * Define el valor de la propiedad labelNumberSource.
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
     * Obtiene el valor de la propiedad accountID.
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
     * Define el valor de la propiedad accountID.
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
     * Obtiene el valor de la propiedad passPhrase.
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
     * Define el valor de la propiedad passPhrase.
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
     * Obtiene el valor de la propiedad clientMailerID.
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
     * Define el valor de la propiedad clientMailerID.
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
     * Obtiene el valor de la propiedad ptsActionCode.
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
     * Define el valor de la propiedad ptsActionCode.
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
     * Obtiene el valor de la propiedad labelDate.
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
     * Define el valor de la propiedad labelDate.
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
     * Obtiene el valor de la propiedad postage.
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
     * Define el valor de la propiedad postage.
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
     * Obtiene el valor de la propiedad fees.
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
     * Define el valor de la propiedad fees.
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
     * Obtiene el valor de la propiedad weight.
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
     * Define el valor de la propiedad weight.
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
     * Obtiene el valor de la propiedad zone.
     * 
     */
    public int getZone() {
        return zone;
    }

    /**
     * Define el valor de la propiedad zone.
     * 
     */
    public void setZone(int value) {
        this.zone = value;
    }

    /**
     * Obtiene el valor de la propiedad pricing.
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
     * Define el valor de la propiedad pricing.
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
     * Obtiene el valor de la propiedad priceTier.
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
     * Define el valor de la propiedad priceTier.
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
     * Obtiene el valor de la propiedad container.
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
     * Define el valor de la propiedad container.
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
     * Obtiene el valor de la propiedad machinable.
     * 
     */
    public boolean isMachinable() {
        return machinable;
    }

    /**
     * Define el valor de la propiedad machinable.
     * 
     */
    public void setMachinable(boolean value) {
        this.machinable = value;
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
     * Obtiene el valor de la propiedad declaredValue.
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
     * Define el valor de la propiedad declaredValue.
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
     * Obtiene el valor de la propiedad cod.
     * 
     */
    public boolean isCOD() {
        return cod;
    }

    /**
     * Define el valor de la propiedad cod.
     * 
     */
    public void setCOD(boolean value) {
        this.cod = value;
    }

    /**
     * Obtiene el valor de la propiedad codFee.
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
     * Define el valor de la propiedad codFee.
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
     * Obtiene el valor de la propiedad codAmount.
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
     * Define el valor de la propiedad codAmount.
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
     * Obtiene el valor de la propiedad fromAddress1.
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
     * Define el valor de la propiedad fromAddress1.
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
     * Obtiene el valor de la propiedad fromAddress2.
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
     * Define el valor de la propiedad fromAddress2.
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
     * Obtiene el valor de la propiedad fromZip5.
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
     * Define el valor de la propiedad fromZip5.
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
     * Obtiene el valor de la propiedad fromZip4.
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
     * Define el valor de la propiedad fromZip4.
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
     * Obtiene el valor de la propiedad fromEmail.
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
     * Define el valor de la propiedad fromEmail.
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
     * Obtiene el valor de la propiedad toFax.
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
     * Define el valor de la propiedad toFax.
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
     * Obtiene el valor de la propiedad toEmail.
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
     * Define el valor de la propiedad toEmail.
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
     * Obtiene el valor de la propiedad toPOBox.
     * 
     */
    public boolean isToPOBox() {
        return toPOBox;
    }

    /**
     * Define el valor de la propiedad toPOBox.
     * 
     */
    public void setToPOBox(boolean value) {
        this.toPOBox = value;
    }

    /**
     * Obtiene el valor de la propiedad destinationFacility.
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
     * Define el valor de la propiedad destinationFacility.
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
     * Obtiene el valor de la propiedad surchargeType.
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
     * Define el valor de la propiedad surchargeType.
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
     * Obtiene el valor de la propiedad surchargeAmount.
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
     * Define el valor de la propiedad surchargeAmount.
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
     * Obtiene el valor de la propiedad surchargeDescription.
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
     * Define el valor de la propiedad surchargeDescription.
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
     * Obtiene el valor de la propiedad customsInfo.
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
     * Define el valor de la propiedad customsInfo.
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
     * Obtiene el valor de la propiedad computeRDC.
     * 
     */
    public boolean isComputeRDC() {
        return computeRDC;
    }

    /**
     * Define el valor de la propiedad computeRDC.
     * 
     */
    public void setComputeRDC(boolean value) {
        this.computeRDC = value;
    }

    /**
     * Obtiene el valor de la propiedad returnService.
     * 
     */
    public boolean isReturnService() {
        return returnService;
    }

    /**
     * Define el valor de la propiedad returnService.
     * 
     */
    public void setReturnService(boolean value) {
        this.returnService = value;
    }

    /**
     * Obtiene el valor de la propiedad reShipment.
     * 
     */
    public boolean isReShipment() {
        return reShipment;
    }

    /**
     * Define el valor de la propiedad reShipment.
     * 
     */
    public void setReShipment(boolean value) {
        this.reShipment = value;
    }

    /**
     * Obtiene el valor de la propiedad adultSignature.
     * 
     */
    public boolean isAdultSignature() {
        return adultSignature;
    }

    /**
     * Define el valor de la propiedad adultSignature.
     * 
     */
    public void setAdultSignature(boolean value) {
        this.adultSignature = value;
    }

    /**
     * Obtiene el valor de la propiedad adultSignatureRestricted.
     * 
     */
    public boolean isAdultSignatureRestricted() {
        return adultSignatureRestricted;
    }

    /**
     * Define el valor de la propiedad adultSignatureRestricted.
     * 
     */
    public void setAdultSignatureRestricted(boolean value) {
        this.adultSignatureRestricted = value;
    }

    /**
     * Obtiene el valor de la propiedad expressMailMerchandiseInsurance.
     * 
     */
    public boolean isExpressMailMerchandiseInsurance() {
        return expressMailMerchandiseInsurance;
    }

    /**
     * Define el valor de la propiedad expressMailMerchandiseInsurance.
     * 
     */
    public void setExpressMailMerchandiseInsurance(boolean value) {
        this.expressMailMerchandiseInsurance = value;
    }

    /**
     * Obtiene el valor de la propiedad parcelAirlift.
     * 
     */
    public boolean isParcelAirlift() {
        return parcelAirlift;
    }

    /**
     * Define el valor de la propiedad parcelAirlift.
     * 
     */
    public void setParcelAirlift(boolean value) {
        this.parcelAirlift = value;
    }

    /**
     * Obtiene el valor de la propiedad specialHandling.
     * 
     */
    public boolean isSpecialHandling() {
        return specialHandling;
    }

    /**
     * Define el valor de la propiedad specialHandling.
     * 
     */
    public void setSpecialHandling(boolean value) {
        this.specialHandling = value;
    }

    /**
     * Obtiene el valor de la propiedad holdForPickup.
     * 
     */
    public boolean isHoldForPickup() {
        return holdForPickup;
    }

    /**
     * Define el valor de la propiedad holdForPickup.
     * 
     */
    public void setHoldForPickup(boolean value) {
        this.holdForPickup = value;
    }

    /**
     * Obtiene el valor de la propiedad openAndDistribute.
     * 
     */
    public boolean isOpenAndDistribute() {
        return openAndDistribute;
    }

    /**
     * Define el valor de la propiedad openAndDistribute.
     * 
     */
    public void setOpenAndDistribute(boolean value) {
        this.openAndDistribute = value;
    }

    /**
     * Obtiene el valor de la propiedad certifiedMail.
     * 
     */
    public boolean isCertifiedMail() {
        return certifiedMail;
    }

    /**
     * Define el valor de la propiedad certifiedMail.
     * 
     */
    public void setCertifiedMail(boolean value) {
        this.certifiedMail = value;
    }

    /**
     * Obtiene el valor de la propiedad deliveryConfirmation.
     * 
     */
    public boolean isDeliveryConfirmation() {
        return deliveryConfirmation;
    }

    /**
     * Define el valor de la propiedad deliveryConfirmation.
     * 
     */
    public void setDeliveryConfirmation(boolean value) {
        this.deliveryConfirmation = value;
    }

    /**
     * Obtiene el valor de la propiedad signatureConfirmation.
     * 
     */
    public boolean isSignatureConfirmation() {
        return signatureConfirmation;
    }

    /**
     * Define el valor de la propiedad signatureConfirmation.
     * 
     */
    public void setSignatureConfirmation(boolean value) {
        this.signatureConfirmation = value;
    }

    /**
     * Obtiene el valor de la propiedad registeredMail.
     * 
     */
    public boolean isRegisteredMail() {
        return registeredMail;
    }

    /**
     * Define el valor de la propiedad registeredMail.
     * 
     */
    public void setRegisteredMail(boolean value) {
        this.registeredMail = value;
    }

    /**
     * Obtiene el valor de la propiedad passiveEnrouteScan.
     * 
     */
    public boolean isPassiveEnrouteScan() {
        return passiveEnrouteScan;
    }

    /**
     * Define el valor de la propiedad passiveEnrouteScan.
     * 
     */
    public void setPassiveEnrouteScan(boolean value) {
        this.passiveEnrouteScan = value;
    }

    /**
     * Obtiene el valor de la propiedad restrictedDelivery.
     * 
     */
    public boolean isRestrictedDelivery() {
        return restrictedDelivery;
    }

    /**
     * Define el valor de la propiedad restrictedDelivery.
     * 
     */
    public void setRestrictedDelivery(boolean value) {
        this.restrictedDelivery = value;
    }

    /**
     * Obtiene el valor de la propiedad expressMail.
     * 
     */
    public boolean isExpressMail() {
        return expressMail;
    }

    /**
     * Define el valor de la propiedad expressMail.
     * 
     */
    public void setExpressMail(boolean value) {
        this.expressMail = value;
    }

    /**
     * Obtiene el valor de la propiedad expeditedReturn.
     * 
     */
    public boolean isExpeditedReturn() {
        return expeditedReturn;
    }

    /**
     * Define el valor de la propiedad expeditedReturn.
     * 
     */
    public void setExpeditedReturn(boolean value) {
        this.expeditedReturn = value;
    }

    /**
     * Obtiene el valor de la propiedad merchandiseReturn.
     * 
     */
    public boolean isMerchandiseReturn() {
        return merchandiseReturn;
    }

    /**
     * Define el valor de la propiedad merchandiseReturn.
     * 
     */
    public void setMerchandiseReturn(boolean value) {
        this.merchandiseReturn = value;
    }

    /**
     * Obtiene el valor de la propiedad merchandiseReturnWithDeliveryConfirmation.
     * 
     */
    public boolean isMerchandiseReturnWithDeliveryConfirmation() {
        return merchandiseReturnWithDeliveryConfirmation;
    }

    /**
     * Define el valor de la propiedad merchandiseReturnWithDeliveryConfirmation.
     * 
     */
    public void setMerchandiseReturnWithDeliveryConfirmation(boolean value) {
        this.merchandiseReturnWithDeliveryConfirmation = value;
    }

    /**
     * Obtiene el valor de la propiedad dayCertainDelivery.
     * 
     */
    public boolean isDayCertainDelivery() {
        return dayCertainDelivery;
    }

    /**
     * Define el valor de la propiedad dayCertainDelivery.
     * 
     */
    public void setDayCertainDelivery(boolean value) {
        this.dayCertainDelivery = value;
    }

    /**
     * Obtiene el valor de la propiedad newFormat.
     * 
     */
    public boolean isNewFormat() {
        return newFormat;
    }

    /**
     * Define el valor de la propiedad newFormat.
     * 
     */
    public void setNewFormat(boolean value) {
        this.newFormat = value;
    }

    /**
     * Obtiene el valor de la propiedad smsEmail.
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
     * Define el valor de la propiedad smsEmail.
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
     * Obtiene el valor de la propiedad smsPhone.
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
     * Define el valor de la propiedad smsPhone.
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
     * Obtiene el valor de la propiedad certifiedMailFee.
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
     * Define el valor de la propiedad certifiedMailFee.
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
     * Obtiene el valor de la propiedad deliveryConfirmationFee.
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
     * Define el valor de la propiedad deliveryConfirmationFee.
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
     * Obtiene el valor de la propiedad merchandiseReturnFee.
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
     * Define el valor de la propiedad merchandiseReturnFee.
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
     * Obtiene el valor de la propiedad dayCertainDeliveryFee.
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
     * Define el valor de la propiedad dayCertainDeliveryFee.
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
     * Obtiene el valor de la propiedad merchandiseReturnWithDeliveryConfirmationFee.
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
     * Define el valor de la propiedad merchandiseReturnWithDeliveryConfirmationFee.
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
     * Obtiene el valor de la propiedad openAndDistributeFee.
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
     * Define el valor de la propiedad openAndDistributeFee.
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
     * Obtiene el valor de la propiedad passiveEnrouteScanFee.
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
     * Define el valor de la propiedad passiveEnrouteScanFee.
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
     * Obtiene el valor de la propiedad registeredMailFee.
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
     * Define el valor de la propiedad registeredMailFee.
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
     * Obtiene el valor de la propiedad signatureConfirmationFee.
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
     * Define el valor de la propiedad signatureConfirmationFee.
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
     * Obtiene el valor de la propiedad signatureServiceFee.
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
     * Define el valor de la propiedad signatureServiceFee.
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
     * Obtiene el valor de la propiedad expressMailFee.
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
     * Define el valor de la propiedad expressMailFee.
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
     * Obtiene el valor de la propiedad expeditedReturnFee.
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
     * Define el valor de la propiedad expeditedReturnFee.
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
     * Obtiene el valor de la propiedad adultSignatureFee.
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
     * Define el valor de la propiedad adultSignatureFee.
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
     * Obtiene el valor de la propiedad adultSignatureRestrictedFee.
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
     * Define el valor de la propiedad adultSignatureRestrictedFee.
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
     * Obtiene el valor de la propiedad groupedExtraServicesFee.
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
     * Define el valor de la propiedad groupedExtraServicesFee.
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
     * Obtiene el valor de la propiedad isConsolidator.
     * 
     */
    public boolean isIsConsolidator() {
        return isConsolidator;
    }

    /**
     * Define el valor de la propiedad isConsolidator.
     * 
     */
    public void setIsConsolidator(boolean value) {
        this.isConsolidator = value;
    }

    /**
     * Obtiene el valor de la propiedad isEvs.
     * 
     */
    public boolean isIsEvs() {
        return isEvs;
    }

    /**
     * Define el valor de la propiedad isEvs.
     * 
     */
    public void setIsEvs(boolean value) {
        this.isEvs = value;
    }

    /**
     * Obtiene el valor de la propiedad consolidatorPrefId.
     * 
     */
    public int getConsolidatorPrefId() {
        return consolidatorPrefId;
    }

    /**
     * Define el valor de la propiedad consolidatorPrefId.
     * 
     */
    public void setConsolidatorPrefId(int value) {
        this.consolidatorPrefId = value;
    }

    /**
     * Obtiene el valor de la propiedad chargedFee.
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
     * Define el valor de la propiedad chargedFee.
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
     * Obtiene el valor de la propiedad internationalPicnumberPrefix.
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
     * Define el valor de la propiedad internationalPicnumberPrefix.
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
     * Obtiene el valor de la propiedad scanBasedPayment.
     * 
     */
    public boolean isScanBasedPayment() {
        return scanBasedPayment;
    }

    /**
     * Define el valor de la propiedad scanBasedPayment.
     * 
     */
    public void setScanBasedPayment(boolean value) {
        this.scanBasedPayment = value;
    }

    /**
     * Obtiene el valor de la propiedad outboundScanBasedPayment.
     * 
     */
    public boolean isOutboundScanBasedPayment() {
        return outboundScanBasedPayment;
    }

    /**
     * Define el valor de la propiedad outboundScanBasedPayment.
     * 
     */
    public void setOutboundScanBasedPayment(boolean value) {
        this.outboundScanBasedPayment = value;
    }

    /**
     * Obtiene el valor de la propiedad signatureService.
     * 
     */
    public boolean isSignatureService() {
        return signatureService;
    }

    /**
     * Define el valor de la propiedad signatureService.
     * 
     */
    public void setSignatureService(boolean value) {
        this.signatureService = value;
    }

    /**
     * Obtiene el valor de la propiedad length.
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
     * Define el valor de la propiedad length.
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
     * Obtiene el valor de la propiedad width.
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
     * Define el valor de la propiedad width.
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
     * Obtiene el valor de la propiedad height.
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
     * Define el valor de la propiedad height.
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
     * Obtiene el valor de la propiedad flagGenerate.
     * 
     */
    public boolean isFlagGenerate() {
        return flagGenerate;
    }

    /**
     * Define el valor de la propiedad flagGenerate.
     * 
     */
    public void setFlagGenerate(boolean value) {
        this.flagGenerate = value;
    }

    /**
     * Obtiene el valor de la propiedad toCarrierRoute.
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
     * Define el valor de la propiedad toCarrierRoute.
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
     * Obtiene el valor de la propiedad liveAnimalSurcharge.
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
     * Define el valor de la propiedad liveAnimalSurcharge.
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
     * Obtiene el valor de la propiedad fragileHandlingSurcharge.
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
     * Define el valor de la propiedad fragileHandlingSurcharge.
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
     * Obtiene el valor de la propiedad permitNumber.
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
     * Define el valor de la propiedad permitNumber.
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
     * Obtiene el valor de la propiedad sbpUseCommercialConstruct.
     * 
     */
    public boolean isSbpUseCommercialConstruct() {
        return sbpUseCommercialConstruct;
    }

    /**
     * Define el valor de la propiedad sbpUseCommercialConstruct.
     * 
     */
    public void setSbpUseCommercialConstruct(boolean value) {
        this.sbpUseCommercialConstruct = value;
    }

    /**
     * Obtiene el valor de la propiedad picMailerID.
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
     * Define el valor de la propiedad picMailerID.
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
     * Obtiene el valor de la propiedad fromDeliveryPoint.
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
     * Define el valor de la propiedad fromDeliveryPoint.
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
     * Obtiene el valor de la propiedad isBalloonRate.
     * 
     */
    public boolean isIsBalloonRate() {
        return isBalloonRate;
    }

    /**
     * Define el valor de la propiedad isBalloonRate.
     * 
     */
    public void setIsBalloonRate(boolean value) {
        this.isBalloonRate = value;
    }

    /**
     * Obtiene el valor de la propiedad softwareID.
     * 
     */
    public long getSoftwareID() {
        return softwareID;
    }

    /**
     * Define el valor de la propiedad softwareID.
     * 
     */
    public void setSoftwareID(long value) {
        this.softwareID = value;
    }

    /**
     * Obtiene el valor de la propiedad isTerritories.
     * 
     */
    public boolean isIsTerritories() {
        return isTerritories;
    }

    /**
     * Define el valor de la propiedad isTerritories.
     * 
     */
    public void setIsTerritories(boolean value) {
        this.isTerritories = value;
    }

    /**
     * Obtiene el valor de la propiedad isBarcodeZIP4Enabled.
     * 
     */
    public boolean isIsBarcodeZIP4Enabled() {
        return isBarcodeZIP4Enabled;
    }

    /**
     * Define el valor de la propiedad isBarcodeZIP4Enabled.
     * 
     */
    public void setIsBarcodeZIP4Enabled(boolean value) {
        this.isBarcodeZIP4Enabled = value;
    }

    /**
     * Obtiene el valor de la propiedad poZipCode.
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
     * Define el valor de la propiedad poZipCode.
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
     * Obtiene el valor de la propiedad returns.
     * 
     */
    public boolean isReturns() {
        return returns;
    }

    /**
     * Define el valor de la propiedad returns.
     * 
     */
    public void setReturns(boolean value) {
        this.returns = value;
    }

    /**
     * Obtiene el valor de la propiedad consolidatorAccountId.
     * 
     */
    public int getConsolidatorAccountId() {
        return consolidatorAccountId;
    }

    /**
     * Define el valor de la propiedad consolidatorAccountId.
     * 
     */
    public void setConsolidatorAccountId(int value) {
        this.consolidatorAccountId = value;
    }

    /**
     * Obtiene el valor de la propiedad isDimWeighted.
     * 
     */
    public boolean isIsDimWeighted() {
        return isDimWeighted;
    }

    /**
     * Define el valor de la propiedad isDimWeighted.
     * 
     */
    public void setIsDimWeighted(boolean value) {
        this.isDimWeighted = value;
    }

    /**
     * Obtiene el valor de la propiedad marketPlacePartnerID.
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
     * Define el valor de la propiedad marketPlacePartnerID.
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
     * Obtiene el valor de la propiedad test.
     * 
     */
    public boolean isTest() {
        return test;
    }

    /**
     * Define el valor de la propiedad test.
     * 
     */
    public void setTest(boolean value) {
        this.test = value;
    }

}
