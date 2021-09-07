
package com.envmgr.labelservice;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.envmgr.labelservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PackagePickupCancelResponse_QNAME = new QName("www.envmgr.com/LabelService", "PackagePickupCancelResponse");
    private final static QName _PostageRateTableResponse_QNAME = new QName("www.envmgr.com/LabelService", "PostageRateTableResponse");
    private final static QName _SCANResponse_QNAME = new QName("www.envmgr.com/LabelService", "SCANResponse");
    private final static QName _RefundResponse_QNAME = new QName("www.envmgr.com/LabelService", "RefundResponse");
    private final static QName _ResetSuspendedAccountRequestResponse_QNAME = new QName("www.envmgr.com/LabelService", "ResetSuspendedAccountRequestResponse");
    private final static QName _ChallengeQuestionResponse_QNAME = new QName("www.envmgr.com/LabelService", "ChallengeQuestionResponse");
    private final static QName _AccountStatusResponse_QNAME = new QName("www.envmgr.com/LabelService", "AccountStatusResponse");
    private final static QName _LabelRequestResponse_QNAME = new QName("www.envmgr.com/LabelService", "LabelRequestResponse");
    private final static QName _GetVersionResults_QNAME = new QName("www.envmgr.com/LabelService", "GetVersionResults");
    private final static QName _UserSignUpResponse_QNAME = new QName("www.envmgr.com/LabelService", "UserSignUpResponse");
    private final static QName _ValidateAddressInfoResponse_QNAME = new QName("www.envmgr.com/LabelService", "ValidateAddressInfoResponse");
    private final static QName _VoidLabelResponse_QNAME = new QName("www.envmgr.com/LabelService", "VoidLabelResponse");
    private final static QName _RecreditRequestResponse_QNAME = new QName("www.envmgr.com/LabelService", "RecreditRequestResponse");
    private final static QName _DdpRateResponse_QNAME = new QName("www.envmgr.com/LabelService", "DdpRateResponse");
    private final static QName _PostageRateResponse_QNAME = new QName("www.envmgr.com/LabelService", "PostageRateResponse");
    private final static QName _CreateNotificationSettingResult_QNAME = new QName("www.envmgr.com/LabelService", "CreateNotificationSettingResult");
    private final static QName _CreateShipmentNotificationResult_QNAME = new QName("www.envmgr.com/LabelService", "CreateShipmentNotificationResult");
    private final static QName _DeleteNotificationSettingResult_QNAME = new QName("www.envmgr.com/LabelService", "DeleteNotificationSettingResult");
    private final static QName _DeleteBrandingResult_QNAME = new QName("www.envmgr.com/LabelService", "DeleteBrandingResult");
    private final static QName _GetUrlResult_QNAME = new QName("www.envmgr.com/LabelService", "GetUrlResult");
    private final static QName _GetNotificationSettingResult_QNAME = new QName("www.envmgr.com/LabelService", "GetNotificationSettingResult");
    private final static QName _UpdateNotificationSettingResult_QNAME = new QName("www.envmgr.com/LabelService", "UpdateNotificationSettingResult");
    private final static QName _UpdateBrandingResult_QNAME = new QName("www.envmgr.com/LabelService", "UpdateBrandingResult");
    private final static QName _GetBrandingResult_QNAME = new QName("www.envmgr.com/LabelService", "GetBrandingResult");
    private final static QName _GetExtraServiceRateResponse_QNAME = new QName("www.envmgr.com/LabelService", "GetExtraServiceRateResponse");
    private final static QName _LabelNumberResponse_QNAME = new QName("www.envmgr.com/LabelService", "LabelNumberResponse");
    private final static QName _CreateBrandingResult_QNAME = new QName("www.envmgr.com/LabelService", "CreateBrandingResult");
    private final static QName _PackagePickupListResponse_QNAME = new QName("www.envmgr.com/LabelService", "PackagePickupListResponse");
    private final static QName _SetAccountFeatureOptInResult_QNAME = new QName("www.envmgr.com/LabelService", "SetAccountFeatureOptInResult");
    private final static QName _UpdatePaymentInfoResponse_QNAME = new QName("www.envmgr.com/LabelService", "UpdatePaymentInfoResponse");
    private final static QName _ChangePassPhraseRequestResponse_QNAME = new QName("www.envmgr.com/LabelService", "ChangePassPhraseRequestResponse");
    private final static QName _PostageRatesResponse_QNAME = new QName("www.envmgr.com/LabelService", "PostageRatesResponse");
    private final static QName _SetPendingCloseAccountResponse_QNAME = new QName("www.envmgr.com/LabelService", "SetPendingCloseAccountResponse");
    private final static QName _DhlgmManifestResponse_QNAME = new QName("www.envmgr.com/LabelService", "DhlgmManifestResponse");
    private final static QName _PackageStatusResponse_QNAME = new QName("www.envmgr.com/LabelService", "PackageStatusResponse");
    private final static QName _RetailAccountsResponse_QNAME = new QName("www.envmgr.com/LabelService", "RetailAccountsResponse");
    private final static QName _TransactionsListingResponse_QNAME = new QName("www.envmgr.com/LabelService", "TransactionsListingResponse");
    private final static QName _PackagePickupChangeResponse_QNAME = new QName("www.envmgr.com/LabelService", "PackagePickupChangeResponse");
    private final static QName _PackagePickupAvailabilityResponse_QNAME = new QName("www.envmgr.com/LabelService", "PackagePickupAvailabilityResponse");
    private final static QName _PackagePickupResponse_QNAME = new QName("www.envmgr.com/LabelService", "PackagePickupResponse");
    private final static QName _FeesPayOnUse_QNAME = new QName("www.envmgr.com/LabelService", "PayOnUse");
    private final static QName _FeesPayOnUseReturn_QNAME = new QName("www.envmgr.com/LabelService", "PayOnUseReturn");
    private final static QName _FeesDeliveredDutyPaid_QNAME = new QName("www.envmgr.com/LabelService", "DeliveredDutyPaid");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.envmgr.labelservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPackagePickupCancel }
     * 
     */
    public GetPackagePickupCancel createGetPackagePickupCancel() {
        return new GetPackagePickupCancel();
    }

    /**
     * Create an instance of {@link PackagePickupCancelRequest }
     * 
     */
    public PackagePickupCancelRequest createPackagePickupCancelRequest() {
        return new PackagePickupCancelRequest();
    }

    /**
     * Create an instance of {@link GetPackagePickupCancelResponse }
     * 
     */
    public GetPackagePickupCancelResponse createGetPackagePickupCancelResponse() {
        return new GetPackagePickupCancelResponse();
    }

    /**
     * Create an instance of {@link PackagePickupCancelResponse }
     * 
     */
    public PackagePickupCancelResponse createPackagePickupCancelResponse() {
        return new PackagePickupCancelResponse();
    }

    /**
     * Create an instance of {@link GetPackagePickupCancelXML }
     * 
     */
    public GetPackagePickupCancelXML createGetPackagePickupCancelXML() {
        return new GetPackagePickupCancelXML();
    }

    /**
     * Create an instance of {@link GetPackagePickupCancelXMLResponse }
     * 
     */
    public GetPackagePickupCancelXMLResponse createGetPackagePickupCancelXMLResponse() {
        return new GetPackagePickupCancelXMLResponse();
    }

    /**
     * Create an instance of {@link GetPostageRateTable }
     * 
     */
    public GetPostageRateTable createGetPostageRateTable() {
        return new GetPostageRateTable();
    }

    /**
     * Create an instance of {@link PostageRateRequest }
     * 
     */
    public PostageRateRequest createPostageRateRequest() {
        return new PostageRateRequest();
    }

    /**
     * Create an instance of {@link GetPostageRateTableResponse }
     * 
     */
    public GetPostageRateTableResponse createGetPostageRateTableResponse() {
        return new GetPostageRateTableResponse();
    }

    /**
     * Create an instance of {@link PostageRateTableResponse }
     * 
     */
    public PostageRateTableResponse createPostageRateTableResponse() {
        return new PostageRateTableResponse();
    }

    /**
     * Create an instance of {@link GetPostageRateTableXML }
     * 
     */
    public GetPostageRateTableXML createGetPostageRateTableXML() {
        return new GetPostageRateTableXML();
    }

    /**
     * Create an instance of {@link GetPostageRateTableXMLResponse }
     * 
     */
    public GetPostageRateTableXMLResponse createGetPostageRateTableXMLResponse() {
        return new GetPostageRateTableXMLResponse();
    }

    /**
     * Create an instance of {@link GetSCAN }
     * 
     */
    public GetSCAN createGetSCAN() {
        return new GetSCAN();
    }

    /**
     * Create an instance of {@link SCANRequest }
     * 
     */
    public SCANRequest createSCANRequest() {
        return new SCANRequest();
    }

    /**
     * Create an instance of {@link GetSCANResponse }
     * 
     */
    public GetSCANResponse createGetSCANResponse() {
        return new GetSCANResponse();
    }

    /**
     * Create an instance of {@link SCANResponse }
     * 
     */
    public SCANResponse createSCANResponse() {
        return new SCANResponse();
    }

    /**
     * Create an instance of {@link GetSCANXML }
     * 
     */
    public GetSCANXML createGetSCANXML() {
        return new GetSCANXML();
    }

    /**
     * Create an instance of {@link GetSCANXMLResponse }
     * 
     */
    public GetSCANXMLResponse createGetSCANXMLResponse() {
        return new GetSCANXMLResponse();
    }

    /**
     * Create an instance of {@link GetRefund }
     * 
     */
    public GetRefund createGetRefund() {
        return new GetRefund();
    }

    /**
     * Create an instance of {@link RefundRequest }
     * 
     */
    public RefundRequest createRefundRequest() {
        return new RefundRequest();
    }

    /**
     * Create an instance of {@link GetRefundResponse }
     * 
     */
    public GetRefundResponse createGetRefundResponse() {
        return new GetRefundResponse();
    }

    /**
     * Create an instance of {@link RefundResponse }
     * 
     */
    public RefundResponse createRefundResponse() {
        return new RefundResponse();
    }

    /**
     * Create an instance of {@link GetRefundXML }
     * 
     */
    public GetRefundXML createGetRefundXML() {
        return new GetRefundXML();
    }

    /**
     * Create an instance of {@link GetRefundXMLResponse }
     * 
     */
    public GetRefundXMLResponse createGetRefundXMLResponse() {
        return new GetRefundXMLResponse();
    }

    /**
     * Create an instance of {@link ResetSuspendedAccount }
     * 
     */
    public ResetSuspendedAccount createResetSuspendedAccount() {
        return new ResetSuspendedAccount();
    }

    /**
     * Create an instance of {@link ResetSuspendedAccountRequest }
     * 
     */
    public ResetSuspendedAccountRequest createResetSuspendedAccountRequest() {
        return new ResetSuspendedAccountRequest();
    }

    /**
     * Create an instance of {@link ResetSuspendedAccountResponse }
     * 
     */
    public ResetSuspendedAccountResponse createResetSuspendedAccountResponse() {
        return new ResetSuspendedAccountResponse();
    }

    /**
     * Create an instance of {@link ResetSuspendedAccountRequestResponse }
     * 
     */
    public ResetSuspendedAccountRequestResponse createResetSuspendedAccountRequestResponse() {
        return new ResetSuspendedAccountRequestResponse();
    }

    /**
     * Create an instance of {@link ResetSuspendedAccountXML }
     * 
     */
    public ResetSuspendedAccountXML createResetSuspendedAccountXML() {
        return new ResetSuspendedAccountXML();
    }

    /**
     * Create an instance of {@link ResetSuspendedAccountXMLResponse }
     * 
     */
    public ResetSuspendedAccountXMLResponse createResetSuspendedAccountXMLResponse() {
        return new ResetSuspendedAccountXMLResponse();
    }

    /**
     * Create an instance of {@link GetChallengeQuestion }
     * 
     */
    public GetChallengeQuestion createGetChallengeQuestion() {
        return new GetChallengeQuestion();
    }

    /**
     * Create an instance of {@link ChallengeQuestionRequest }
     * 
     */
    public ChallengeQuestionRequest createChallengeQuestionRequest() {
        return new ChallengeQuestionRequest();
    }

    /**
     * Create an instance of {@link GetChallengeQuestionResponse }
     * 
     */
    public GetChallengeQuestionResponse createGetChallengeQuestionResponse() {
        return new GetChallengeQuestionResponse();
    }

    /**
     * Create an instance of {@link ChallengeQuestionResponse }
     * 
     */
    public ChallengeQuestionResponse createChallengeQuestionResponse() {
        return new ChallengeQuestionResponse();
    }

    /**
     * Create an instance of {@link GetChallengeQuestionXML }
     * 
     */
    public GetChallengeQuestionXML createGetChallengeQuestionXML() {
        return new GetChallengeQuestionXML();
    }

    /**
     * Create an instance of {@link GetChallengeQuestionXMLResponse }
     * 
     */
    public GetChallengeQuestionXMLResponse createGetChallengeQuestionXMLResponse() {
        return new GetChallengeQuestionXMLResponse();
    }

    /**
     * Create an instance of {@link GetAccountStatus }
     * 
     */
    public GetAccountStatus createGetAccountStatus() {
        return new GetAccountStatus();
    }

    /**
     * Create an instance of {@link AccountStatusRequest }
     * 
     */
    public AccountStatusRequest createAccountStatusRequest() {
        return new AccountStatusRequest();
    }

    /**
     * Create an instance of {@link GetAccountStatusResponse }
     * 
     */
    public GetAccountStatusResponse createGetAccountStatusResponse() {
        return new GetAccountStatusResponse();
    }

    /**
     * Create an instance of {@link AccountStatusResponse }
     * 
     */
    public AccountStatusResponse createAccountStatusResponse() {
        return new AccountStatusResponse();
    }

    /**
     * Create an instance of {@link GetAccountStatusXML }
     * 
     */
    public GetAccountStatusXML createGetAccountStatusXML() {
        return new GetAccountStatusXML();
    }

    /**
     * Create an instance of {@link GetAccountStatusXMLResponse }
     * 
     */
    public GetAccountStatusXMLResponse createGetAccountStatusXMLResponse() {
        return new GetAccountStatusXMLResponse();
    }

    /**
     * Create an instance of {@link GetPostageLabel }
     * 
     */
    public GetPostageLabel createGetPostageLabel() {
        return new GetPostageLabel();
    }

    /**
     * Create an instance of {@link LabelRequest }
     * 
     */
    public LabelRequest createLabelRequest() {
        return new LabelRequest();
    }

    /**
     * Create an instance of {@link GetPostageLabelResponse }
     * 
     */
    public GetPostageLabelResponse createGetPostageLabelResponse() {
        return new GetPostageLabelResponse();
    }

    /**
     * Create an instance of {@link LabelRequestResponse }
     * 
     */
    public LabelRequestResponse createLabelRequestResponse() {
        return new LabelRequestResponse();
    }

    /**
     * Create an instance of {@link GetPostageLabelXML }
     * 
     */
    public GetPostageLabelXML createGetPostageLabelXML() {
        return new GetPostageLabelXML();
    }

    /**
     * Create an instance of {@link GetPostageLabelXMLResponse }
     * 
     */
    public GetPostageLabelXMLResponse createGetPostageLabelXMLResponse() {
        return new GetPostageLabelXMLResponse();
    }

    /**
     * Create an instance of {@link GetVersion }
     * 
     */
    public GetVersion createGetVersion() {
        return new GetVersion();
    }

    /**
     * Create an instance of {@link GetVersionResponse }
     * 
     */
    public GetVersionResponse createGetVersionResponse() {
        return new GetVersionResponse();
    }

    /**
     * Create an instance of {@link GetVersionResults }
     * 
     */
    public GetVersionResults createGetVersionResults() {
        return new GetVersionResults();
    }

    /**
     * Create an instance of {@link GetVersionXML }
     * 
     */
    public GetVersionXML createGetVersionXML() {
        return new GetVersionXML();
    }

    /**
     * Create an instance of {@link GetVersionXMLResponse }
     * 
     */
    public GetVersionXMLResponse createGetVersionXMLResponse() {
        return new GetVersionXMLResponse();
    }

    /**
     * Create an instance of {@link GetUserSignUp }
     * 
     */
    public GetUserSignUp createGetUserSignUp() {
        return new GetUserSignUp();
    }

    /**
     * Create an instance of {@link UserSignUpRequest }
     * 
     */
    public UserSignUpRequest createUserSignUpRequest() {
        return new UserSignUpRequest();
    }

    /**
     * Create an instance of {@link GetUserSignUpResponse }
     * 
     */
    public GetUserSignUpResponse createGetUserSignUpResponse() {
        return new GetUserSignUpResponse();
    }

    /**
     * Create an instance of {@link UserSignUpResponse }
     * 
     */
    public UserSignUpResponse createUserSignUpResponse() {
        return new UserSignUpResponse();
    }

    /**
     * Create an instance of {@link GetUserSignUpXML }
     * 
     */
    public GetUserSignUpXML createGetUserSignUpXML() {
        return new GetUserSignUpXML();
    }

    /**
     * Create an instance of {@link GetUserSignUpXMLResponse }
     * 
     */
    public GetUserSignUpXMLResponse createGetUserSignUpXMLResponse() {
        return new GetUserSignUpXMLResponse();
    }

    /**
     * Create an instance of {@link ValidateAddress }
     * 
     */
    public ValidateAddress createValidateAddress() {
        return new ValidateAddress();
    }

    /**
     * Create an instance of {@link ValidateAddressInfoRequest }
     * 
     */
    public ValidateAddressInfoRequest createValidateAddressInfoRequest() {
        return new ValidateAddressInfoRequest();
    }

    /**
     * Create an instance of {@link ValidateAddressResponse }
     * 
     */
    public ValidateAddressResponse createValidateAddressResponse() {
        return new ValidateAddressResponse();
    }

    /**
     * Create an instance of {@link ValidateAddressInfoResponse }
     * 
     */
    public ValidateAddressInfoResponse createValidateAddressInfoResponse() {
        return new ValidateAddressInfoResponse();
    }

    /**
     * Create an instance of {@link ValidateAddressXML }
     * 
     */
    public ValidateAddressXML createValidateAddressXML() {
        return new ValidateAddressXML();
    }

    /**
     * Create an instance of {@link ValidateAddressXMLResponse }
     * 
     */
    public ValidateAddressXMLResponse createValidateAddressXMLResponse() {
        return new ValidateAddressXMLResponse();
    }

    /**
     * Create an instance of {@link VoideVSLabel }
     * 
     */
    public VoideVSLabel createVoideVSLabel() {
        return new VoideVSLabel();
    }

    /**
     * Create an instance of {@link VoidLabelRequest }
     * 
     */
    public VoidLabelRequest createVoidLabelRequest() {
        return new VoidLabelRequest();
    }

    /**
     * Create an instance of {@link VoideVSLabelResponse }
     * 
     */
    public VoideVSLabelResponse createVoideVSLabelResponse() {
        return new VoideVSLabelResponse();
    }

    /**
     * Create an instance of {@link VoidLabelResponse }
     * 
     */
    public VoidLabelResponse createVoidLabelResponse() {
        return new VoidLabelResponse();
    }

    /**
     * Create an instance of {@link VoideVSLabelXML }
     * 
     */
    public VoideVSLabelXML createVoideVSLabelXML() {
        return new VoideVSLabelXML();
    }

    /**
     * Create an instance of {@link VoideVSLabelXMLResponse }
     * 
     */
    public VoideVSLabelXMLResponse createVoideVSLabelXMLResponse() {
        return new VoideVSLabelXMLResponse();
    }

    /**
     * Create an instance of {@link AddCarrier }
     * 
     */
    public AddCarrier createAddCarrier() {
        return new AddCarrier();
    }

    /**
     * Create an instance of {@link AddCarrierRequest }
     * 
     */
    public AddCarrierRequest createAddCarrierRequest() {
        return new AddCarrierRequest();
    }

    /**
     * Create an instance of {@link AddCarrierResponse }
     * 
     */
    public AddCarrierResponse createAddCarrierResponse() {
        return new AddCarrierResponse();
    }

    /**
     * Create an instance of {@link AddCarrierResponseComplex }
     * 
     */
    public AddCarrierResponseComplex createAddCarrierResponseComplex() {
        return new AddCarrierResponseComplex();
    }

    /**
     * Create an instance of {@link BuyPostage }
     * 
     */
    public BuyPostage createBuyPostage() {
        return new BuyPostage();
    }

    /**
     * Create an instance of {@link RecreditRequest }
     * 
     */
    public RecreditRequest createRecreditRequest() {
        return new RecreditRequest();
    }

    /**
     * Create an instance of {@link BuyPostageResponse }
     * 
     */
    public BuyPostageResponse createBuyPostageResponse() {
        return new BuyPostageResponse();
    }

    /**
     * Create an instance of {@link RecreditRequestResponse }
     * 
     */
    public RecreditRequestResponse createRecreditRequestResponse() {
        return new RecreditRequestResponse();
    }

    /**
     * Create an instance of {@link BuyPostageXML }
     * 
     */
    public BuyPostageXML createBuyPostageXML() {
        return new BuyPostageXML();
    }

    /**
     * Create an instance of {@link BuyPostageXMLResponse }
     * 
     */
    public BuyPostageXMLResponse createBuyPostageXMLResponse() {
        return new BuyPostageXMLResponse();
    }

    /**
     * Create an instance of {@link CalculateDdpRate }
     * 
     */
    public CalculateDdpRate createCalculateDdpRate() {
        return new CalculateDdpRate();
    }

    /**
     * Create an instance of {@link DdpRateRequest }
     * 
     */
    public DdpRateRequest createDdpRateRequest() {
        return new DdpRateRequest();
    }

    /**
     * Create an instance of {@link CalculateDdpRateResponse }
     * 
     */
    public CalculateDdpRateResponse createCalculateDdpRateResponse() {
        return new CalculateDdpRateResponse();
    }

    /**
     * Create an instance of {@link DdpRateResponse }
     * 
     */
    public DdpRateResponse createDdpRateResponse() {
        return new DdpRateResponse();
    }

    /**
     * Create an instance of {@link CalculateDdpRateXML }
     * 
     */
    public CalculateDdpRateXML createCalculateDdpRateXML() {
        return new CalculateDdpRateXML();
    }

    /**
     * Create an instance of {@link CalculateDdpRateXMLResponse }
     * 
     */
    public CalculateDdpRateXMLResponse createCalculateDdpRateXMLResponse() {
        return new CalculateDdpRateXMLResponse();
    }

    /**
     * Create an instance of {@link CalculatePostageRate }
     * 
     */
    public CalculatePostageRate createCalculatePostageRate() {
        return new CalculatePostageRate();
    }

    /**
     * Create an instance of {@link CalculatePostageRateResponse }
     * 
     */
    public CalculatePostageRateResponse createCalculatePostageRateResponse() {
        return new CalculatePostageRateResponse();
    }

    /**
     * Create an instance of {@link PostageRateResponse }
     * 
     */
    public PostageRateResponse createPostageRateResponse() {
        return new PostageRateResponse();
    }

    /**
     * Create an instance of {@link CalculatePostageRateXML }
     * 
     */
    public CalculatePostageRateXML createCalculatePostageRateXML() {
        return new CalculatePostageRateXML();
    }

    /**
     * Create an instance of {@link CalculatePostageRateXMLResponse }
     * 
     */
    public CalculatePostageRateXMLResponse createCalculatePostageRateXMLResponse() {
        return new CalculatePostageRateXMLResponse();
    }

    /**
     * Create an instance of {@link CreateNotificationSetting }
     * 
     */
    public CreateNotificationSetting createCreateNotificationSetting() {
        return new CreateNotificationSetting();
    }

    /**
     * Create an instance of {@link CreateNotificationSettingRequest }
     * 
     */
    public CreateNotificationSettingRequest createCreateNotificationSettingRequest() {
        return new CreateNotificationSettingRequest();
    }

    /**
     * Create an instance of {@link CreateNotificationSettingResponse }
     * 
     */
    public CreateNotificationSettingResponse createCreateNotificationSettingResponse() {
        return new CreateNotificationSettingResponse();
    }

    /**
     * Create an instance of {@link CreateNotificationSettingResult }
     * 
     */
    public CreateNotificationSettingResult createCreateNotificationSettingResult() {
        return new CreateNotificationSettingResult();
    }

    /**
     * Create an instance of {@link CreateNotificationSettingRequestXML }
     * 
     */
    public CreateNotificationSettingRequestXML createCreateNotificationSettingRequestXML() {
        return new CreateNotificationSettingRequestXML();
    }

    /**
     * Create an instance of {@link CreateNotificationSettingRequestXMLResponse }
     * 
     */
    public CreateNotificationSettingRequestXMLResponse createCreateNotificationSettingRequestXMLResponse() {
        return new CreateNotificationSettingRequestXMLResponse();
    }

    /**
     * Create an instance of {@link CreateShipmentNotification }
     * 
     */
    public CreateShipmentNotification createCreateShipmentNotification() {
        return new CreateShipmentNotification();
    }

    /**
     * Create an instance of {@link CreateShipmentNotificationRequest }
     * 
     */
    public CreateShipmentNotificationRequest createCreateShipmentNotificationRequest() {
        return new CreateShipmentNotificationRequest();
    }

    /**
     * Create an instance of {@link CreateShipmentNotificationResponse }
     * 
     */
    public CreateShipmentNotificationResponse createCreateShipmentNotificationResponse() {
        return new CreateShipmentNotificationResponse();
    }

    /**
     * Create an instance of {@link CreateShipmentNotificationResult }
     * 
     */
    public CreateShipmentNotificationResult createCreateShipmentNotificationResult() {
        return new CreateShipmentNotificationResult();
    }

    /**
     * Create an instance of {@link CreateShipmentNotificationRequestXML }
     * 
     */
    public CreateShipmentNotificationRequestXML createCreateShipmentNotificationRequestXML() {
        return new CreateShipmentNotificationRequestXML();
    }

    /**
     * Create an instance of {@link CreateShipmentNotificationRequestXMLResponse }
     * 
     */
    public CreateShipmentNotificationRequestXMLResponse createCreateShipmentNotificationRequestXMLResponse() {
        return new CreateShipmentNotificationRequestXMLResponse();
    }

    /**
     * Create an instance of {@link DeleteNotificationSetting }
     * 
     */
    public DeleteNotificationSetting createDeleteNotificationSetting() {
        return new DeleteNotificationSetting();
    }

    /**
     * Create an instance of {@link DeleteNotificationSettingRequest }
     * 
     */
    public DeleteNotificationSettingRequest createDeleteNotificationSettingRequest() {
        return new DeleteNotificationSettingRequest();
    }

    /**
     * Create an instance of {@link DeleteNotificationSettingResponse }
     * 
     */
    public DeleteNotificationSettingResponse createDeleteNotificationSettingResponse() {
        return new DeleteNotificationSettingResponse();
    }

    /**
     * Create an instance of {@link DeleteNotificationSettingResult }
     * 
     */
    public DeleteNotificationSettingResult createDeleteNotificationSettingResult() {
        return new DeleteNotificationSettingResult();
    }

    /**
     * Create an instance of {@link DeleteNotificationSettingXML }
     * 
     */
    public DeleteNotificationSettingXML createDeleteNotificationSettingXML() {
        return new DeleteNotificationSettingXML();
    }

    /**
     * Create an instance of {@link DeleteNotificationSettingXMLResponse }
     * 
     */
    public DeleteNotificationSettingXMLResponse createDeleteNotificationSettingXMLResponse() {
        return new DeleteNotificationSettingXMLResponse();
    }

    /**
     * Create an instance of {@link DeleteBranding }
     * 
     */
    public DeleteBranding createDeleteBranding() {
        return new DeleteBranding();
    }

    /**
     * Create an instance of {@link DeleteBrandingRequest }
     * 
     */
    public DeleteBrandingRequest createDeleteBrandingRequest() {
        return new DeleteBrandingRequest();
    }

    /**
     * Create an instance of {@link DeleteBrandingResponse }
     * 
     */
    public DeleteBrandingResponse createDeleteBrandingResponse() {
        return new DeleteBrandingResponse();
    }

    /**
     * Create an instance of {@link DeleteBrandingResult }
     * 
     */
    public DeleteBrandingResult createDeleteBrandingResult() {
        return new DeleteBrandingResult();
    }

    /**
     * Create an instance of {@link DeleteBrandingXML }
     * 
     */
    public DeleteBrandingXML createDeleteBrandingXML() {
        return new DeleteBrandingXML();
    }

    /**
     * Create an instance of {@link DeleteBrandingXMLResponse }
     * 
     */
    public DeleteBrandingXMLResponse createDeleteBrandingXMLResponse() {
        return new DeleteBrandingXMLResponse();
    }

    /**
     * Create an instance of {@link GetUrl }
     * 
     */
    public GetUrl createGetUrl() {
        return new GetUrl();
    }

    /**
     * Create an instance of {@link GetUrlRequest }
     * 
     */
    public GetUrlRequest createGetUrlRequest() {
        return new GetUrlRequest();
    }

    /**
     * Create an instance of {@link GetUrlResponse }
     * 
     */
    public GetUrlResponse createGetUrlResponse() {
        return new GetUrlResponse();
    }

    /**
     * Create an instance of {@link GetUrlResult }
     * 
     */
    public GetUrlResult createGetUrlResult() {
        return new GetUrlResult();
    }

    /**
     * Create an instance of {@link GetUrlXML }
     * 
     */
    public GetUrlXML createGetUrlXML() {
        return new GetUrlXML();
    }

    /**
     * Create an instance of {@link GetUrlXMLResponse }
     * 
     */
    public GetUrlXMLResponse createGetUrlXMLResponse() {
        return new GetUrlXMLResponse();
    }

    /**
     * Create an instance of {@link GetNotificationSetting }
     * 
     */
    public GetNotificationSetting createGetNotificationSetting() {
        return new GetNotificationSetting();
    }

    /**
     * Create an instance of {@link GetNotificationSettingRequest }
     * 
     */
    public GetNotificationSettingRequest createGetNotificationSettingRequest() {
        return new GetNotificationSettingRequest();
    }

    /**
     * Create an instance of {@link GetNotificationSettingResponse }
     * 
     */
    public GetNotificationSettingResponse createGetNotificationSettingResponse() {
        return new GetNotificationSettingResponse();
    }

    /**
     * Create an instance of {@link GetNotificationSettingResult }
     * 
     */
    public GetNotificationSettingResult createGetNotificationSettingResult() {
        return new GetNotificationSettingResult();
    }

    /**
     * Create an instance of {@link GetNotificationSettingXML }
     * 
     */
    public GetNotificationSettingXML createGetNotificationSettingXML() {
        return new GetNotificationSettingXML();
    }

    /**
     * Create an instance of {@link GetNotificationSettingXMLResponse }
     * 
     */
    public GetNotificationSettingXMLResponse createGetNotificationSettingXMLResponse() {
        return new GetNotificationSettingXMLResponse();
    }

    /**
     * Create an instance of {@link UpdateNotificationSetting }
     * 
     */
    public UpdateNotificationSetting createUpdateNotificationSetting() {
        return new UpdateNotificationSetting();
    }

    /**
     * Create an instance of {@link UpdateNotificationSettingRequest }
     * 
     */
    public UpdateNotificationSettingRequest createUpdateNotificationSettingRequest() {
        return new UpdateNotificationSettingRequest();
    }

    /**
     * Create an instance of {@link UpdateNotificationSettingResponse }
     * 
     */
    public UpdateNotificationSettingResponse createUpdateNotificationSettingResponse() {
        return new UpdateNotificationSettingResponse();
    }

    /**
     * Create an instance of {@link UpdateNotificationSettingResult }
     * 
     */
    public UpdateNotificationSettingResult createUpdateNotificationSettingResult() {
        return new UpdateNotificationSettingResult();
    }

    /**
     * Create an instance of {@link UpdateNotificationSettingXML }
     * 
     */
    public UpdateNotificationSettingXML createUpdateNotificationSettingXML() {
        return new UpdateNotificationSettingXML();
    }

    /**
     * Create an instance of {@link UpdateNotificationSettingXMLResponse }
     * 
     */
    public UpdateNotificationSettingXMLResponse createUpdateNotificationSettingXMLResponse() {
        return new UpdateNotificationSettingXMLResponse();
    }

    /**
     * Create an instance of {@link UpdateBranding }
     * 
     */
    public UpdateBranding createUpdateBranding() {
        return new UpdateBranding();
    }

    /**
     * Create an instance of {@link UpdateBrandingRequest }
     * 
     */
    public UpdateBrandingRequest createUpdateBrandingRequest() {
        return new UpdateBrandingRequest();
    }

    /**
     * Create an instance of {@link UpdateBrandingResponse }
     * 
     */
    public UpdateBrandingResponse createUpdateBrandingResponse() {
        return new UpdateBrandingResponse();
    }

    /**
     * Create an instance of {@link UpdateBrandingResult }
     * 
     */
    public UpdateBrandingResult createUpdateBrandingResult() {
        return new UpdateBrandingResult();
    }

    /**
     * Create an instance of {@link UpdateBrandingXML }
     * 
     */
    public UpdateBrandingXML createUpdateBrandingXML() {
        return new UpdateBrandingXML();
    }

    /**
     * Create an instance of {@link UpdateBrandingXMLResponse }
     * 
     */
    public UpdateBrandingXMLResponse createUpdateBrandingXMLResponse() {
        return new UpdateBrandingXMLResponse();
    }

    /**
     * Create an instance of {@link GetBranding }
     * 
     */
    public GetBranding createGetBranding() {
        return new GetBranding();
    }

    /**
     * Create an instance of {@link GetBrandingRequest }
     * 
     */
    public GetBrandingRequest createGetBrandingRequest() {
        return new GetBrandingRequest();
    }

    /**
     * Create an instance of {@link GetBrandingResponse }
     * 
     */
    public GetBrandingResponse createGetBrandingResponse() {
        return new GetBrandingResponse();
    }

    /**
     * Create an instance of {@link GetBrandingResult }
     * 
     */
    public GetBrandingResult createGetBrandingResult() {
        return new GetBrandingResult();
    }

    /**
     * Create an instance of {@link GetBrandingXML }
     * 
     */
    public GetBrandingXML createGetBrandingXML() {
        return new GetBrandingXML();
    }

    /**
     * Create an instance of {@link GetBrandingXMLResponse }
     * 
     */
    public GetBrandingXMLResponse createGetBrandingXMLResponse() {
        return new GetBrandingXMLResponse();
    }

    /**
     * Create an instance of {@link DeleteCarrier }
     * 
     */
    public DeleteCarrier createDeleteCarrier() {
        return new DeleteCarrier();
    }

    /**
     * Create an instance of {@link DeleteCarrierRequest }
     * 
     */
    public DeleteCarrierRequest createDeleteCarrierRequest() {
        return new DeleteCarrierRequest();
    }

    /**
     * Create an instance of {@link DeleteCarrierResponse }
     * 
     */
    public DeleteCarrierResponse createDeleteCarrierResponse() {
        return new DeleteCarrierResponse();
    }

    /**
     * Create an instance of {@link DeleteCarrierResponseComplex }
     * 
     */
    public DeleteCarrierResponseComplex createDeleteCarrierResponseComplex() {
        return new DeleteCarrierResponseComplex();
    }

    /**
     * Create an instance of {@link GetExtraServiceRates }
     * 
     */
    public GetExtraServiceRates createGetExtraServiceRates() {
        return new GetExtraServiceRates();
    }

    /**
     * Create an instance of {@link GetExtraServiceRatesRequest }
     * 
     */
    public GetExtraServiceRatesRequest createGetExtraServiceRatesRequest() {
        return new GetExtraServiceRatesRequest();
    }

    /**
     * Create an instance of {@link GetExtraServiceRatesResponse }
     * 
     */
    public GetExtraServiceRatesResponse createGetExtraServiceRatesResponse() {
        return new GetExtraServiceRatesResponse();
    }

    /**
     * Create an instance of {@link GetExtraServiceRateResponse }
     * 
     */
    public GetExtraServiceRateResponse createGetExtraServiceRateResponse() {
        return new GetExtraServiceRateResponse();
    }

    /**
     * Create an instance of {@link GetExtraServiceRatesXML }
     * 
     */
    public GetExtraServiceRatesXML createGetExtraServiceRatesXML() {
        return new GetExtraServiceRatesXML();
    }

    /**
     * Create an instance of {@link GetExtraServiceRatesXMLResponse }
     * 
     */
    public GetExtraServiceRatesXMLResponse createGetExtraServiceRatesXMLResponse() {
        return new GetExtraServiceRatesXMLResponse();
    }

    /**
     * Create an instance of {@link GetPicNumber }
     * 
     */
    public GetPicNumber createGetPicNumber() {
        return new GetPicNumber();
    }

    /**
     * Create an instance of {@link PicNumberRequest }
     * 
     */
    public PicNumberRequest createPicNumberRequest() {
        return new PicNumberRequest();
    }

    /**
     * Create an instance of {@link GetPicNumberResponse }
     * 
     */
    public GetPicNumberResponse createGetPicNumberResponse() {
        return new GetPicNumberResponse();
    }

    /**
     * Create an instance of {@link LabelNumberResponse }
     * 
     */
    public LabelNumberResponse createLabelNumberResponse() {
        return new LabelNumberResponse();
    }

    /**
     * Create an instance of {@link GetPicNumberXml }
     * 
     */
    public GetPicNumberXml createGetPicNumberXml() {
        return new GetPicNumberXml();
    }

    /**
     * Create an instance of {@link GetPicNumberXmlResponse }
     * 
     */
    public GetPicNumberXmlResponse createGetPicNumberXmlResponse() {
        return new GetPicNumberXmlResponse();
    }

    /**
     * Create an instance of {@link CreateBranding }
     * 
     */
    public CreateBranding createCreateBranding() {
        return new CreateBranding();
    }

    /**
     * Create an instance of {@link CreateBrandingRequest }
     * 
     */
    public CreateBrandingRequest createCreateBrandingRequest() {
        return new CreateBrandingRequest();
    }

    /**
     * Create an instance of {@link CreateBrandingResponse }
     * 
     */
    public CreateBrandingResponse createCreateBrandingResponse() {
        return new CreateBrandingResponse();
    }

    /**
     * Create an instance of {@link CreateBrandingResult }
     * 
     */
    public CreateBrandingResult createCreateBrandingResult() {
        return new CreateBrandingResult();
    }

    /**
     * Create an instance of {@link CreateBrandingXML }
     * 
     */
    public CreateBrandingXML createCreateBrandingXML() {
        return new CreateBrandingXML();
    }

    /**
     * Create an instance of {@link CreateBrandingXMLResponse }
     * 
     */
    public CreateBrandingXMLResponse createCreateBrandingXMLResponse() {
        return new CreateBrandingXMLResponse();
    }

    /**
     * Create an instance of {@link GetPackagePickupList }
     * 
     */
    public GetPackagePickupList createGetPackagePickupList() {
        return new GetPackagePickupList();
    }

    /**
     * Create an instance of {@link PackagePickupListRequest }
     * 
     */
    public PackagePickupListRequest createPackagePickupListRequest() {
        return new PackagePickupListRequest();
    }

    /**
     * Create an instance of {@link GetPackagePickupListResponse }
     * 
     */
    public GetPackagePickupListResponse createGetPackagePickupListResponse() {
        return new GetPackagePickupListResponse();
    }

    /**
     * Create an instance of {@link PackagePickupListResponse }
     * 
     */
    public PackagePickupListResponse createPackagePickupListResponse() {
        return new PackagePickupListResponse();
    }

    /**
     * Create an instance of {@link GetPackagePickupListXML }
     * 
     */
    public GetPackagePickupListXML createGetPackagePickupListXML() {
        return new GetPackagePickupListXML();
    }

    /**
     * Create an instance of {@link GetPackagePickupListXMLResponse }
     * 
     */
    public GetPackagePickupListXMLResponse createGetPackagePickupListXMLResponse() {
        return new GetPackagePickupListXMLResponse();
    }

    /**
     * Create an instance of {@link SetAccountFeatureOptIn }
     * 
     */
    public SetAccountFeatureOptIn createSetAccountFeatureOptIn() {
        return new SetAccountFeatureOptIn();
    }

    /**
     * Create an instance of {@link SetAccountFeatureOptInRequest }
     * 
     */
    public SetAccountFeatureOptInRequest createSetAccountFeatureOptInRequest() {
        return new SetAccountFeatureOptInRequest();
    }

    /**
     * Create an instance of {@link SetAccountFeatureOptInResponse }
     * 
     */
    public SetAccountFeatureOptInResponse createSetAccountFeatureOptInResponse() {
        return new SetAccountFeatureOptInResponse();
    }

    /**
     * Create an instance of {@link SetAccountFeatureOptInResult }
     * 
     */
    public SetAccountFeatureOptInResult createSetAccountFeatureOptInResult() {
        return new SetAccountFeatureOptInResult();
    }

    /**
     * Create an instance of {@link SetAccountFeatureOptInXML }
     * 
     */
    public SetAccountFeatureOptInXML createSetAccountFeatureOptInXML() {
        return new SetAccountFeatureOptInXML();
    }

    /**
     * Create an instance of {@link SetAccountFeatureOptInXMLResponse }
     * 
     */
    public SetAccountFeatureOptInXMLResponse createSetAccountFeatureOptInXMLResponse() {
        return new SetAccountFeatureOptInXMLResponse();
    }

    /**
     * Create an instance of {@link UpdatePaymentInformation }
     * 
     */
    public UpdatePaymentInformation createUpdatePaymentInformation() {
        return new UpdatePaymentInformation();
    }

    /**
     * Create an instance of {@link UpdatePaymentInfoRequest }
     * 
     */
    public UpdatePaymentInfoRequest createUpdatePaymentInfoRequest() {
        return new UpdatePaymentInfoRequest();
    }

    /**
     * Create an instance of {@link UpdatePaymentInformationResponse }
     * 
     */
    public UpdatePaymentInformationResponse createUpdatePaymentInformationResponse() {
        return new UpdatePaymentInformationResponse();
    }

    /**
     * Create an instance of {@link UpdatePaymentInfoResponse }
     * 
     */
    public UpdatePaymentInfoResponse createUpdatePaymentInfoResponse() {
        return new UpdatePaymentInfoResponse();
    }

    /**
     * Create an instance of {@link UpdatePaymentInformationXML }
     * 
     */
    public UpdatePaymentInformationXML createUpdatePaymentInformationXML() {
        return new UpdatePaymentInformationXML();
    }

    /**
     * Create an instance of {@link UpdatePaymentInformationXMLResponse }
     * 
     */
    public UpdatePaymentInformationXMLResponse createUpdatePaymentInformationXMLResponse() {
        return new UpdatePaymentInformationXMLResponse();
    }

    /**
     * Create an instance of {@link ChangePassPhrase }
     * 
     */
    public ChangePassPhrase createChangePassPhrase() {
        return new ChangePassPhrase();
    }

    /**
     * Create an instance of {@link ChangePassPhraseRequest }
     * 
     */
    public ChangePassPhraseRequest createChangePassPhraseRequest() {
        return new ChangePassPhraseRequest();
    }

    /**
     * Create an instance of {@link ChangePassPhraseResponse }
     * 
     */
    public ChangePassPhraseResponse createChangePassPhraseResponse() {
        return new ChangePassPhraseResponse();
    }

    /**
     * Create an instance of {@link ChangePassPhraseRequestResponse }
     * 
     */
    public ChangePassPhraseRequestResponse createChangePassPhraseRequestResponse() {
        return new ChangePassPhraseRequestResponse();
    }

    /**
     * Create an instance of {@link ChangePassPhraseXML }
     * 
     */
    public ChangePassPhraseXML createChangePassPhraseXML() {
        return new ChangePassPhraseXML();
    }

    /**
     * Create an instance of {@link ChangePassPhraseXMLResponse }
     * 
     */
    public ChangePassPhraseXMLResponse createChangePassPhraseXMLResponse() {
        return new ChangePassPhraseXMLResponse();
    }

    /**
     * Create an instance of {@link CalculatePostageRates }
     * 
     */
    public CalculatePostageRates createCalculatePostageRates() {
        return new CalculatePostageRates();
    }

    /**
     * Create an instance of {@link PostageRatesRequest }
     * 
     */
    public PostageRatesRequest createPostageRatesRequest() {
        return new PostageRatesRequest();
    }

    /**
     * Create an instance of {@link CalculatePostageRatesResponse }
     * 
     */
    public CalculatePostageRatesResponse createCalculatePostageRatesResponse() {
        return new CalculatePostageRatesResponse();
    }

    /**
     * Create an instance of {@link PostageRatesResponse }
     * 
     */
    public PostageRatesResponse createPostageRatesResponse() {
        return new PostageRatesResponse();
    }

    /**
     * Create an instance of {@link CalculatePostageRatesXML }
     * 
     */
    public CalculatePostageRatesXML createCalculatePostageRatesXML() {
        return new CalculatePostageRatesXML();
    }

    /**
     * Create an instance of {@link CalculatePostageRatesXMLResponse }
     * 
     */
    public CalculatePostageRatesXMLResponse createCalculatePostageRatesXMLResponse() {
        return new CalculatePostageRatesXMLResponse();
    }

    /**
     * Create an instance of {@link CloseAccount }
     * 
     */
    public CloseAccount createCloseAccount() {
        return new CloseAccount();
    }

    /**
     * Create an instance of {@link CloseAccountRequest }
     * 
     */
    public CloseAccountRequest createCloseAccountRequest() {
        return new CloseAccountRequest();
    }

    /**
     * Create an instance of {@link CloseAccountResponse }
     * 
     */
    public CloseAccountResponse createCloseAccountResponse() {
        return new CloseAccountResponse();
    }

    /**
     * Create an instance of {@link SetPendingCloseAccountResponse }
     * 
     */
    public SetPendingCloseAccountResponse createSetPendingCloseAccountResponse() {
        return new SetPendingCloseAccountResponse();
    }

    /**
     * Create an instance of {@link CloseAccountXML }
     * 
     */
    public CloseAccountXML createCloseAccountXML() {
        return new CloseAccountXML();
    }

    /**
     * Create an instance of {@link CloseAccountXMLResponse }
     * 
     */
    public CloseAccountXMLResponse createCloseAccountXMLResponse() {
        return new CloseAccountXMLResponse();
    }

    /**
     * Create an instance of {@link CreateDhlgmManifest }
     * 
     */
    public CreateDhlgmManifest createCreateDhlgmManifest() {
        return new CreateDhlgmManifest();
    }

    /**
     * Create an instance of {@link CreateDhlgmManifestRequest }
     * 
     */
    public CreateDhlgmManifestRequest createCreateDhlgmManifestRequest() {
        return new CreateDhlgmManifestRequest();
    }

    /**
     * Create an instance of {@link CreateDhlgmManifestResponse }
     * 
     */
    public CreateDhlgmManifestResponse createCreateDhlgmManifestResponse() {
        return new CreateDhlgmManifestResponse();
    }

    /**
     * Create an instance of {@link DhlgmManifestResponse }
     * 
     */
    public DhlgmManifestResponse createDhlgmManifestResponse() {
        return new DhlgmManifestResponse();
    }

    /**
     * Create an instance of {@link CreateDhlgmManifestXML }
     * 
     */
    public CreateDhlgmManifestXML createCreateDhlgmManifestXML() {
        return new CreateDhlgmManifestXML();
    }

    /**
     * Create an instance of {@link CreateDhlgmManifestXMLResponse }
     * 
     */
    public CreateDhlgmManifestXMLResponse createCreateDhlgmManifestXMLResponse() {
        return new CreateDhlgmManifestXMLResponse();
    }

    /**
     * Create an instance of {@link StatusRequest }
     * 
     */
    public StatusRequest createStatusRequest() {
        return new StatusRequest();
    }

    /**
     * Create an instance of {@link PackageStatusRequest }
     * 
     */
    public PackageStatusRequest createPackageStatusRequest() {
        return new PackageStatusRequest();
    }

    /**
     * Create an instance of {@link StatusRequestResponse }
     * 
     */
    public StatusRequestResponse createStatusRequestResponse() {
        return new StatusRequestResponse();
    }

    /**
     * Create an instance of {@link PackageStatusResponse }
     * 
     */
    public PackageStatusResponse createPackageStatusResponse() {
        return new PackageStatusResponse();
    }

    /**
     * Create an instance of {@link StatusRequestXML }
     * 
     */
    public StatusRequestXML createStatusRequestXML() {
        return new StatusRequestXML();
    }

    /**
     * Create an instance of {@link StatusRequestXMLResponse }
     * 
     */
    public StatusRequestXMLResponse createStatusRequestXMLResponse() {
        return new StatusRequestXMLResponse();
    }

    /**
     * Create an instance of {@link GetRetailAccounts }
     * 
     */
    public GetRetailAccounts createGetRetailAccounts() {
        return new GetRetailAccounts();
    }

    /**
     * Create an instance of {@link RetailAccountsRequest }
     * 
     */
    public RetailAccountsRequest createRetailAccountsRequest() {
        return new RetailAccountsRequest();
    }

    /**
     * Create an instance of {@link GetRetailAccountsResponse }
     * 
     */
    public GetRetailAccountsResponse createGetRetailAccountsResponse() {
        return new GetRetailAccountsResponse();
    }

    /**
     * Create an instance of {@link RetailAccountsResponse }
     * 
     */
    public RetailAccountsResponse createRetailAccountsResponse() {
        return new RetailAccountsResponse();
    }

    /**
     * Create an instance of {@link GetRetailAccountsXML }
     * 
     */
    public GetRetailAccountsXML createGetRetailAccountsXML() {
        return new GetRetailAccountsXML();
    }

    /**
     * Create an instance of {@link GetRetailAccountsXMLResponse }
     * 
     */
    public GetRetailAccountsXMLResponse createGetRetailAccountsXMLResponse() {
        return new GetRetailAccountsXMLResponse();
    }

    /**
     * Create an instance of {@link GetTransactionsListing }
     * 
     */
    public GetTransactionsListing createGetTransactionsListing() {
        return new GetTransactionsListing();
    }

    /**
     * Create an instance of {@link GetTransactionsListingRequest }
     * 
     */
    public GetTransactionsListingRequest createGetTransactionsListingRequest() {
        return new GetTransactionsListingRequest();
    }

    /**
     * Create an instance of {@link GetTransactionsListingResponse }
     * 
     */
    public GetTransactionsListingResponse createGetTransactionsListingResponse() {
        return new GetTransactionsListingResponse();
    }

    /**
     * Create an instance of {@link TransactionsListingResponse }
     * 
     */
    public TransactionsListingResponse createTransactionsListingResponse() {
        return new TransactionsListingResponse();
    }

    /**
     * Create an instance of {@link GetTransactionsListingXML }
     * 
     */
    public GetTransactionsListingXML createGetTransactionsListingXML() {
        return new GetTransactionsListingXML();
    }

    /**
     * Create an instance of {@link GetTransactionsListingXMLResponse }
     * 
     */
    public GetTransactionsListingXMLResponse createGetTransactionsListingXMLResponse() {
        return new GetTransactionsListingXMLResponse();
    }

    /**
     * Create an instance of {@link GetPackagePickupChange }
     * 
     */
    public GetPackagePickupChange createGetPackagePickupChange() {
        return new GetPackagePickupChange();
    }

    /**
     * Create an instance of {@link PackagePickupChangeRequest }
     * 
     */
    public PackagePickupChangeRequest createPackagePickupChangeRequest() {
        return new PackagePickupChangeRequest();
    }

    /**
     * Create an instance of {@link GetPackagePickupChangeResponse }
     * 
     */
    public GetPackagePickupChangeResponse createGetPackagePickupChangeResponse() {
        return new GetPackagePickupChangeResponse();
    }

    /**
     * Create an instance of {@link PackagePickupChangeResponse }
     * 
     */
    public PackagePickupChangeResponse createPackagePickupChangeResponse() {
        return new PackagePickupChangeResponse();
    }

    /**
     * Create an instance of {@link GetPackagePickupChangeXML }
     * 
     */
    public GetPackagePickupChangeXML createGetPackagePickupChangeXML() {
        return new GetPackagePickupChangeXML();
    }

    /**
     * Create an instance of {@link GetPackagePickupChangeXMLResponse }
     * 
     */
    public GetPackagePickupChangeXMLResponse createGetPackagePickupChangeXMLResponse() {
        return new GetPackagePickupChangeXMLResponse();
    }

    /**
     * Create an instance of {@link GetPackagePickupAvailability }
     * 
     */
    public GetPackagePickupAvailability createGetPackagePickupAvailability() {
        return new GetPackagePickupAvailability();
    }

    /**
     * Create an instance of {@link PackagePickupAvailabilityRequest }
     * 
     */
    public PackagePickupAvailabilityRequest createPackagePickupAvailabilityRequest() {
        return new PackagePickupAvailabilityRequest();
    }

    /**
     * Create an instance of {@link GetPackagePickupAvailabilityResponse }
     * 
     */
    public GetPackagePickupAvailabilityResponse createGetPackagePickupAvailabilityResponse() {
        return new GetPackagePickupAvailabilityResponse();
    }

    /**
     * Create an instance of {@link PackagePickupAvailabilityResponse }
     * 
     */
    public PackagePickupAvailabilityResponse createPackagePickupAvailabilityResponse() {
        return new PackagePickupAvailabilityResponse();
    }

    /**
     * Create an instance of {@link GetPackagePickupAvailabilityXML }
     * 
     */
    public GetPackagePickupAvailabilityXML createGetPackagePickupAvailabilityXML() {
        return new GetPackagePickupAvailabilityXML();
    }

    /**
     * Create an instance of {@link GetPackagePickupAvailabilityXMLResponse }
     * 
     */
    public GetPackagePickupAvailabilityXMLResponse createGetPackagePickupAvailabilityXMLResponse() {
        return new GetPackagePickupAvailabilityXMLResponse();
    }

    /**
     * Create an instance of {@link GetPackagePickup }
     * 
     */
    public GetPackagePickup createGetPackagePickup() {
        return new GetPackagePickup();
    }

    /**
     * Create an instance of {@link PackagePickupRequest }
     * 
     */
    public PackagePickupRequest createPackagePickupRequest() {
        return new PackagePickupRequest();
    }

    /**
     * Create an instance of {@link GetPackagePickupResponse }
     * 
     */
    public GetPackagePickupResponse createGetPackagePickupResponse() {
        return new GetPackagePickupResponse();
    }

    /**
     * Create an instance of {@link PackagePickupResponse }
     * 
     */
    public PackagePickupResponse createPackagePickupResponse() {
        return new PackagePickupResponse();
    }

    /**
     * Create an instance of {@link GetPackagePickupXML }
     * 
     */
    public GetPackagePickupXML createGetPackagePickupXML() {
        return new GetPackagePickupXML();
    }

    /**
     * Create an instance of {@link GetPackagePickupXMLResponse }
     * 
     */
    public GetPackagePickupXMLResponse createGetPackagePickupXMLResponse() {
        return new GetPackagePickupXMLResponse();
    }

    /**
     * Create an instance of {@link DataValidator }
     * 
     */
    public DataValidator createDataValidator() {
        return new DataValidator();
    }

    /**
     * Create an instance of {@link PhysicalPickupAddress }
     * 
     */
    public PhysicalPickupAddress createPhysicalPickupAddress() {
        return new PhysicalPickupAddress();
    }

    /**
     * Create an instance of {@link CertifiedIntermediary }
     * 
     */
    public CertifiedIntermediary createCertifiedIntermediary() {
        return new CertifiedIntermediary();
    }

    /**
     * Create an instance of {@link Dimensions }
     * 
     */
    public Dimensions createDimensions() {
        return new Dimensions();
    }

    /**
     * Create an instance of {@link SpecialServices }
     * 
     */
    public SpecialServices createSpecialServices() {
        return new SpecialServices();
    }

    /**
     * Create an instance of {@link ResponseOptions }
     * 
     */
    public ResponseOptions createResponseOptions() {
        return new ResponseOptions();
    }

    /**
     * Create an instance of {@link PostageRateTable }
     * 
     */
    public PostageRateTable createPostageRateTable() {
        return new PostageRateTable();
    }

    /**
     * Create an instance of {@link PostageWeightRatePair }
     * 
     */
    public PostageWeightRatePair createPostageWeightRatePair() {
        return new PostageWeightRatePair();
    }

    /**
     * Create an instance of {@link GetSCANParameters }
     * 
     */
    public GetSCANParameters createGetSCANParameters() {
        return new GetSCANParameters();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link ArrayOfString1 }
     * 
     */
    public ArrayOfString1 createArrayOfString1() {
        return new ArrayOfString1();
    }

    /**
     * Create an instance of {@link ArrayOfString2 }
     * 
     */
    public ArrayOfString2 createArrayOfString2() {
        return new ArrayOfString2();
    }

    /**
     * Create an instance of {@link ArrayOfString3 }
     * 
     */
    public ArrayOfString3 createArrayOfString3() {
        return new ArrayOfString3();
    }

    /**
     * Create an instance of {@link EndOfDayManifest }
     * 
     */
    public EndOfDayManifest createEndOfDayManifest() {
        return new EndOfDayManifest();
    }

    /**
     * Create an instance of {@link ArrayOfContainerLabel }
     * 
     */
    public ArrayOfContainerLabel createArrayOfContainerLabel() {
        return new ArrayOfContainerLabel();
    }

    /**
     * Create an instance of {@link ContainerLabel }
     * 
     */
    public ContainerLabel createContainerLabel() {
        return new ContainerLabel();
    }

    /**
     * Create an instance of {@link ArrayOfString4 }
     * 
     */
    public ArrayOfString4 createArrayOfString4() {
        return new ArrayOfString4();
    }

    /**
     * Create an instance of {@link ArrayOfLong }
     * 
     */
    public ArrayOfLong createArrayOfLong() {
        return new ArrayOfLong();
    }

    /**
     * Create an instance of {@link ArrayOfInt }
     * 
     */
    public ArrayOfInt createArrayOfInt() {
        return new ArrayOfInt();
    }

    /**
     * Create an instance of {@link LabelResponse }
     * 
     */
    public LabelResponse createLabelResponse() {
        return new LabelResponse();
    }

    /**
     * Create an instance of {@link CertifiedIntermediaryStatus }
     * 
     */
    public CertifiedIntermediaryStatus createCertifiedIntermediaryStatus() {
        return new CertifiedIntermediaryStatus();
    }

    /**
     * Create an instance of {@link AccountDiscounts }
     * 
     */
    public AccountDiscounts createAccountDiscounts() {
        return new AccountDiscounts();
    }

    /**
     * Create an instance of {@link Discounts }
     * 
     */
    public Discounts createDiscounts() {
        return new Discounts();
    }

    /**
     * Create an instance of {@link DiscountRates }
     * 
     */
    public DiscountRates createDiscountRates() {
        return new DiscountRates();
    }

    /**
     * Create an instance of {@link ConsolidatorServiceDetailResponse }
     * 
     */
    public ConsolidatorServiceDetailResponse createConsolidatorServiceDetailResponse() {
        return new ConsolidatorServiceDetailResponse();
    }

    /**
     * Create an instance of {@link ArrayOfInternationalConsolidatorServiceDetailResponse }
     * 
     */
    public ArrayOfInternationalConsolidatorServiceDetailResponse createArrayOfInternationalConsolidatorServiceDetailResponse() {
        return new ArrayOfInternationalConsolidatorServiceDetailResponse();
    }

    /**
     * Create an instance of {@link InternationalConsolidatorServiceDetailResponse }
     * 
     */
    public InternationalConsolidatorServiceDetailResponse createInternationalConsolidatorServiceDetailResponse() {
        return new InternationalConsolidatorServiceDetailResponse();
    }

    /**
     * Create an instance of {@link ArrayOfConsolidatorTypeCode }
     * 
     */
    public ArrayOfConsolidatorTypeCode createArrayOfConsolidatorTypeCode() {
        return new ArrayOfConsolidatorTypeCode();
    }

    /**
     * Create an instance of {@link ConsolidatorTypeCode }
     * 
     */
    public ConsolidatorTypeCode createConsolidatorTypeCode() {
        return new ConsolidatorTypeCode();
    }

    /**
     * Create an instance of {@link ConsolidatorServiceInfo }
     * 
     */
    public ConsolidatorServiceInfo createConsolidatorServiceInfo() {
        return new ConsolidatorServiceInfo();
    }

    /**
     * Create an instance of {@link ArrayOfConsolidatorService }
     * 
     */
    public ArrayOfConsolidatorService createArrayOfConsolidatorService() {
        return new ArrayOfConsolidatorService();
    }

    /**
     * Create an instance of {@link ConsolidatorService }
     * 
     */
    public ConsolidatorService createConsolidatorService() {
        return new ConsolidatorService();
    }

    /**
     * Create an instance of {@link AccountContractIDs }
     * 
     */
    public AccountContractIDs createAccountContractIDs() {
        return new AccountContractIDs();
    }

    /**
     * Create an instance of {@link AccountStatus }
     * 
     */
    public AccountStatus createAccountStatus() {
        return new AccountStatus();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link AccountFeatures }
     * 
     */
    public AccountFeatures createAccountFeatures() {
        return new AccountFeatures();
    }

    /**
     * Create an instance of {@link Feature }
     * 
     */
    public Feature createFeature() {
        return new Feature();
    }

    /**
     * Create an instance of {@link PayOnUse }
     * 
     */
    public PayOnUse createPayOnUse() {
        return new PayOnUse();
    }

    /**
     * Create an instance of {@link ConfiguredCarriers }
     * 
     */
    public ConfiguredCarriers createConfiguredCarriers() {
        return new ConfiguredCarriers();
    }

    /**
     * Create an instance of {@link ConfiguredCarrier }
     * 
     */
    public ConfiguredCarrier createConfiguredCarrier() {
        return new ConfiguredCarrier();
    }

    /**
     * Create an instance of {@link CustomsInfo }
     * 
     */
    public CustomsInfo createCustomsInfo() {
        return new CustomsInfo();
    }

    /**
     * Create an instance of {@link ArrayOfCustomsItem }
     * 
     */
    public ArrayOfCustomsItem createArrayOfCustomsItem() {
        return new ArrayOfCustomsItem();
    }

    /**
     * Create an instance of {@link CustomsItem }
     * 
     */
    public CustomsItem createCustomsItem() {
        return new CustomsItem();
    }

    /**
     * Create an instance of {@link EVSOptions }
     * 
     */
    public EVSOptions createEVSOptions() {
        return new EVSOptions();
    }

    /**
     * Create an instance of {@link Cod3816 }
     * 
     */
    public Cod3816 createCod3816() {
        return new Cod3816();
    }

    /**
     * Create an instance of {@link HazMat }
     * 
     */
    public HazMat createHazMat() {
        return new HazMat();
    }

    /**
     * Create an instance of {@link OrderDetails }
     * 
     */
    public OrderDetails createOrderDetails() {
        return new OrderDetails();
    }

    /**
     * Create an instance of {@link ArrayOfOrderItem }
     * 
     */
    public ArrayOfOrderItem createArrayOfOrderItem() {
        return new ArrayOfOrderItem();
    }

    /**
     * Create an instance of {@link OrderItem }
     * 
     */
    public OrderItem createOrderItem() {
        return new OrderItem();
    }

    /**
     * Create an instance of {@link ArrayOfOrderOption }
     * 
     */
    public ArrayOfOrderOption createArrayOfOrderOption() {
        return new ArrayOfOrderOption();
    }

    /**
     * Create an instance of {@link OrderOption }
     * 
     */
    public OrderOption createOrderOption() {
        return new OrderOption();
    }

    /**
     * Create an instance of {@link ImageSet }
     * 
     */
    public ImageSet createImageSet() {
        return new ImageSet();
    }

    /**
     * Create an instance of {@link ImageData }
     * 
     */
    public ImageData createImageData() {
        return new ImageData();
    }

    /**
     * Create an instance of {@link PostagePrice }
     * 
     */
    public PostagePrice createPostagePrice() {
        return new PostagePrice();
    }

    /**
     * Create an instance of {@link Postage }
     * 
     */
    public Postage createPostage() {
        return new Postage();
    }

    /**
     * Create an instance of {@link Fees }
     * 
     */
    public Fees createFees() {
        return new Fees();
    }

    /**
     * Create an instance of {@link GroupedExtraServices }
     * 
     */
    public GroupedExtraServices createGroupedExtraServices() {
        return new GroupedExtraServices();
    }

    /**
     * Create an instance of {@link Surcharge }
     * 
     */
    public Surcharge createSurcharge() {
        return new Surcharge();
    }

    /**
     * Create an instance of {@link ArrayOfCommitment }
     * 
     */
    public ArrayOfCommitment createArrayOfCommitment() {
        return new ArrayOfCommitment();
    }

    /**
     * Create an instance of {@link Commitment }
     * 
     */
    public Commitment createCommitment() {
        return new Commitment();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link ResellerInformation }
     * 
     */
    public ResellerInformation createResellerInformation() {
        return new ResellerInformation();
    }

    /**
     * Create an instance of {@link ArrayOfString5 }
     * 
     */
    public ArrayOfString5 createArrayOfString5() {
        return new ArrayOfString5();
    }

    /**
     * Create an instance of {@link AccountCredentials }
     * 
     */
    public AccountCredentials createAccountCredentials() {
        return new AccountCredentials();
    }

    /**
     * Create an instance of {@link CreditCard }
     * 
     */
    public CreditCard createCreditCard() {
        return new CreditCard();
    }

    /**
     * Create an instance of {@link CheckingAccount }
     * 
     */
    public CheckingAccount createCheckingAccount() {
        return new CheckingAccount();
    }

    /**
     * Create an instance of {@link ValidateAddressInfo }
     * 
     */
    public ValidateAddressInfo createValidateAddressInfo() {
        return new ValidateAddressInfo();
    }

    /**
     * Create an instance of {@link ArrayOfValidateAddressInfo }
     * 
     */
    public ArrayOfValidateAddressInfo createArrayOfValidateAddressInfo() {
        return new ArrayOfValidateAddressInfo();
    }

    /**
     * Create an instance of {@link StatusCodes }
     * 
     */
    public StatusCodes createStatusCodes() {
        return new StatusCodes();
    }

    /**
     * Create an instance of {@link ArrayOfFootnote }
     * 
     */
    public ArrayOfFootnote createArrayOfFootnote() {
        return new ArrayOfFootnote();
    }

    /**
     * Create an instance of {@link Footnote }
     * 
     */
    public Footnote createFootnote() {
        return new Footnote();
    }

    /**
     * Create an instance of {@link ArrayOfDpvFootnote }
     * 
     */
    public ArrayOfDpvFootnote createArrayOfDpvFootnote() {
        return new ArrayOfDpvFootnote();
    }

    /**
     * Create an instance of {@link DpvFootnote }
     * 
     */
    public DpvFootnote createDpvFootnote() {
        return new DpvFootnote();
    }

    /**
     * Create an instance of {@link Invoice }
     * 
     */
    public Invoice createInvoice() {
        return new Invoice();
    }

    /**
     * Create an instance of {@link PostageRate }
     * 
     */
    public PostageRate createPostageRate() {
        return new PostageRate();
    }

    /**
     * Create an instance of {@link NotificationSettingProperties }
     * 
     */
    public NotificationSettingProperties createNotificationSettingProperties() {
        return new NotificationSettingProperties();
    }

    /**
     * Create an instance of {@link Trigger }
     * 
     */
    public Trigger createTrigger() {
        return new Trigger();
    }

    /**
     * Create an instance of {@link Channel }
     * 
     */
    public Channel createChannel() {
        return new Channel();
    }

    /**
     * Create an instance of {@link EmailConfig }
     * 
     */
    public EmailConfig createEmailConfig() {
        return new EmailConfig();
    }

    /**
     * Create an instance of {@link ArrayOfContentBlock }
     * 
     */
    public ArrayOfContentBlock createArrayOfContentBlock() {
        return new ArrayOfContentBlock();
    }

    /**
     * Create an instance of {@link ContentBlock }
     * 
     */
    public ContentBlock createContentBlock() {
        return new ContentBlock();
    }

    /**
     * Create an instance of {@link ArrayOfBccEmail }
     * 
     */
    public ArrayOfBccEmail createArrayOfBccEmail() {
        return new ArrayOfBccEmail();
    }

    /**
     * Create an instance of {@link BccEmail }
     * 
     */
    public BccEmail createBccEmail() {
        return new BccEmail();
    }

    /**
     * Create an instance of {@link ArrayOfNotificationSetting }
     * 
     */
    public ArrayOfNotificationSetting createArrayOfNotificationSetting() {
        return new ArrayOfNotificationSetting();
    }

    /**
     * Create an instance of {@link NotificationSetting }
     * 
     */
    public NotificationSetting createNotificationSetting() {
        return new NotificationSetting();
    }

    /**
     * Create an instance of {@link Branding }
     * 
     */
    public Branding createBranding() {
        return new Branding();
    }

    /**
     * Create an instance of {@link BrandingProperties }
     * 
     */
    public BrandingProperties createBrandingProperties() {
        return new BrandingProperties();
    }

    /**
     * Create an instance of {@link ArrayOfMenuLink }
     * 
     */
    public ArrayOfMenuLink createArrayOfMenuLink() {
        return new ArrayOfMenuLink();
    }

    /**
     * Create an instance of {@link MenuLink }
     * 
     */
    public MenuLink createMenuLink() {
        return new MenuLink();
    }

    /**
     * Create an instance of {@link ArrayOfSocialMedia }
     * 
     */
    public ArrayOfSocialMedia createArrayOfSocialMedia() {
        return new ArrayOfSocialMedia();
    }

    /**
     * Create an instance of {@link SocialMedia }
     * 
     */
    public SocialMedia createSocialMedia() {
        return new SocialMedia();
    }

    /**
     * Create an instance of {@link Toggles }
     * 
     */
    public Toggles createToggles() {
        return new Toggles();
    }

    /**
     * Create an instance of {@link Colors }
     * 
     */
    public Colors createColors() {
        return new Colors();
    }

    /**
     * Create an instance of {@link ArrayOfBranding }
     * 
     */
    public ArrayOfBranding createArrayOfBranding() {
        return new ArrayOfBranding();
    }

    /**
     * Create an instance of {@link ExtraServiceRate }
     * 
     */
    public ExtraServiceRate createExtraServiceRate() {
        return new ExtraServiceRate();
    }

    /**
     * Create an instance of {@link CarrierPickupList }
     * 
     */
    public CarrierPickupList createCarrierPickupList() {
        return new CarrierPickupList();
    }

    /**
     * Create an instance of {@link ArrayOfCarrierPickupListDetail }
     * 
     */
    public ArrayOfCarrierPickupListDetail createArrayOfCarrierPickupListDetail() {
        return new ArrayOfCarrierPickupListDetail();
    }

    /**
     * Create an instance of {@link CarrierPickupListDetail }
     * 
     */
    public CarrierPickupListDetail createCarrierPickupListDetail() {
        return new CarrierPickupListDetail();
    }

    /**
     * Create an instance of {@link PackagePickup }
     * 
     */
    public PackagePickup createPackagePickup() {
        return new PackagePickup();
    }

    /**
     * Create an instance of {@link UpdateCreditCardInformation }
     * 
     */
    public UpdateCreditCardInformation createUpdateCreditCardInformation() {
        return new UpdateCreditCardInformation();
    }

    /**
     * Create an instance of {@link UpdateACHInformation }
     * 
     */
    public UpdateACHInformation createUpdateACHInformation() {
        return new UpdateACHInformation();
    }

    /**
     * Create an instance of {@link CloseAccountReasons }
     * 
     */
    public CloseAccountReasons createCloseAccountReasons() {
        return new CloseAccountReasons();
    }

    /**
     * Create an instance of {@link PackageStatusRequestOptions }
     * 
     */
    public PackageStatusRequestOptions createPackageStatusRequestOptions() {
        return new PackageStatusRequestOptions();
    }

    /**
     * Create an instance of {@link ArrayOfString6 }
     * 
     */
    public ArrayOfString6 createArrayOfString6() {
        return new ArrayOfString6();
    }

    /**
     * Create an instance of {@link ArrayOfStatusResponse }
     * 
     */
    public ArrayOfStatusResponse createArrayOfStatusResponse() {
        return new ArrayOfStatusResponse();
    }

    /**
     * Create an instance of {@link StatusResponse }
     * 
     */
    public StatusResponse createStatusResponse() {
        return new StatusResponse();
    }

    /**
     * Create an instance of {@link ArrayOfStatusEventList }
     * 
     */
    public ArrayOfStatusEventList createArrayOfStatusEventList() {
        return new ArrayOfStatusEventList();
    }

    /**
     * Create an instance of {@link StatusEventList }
     * 
     */
    public StatusEventList createStatusEventList() {
        return new StatusEventList();
    }

    /**
     * Create an instance of {@link ArrayOfTrackingResult }
     * 
     */
    public ArrayOfTrackingResult createArrayOfTrackingResult() {
        return new ArrayOfTrackingResult();
    }

    /**
     * Create an instance of {@link TrackingResult }
     * 
     */
    public TrackingResult createTrackingResult() {
        return new TrackingResult();
    }

    /**
     * Create an instance of {@link ArrayOfRetailAccount }
     * 
     */
    public ArrayOfRetailAccount createArrayOfRetailAccount() {
        return new ArrayOfRetailAccount();
    }

    /**
     * Create an instance of {@link RetailAccount }
     * 
     */
    public RetailAccount createRetailAccount() {
        return new RetailAccount();
    }

    /**
     * Create an instance of {@link TransactionListingsRequestOptions }
     * 
     */
    public TransactionListingsRequestOptions createTransactionListingsRequestOptions() {
        return new TransactionListingsRequestOptions();
    }

    /**
     * Create an instance of {@link ArrayOfString7 }
     * 
     */
    public ArrayOfString7 createArrayOfString7() {
        return new ArrayOfString7();
    }

    /**
     * Create an instance of {@link ArrayOfString8 }
     * 
     */
    public ArrayOfString8 createArrayOfString8() {
        return new ArrayOfString8();
    }

    /**
     * Create an instance of {@link ArrayOfString9 }
     * 
     */
    public ArrayOfString9 createArrayOfString9() {
        return new ArrayOfString9();
    }

    /**
     * Create an instance of {@link ArrayOfString10 }
     * 
     */
    public ArrayOfString10 createArrayOfString10() {
        return new ArrayOfString10();
    }

    /**
     * Create an instance of {@link ArrayOfTransaction }
     * 
     */
    public ArrayOfTransaction createArrayOfTransaction() {
        return new ArrayOfTransaction();
    }

    /**
     * Create an instance of {@link Transaction }
     * 
     */
    public Transaction createTransaction() {
        return new Transaction();
    }

    /**
     * Create an instance of {@link TransactionAddress }
     * 
     */
    public TransactionAddress createTransactionAddress() {
        return new TransactionAddress();
    }

    /**
     * Create an instance of {@link AddressLines }
     * 
     */
    public AddressLines createAddressLines() {
        return new AddressLines();
    }

    /**
     * Create an instance of {@link TransactionStatus }
     * 
     */
    public TransactionStatus createTransactionStatus() {
        return new TransactionStatus();
    }

    /**
     * Create an instance of {@link TransactionRefundDetails }
     * 
     */
    public TransactionRefundDetails createTransactionRefundDetails() {
        return new TransactionRefundDetails();
    }

    /**
     * Create an instance of {@link ArrayOfAdjustment }
     * 
     */
    public ArrayOfAdjustment createArrayOfAdjustment() {
        return new ArrayOfAdjustment();
    }

    /**
     * Create an instance of {@link Adjustment }
     * 
     */
    public Adjustment createAdjustment() {
        return new Adjustment();
    }

    /**
     * Create an instance of {@link PackageInfo }
     * 
     */
    public PackageInfo createPackageInfo() {
        return new PackageInfo();
    }

    /**
     * Create an instance of {@link DisputeDetails }
     * 
     */
    public DisputeDetails createDisputeDetails() {
        return new DisputeDetails();
    }

    /**
     * Create an instance of {@link ActualService }
     * 
     */
    public ActualService createActualService() {
        return new ActualService();
    }

    /**
     * Create an instance of {@link TransactionsResponseOptions }
     * 
     */
    public TransactionsResponseOptions createTransactionsResponseOptions() {
        return new TransactionsResponseOptions();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackagePickupCancelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "PackagePickupCancelResponse")
    public JAXBElement<PackagePickupCancelResponse> createPackagePickupCancelResponse(PackagePickupCancelResponse value) {
        return new JAXBElement<PackagePickupCancelResponse>(_PackagePickupCancelResponse_QNAME, PackagePickupCancelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostageRateTableResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "PostageRateTableResponse")
    public JAXBElement<PostageRateTableResponse> createPostageRateTableResponse(PostageRateTableResponse value) {
        return new JAXBElement<PostageRateTableResponse>(_PostageRateTableResponse_QNAME, PostageRateTableResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SCANResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "SCANResponse")
    public JAXBElement<SCANResponse> createSCANResponse(SCANResponse value) {
        return new JAXBElement<SCANResponse>(_SCANResponse_QNAME, SCANResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefundResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "RefundResponse")
    public JAXBElement<RefundResponse> createRefundResponse(RefundResponse value) {
        return new JAXBElement<RefundResponse>(_RefundResponse_QNAME, RefundResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetSuspendedAccountRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "ResetSuspendedAccountRequestResponse")
    public JAXBElement<ResetSuspendedAccountRequestResponse> createResetSuspendedAccountRequestResponse(ResetSuspendedAccountRequestResponse value) {
        return new JAXBElement<ResetSuspendedAccountRequestResponse>(_ResetSuspendedAccountRequestResponse_QNAME, ResetSuspendedAccountRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChallengeQuestionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "ChallengeQuestionResponse")
    public JAXBElement<ChallengeQuestionResponse> createChallengeQuestionResponse(ChallengeQuestionResponse value) {
        return new JAXBElement<ChallengeQuestionResponse>(_ChallengeQuestionResponse_QNAME, ChallengeQuestionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "AccountStatusResponse")
    public JAXBElement<AccountStatusResponse> createAccountStatusResponse(AccountStatusResponse value) {
        return new JAXBElement<AccountStatusResponse>(_AccountStatusResponse_QNAME, AccountStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "LabelRequestResponse")
    public JAXBElement<LabelRequestResponse> createLabelRequestResponse(LabelRequestResponse value) {
        return new JAXBElement<LabelRequestResponse>(_LabelRequestResponse_QNAME, LabelRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "GetVersionResults")
    public JAXBElement<GetVersionResults> createGetVersionResults(GetVersionResults value) {
        return new JAXBElement<GetVersionResults>(_GetVersionResults_QNAME, GetVersionResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserSignUpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "UserSignUpResponse")
    public JAXBElement<UserSignUpResponse> createUserSignUpResponse(UserSignUpResponse value) {
        return new JAXBElement<UserSignUpResponse>(_UserSignUpResponse_QNAME, UserSignUpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateAddressInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "ValidateAddressInfoResponse")
    public JAXBElement<ValidateAddressInfoResponse> createValidateAddressInfoResponse(ValidateAddressInfoResponse value) {
        return new JAXBElement<ValidateAddressInfoResponse>(_ValidateAddressInfoResponse_QNAME, ValidateAddressInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoidLabelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "VoidLabelResponse")
    public JAXBElement<VoidLabelResponse> createVoidLabelResponse(VoidLabelResponse value) {
        return new JAXBElement<VoidLabelResponse>(_VoidLabelResponse_QNAME, VoidLabelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecreditRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "RecreditRequestResponse")
    public JAXBElement<RecreditRequestResponse> createRecreditRequestResponse(RecreditRequestResponse value) {
        return new JAXBElement<RecreditRequestResponse>(_RecreditRequestResponse_QNAME, RecreditRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DdpRateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "DdpRateResponse")
    public JAXBElement<DdpRateResponse> createDdpRateResponse(DdpRateResponse value) {
        return new JAXBElement<DdpRateResponse>(_DdpRateResponse_QNAME, DdpRateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostageRateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "PostageRateResponse")
    public JAXBElement<PostageRateResponse> createPostageRateResponse(PostageRateResponse value) {
        return new JAXBElement<PostageRateResponse>(_PostageRateResponse_QNAME, PostageRateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNotificationSettingResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "CreateNotificationSettingResult")
    public JAXBElement<CreateNotificationSettingResult> createCreateNotificationSettingResult(CreateNotificationSettingResult value) {
        return new JAXBElement<CreateNotificationSettingResult>(_CreateNotificationSettingResult_QNAME, CreateNotificationSettingResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateShipmentNotificationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "CreateShipmentNotificationResult")
    public JAXBElement<CreateShipmentNotificationResult> createCreateShipmentNotificationResult(CreateShipmentNotificationResult value) {
        return new JAXBElement<CreateShipmentNotificationResult>(_CreateShipmentNotificationResult_QNAME, CreateShipmentNotificationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteNotificationSettingResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "DeleteNotificationSettingResult")
    public JAXBElement<DeleteNotificationSettingResult> createDeleteNotificationSettingResult(DeleteNotificationSettingResult value) {
        return new JAXBElement<DeleteNotificationSettingResult>(_DeleteNotificationSettingResult_QNAME, DeleteNotificationSettingResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBrandingResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "DeleteBrandingResult")
    public JAXBElement<DeleteBrandingResult> createDeleteBrandingResult(DeleteBrandingResult value) {
        return new JAXBElement<DeleteBrandingResult>(_DeleteBrandingResult_QNAME, DeleteBrandingResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUrlResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "GetUrlResult")
    public JAXBElement<GetUrlResult> createGetUrlResult(GetUrlResult value) {
        return new JAXBElement<GetUrlResult>(_GetUrlResult_QNAME, GetUrlResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNotificationSettingResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "GetNotificationSettingResult")
    public JAXBElement<GetNotificationSettingResult> createGetNotificationSettingResult(GetNotificationSettingResult value) {
        return new JAXBElement<GetNotificationSettingResult>(_GetNotificationSettingResult_QNAME, GetNotificationSettingResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateNotificationSettingResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "UpdateNotificationSettingResult")
    public JAXBElement<UpdateNotificationSettingResult> createUpdateNotificationSettingResult(UpdateNotificationSettingResult value) {
        return new JAXBElement<UpdateNotificationSettingResult>(_UpdateNotificationSettingResult_QNAME, UpdateNotificationSettingResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBrandingResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "UpdateBrandingResult")
    public JAXBElement<UpdateBrandingResult> createUpdateBrandingResult(UpdateBrandingResult value) {
        return new JAXBElement<UpdateBrandingResult>(_UpdateBrandingResult_QNAME, UpdateBrandingResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBrandingResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "GetBrandingResult")
    public JAXBElement<GetBrandingResult> createGetBrandingResult(GetBrandingResult value) {
        return new JAXBElement<GetBrandingResult>(_GetBrandingResult_QNAME, GetBrandingResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExtraServiceRateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "GetExtraServiceRateResponse")
    public JAXBElement<GetExtraServiceRateResponse> createGetExtraServiceRateResponse(GetExtraServiceRateResponse value) {
        return new JAXBElement<GetExtraServiceRateResponse>(_GetExtraServiceRateResponse_QNAME, GetExtraServiceRateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "LabelNumberResponse")
    public JAXBElement<LabelNumberResponse> createLabelNumberResponse(LabelNumberResponse value) {
        return new JAXBElement<LabelNumberResponse>(_LabelNumberResponse_QNAME, LabelNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBrandingResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "CreateBrandingResult")
    public JAXBElement<CreateBrandingResult> createCreateBrandingResult(CreateBrandingResult value) {
        return new JAXBElement<CreateBrandingResult>(_CreateBrandingResult_QNAME, CreateBrandingResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackagePickupListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "PackagePickupListResponse")
    public JAXBElement<PackagePickupListResponse> createPackagePickupListResponse(PackagePickupListResponse value) {
        return new JAXBElement<PackagePickupListResponse>(_PackagePickupListResponse_QNAME, PackagePickupListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAccountFeatureOptInResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "SetAccountFeatureOptInResult")
    public JAXBElement<SetAccountFeatureOptInResult> createSetAccountFeatureOptInResult(SetAccountFeatureOptInResult value) {
        return new JAXBElement<SetAccountFeatureOptInResult>(_SetAccountFeatureOptInResult_QNAME, SetAccountFeatureOptInResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePaymentInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "UpdatePaymentInfoResponse")
    public JAXBElement<UpdatePaymentInfoResponse> createUpdatePaymentInfoResponse(UpdatePaymentInfoResponse value) {
        return new JAXBElement<UpdatePaymentInfoResponse>(_UpdatePaymentInfoResponse_QNAME, UpdatePaymentInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePassPhraseRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "ChangePassPhraseRequestResponse")
    public JAXBElement<ChangePassPhraseRequestResponse> createChangePassPhraseRequestResponse(ChangePassPhraseRequestResponse value) {
        return new JAXBElement<ChangePassPhraseRequestResponse>(_ChangePassPhraseRequestResponse_QNAME, ChangePassPhraseRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostageRatesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "PostageRatesResponse")
    public JAXBElement<PostageRatesResponse> createPostageRatesResponse(PostageRatesResponse value) {
        return new JAXBElement<PostageRatesResponse>(_PostageRatesResponse_QNAME, PostageRatesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPendingCloseAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "SetPendingCloseAccountResponse")
    public JAXBElement<SetPendingCloseAccountResponse> createSetPendingCloseAccountResponse(SetPendingCloseAccountResponse value) {
        return new JAXBElement<SetPendingCloseAccountResponse>(_SetPendingCloseAccountResponse_QNAME, SetPendingCloseAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DhlgmManifestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "DhlgmManifestResponse")
    public JAXBElement<DhlgmManifestResponse> createDhlgmManifestResponse(DhlgmManifestResponse value) {
        return new JAXBElement<DhlgmManifestResponse>(_DhlgmManifestResponse_QNAME, DhlgmManifestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "PackageStatusResponse")
    public JAXBElement<PackageStatusResponse> createPackageStatusResponse(PackageStatusResponse value) {
        return new JAXBElement<PackageStatusResponse>(_PackageStatusResponse_QNAME, PackageStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetailAccountsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "RetailAccountsResponse")
    public JAXBElement<RetailAccountsResponse> createRetailAccountsResponse(RetailAccountsResponse value) {
        return new JAXBElement<RetailAccountsResponse>(_RetailAccountsResponse_QNAME, RetailAccountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionsListingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "TransactionsListingResponse")
    public JAXBElement<TransactionsListingResponse> createTransactionsListingResponse(TransactionsListingResponse value) {
        return new JAXBElement<TransactionsListingResponse>(_TransactionsListingResponse_QNAME, TransactionsListingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackagePickupChangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "PackagePickupChangeResponse")
    public JAXBElement<PackagePickupChangeResponse> createPackagePickupChangeResponse(PackagePickupChangeResponse value) {
        return new JAXBElement<PackagePickupChangeResponse>(_PackagePickupChangeResponse_QNAME, PackagePickupChangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackagePickupAvailabilityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "PackagePickupAvailabilityResponse")
    public JAXBElement<PackagePickupAvailabilityResponse> createPackagePickupAvailabilityResponse(PackagePickupAvailabilityResponse value) {
        return new JAXBElement<PackagePickupAvailabilityResponse>(_PackagePickupAvailabilityResponse_QNAME, PackagePickupAvailabilityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackagePickupResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "PackagePickupResponse")
    public JAXBElement<PackagePickupResponse> createPackagePickupResponse(PackagePickupResponse value) {
        return new JAXBElement<PackagePickupResponse>(_PackagePickupResponse_QNAME, PackagePickupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "PayOnUse", scope = Fees.class)
    public JAXBElement<BigDecimal> createFeesPayOnUse(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_FeesPayOnUse_QNAME, BigDecimal.class, Fees.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "PayOnUseReturn", scope = Fees.class)
    public JAXBElement<BigDecimal> createFeesPayOnUseReturn(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_FeesPayOnUseReturn_QNAME, BigDecimal.class, Fees.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.envmgr.com/LabelService", name = "DeliveredDutyPaid", scope = Fees.class)
    public JAXBElement<BigDecimal> createFeesDeliveredDutyPaid(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_FeesDeliveredDutyPaid_QNAME, BigDecimal.class, Fees.class, value);
    }

}
