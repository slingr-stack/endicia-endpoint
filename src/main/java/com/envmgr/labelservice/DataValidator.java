
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DataValidator complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DataValidator"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataValidator")
@XmlSeeAlso({
    PackagePickupCancelRequest.class,
    SCANRequest.class,
    RefundRequest.class,
    ResetSuspendedAccountRequest.class,
    ChallengeQuestionRequest.class,
    AccountStatusRequest.class,
    UserSignUpRequest.class,
    ValidateAddressInfoRequest.class,
    VoidLabelRequest.class,
    AddCarrierRequest.class,
    RecreditRequest.class,
    DdpRateRequest.class,
    CreateNotificationSettingRequest.class,
    DeleteNotificationSettingRequest.class,
    DeleteBrandingRequest.class,
    GetUrlRequest.class,
    GetNotificationSettingRequest.class,
    UpdateNotificationSettingRequest.class,
    UpdateBrandingRequest.class,
    GetBrandingRequest.class,
    CreateManifestRequest.class,
    DeleteCarrierRequest.class,
    GetExtraServiceRatesRequest.class,
    CreateBrandingRequest.class,
    PackagePickupListRequest.class,
    SetAccountFeatureOptInRequest.class,
    UpdatePaymentInfoRequest.class,
    ChangePassPhraseRequest.class,
    PostageRatesRequest.class,
    CloseAccountRequest.class,
    CreateDhlgmManifestRequest.class,
    PackageStatusRequest.class,
    RetailAccountsRequest.class,
    GetTransactionsListingRequest.class,
    PackagePickupAvailabilityRequest.class,
    PackagePickupRequest.class,
    PhysicalPickupAddress.class,
    CommonLabelRequestAndPostageRateRequest.class,
    Address.class,
    CustomsInfo.class,
    CustomsItem.class,
    AccountCredentials.class,
    CreditCard.class,
    CheckingAccount.class,
    LabelNumberRequest.class
})
public class DataValidator {


}
