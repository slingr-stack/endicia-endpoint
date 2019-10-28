
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LabelRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{www.envmgr.com/LabelService}CommonLabelRequestAndPostageRateRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PassPhrase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AutomationRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Machinable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SortType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IncludePostage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReplyPostage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShowReturnAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Stealth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValidateAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SignatureWaiver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NoWeekendDelivery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Services" type="{www.envmgr.com/LabelService}SpecialServices" minOccurs="0"/&gt;
 *         &lt;element name="CostCenter" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="CODAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RegisteredMailValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegratedFormType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomsFormType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomsFormImageFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomsFormImageResolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContentsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContentsExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NonDeliveryOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceID2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceID3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceID4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PartnerCustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PartnerTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BpodClientDunsNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RubberStamp1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RubberStamp2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RubberStamp3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EntryFacility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="POZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomsInfo" type="{www.envmgr.com/LabelService}CustomsInfo" minOccurs="0"/&gt;
 *         &lt;element name="CustomsCertify" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomsSigner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HfpEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HfpSMS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HfpFacilityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MRSPermitNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MRSPermitCityStateZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MRSPermitFirm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MRSPermitStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MRSRMANumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OpenAndDistributeFacilityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OpenAndDistributeFacilityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OpenAndDistributeTray" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OpenAndDistributeMailClassEnclosed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OpenAndDistributeMailClassOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GXGFedexTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GXGUSPSTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrintConsolidatorLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResponseOptions" type="{www.envmgr.com/LabelService}ResponseOptions" minOccurs="0"/&gt;
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomsSendersCopy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NoDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MerchantID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrintScanBasedPaymentLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpecialContents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eVSOptions" type="{www.envmgr.com/LabelService}eVSOptions" minOccurs="0"/&gt;
 *         &lt;element name="COD3816" type="{www.envmgr.com/LabelService}Cod3816" minOccurs="0"/&gt;
 *         &lt;element name="EmailMiscNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AncillaryServiceEndorsement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequesterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsuredValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProfileType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressCleansedHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnAddress4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromZIP4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="ToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToZIP4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToDeliveryPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomsCountry1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomsDescription1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomsQuantity1" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="CustomsValue1" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="CustomsWeight1" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="CustomsCountry2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomsDescription2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomsQuantity2" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="CustomsValue2" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="CustomsWeight2" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="CustomsCountry3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomsDescription3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomsQuantity3" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="CustomsValue3" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="CustomsWeight3" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="CustomsCountry4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomsDescription4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomsQuantity4" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="CustomsValue4" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="CustomsWeight4" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="CustomsCountry5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomsDescription5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomsQuantity5" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="CustomsValue5" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="CustomsWeight5" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="EelPfc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HfpFacilityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HfpFacilityAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HfpFacilityCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HfpFacilityState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HfpFacilityPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HfpFacilityZIP4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CostCenterAlphaNumeric" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToCarrierRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HazardousMaterial" type="{www.envmgr.com/LabelService}HazMat" minOccurs="0"/&gt;
 *         &lt;element name="FromCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Test" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LabelType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LabelSubtype" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LabelSize" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ImageFormat" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ImageResolution" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ImageRotation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LabelTemplate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelRequest", propOrder = {
    "passPhrase",
    "automationRate",
    "machinable",
    "serviceLevel",
    "sortType",
    "includePostage",
    "replyPostage",
    "showReturnAddress",
    "stealth",
    "validateAddress",
    "signatureWaiver",
    "noWeekendDelivery",
    "services",
    "costCenter",
    "value",
    "codAmount",
    "registeredMailValue",
    "description",
    "integratedFormType",
    "customsFormType",
    "customsFormImageFormat",
    "customsFormImageResolution",
    "originCountry",
    "contentsType",
    "contentsExplanation",
    "nonDeliveryOption",
    "referenceID",
    "referenceID2",
    "referenceID3",
    "referenceID4",
    "partnerCustomerID",
    "partnerTransactionID",
    "bpodClientDunsNumber",
    "rubberStamp1",
    "rubberStamp2",
    "rubberStamp3",
    "entryFacility",
    "poZipCode",
    "shipDate",
    "shipTime",
    "customsInfo",
    "customsCertify",
    "customsSigner",
    "hfpEmailAddress",
    "hfpSMS",
    "hfpFacilityID",
    "mrsPermitNo",
    "mrsPermitCityStateZIP",
    "mrsPermitFirm",
    "mrsPermitStreet",
    "mrsrmaNumber",
    "openAndDistributeFacilityType",
    "openAndDistributeFacilityName",
    "openAndDistributeTray",
    "openAndDistributeMailClassEnclosed",
    "openAndDistributeMailClassOther",
    "gxgFedexTrackingNumber",
    "gxguspsTrackingNumber",
    "printConsolidatorLabel",
    "responseOptions",
    "token",
    "customsSendersCopy",
    "noDate",
    "merchantID",
    "printScanBasedPaymentLabel",
    "specialContents",
    "evsOptions",
    "cod3816",
    "emailMiscNotes",
    "estimatedDeliveryDate",
    "ancillaryServiceEndorsement",
    "requesterID",
    "accountID",
    "insuredValue",
    "profileType",
    "addressCleansedHash",
    "fromName",
    "fromCompany",
    "returnAddress1",
    "returnAddress2",
    "returnAddress3",
    "returnAddress4",
    "fromCity",
    "fromState",
    "fromPostalCode",
    "fromZIP4",
    "fromCountry",
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
    "toPostalCode",
    "toZIP4",
    "toDeliveryPoint",
    "toCountry",
    "toCountryCode",
    "toPhone",
    "toEMail",
    "customsCountry1",
    "customsDescription1",
    "customsQuantity1",
    "customsValue1",
    "customsWeight1",
    "customsCountry2",
    "customsDescription2",
    "customsQuantity2",
    "customsValue2",
    "customsWeight2",
    "customsCountry3",
    "customsDescription3",
    "customsQuantity3",
    "customsValue3",
    "customsWeight3",
    "customsCountry4",
    "customsDescription4",
    "customsQuantity4",
    "customsValue4",
    "customsWeight4",
    "customsCountry5",
    "customsDescription5",
    "customsQuantity5",
    "customsValue5",
    "customsWeight5",
    "eelPfc",
    "hfpFacilityName",
    "hfpFacilityAddress1",
    "hfpFacilityCity",
    "hfpFacilityState",
    "hfpFacilityPostalCode",
    "hfpFacilityZIP4",
    "costCenterAlphaNumeric",
    "toCarrierRoute",
    "hazardousMaterial",
    "fromCountryCode"
})
public class LabelRequest
    extends CommonLabelRequestAndPostageRateRequest
{

    @XmlElement(name = "PassPhrase")
    protected String passPhrase;
    @XmlElement(name = "AutomationRate")
    protected String automationRate;
    @XmlElement(name = "Machinable")
    protected String machinable;
    @XmlElement(name = "ServiceLevel")
    protected String serviceLevel;
    @XmlElement(name = "SortType")
    protected String sortType;
    @XmlElement(name = "IncludePostage")
    protected String includePostage;
    @XmlElement(name = "ReplyPostage")
    protected String replyPostage;
    @XmlElement(name = "ShowReturnAddress")
    protected String showReturnAddress;
    @XmlElement(name = "Stealth")
    protected String stealth;
    @XmlElement(name = "ValidateAddress")
    protected String validateAddress;
    @XmlElement(name = "SignatureWaiver")
    protected String signatureWaiver;
    @XmlElement(name = "NoWeekendDelivery")
    protected String noWeekendDelivery;
    @XmlElement(name = "Services")
    protected SpecialServices services;
    @XmlElement(name = "CostCenter")
    protected int costCenter;
    @XmlElement(name = "Value")
    protected float value;
    @XmlElement(name = "CODAmount", defaultValue = "0")
    protected Double codAmount;
    @XmlElement(name = "RegisteredMailValue", defaultValue = "0")
    protected Double registeredMailValue;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "IntegratedFormType")
    protected String integratedFormType;
    @XmlElement(name = "CustomsFormType")
    protected String customsFormType;
    @XmlElement(name = "CustomsFormImageFormat")
    protected String customsFormImageFormat;
    @XmlElement(name = "CustomsFormImageResolution")
    protected String customsFormImageResolution;
    @XmlElement(name = "OriginCountry")
    protected String originCountry;
    @XmlElement(name = "ContentsType")
    protected String contentsType;
    @XmlElement(name = "ContentsExplanation")
    protected String contentsExplanation;
    @XmlElement(name = "NonDeliveryOption")
    protected String nonDeliveryOption;
    @XmlElement(name = "ReferenceID")
    protected String referenceID;
    @XmlElement(name = "ReferenceID2")
    protected String referenceID2;
    @XmlElement(name = "ReferenceID3")
    protected String referenceID3;
    @XmlElement(name = "ReferenceID4")
    protected String referenceID4;
    @XmlElement(name = "PartnerCustomerID")
    protected String partnerCustomerID;
    @XmlElement(name = "PartnerTransactionID")
    protected String partnerTransactionID;
    @XmlElement(name = "BpodClientDunsNumber")
    protected String bpodClientDunsNumber;
    @XmlElement(name = "RubberStamp1")
    protected String rubberStamp1;
    @XmlElement(name = "RubberStamp2")
    protected String rubberStamp2;
    @XmlElement(name = "RubberStamp3")
    protected String rubberStamp3;
    @XmlElement(name = "EntryFacility")
    protected String entryFacility;
    @XmlElement(name = "POZipCode")
    protected String poZipCode;
    @XmlElement(name = "ShipDate")
    protected String shipDate;
    @XmlElement(name = "ShipTime")
    protected String shipTime;
    @XmlElement(name = "CustomsInfo")
    protected CustomsInfo customsInfo;
    @XmlElement(name = "CustomsCertify")
    protected String customsCertify;
    @XmlElement(name = "CustomsSigner")
    protected String customsSigner;
    @XmlElement(name = "HfpEmailAddress")
    protected String hfpEmailAddress;
    @XmlElement(name = "HfpSMS")
    protected String hfpSMS;
    @XmlElement(name = "HfpFacilityID")
    protected String hfpFacilityID;
    @XmlElement(name = "MRSPermitNo")
    protected String mrsPermitNo;
    @XmlElement(name = "MRSPermitCityStateZIP")
    protected String mrsPermitCityStateZIP;
    @XmlElement(name = "MRSPermitFirm")
    protected String mrsPermitFirm;
    @XmlElement(name = "MRSPermitStreet")
    protected String mrsPermitStreet;
    @XmlElement(name = "MRSRMANumber")
    protected String mrsrmaNumber;
    @XmlElement(name = "OpenAndDistributeFacilityType")
    protected String openAndDistributeFacilityType;
    @XmlElement(name = "OpenAndDistributeFacilityName")
    protected String openAndDistributeFacilityName;
    @XmlElement(name = "OpenAndDistributeTray")
    protected String openAndDistributeTray;
    @XmlElement(name = "OpenAndDistributeMailClassEnclosed")
    protected String openAndDistributeMailClassEnclosed;
    @XmlElement(name = "OpenAndDistributeMailClassOther")
    protected String openAndDistributeMailClassOther;
    @XmlElement(name = "GXGFedexTrackingNumber")
    protected String gxgFedexTrackingNumber;
    @XmlElement(name = "GXGUSPSTrackingNumber")
    protected String gxguspsTrackingNumber;
    @XmlElement(name = "PrintConsolidatorLabel")
    protected String printConsolidatorLabel;
    @XmlElement(name = "ResponseOptions")
    protected ResponseOptions responseOptions;
    @XmlElement(name = "Token")
    protected String token;
    @XmlElement(name = "CustomsSendersCopy")
    protected String customsSendersCopy;
    @XmlElement(name = "NoDate")
    protected String noDate;
    @XmlElement(name = "MerchantID")
    protected String merchantID;
    @XmlElement(name = "PrintScanBasedPaymentLabel")
    protected String printScanBasedPaymentLabel;
    @XmlElement(name = "SpecialContents")
    protected String specialContents;
    @XmlElement(name = "eVSOptions")
    protected EVSOptions evsOptions;
    @XmlElement(name = "COD3816")
    protected Cod3816 cod3816;
    @XmlElement(name = "EmailMiscNotes")
    protected String emailMiscNotes;
    @XmlElement(name = "EstimatedDeliveryDate")
    protected String estimatedDeliveryDate;
    @XmlElement(name = "AncillaryServiceEndorsement")
    protected String ancillaryServiceEndorsement;
    @XmlElement(name = "RequesterID")
    protected String requesterID;
    @XmlElement(name = "AccountID")
    protected String accountID;
    @XmlElement(name = "InsuredValue")
    protected String insuredValue;
    @XmlElement(name = "ProfileType")
    protected String profileType;
    @XmlElement(name = "AddressCleansedHash")
    protected String addressCleansedHash;
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
    @XmlElement(name = "FromPostalCode")
    protected String fromPostalCode;
    @XmlElement(name = "FromZIP4")
    protected String fromZIP4;
    @XmlElement(name = "FromCountry")
    protected String fromCountry;
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
    @XmlElement(name = "ToPostalCode")
    protected String toPostalCode;
    @XmlElement(name = "ToZIP4")
    protected String toZIP4;
    @XmlElement(name = "ToDeliveryPoint")
    protected String toDeliveryPoint;
    @XmlElement(name = "ToCountry")
    protected String toCountry;
    @XmlElement(name = "ToCountryCode")
    protected String toCountryCode;
    @XmlElement(name = "ToPhone")
    protected String toPhone;
    @XmlElement(name = "ToEMail")
    protected String toEMail;
    @XmlElement(name = "CustomsCountry1")
    protected String customsCountry1;
    @XmlElement(name = "CustomsDescription1")
    protected String customsDescription1;
    @XmlElement(name = "CustomsQuantity1")
    @XmlSchemaType(name = "unsignedInt")
    protected Long customsQuantity1;
    @XmlElement(name = "CustomsValue1")
    protected Float customsValue1;
    @XmlElement(name = "CustomsWeight1")
    @XmlSchemaType(name = "unsignedInt")
    protected Long customsWeight1;
    @XmlElement(name = "CustomsCountry2")
    protected String customsCountry2;
    @XmlElement(name = "CustomsDescription2")
    protected String customsDescription2;
    @XmlElement(name = "CustomsQuantity2")
    @XmlSchemaType(name = "unsignedInt")
    protected Long customsQuantity2;
    @XmlElement(name = "CustomsValue2")
    protected Float customsValue2;
    @XmlElement(name = "CustomsWeight2")
    @XmlSchemaType(name = "unsignedInt")
    protected Long customsWeight2;
    @XmlElement(name = "CustomsCountry3")
    protected String customsCountry3;
    @XmlElement(name = "CustomsDescription3")
    protected String customsDescription3;
    @XmlElement(name = "CustomsQuantity3")
    @XmlSchemaType(name = "unsignedInt")
    protected Long customsQuantity3;
    @XmlElement(name = "CustomsValue3")
    protected Float customsValue3;
    @XmlElement(name = "CustomsWeight3")
    @XmlSchemaType(name = "unsignedInt")
    protected Long customsWeight3;
    @XmlElement(name = "CustomsCountry4")
    protected String customsCountry4;
    @XmlElement(name = "CustomsDescription4")
    protected String customsDescription4;
    @XmlElement(name = "CustomsQuantity4")
    @XmlSchemaType(name = "unsignedInt")
    protected Long customsQuantity4;
    @XmlElement(name = "CustomsValue4")
    protected Float customsValue4;
    @XmlElement(name = "CustomsWeight4")
    @XmlSchemaType(name = "unsignedInt")
    protected Long customsWeight4;
    @XmlElement(name = "CustomsCountry5")
    protected String customsCountry5;
    @XmlElement(name = "CustomsDescription5")
    protected String customsDescription5;
    @XmlElement(name = "CustomsQuantity5")
    @XmlSchemaType(name = "unsignedInt")
    protected Long customsQuantity5;
    @XmlElement(name = "CustomsValue5")
    protected Float customsValue5;
    @XmlElement(name = "CustomsWeight5")
    @XmlSchemaType(name = "unsignedInt")
    protected Long customsWeight5;
    @XmlElement(name = "EelPfc")
    protected String eelPfc;
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
    @XmlElement(name = "CostCenterAlphaNumeric")
    protected String costCenterAlphaNumeric;
    @XmlElement(name = "ToCarrierRoute")
    protected String toCarrierRoute;
    @XmlElement(name = "HazardousMaterial")
    protected HazMat hazardousMaterial;
    @XmlElement(name = "FromCountryCode")
    protected String fromCountryCode;
    @XmlAttribute(name = "Test")
    protected String test;
    @XmlAttribute(name = "LabelType")
    protected String labelType;
    @XmlAttribute(name = "LabelSubtype")
    protected String labelSubtype;
    @XmlAttribute(name = "LabelSize")
    protected String labelSize;
    @XmlAttribute(name = "ImageFormat")
    protected String imageFormat;
    @XmlAttribute(name = "ImageResolution")
    protected String imageResolution;
    @XmlAttribute(name = "ImageRotation")
    protected String imageRotation;
    @XmlAttribute(name = "LabelTemplate")
    protected String labelTemplate;

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
     * Gets the value of the includePostage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludePostage() {
        return includePostage;
    }

    /**
     * Sets the value of the includePostage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludePostage(String value) {
        this.includePostage = value;
    }

    /**
     * Gets the value of the replyPostage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyPostage() {
        return replyPostage;
    }

    /**
     * Sets the value of the replyPostage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyPostage(String value) {
        this.replyPostage = value;
    }

    /**
     * Gets the value of the showReturnAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowReturnAddress() {
        return showReturnAddress;
    }

    /**
     * Sets the value of the showReturnAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowReturnAddress(String value) {
        this.showReturnAddress = value;
    }

    /**
     * Gets the value of the stealth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStealth() {
        return stealth;
    }

    /**
     * Sets the value of the stealth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStealth(String value) {
        this.stealth = value;
    }

    /**
     * Gets the value of the validateAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidateAddress() {
        return validateAddress;
    }

    /**
     * Sets the value of the validateAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidateAddress(String value) {
        this.validateAddress = value;
    }

    /**
     * Gets the value of the signatureWaiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureWaiver() {
        return signatureWaiver;
    }

    /**
     * Sets the value of the signatureWaiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureWaiver(String value) {
        this.signatureWaiver = value;
    }

    /**
     * Gets the value of the noWeekendDelivery property.
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
     * Sets the value of the noWeekendDelivery property.
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the integratedFormType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegratedFormType() {
        return integratedFormType;
    }

    /**
     * Sets the value of the integratedFormType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegratedFormType(String value) {
        this.integratedFormType = value;
    }

    /**
     * Gets the value of the customsFormType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsFormType() {
        return customsFormType;
    }

    /**
     * Sets the value of the customsFormType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsFormType(String value) {
        this.customsFormType = value;
    }

    /**
     * Gets the value of the customsFormImageFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsFormImageFormat() {
        return customsFormImageFormat;
    }

    /**
     * Sets the value of the customsFormImageFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsFormImageFormat(String value) {
        this.customsFormImageFormat = value;
    }

    /**
     * Gets the value of the customsFormImageResolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsFormImageResolution() {
        return customsFormImageResolution;
    }

    /**
     * Sets the value of the customsFormImageResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsFormImageResolution(String value) {
        this.customsFormImageResolution = value;
    }

    /**
     * Gets the value of the originCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCountry() {
        return originCountry;
    }

    /**
     * Sets the value of the originCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCountry(String value) {
        this.originCountry = value;
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
     * Gets the value of the contentsExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentsExplanation() {
        return contentsExplanation;
    }

    /**
     * Sets the value of the contentsExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentsExplanation(String value) {
        this.contentsExplanation = value;
    }

    /**
     * Gets the value of the nonDeliveryOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonDeliveryOption() {
        return nonDeliveryOption;
    }

    /**
     * Sets the value of the nonDeliveryOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonDeliveryOption(String value) {
        this.nonDeliveryOption = value;
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
     * Gets the value of the partnerCustomerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerCustomerID() {
        return partnerCustomerID;
    }

    /**
     * Sets the value of the partnerCustomerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerCustomerID(String value) {
        this.partnerCustomerID = value;
    }

    /**
     * Gets the value of the partnerTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerTransactionID() {
        return partnerTransactionID;
    }

    /**
     * Sets the value of the partnerTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerTransactionID(String value) {
        this.partnerTransactionID = value;
    }

    /**
     * Gets the value of the bpodClientDunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpodClientDunsNumber() {
        return bpodClientDunsNumber;
    }

    /**
     * Sets the value of the bpodClientDunsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpodClientDunsNumber(String value) {
        this.bpodClientDunsNumber = value;
    }

    /**
     * Gets the value of the rubberStamp1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRubberStamp1() {
        return rubberStamp1;
    }

    /**
     * Sets the value of the rubberStamp1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRubberStamp1(String value) {
        this.rubberStamp1 = value;
    }

    /**
     * Gets the value of the rubberStamp2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRubberStamp2() {
        return rubberStamp2;
    }

    /**
     * Sets the value of the rubberStamp2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRubberStamp2(String value) {
        this.rubberStamp2 = value;
    }

    /**
     * Gets the value of the rubberStamp3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRubberStamp3() {
        return rubberStamp3;
    }

    /**
     * Sets the value of the rubberStamp3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRubberStamp3(String value) {
        this.rubberStamp3 = value;
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
     * Gets the value of the customsCertify property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsCertify() {
        return customsCertify;
    }

    /**
     * Sets the value of the customsCertify property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsCertify(String value) {
        this.customsCertify = value;
    }

    /**
     * Gets the value of the customsSigner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsSigner() {
        return customsSigner;
    }

    /**
     * Sets the value of the customsSigner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsSigner(String value) {
        this.customsSigner = value;
    }

    /**
     * Gets the value of the hfpEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHfpEmailAddress() {
        return hfpEmailAddress;
    }

    /**
     * Sets the value of the hfpEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHfpEmailAddress(String value) {
        this.hfpEmailAddress = value;
    }

    /**
     * Gets the value of the hfpSMS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHfpSMS() {
        return hfpSMS;
    }

    /**
     * Sets the value of the hfpSMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHfpSMS(String value) {
        this.hfpSMS = value;
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
     * Gets the value of the mrsPermitNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRSPermitNo() {
        return mrsPermitNo;
    }

    /**
     * Sets the value of the mrsPermitNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRSPermitNo(String value) {
        this.mrsPermitNo = value;
    }

    /**
     * Gets the value of the mrsPermitCityStateZIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRSPermitCityStateZIP() {
        return mrsPermitCityStateZIP;
    }

    /**
     * Sets the value of the mrsPermitCityStateZIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRSPermitCityStateZIP(String value) {
        this.mrsPermitCityStateZIP = value;
    }

    /**
     * Gets the value of the mrsPermitFirm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRSPermitFirm() {
        return mrsPermitFirm;
    }

    /**
     * Sets the value of the mrsPermitFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRSPermitFirm(String value) {
        this.mrsPermitFirm = value;
    }

    /**
     * Gets the value of the mrsPermitStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRSPermitStreet() {
        return mrsPermitStreet;
    }

    /**
     * Sets the value of the mrsPermitStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRSPermitStreet(String value) {
        this.mrsPermitStreet = value;
    }

    /**
     * Gets the value of the mrsrmaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRSRMANumber() {
        return mrsrmaNumber;
    }

    /**
     * Sets the value of the mrsrmaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRSRMANumber(String value) {
        this.mrsrmaNumber = value;
    }

    /**
     * Gets the value of the openAndDistributeFacilityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenAndDistributeFacilityType() {
        return openAndDistributeFacilityType;
    }

    /**
     * Sets the value of the openAndDistributeFacilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenAndDistributeFacilityType(String value) {
        this.openAndDistributeFacilityType = value;
    }

    /**
     * Gets the value of the openAndDistributeFacilityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenAndDistributeFacilityName() {
        return openAndDistributeFacilityName;
    }

    /**
     * Sets the value of the openAndDistributeFacilityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenAndDistributeFacilityName(String value) {
        this.openAndDistributeFacilityName = value;
    }

    /**
     * Gets the value of the openAndDistributeTray property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenAndDistributeTray() {
        return openAndDistributeTray;
    }

    /**
     * Sets the value of the openAndDistributeTray property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenAndDistributeTray(String value) {
        this.openAndDistributeTray = value;
    }

    /**
     * Gets the value of the openAndDistributeMailClassEnclosed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenAndDistributeMailClassEnclosed() {
        return openAndDistributeMailClassEnclosed;
    }

    /**
     * Sets the value of the openAndDistributeMailClassEnclosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenAndDistributeMailClassEnclosed(String value) {
        this.openAndDistributeMailClassEnclosed = value;
    }

    /**
     * Gets the value of the openAndDistributeMailClassOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenAndDistributeMailClassOther() {
        return openAndDistributeMailClassOther;
    }

    /**
     * Sets the value of the openAndDistributeMailClassOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenAndDistributeMailClassOther(String value) {
        this.openAndDistributeMailClassOther = value;
    }

    /**
     * Gets the value of the gxgFedexTrackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGXGFedexTrackingNumber() {
        return gxgFedexTrackingNumber;
    }

    /**
     * Sets the value of the gxgFedexTrackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGXGFedexTrackingNumber(String value) {
        this.gxgFedexTrackingNumber = value;
    }

    /**
     * Gets the value of the gxguspsTrackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGXGUSPSTrackingNumber() {
        return gxguspsTrackingNumber;
    }

    /**
     * Sets the value of the gxguspsTrackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGXGUSPSTrackingNumber(String value) {
        this.gxguspsTrackingNumber = value;
    }

    /**
     * Gets the value of the printConsolidatorLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintConsolidatorLabel() {
        return printConsolidatorLabel;
    }

    /**
     * Sets the value of the printConsolidatorLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintConsolidatorLabel(String value) {
        this.printConsolidatorLabel = value;
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
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the customsSendersCopy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsSendersCopy() {
        return customsSendersCopy;
    }

    /**
     * Sets the value of the customsSendersCopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsSendersCopy(String value) {
        this.customsSendersCopy = value;
    }

    /**
     * Gets the value of the noDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoDate() {
        return noDate;
    }

    /**
     * Sets the value of the noDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoDate(String value) {
        this.noDate = value;
    }

    /**
     * Gets the value of the merchantID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantID() {
        return merchantID;
    }

    /**
     * Sets the value of the merchantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantID(String value) {
        this.merchantID = value;
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
     * Gets the value of the evsOptions property.
     * 
     * @return
     *     possible object is
     *     {@link EVSOptions }
     *     
     */
    public EVSOptions getEVSOptions() {
        return evsOptions;
    }

    /**
     * Sets the value of the evsOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EVSOptions }
     *     
     */
    public void setEVSOptions(EVSOptions value) {
        this.evsOptions = value;
    }

    /**
     * Gets the value of the cod3816 property.
     * 
     * @return
     *     possible object is
     *     {@link Cod3816 }
     *     
     */
    public Cod3816 getCOD3816() {
        return cod3816;
    }

    /**
     * Sets the value of the cod3816 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cod3816 }
     *     
     */
    public void setCOD3816(Cod3816 value) {
        this.cod3816 = value;
    }

    /**
     * Gets the value of the emailMiscNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailMiscNotes() {
        return emailMiscNotes;
    }

    /**
     * Sets the value of the emailMiscNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailMiscNotes(String value) {
        this.emailMiscNotes = value;
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
     * Gets the value of the ancillaryServiceEndorsement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncillaryServiceEndorsement() {
        return ancillaryServiceEndorsement;
    }

    /**
     * Sets the value of the ancillaryServiceEndorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncillaryServiceEndorsement(String value) {
        this.ancillaryServiceEndorsement = value;
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
     * Gets the value of the profileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileType() {
        return profileType;
    }

    /**
     * Sets the value of the profileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileType(String value) {
        this.profileType = value;
    }

    /**
     * Gets the value of the addressCleansedHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCleansedHash() {
        return addressCleansedHash;
    }

    /**
     * Sets the value of the addressCleansedHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCleansedHash(String value) {
        this.addressCleansedHash = value;
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
     * Gets the value of the returnAddress1 property.
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
     * Sets the value of the returnAddress1 property.
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
     * Gets the value of the returnAddress2 property.
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
     * Sets the value of the returnAddress2 property.
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
     * Gets the value of the returnAddress3 property.
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
     * Sets the value of the returnAddress3 property.
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
     * Gets the value of the returnAddress4 property.
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
     * Sets the value of the returnAddress4 property.
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
     * Gets the value of the fromZIP4 property.
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
     * Sets the value of the fromZIP4 property.
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
     * Gets the value of the fromCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCountry() {
        return fromCountry;
    }

    /**
     * Sets the value of the fromCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCountry(String value) {
        this.fromCountry = value;
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
     * Gets the value of the fromEMail property.
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
     * Sets the value of the fromEMail property.
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
     * Gets the value of the toAddress3 property.
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
     * Sets the value of the toAddress3 property.
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
     * Gets the value of the toAddress4 property.
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
     * Sets the value of the toAddress4 property.
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
     * Gets the value of the toZIP4 property.
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
     * Sets the value of the toZIP4 property.
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
     * Gets the value of the toEMail property.
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
     * Sets the value of the toEMail property.
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
     * Gets the value of the customsCountry1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsCountry1() {
        return customsCountry1;
    }

    /**
     * Sets the value of the customsCountry1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsCountry1(String value) {
        this.customsCountry1 = value;
    }

    /**
     * Gets the value of the customsDescription1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsDescription1() {
        return customsDescription1;
    }

    /**
     * Sets the value of the customsDescription1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsDescription1(String value) {
        this.customsDescription1 = value;
    }

    /**
     * Gets the value of the customsQuantity1 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomsQuantity1() {
        return customsQuantity1;
    }

    /**
     * Sets the value of the customsQuantity1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomsQuantity1(Long value) {
        this.customsQuantity1 = value;
    }

    /**
     * Gets the value of the customsValue1 property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCustomsValue1() {
        return customsValue1;
    }

    /**
     * Sets the value of the customsValue1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCustomsValue1(Float value) {
        this.customsValue1 = value;
    }

    /**
     * Gets the value of the customsWeight1 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomsWeight1() {
        return customsWeight1;
    }

    /**
     * Sets the value of the customsWeight1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomsWeight1(Long value) {
        this.customsWeight1 = value;
    }

    /**
     * Gets the value of the customsCountry2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsCountry2() {
        return customsCountry2;
    }

    /**
     * Sets the value of the customsCountry2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsCountry2(String value) {
        this.customsCountry2 = value;
    }

    /**
     * Gets the value of the customsDescription2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsDescription2() {
        return customsDescription2;
    }

    /**
     * Sets the value of the customsDescription2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsDescription2(String value) {
        this.customsDescription2 = value;
    }

    /**
     * Gets the value of the customsQuantity2 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomsQuantity2() {
        return customsQuantity2;
    }

    /**
     * Sets the value of the customsQuantity2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomsQuantity2(Long value) {
        this.customsQuantity2 = value;
    }

    /**
     * Gets the value of the customsValue2 property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCustomsValue2() {
        return customsValue2;
    }

    /**
     * Sets the value of the customsValue2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCustomsValue2(Float value) {
        this.customsValue2 = value;
    }

    /**
     * Gets the value of the customsWeight2 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomsWeight2() {
        return customsWeight2;
    }

    /**
     * Sets the value of the customsWeight2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomsWeight2(Long value) {
        this.customsWeight2 = value;
    }

    /**
     * Gets the value of the customsCountry3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsCountry3() {
        return customsCountry3;
    }

    /**
     * Sets the value of the customsCountry3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsCountry3(String value) {
        this.customsCountry3 = value;
    }

    /**
     * Gets the value of the customsDescription3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsDescription3() {
        return customsDescription3;
    }

    /**
     * Sets the value of the customsDescription3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsDescription3(String value) {
        this.customsDescription3 = value;
    }

    /**
     * Gets the value of the customsQuantity3 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomsQuantity3() {
        return customsQuantity3;
    }

    /**
     * Sets the value of the customsQuantity3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomsQuantity3(Long value) {
        this.customsQuantity3 = value;
    }

    /**
     * Gets the value of the customsValue3 property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCustomsValue3() {
        return customsValue3;
    }

    /**
     * Sets the value of the customsValue3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCustomsValue3(Float value) {
        this.customsValue3 = value;
    }

    /**
     * Gets the value of the customsWeight3 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomsWeight3() {
        return customsWeight3;
    }

    /**
     * Sets the value of the customsWeight3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomsWeight3(Long value) {
        this.customsWeight3 = value;
    }

    /**
     * Gets the value of the customsCountry4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsCountry4() {
        return customsCountry4;
    }

    /**
     * Sets the value of the customsCountry4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsCountry4(String value) {
        this.customsCountry4 = value;
    }

    /**
     * Gets the value of the customsDescription4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsDescription4() {
        return customsDescription4;
    }

    /**
     * Sets the value of the customsDescription4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsDescription4(String value) {
        this.customsDescription4 = value;
    }

    /**
     * Gets the value of the customsQuantity4 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomsQuantity4() {
        return customsQuantity4;
    }

    /**
     * Sets the value of the customsQuantity4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomsQuantity4(Long value) {
        this.customsQuantity4 = value;
    }

    /**
     * Gets the value of the customsValue4 property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCustomsValue4() {
        return customsValue4;
    }

    /**
     * Sets the value of the customsValue4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCustomsValue4(Float value) {
        this.customsValue4 = value;
    }

    /**
     * Gets the value of the customsWeight4 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomsWeight4() {
        return customsWeight4;
    }

    /**
     * Sets the value of the customsWeight4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomsWeight4(Long value) {
        this.customsWeight4 = value;
    }

    /**
     * Gets the value of the customsCountry5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsCountry5() {
        return customsCountry5;
    }

    /**
     * Sets the value of the customsCountry5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsCountry5(String value) {
        this.customsCountry5 = value;
    }

    /**
     * Gets the value of the customsDescription5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsDescription5() {
        return customsDescription5;
    }

    /**
     * Sets the value of the customsDescription5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsDescription5(String value) {
        this.customsDescription5 = value;
    }

    /**
     * Gets the value of the customsQuantity5 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomsQuantity5() {
        return customsQuantity5;
    }

    /**
     * Sets the value of the customsQuantity5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomsQuantity5(Long value) {
        this.customsQuantity5 = value;
    }

    /**
     * Gets the value of the customsValue5 property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCustomsValue5() {
        return customsValue5;
    }

    /**
     * Sets the value of the customsValue5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCustomsValue5(Float value) {
        this.customsValue5 = value;
    }

    /**
     * Gets the value of the customsWeight5 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomsWeight5() {
        return customsWeight5;
    }

    /**
     * Sets the value of the customsWeight5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomsWeight5(Long value) {
        this.customsWeight5 = value;
    }

    /**
     * Gets the value of the eelPfc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEelPfc() {
        return eelPfc;
    }

    /**
     * Sets the value of the eelPfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEelPfc(String value) {
        this.eelPfc = value;
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
     * Gets the value of the hazardousMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link HazMat }
     *     
     */
    public HazMat getHazardousMaterial() {
        return hazardousMaterial;
    }

    /**
     * Sets the value of the hazardousMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazMat }
     *     
     */
    public void setHazardousMaterial(HazMat value) {
        this.hazardousMaterial = value;
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
     * Gets the value of the test property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTest() {
        return test;
    }

    /**
     * Sets the value of the test property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTest(String value) {
        this.test = value;
    }

    /**
     * Gets the value of the labelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelType() {
        return labelType;
    }

    /**
     * Sets the value of the labelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelType(String value) {
        this.labelType = value;
    }

    /**
     * Gets the value of the labelSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelSubtype() {
        return labelSubtype;
    }

    /**
     * Sets the value of the labelSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelSubtype(String value) {
        this.labelSubtype = value;
    }

    /**
     * Gets the value of the labelSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelSize() {
        return labelSize;
    }

    /**
     * Sets the value of the labelSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelSize(String value) {
        this.labelSize = value;
    }

    /**
     * Gets the value of the imageFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageFormat() {
        return imageFormat;
    }

    /**
     * Sets the value of the imageFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageFormat(String value) {
        this.imageFormat = value;
    }

    /**
     * Gets the value of the imageResolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageResolution() {
        return imageResolution;
    }

    /**
     * Sets the value of the imageResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageResolution(String value) {
        this.imageResolution = value;
    }

    /**
     * Gets the value of the imageRotation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageRotation() {
        return imageRotation;
    }

    /**
     * Sets the value of the imageRotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageRotation(String value) {
        this.imageRotation = value;
    }

    /**
     * Gets the value of the labelTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelTemplate() {
        return labelTemplate;
    }

    /**
     * Sets the value of the labelTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelTemplate(String value) {
        this.labelTemplate = value;
    }

}
