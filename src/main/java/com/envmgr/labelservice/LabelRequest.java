
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LabelRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
 *         &lt;element name="FullAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="OutboundTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderDetails" type="{www.envmgr.com/LabelService}OrderDetails" minOccurs="0"/&gt;
 *         &lt;element name="BrandingID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NotificationSettingID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToAddress4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToZIP4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "fullAddress",
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
    "fromCountryCode",
    "outboundTransactionID",
    "orderDetails",
    "brandingID",
    "notificationSettingID",
    "returnToName",
    "returnToCompany",
    "returnToAddress1",
    "returnToAddress2",
    "returnToAddress3",
    "returnToAddress4",
    "returnToCity",
    "returnToState",
    "returnToPostalCode",
    "returnToZIP4",
    "returnToCountryCode",
    "returnToPhone",
    "returnToEMail"
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
    @XmlElement(name = "FullAddress")
    protected String fullAddress;
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
    @XmlElement(name = "OutboundTransactionID")
    protected String outboundTransactionID;
    @XmlElement(name = "OrderDetails")
    protected OrderDetails orderDetails;
    @XmlElement(name = "BrandingID")
    protected String brandingID;
    @XmlElement(name = "NotificationSettingID")
    protected String notificationSettingID;
    @XmlElement(name = "ReturnToName")
    protected String returnToName;
    @XmlElement(name = "ReturnToCompany")
    protected String returnToCompany;
    @XmlElement(name = "ReturnToAddress1")
    protected String returnToAddress1;
    @XmlElement(name = "ReturnToAddress2")
    protected String returnToAddress2;
    @XmlElement(name = "ReturnToAddress3")
    protected String returnToAddress3;
    @XmlElement(name = "ReturnToAddress4")
    protected String returnToAddress4;
    @XmlElement(name = "ReturnToCity")
    protected String returnToCity;
    @XmlElement(name = "ReturnToState")
    protected String returnToState;
    @XmlElement(name = "ReturnToPostalCode")
    protected String returnToPostalCode;
    @XmlElement(name = "ReturnToZIP4")
    protected String returnToZIP4;
    @XmlElement(name = "ReturnToCountryCode")
    protected String returnToCountryCode;
    @XmlElement(name = "ReturnToPhone")
    protected String returnToPhone;
    @XmlElement(name = "ReturnToEMail")
    protected String returnToEMail;
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
     * Obtiene el valor de la propiedad includePostage.
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
     * Define el valor de la propiedad includePostage.
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
     * Obtiene el valor de la propiedad replyPostage.
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
     * Define el valor de la propiedad replyPostage.
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
     * Obtiene el valor de la propiedad showReturnAddress.
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
     * Define el valor de la propiedad showReturnAddress.
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
     * Obtiene el valor de la propiedad stealth.
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
     * Define el valor de la propiedad stealth.
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
     * Obtiene el valor de la propiedad validateAddress.
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
     * Define el valor de la propiedad validateAddress.
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
     * Obtiene el valor de la propiedad signatureWaiver.
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
     * Define el valor de la propiedad signatureWaiver.
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
     * Obtiene el valor de la propiedad description.
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
     * Define el valor de la propiedad description.
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
     * Obtiene el valor de la propiedad integratedFormType.
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
     * Define el valor de la propiedad integratedFormType.
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
     * Obtiene el valor de la propiedad customsFormType.
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
     * Define el valor de la propiedad customsFormType.
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
     * Obtiene el valor de la propiedad customsFormImageFormat.
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
     * Define el valor de la propiedad customsFormImageFormat.
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
     * Obtiene el valor de la propiedad customsFormImageResolution.
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
     * Define el valor de la propiedad customsFormImageResolution.
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
     * Obtiene el valor de la propiedad originCountry.
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
     * Define el valor de la propiedad originCountry.
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
     * Obtiene el valor de la propiedad contentsExplanation.
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
     * Define el valor de la propiedad contentsExplanation.
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
     * Obtiene el valor de la propiedad nonDeliveryOption.
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
     * Define el valor de la propiedad nonDeliveryOption.
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
     * Obtiene el valor de la propiedad partnerCustomerID.
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
     * Define el valor de la propiedad partnerCustomerID.
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
     * Obtiene el valor de la propiedad partnerTransactionID.
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
     * Define el valor de la propiedad partnerTransactionID.
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
     * Obtiene el valor de la propiedad bpodClientDunsNumber.
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
     * Define el valor de la propiedad bpodClientDunsNumber.
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
     * Obtiene el valor de la propiedad rubberStamp1.
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
     * Define el valor de la propiedad rubberStamp1.
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
     * Obtiene el valor de la propiedad rubberStamp2.
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
     * Define el valor de la propiedad rubberStamp2.
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
     * Obtiene el valor de la propiedad rubberStamp3.
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
     * Define el valor de la propiedad rubberStamp3.
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
     * Obtiene el valor de la propiedad customsCertify.
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
     * Define el valor de la propiedad customsCertify.
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
     * Obtiene el valor de la propiedad customsSigner.
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
     * Define el valor de la propiedad customsSigner.
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
     * Obtiene el valor de la propiedad hfpEmailAddress.
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
     * Define el valor de la propiedad hfpEmailAddress.
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
     * Obtiene el valor de la propiedad hfpSMS.
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
     * Define el valor de la propiedad hfpSMS.
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
     * Obtiene el valor de la propiedad mrsPermitNo.
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
     * Define el valor de la propiedad mrsPermitNo.
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
     * Obtiene el valor de la propiedad mrsPermitCityStateZIP.
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
     * Define el valor de la propiedad mrsPermitCityStateZIP.
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
     * Obtiene el valor de la propiedad mrsPermitFirm.
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
     * Define el valor de la propiedad mrsPermitFirm.
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
     * Obtiene el valor de la propiedad mrsPermitStreet.
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
     * Define el valor de la propiedad mrsPermitStreet.
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
     * Obtiene el valor de la propiedad mrsrmaNumber.
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
     * Define el valor de la propiedad mrsrmaNumber.
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
     * Obtiene el valor de la propiedad openAndDistributeFacilityType.
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
     * Define el valor de la propiedad openAndDistributeFacilityType.
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
     * Obtiene el valor de la propiedad openAndDistributeFacilityName.
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
     * Define el valor de la propiedad openAndDistributeFacilityName.
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
     * Obtiene el valor de la propiedad openAndDistributeTray.
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
     * Define el valor de la propiedad openAndDistributeTray.
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
     * Obtiene el valor de la propiedad openAndDistributeMailClassEnclosed.
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
     * Define el valor de la propiedad openAndDistributeMailClassEnclosed.
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
     * Obtiene el valor de la propiedad openAndDistributeMailClassOther.
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
     * Define el valor de la propiedad openAndDistributeMailClassOther.
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
     * Obtiene el valor de la propiedad gxgFedexTrackingNumber.
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
     * Define el valor de la propiedad gxgFedexTrackingNumber.
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
     * Obtiene el valor de la propiedad gxguspsTrackingNumber.
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
     * Define el valor de la propiedad gxguspsTrackingNumber.
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
     * Obtiene el valor de la propiedad printConsolidatorLabel.
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
     * Define el valor de la propiedad printConsolidatorLabel.
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
     * Obtiene el valor de la propiedad token.
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
     * Define el valor de la propiedad token.
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
     * Obtiene el valor de la propiedad customsSendersCopy.
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
     * Define el valor de la propiedad customsSendersCopy.
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
     * Obtiene el valor de la propiedad noDate.
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
     * Define el valor de la propiedad noDate.
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
     * Obtiene el valor de la propiedad merchantID.
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
     * Define el valor de la propiedad merchantID.
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
     * Obtiene el valor de la propiedad evsOptions.
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
     * Define el valor de la propiedad evsOptions.
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
     * Obtiene el valor de la propiedad cod3816.
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
     * Define el valor de la propiedad cod3816.
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
     * Obtiene el valor de la propiedad emailMiscNotes.
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
     * Define el valor de la propiedad emailMiscNotes.
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
     * Obtiene el valor de la propiedad ancillaryServiceEndorsement.
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
     * Define el valor de la propiedad ancillaryServiceEndorsement.
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
     * Obtiene el valor de la propiedad profileType.
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
     * Define el valor de la propiedad profileType.
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
     * Obtiene el valor de la propiedad addressCleansedHash.
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
     * Define el valor de la propiedad addressCleansedHash.
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
     * Obtiene el valor de la propiedad fullAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullAddress() {
        return fullAddress;
    }

    /**
     * Define el valor de la propiedad fullAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullAddress(String value) {
        this.fullAddress = value;
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
     * Obtiene el valor de la propiedad fromCountry.
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
     * Define el valor de la propiedad fromCountry.
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
     * Obtiene el valor de la propiedad customsCountry1.
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
     * Define el valor de la propiedad customsCountry1.
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
     * Obtiene el valor de la propiedad customsDescription1.
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
     * Define el valor de la propiedad customsDescription1.
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
     * Obtiene el valor de la propiedad customsQuantity1.
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
     * Define el valor de la propiedad customsQuantity1.
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
     * Obtiene el valor de la propiedad customsValue1.
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
     * Define el valor de la propiedad customsValue1.
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
     * Obtiene el valor de la propiedad customsWeight1.
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
     * Define el valor de la propiedad customsWeight1.
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
     * Obtiene el valor de la propiedad customsCountry2.
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
     * Define el valor de la propiedad customsCountry2.
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
     * Obtiene el valor de la propiedad customsDescription2.
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
     * Define el valor de la propiedad customsDescription2.
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
     * Obtiene el valor de la propiedad customsQuantity2.
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
     * Define el valor de la propiedad customsQuantity2.
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
     * Obtiene el valor de la propiedad customsValue2.
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
     * Define el valor de la propiedad customsValue2.
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
     * Obtiene el valor de la propiedad customsWeight2.
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
     * Define el valor de la propiedad customsWeight2.
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
     * Obtiene el valor de la propiedad customsCountry3.
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
     * Define el valor de la propiedad customsCountry3.
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
     * Obtiene el valor de la propiedad customsDescription3.
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
     * Define el valor de la propiedad customsDescription3.
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
     * Obtiene el valor de la propiedad customsQuantity3.
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
     * Define el valor de la propiedad customsQuantity3.
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
     * Obtiene el valor de la propiedad customsValue3.
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
     * Define el valor de la propiedad customsValue3.
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
     * Obtiene el valor de la propiedad customsWeight3.
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
     * Define el valor de la propiedad customsWeight3.
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
     * Obtiene el valor de la propiedad customsCountry4.
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
     * Define el valor de la propiedad customsCountry4.
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
     * Obtiene el valor de la propiedad customsDescription4.
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
     * Define el valor de la propiedad customsDescription4.
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
     * Obtiene el valor de la propiedad customsQuantity4.
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
     * Define el valor de la propiedad customsQuantity4.
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
     * Obtiene el valor de la propiedad customsValue4.
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
     * Define el valor de la propiedad customsValue4.
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
     * Obtiene el valor de la propiedad customsWeight4.
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
     * Define el valor de la propiedad customsWeight4.
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
     * Obtiene el valor de la propiedad customsCountry5.
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
     * Define el valor de la propiedad customsCountry5.
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
     * Obtiene el valor de la propiedad customsDescription5.
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
     * Define el valor de la propiedad customsDescription5.
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
     * Obtiene el valor de la propiedad customsQuantity5.
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
     * Define el valor de la propiedad customsQuantity5.
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
     * Obtiene el valor de la propiedad customsValue5.
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
     * Define el valor de la propiedad customsValue5.
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
     * Obtiene el valor de la propiedad customsWeight5.
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
     * Define el valor de la propiedad customsWeight5.
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
     * Obtiene el valor de la propiedad eelPfc.
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
     * Define el valor de la propiedad eelPfc.
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
     * Obtiene el valor de la propiedad hazardousMaterial.
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
     * Define el valor de la propiedad hazardousMaterial.
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
     * Obtiene el valor de la propiedad outboundTransactionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutboundTransactionID() {
        return outboundTransactionID;
    }

    /**
     * Define el valor de la propiedad outboundTransactionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutboundTransactionID(String value) {
        this.outboundTransactionID = value;
    }

    /**
     * Obtiene el valor de la propiedad orderDetails.
     * 
     * @return
     *     possible object is
     *     {@link OrderDetails }
     *     
     */
    public OrderDetails getOrderDetails() {
        return orderDetails;
    }

    /**
     * Define el valor de la propiedad orderDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDetails }
     *     
     */
    public void setOrderDetails(OrderDetails value) {
        this.orderDetails = value;
    }

    /**
     * Obtiene el valor de la propiedad brandingID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandingID() {
        return brandingID;
    }

    /**
     * Define el valor de la propiedad brandingID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandingID(String value) {
        this.brandingID = value;
    }

    /**
     * Obtiene el valor de la propiedad notificationSettingID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationSettingID() {
        return notificationSettingID;
    }

    /**
     * Define el valor de la propiedad notificationSettingID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationSettingID(String value) {
        this.notificationSettingID = value;
    }

    /**
     * Obtiene el valor de la propiedad returnToName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToName() {
        return returnToName;
    }

    /**
     * Define el valor de la propiedad returnToName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToName(String value) {
        this.returnToName = value;
    }

    /**
     * Obtiene el valor de la propiedad returnToCompany.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToCompany() {
        return returnToCompany;
    }

    /**
     * Define el valor de la propiedad returnToCompany.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToCompany(String value) {
        this.returnToCompany = value;
    }

    /**
     * Obtiene el valor de la propiedad returnToAddress1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToAddress1() {
        return returnToAddress1;
    }

    /**
     * Define el valor de la propiedad returnToAddress1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToAddress1(String value) {
        this.returnToAddress1 = value;
    }

    /**
     * Obtiene el valor de la propiedad returnToAddress2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToAddress2() {
        return returnToAddress2;
    }

    /**
     * Define el valor de la propiedad returnToAddress2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToAddress2(String value) {
        this.returnToAddress2 = value;
    }

    /**
     * Obtiene el valor de la propiedad returnToAddress3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToAddress3() {
        return returnToAddress3;
    }

    /**
     * Define el valor de la propiedad returnToAddress3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToAddress3(String value) {
        this.returnToAddress3 = value;
    }

    /**
     * Obtiene el valor de la propiedad returnToAddress4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToAddress4() {
        return returnToAddress4;
    }

    /**
     * Define el valor de la propiedad returnToAddress4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToAddress4(String value) {
        this.returnToAddress4 = value;
    }

    /**
     * Obtiene el valor de la propiedad returnToCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToCity() {
        return returnToCity;
    }

    /**
     * Define el valor de la propiedad returnToCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToCity(String value) {
        this.returnToCity = value;
    }

    /**
     * Obtiene el valor de la propiedad returnToState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToState() {
        return returnToState;
    }

    /**
     * Define el valor de la propiedad returnToState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToState(String value) {
        this.returnToState = value;
    }

    /**
     * Obtiene el valor de la propiedad returnToPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToPostalCode() {
        return returnToPostalCode;
    }

    /**
     * Define el valor de la propiedad returnToPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToPostalCode(String value) {
        this.returnToPostalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad returnToZIP4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToZIP4() {
        return returnToZIP4;
    }

    /**
     * Define el valor de la propiedad returnToZIP4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToZIP4(String value) {
        this.returnToZIP4 = value;
    }

    /**
     * Obtiene el valor de la propiedad returnToCountryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToCountryCode() {
        return returnToCountryCode;
    }

    /**
     * Define el valor de la propiedad returnToCountryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToCountryCode(String value) {
        this.returnToCountryCode = value;
    }

    /**
     * Obtiene el valor de la propiedad returnToPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToPhone() {
        return returnToPhone;
    }

    /**
     * Define el valor de la propiedad returnToPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToPhone(String value) {
        this.returnToPhone = value;
    }

    /**
     * Obtiene el valor de la propiedad returnToEMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToEMail() {
        return returnToEMail;
    }

    /**
     * Define el valor de la propiedad returnToEMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToEMail(String value) {
        this.returnToEMail = value;
    }

    /**
     * Obtiene el valor de la propiedad test.
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
     * Define el valor de la propiedad test.
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
     * Obtiene el valor de la propiedad labelType.
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
     * Define el valor de la propiedad labelType.
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
     * Obtiene el valor de la propiedad labelSubtype.
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
     * Define el valor de la propiedad labelSubtype.
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
     * Obtiene el valor de la propiedad labelSize.
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
     * Define el valor de la propiedad labelSize.
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
     * Obtiene el valor de la propiedad imageFormat.
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
     * Define el valor de la propiedad imageFormat.
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
     * Obtiene el valor de la propiedad imageResolution.
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
     * Define el valor de la propiedad imageResolution.
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
     * Obtiene el valor de la propiedad imageRotation.
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
     * Define el valor de la propiedad imageRotation.
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
     * Obtiene el valor de la propiedad labelTemplate.
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
     * Define el valor de la propiedad labelTemplate.
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
