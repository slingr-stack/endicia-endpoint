package com.envmgr.labelservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2021-06-14T17:58:37.814-03:00
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "www.envmgr.com/LabelService", name = "EwsLabelServiceHttpGet")
@XmlSeeAlso({core.labelnumberservice.ObjectFactory.class, ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface EwsLabelServiceHttpGet {

    @WebMethod(operationName = "ChangePassPhraseXML")
    @WebResult(name = "ChangePassPhraseRequestResponse", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public ChangePassPhraseRequestResponse changePassPhraseXML(
        @WebParam(partName = "changePassPhraseRequestXML", name = "changePassPhraseRequestXML", targetNamespace = "")
        java.lang.String changePassPhraseRequestXML
    );

    @WebMethod(operationName = "CreateNotificationSettingRequestXML")
    @WebResult(name = "CreateNotificationSettingResult", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public CreateNotificationSettingResult createNotificationSettingRequestXML(
        @WebParam(partName = "createNotificationSettingRequestXML", name = "createNotificationSettingRequestXML", targetNamespace = "")
        java.lang.String createNotificationSettingRequestXML
    );

    @WebMethod(operationName = "CreateBrandingXML")
    @WebResult(name = "CreateBrandingResult", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public CreateBrandingResult createBrandingXML(
        @WebParam(partName = "createBrandingRequestXML", name = "createBrandingRequestXML", targetNamespace = "")
        java.lang.String createBrandingRequestXML
    );

    @WebMethod(operationName = "GetPostageLabelXML")
    @WebResult(name = "LabelRequestResponse", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public LabelRequestResponse getPostageLabelXML(
        @WebParam(partName = "labelRequestXML", name = "labelRequestXML", targetNamespace = "")
        java.lang.String labelRequestXML
    );

    @WebMethod(operationName = "UpdatePaymentInformationXML")
    @WebResult(name = "UpdatePaymentInfoResponse", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public UpdatePaymentInfoResponse updatePaymentInformationXML(
        @WebParam(partName = "updatePaymentInformationRequestXML", name = "updatePaymentInformationRequestXML", targetNamespace = "")
        java.lang.String updatePaymentInformationRequestXML
    );

    @WebMethod(operationName = "GetRefundXML")
    @WebResult(name = "RefundResponse", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public RefundResponse getRefundXML(
        @WebParam(partName = "refundRequestXML", name = "refundRequestXML", targetNamespace = "")
        java.lang.String refundRequestXML
    );

    @WebMethod(operationName = "GetPicNumberXml")
    @WebResult(name = "LabelNumberResponse", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public LabelNumberResponse getPicNumberXml(
        @WebParam(partName = "picNumberRequestXml", name = "picNumberRequestXml", targetNamespace = "")
        java.lang.String picNumberRequestXml
    );

    @WebMethod(operationName = "GetExtraServiceRatesXML")
    @WebResult(name = "GetExtraServiceRateResponse", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public GetExtraServiceRateResponse getExtraServiceRatesXML(
        @WebParam(partName = "getExtraServiceRatesRequestXML", name = "getExtraServiceRatesRequestXML", targetNamespace = "")
        java.lang.String getExtraServiceRatesRequestXML
    );

    @WebMethod(operationName = "CreateDhlgmManifestXML")
    @WebResult(name = "DhlgmManifestResponse", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public DhlgmManifestResponse createDhlgmManifestXML(
        @WebParam(partName = "createDhlgmManifestRequestXML", name = "createDhlgmManifestRequestXML", targetNamespace = "")
        java.lang.String createDhlgmManifestRequestXML
    );

    @WebMethod(operationName = "CalculatePostageRatesXML")
    @WebResult(name = "PostageRatesResponse", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public PostageRatesResponse calculatePostageRatesXML(
        @WebParam(partName = "postageRatesRequestXML", name = "postageRatesRequestXML", targetNamespace = "")
        java.lang.String postageRatesRequestXML
    );

    @WebMethod(operationName = "GetUserSignUpXML")
    @WebResult(name = "UserSignUpResponse", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public UserSignUpResponse getUserSignUpXML(
        @WebParam(partName = "userSignUpRequestXML", name = "userSignUpRequestXML", targetNamespace = "")
        java.lang.String userSignUpRequestXML
    );

    @WebMethod(operationName = "SetAccountFeatureOptInXML")
    @WebResult(name = "SetAccountFeatureOptInResult", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public SetAccountFeatureOptInResult setAccountFeatureOptInXML(
        @WebParam(partName = "setAccountFeatureOptInRequestXml", name = "setAccountFeatureOptInRequestXml", targetNamespace = "")
        java.lang.String setAccountFeatureOptInRequestXml
    );

    @WebMethod(operationName = "DeleteNotificationSettingXML")
    @WebResult(name = "DeleteNotificationSettingResult", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public DeleteNotificationSettingResult deleteNotificationSettingXML(
        @WebParam(partName = "deleteNotificationSettingRequestXML", name = "deleteNotificationSettingRequestXML", targetNamespace = "")
        java.lang.String deleteNotificationSettingRequestXML
    );

    @WebMethod(operationName = "GetPostageRateTableXML")
    @WebResult(name = "PostageRateTableResponse", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public PostageRateTableResponse getPostageRateTableXML(
        @WebParam(partName = "postageRateRequestXML", name = "postageRateRequestXML", targetNamespace = "")
        java.lang.String postageRateRequestXML
    );

    @WebMethod(operationName = "GetVersionXML")
    @WebResult(name = "GetVersionResults", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public GetVersionResults getVersionXML();

    @WebMethod(operationName = "CalculatePostageRateXML")
    @WebResult(name = "PostageRateResponse", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public PostageRateResponse calculatePostageRateXML(
        @WebParam(partName = "postageRateRequestXML", name = "postageRateRequestXML", targetNamespace = "")
        java.lang.String postageRateRequestXML
    );

    @WebMethod(operationName = "GetRetailAccountsXML")
    @WebResult(name = "RetailAccountsResponse", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public RetailAccountsResponse getRetailAccountsXML(
        @WebParam(partName = "retailAccountsRequestXML", name = "retailAccountsRequestXML", targetNamespace = "")
        java.lang.String retailAccountsRequestXML
    );

    @WebMethod(operationName = "GetVersion")
    @WebResult(name = "GetVersionResults", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public GetVersionResults getVersion();

    @WebMethod(operationName = "GetUrlXML")
    @WebResult(name = "GetUrlResult", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public GetUrlResult getUrlXML(
        @WebParam(partName = "getUrlRequestXML", name = "getUrlRequestXML", targetNamespace = "")
        java.lang.String getUrlRequestXML
    );

    @WebMethod(operationName = "GetPackagePickupListXML")
    @WebResult(name = "PackagePickupListResponse", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public PackagePickupListResponse getPackagePickupListXML(
        @WebParam(partName = "packagePickupListRequestXML", name = "packagePickupListRequestXML", targetNamespace = "")
        java.lang.String packagePickupListRequestXML
    );

    @WebMethod(operationName = "GetChallengeQuestionXML")
    @WebResult(name = "ChallengeQuestionResponse", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public ChallengeQuestionResponse getChallengeQuestionXML(
        @WebParam(partName = "challengeQuestionRequestXML", name = "challengeQuestionRequestXML", targetNamespace = "")
        java.lang.String challengeQuestionRequestXML
    );

    @WebMethod(operationName = "UpdateNotificationSettingXML")
    @WebResult(name = "UpdateNotificationSettingResult", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public UpdateNotificationSettingResult updateNotificationSettingXML(
        @WebParam(partName = "updateNotificationSettingRequestXML", name = "updateNotificationSettingRequestXML", targetNamespace = "")
        java.lang.String updateNotificationSettingRequestXML
    );

    @WebMethod(operationName = "StatusRequestXML")
    @WebResult(name = "PackageStatusResponse", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public PackageStatusResponse statusRequestXML(
        @WebParam(partName = "packageStatusRequestXML", name = "packageStatusRequestXML", targetNamespace = "")
        java.lang.String packageStatusRequestXML
    );

    @WebMethod(operationName = "UpdateBrandingXML")
    @WebResult(name = "UpdateBrandingResult", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public UpdateBrandingResult updateBrandingXML(
        @WebParam(partName = "updateBrandingRequestXML", name = "updateBrandingRequestXML", targetNamespace = "")
        java.lang.String updateBrandingRequestXML
    );

    @WebMethod(operationName = "CalculateDdpRateXML")
    @WebResult(name = "DdpRateResponse", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public DdpRateResponse calculateDdpRateXML(
        @WebParam(partName = "ddpRateRequest", name = "ddpRateRequest", targetNamespace = "")
        java.lang.String ddpRateRequest
    );

    @WebMethod(operationName = "GetBrandingXML")
    @WebResult(name = "GetBrandingResult", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public GetBrandingResult getBrandingXML(
        @WebParam(partName = "getBrandingRequestXML", name = "getBrandingRequestXML", targetNamespace = "")
        java.lang.String getBrandingRequestXML
    );

    @WebMethod(operationName = "CloseAccountXML")
    @WebResult(name = "SetPendingCloseAccountResponse", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public SetPendingCloseAccountResponse closeAccountXML(
        @WebParam(partName = "closeAccountRequestXML", name = "closeAccountRequestXML", targetNamespace = "")
        java.lang.String closeAccountRequestXML
    );

    @WebMethod(operationName = "GetAccountStatusXML")
    @WebResult(name = "AccountStatusResponse", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public AccountStatusResponse getAccountStatusXML(
        @WebParam(partName = "accountStatusRequestXML", name = "accountStatusRequestXML", targetNamespace = "")
        java.lang.String accountStatusRequestXML
    );

    @WebMethod(operationName = "GetTransactionsListingXML")
    @WebResult(name = "TransactionsListingResponse", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public TransactionsListingResponse getTransactionsListingXML(
        @WebParam(partName = "transactionsRequestXML", name = "transactionsRequestXML", targetNamespace = "")
        java.lang.String transactionsRequestXML
    );

    @WebMethod(operationName = "GetPackagePickupChangeXML")
    @WebResult(name = "PackagePickupChangeResponse", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public PackagePickupChangeResponse getPackagePickupChangeXML(
        @WebParam(partName = "packagePickupChangeRequestXML", name = "packagePickupChangeRequestXML", targetNamespace = "")
        java.lang.String packagePickupChangeRequestXML
    );

    @WebMethod(operationName = "VoideVSLabelXML")
    @WebResult(name = "VoidLabelResponse", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public VoidLabelResponse voideVSLabelXML(
        @WebParam(partName = "voidLabelRequestXML", name = "voidLabelRequestXML", targetNamespace = "")
        java.lang.String voidLabelRequestXML
    );

    @WebMethod(operationName = "GetPackagePickupCancelXML")
    @WebResult(name = "PackagePickupCancelResponse", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public PackagePickupCancelResponse getPackagePickupCancelXML(
        @WebParam(partName = "packagePickupCancelRequestXML", name = "packagePickupCancelRequestXML", targetNamespace = "")
        java.lang.String packagePickupCancelRequestXML
    );

    @WebMethod(operationName = "GetSCANXML")
    @WebResult(name = "SCANResponse", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public SCANResponse getSCANXML(
        @WebParam(partName = "scanRequestXML", name = "scanRequestXML", targetNamespace = "")
        java.lang.String scanRequestXML
    );

    @WebMethod(operationName = "GetPackagePickupAvailabilityXML")
    @WebResult(name = "PackagePickupAvailabilityResponse", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public PackagePickupAvailabilityResponse getPackagePickupAvailabilityXML(
        @WebParam(partName = "packagePickupAvailabilityRequestXML", name = "packagePickupAvailabilityRequestXML", targetNamespace = "")
        java.lang.String packagePickupAvailabilityRequestXML
    );

    @WebMethod(operationName = "GetNotificationSettingXML")
    @WebResult(name = "GetNotificationSettingResult", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public GetNotificationSettingResult getNotificationSettingXML(
        @WebParam(partName = "getNotificationSettingRequestXML", name = "getNotificationSettingRequestXML", targetNamespace = "")
        java.lang.String getNotificationSettingRequestXML
    );

    @WebMethod(operationName = "GetPackagePickupXML")
    @WebResult(name = "PackagePickupResponse", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public PackagePickupResponse getPackagePickupXML(
        @WebParam(partName = "packagePickupRequestXML", name = "packagePickupRequestXML", targetNamespace = "")
        java.lang.String packagePickupRequestXML
    );

    @WebMethod(operationName = "ValidateAddressXML")
    @WebResult(name = "ValidateAddressInfoResponse", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public ValidateAddressInfoResponse validateAddressXML(
        @WebParam(partName = "validateAddressRequestXML", name = "validateAddressRequestXML", targetNamespace = "")
        java.lang.String validateAddressRequestXML
    );

    @WebMethod(operationName = "DeleteBrandingXML")
    @WebResult(name = "DeleteBrandingResult", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public DeleteBrandingResult deleteBrandingXML(
        @WebParam(partName = "deleteBrandingRequestXML", name = "deleteBrandingRequestXML", targetNamespace = "")
        java.lang.String deleteBrandingRequestXML
    );

    @WebMethod(operationName = "ResetSuspendedAccountXML")
    @WebResult(name = "ResetSuspendedAccountRequestResponse", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public ResetSuspendedAccountRequestResponse resetSuspendedAccountXML(
        @WebParam(partName = "resetSuspendedAccountRequestXML", name = "resetSuspendedAccountRequestXML", targetNamespace = "")
        java.lang.String resetSuspendedAccountRequestXML
    );

    @WebMethod(operationName = "BuyPostageXML")
    @WebResult(name = "RecreditRequestResponse", targetNamespace = "www.envmgr.com/LabelService", partName = "Body")
    public RecreditRequestResponse buyPostageXML(
        @WebParam(partName = "recreditRequestXML", name = "recreditRequestXML", targetNamespace = "")
        java.lang.String recreditRequestXML
    );
}
