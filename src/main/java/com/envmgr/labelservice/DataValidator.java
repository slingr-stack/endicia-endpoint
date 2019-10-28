
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataValidator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
    ValidateAddressInfoRequest.class,
    VoidLabelRequest.class,
    RecreditRequest.class,
    DdpRateRequest.class,
    GetExtraServiceRatesRequest.class,
    SetAccountFeatureOptInRequest.class,
    UpdatePaymentInfoRequest.class,
    ChangePassPhraseRequest.class,
    PostageRatesRequest.class,
    CloseAccountRequest.class,
    CreateDhlgmManifestRequest.class,
    DHLeCManifestRequest.class,
    PackageStatusRequest.class,
    RetailAccountsRequest.class,
    UserSignUpRequest.class,
    GetTransactionsListingRequest.class,
    PackagePickupAvailabilityRequest.class,
    PackagePickupRequest.class,
    PackagePickupCancelRequest.class,
    SCANRequest.class,
    RefundRequest.class,
    ResetSuspendedAccountRequest.class,
    ChallengeQuestionRequest.class,
    AccountStatusRequest.class,
    CustomsItem.class,
    CommonLabelRequestAndPostageRateRequest.class,
    LabelNumberRequest.class,
    AccountCredentials.class,
    CreditCard.class,
    CheckingAccount.class,
    PhysicalPickupAddress.class,
    Address.class,
    CustomsInfo.class
})
public class DataValidator {


}
