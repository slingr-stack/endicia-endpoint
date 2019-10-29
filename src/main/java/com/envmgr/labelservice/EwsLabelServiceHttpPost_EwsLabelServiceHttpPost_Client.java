
package com.envmgr.labelservice;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-10-29T12:46:10.373-03:00
 * Generated source version: 3.2.7
 *
 */
public final class EwsLabelServiceHttpPost_EwsLabelServiceHttpPost_Client {

    private static final QName SERVICE_NAME = new QName("www.envmgr.com/LabelService", "EwsLabelService");

    private EwsLabelServiceHttpPost_EwsLabelServiceHttpPost_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = EwsLabelService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        EwsLabelService ss = new EwsLabelService(wsdlURL, SERVICE_NAME);
        EwsLabelServiceHttpPost port = ss.getEwsLabelServiceHttpPost();

        {
        System.out.println("Invoking changePassPhraseXML...");
        java.lang.String _changePassPhraseXML_changePassPhraseRequestXML = "";
        com.envmgr.labelservice.ChangePassPhraseRequestResponse _changePassPhraseXML__return = port.changePassPhraseXML(_changePassPhraseXML_changePassPhraseRequestXML);
        System.out.println("changePassPhraseXML.result=" + _changePassPhraseXML__return);


        }
        {
        System.out.println("Invoking getPostageLabelXML...");
        java.lang.String _getPostageLabelXML_labelRequestXML = "";
        com.envmgr.labelservice.LabelRequestResponse _getPostageLabelXML__return = port.getPostageLabelXML(_getPostageLabelXML_labelRequestXML);
        System.out.println("getPostageLabelXML.result=" + _getPostageLabelXML__return);


        }
        {
        System.out.println("Invoking updatePaymentInformationXML...");
        java.lang.String _updatePaymentInformationXML_updatePaymentInformationRequestXML = "";
        com.envmgr.labelservice.UpdatePaymentInfoResponse _updatePaymentInformationXML__return = port.updatePaymentInformationXML(_updatePaymentInformationXML_updatePaymentInformationRequestXML);
        System.out.println("updatePaymentInformationXML.result=" + _updatePaymentInformationXML__return);


        }
        {
        System.out.println("Invoking getPicNumberXml...");
        java.lang.String _getPicNumberXml_picNumberRequestXml = "";
        com.envmgr.labelservice.LabelNumberResponse _getPicNumberXml__return = port.getPicNumberXml(_getPicNumberXml_picNumberRequestXml);
        System.out.println("getPicNumberXml.result=" + _getPicNumberXml__return);


        }
        {
        System.out.println("Invoking getRefundXML...");
        java.lang.String _getRefundXML_refundRequestXML = "";
        com.envmgr.labelservice.RefundResponse _getRefundXML__return = port.getRefundXML(_getRefundXML_refundRequestXML);
        System.out.println("getRefundXML.result=" + _getRefundXML__return);


        }
        {
        System.out.println("Invoking getExtraServiceRatesXML...");
        java.lang.String _getExtraServiceRatesXML_getExtraServiceRatesRequestXML = "";
        com.envmgr.labelservice.GetExtraServiceRateResponse _getExtraServiceRatesXML__return = port.getExtraServiceRatesXML(_getExtraServiceRatesXML_getExtraServiceRatesRequestXML);
        System.out.println("getExtraServiceRatesXML.result=" + _getExtraServiceRatesXML__return);


        }
        {
        System.out.println("Invoking createDhlgmManifestXML...");
        java.lang.String _createDhlgmManifestXML_createDhlgmManifestRequestXML = "";
        com.envmgr.labelservice.DhlgmManifestResponse _createDhlgmManifestXML__return = port.createDhlgmManifestXML(_createDhlgmManifestXML_createDhlgmManifestRequestXML);
        System.out.println("createDhlgmManifestXML.result=" + _createDhlgmManifestXML__return);


        }
        {
        System.out.println("Invoking calculatePostageRatesXML...");
        java.lang.String _calculatePostageRatesXML_postageRatesRequestXML = "";
        com.envmgr.labelservice.PostageRatesResponse _calculatePostageRatesXML__return = port.calculatePostageRatesXML(_calculatePostageRatesXML_postageRatesRequestXML);
        System.out.println("calculatePostageRatesXML.result=" + _calculatePostageRatesXML__return);


        }
        {
        System.out.println("Invoking getUserSignUpXML...");
        java.lang.String _getUserSignUpXML_userSignUpRequestXML = "";
        com.envmgr.labelservice.UserSignUpResponse _getUserSignUpXML__return = port.getUserSignUpXML(_getUserSignUpXML_userSignUpRequestXML);
        System.out.println("getUserSignUpXML.result=" + _getUserSignUpXML__return);


        }
        {
        System.out.println("Invoking setAccountFeatureOptInXML...");
        java.lang.String _setAccountFeatureOptInXML_setAccountFeatureOptInRequestXml = "";
        com.envmgr.labelservice.SetAccountFeatureOptInResult _setAccountFeatureOptInXML__return = port.setAccountFeatureOptInXML(_setAccountFeatureOptInXML_setAccountFeatureOptInRequestXml);
        System.out.println("setAccountFeatureOptInXML.result=" + _setAccountFeatureOptInXML__return);


        }
        {
        System.out.println("Invoking getPostageRateTableXML...");
        java.lang.String _getPostageRateTableXML_postageRateRequestXML = "";
        com.envmgr.labelservice.PostageRateTableResponse _getPostageRateTableXML__return = port.getPostageRateTableXML(_getPostageRateTableXML_postageRateRequestXML);
        System.out.println("getPostageRateTableXML.result=" + _getPostageRateTableXML__return);


        }
        {
        System.out.println("Invoking getVersionXML...");
        com.envmgr.labelservice.GetVersionResults _getVersionXML__return = port.getVersionXML();
        System.out.println("getVersionXML.result=" + _getVersionXML__return);


        }
        {
        System.out.println("Invoking calculatePostageRateXML...");
        java.lang.String _calculatePostageRateXML_postageRateRequestXML = "";
        com.envmgr.labelservice.PostageRateResponse _calculatePostageRateXML__return = port.calculatePostageRateXML(_calculatePostageRateXML_postageRateRequestXML);
        System.out.println("calculatePostageRateXML.result=" + _calculatePostageRateXML__return);


        }
        {
        System.out.println("Invoking getRetailAccountsXML...");
        java.lang.String _getRetailAccountsXML_retailAccountsRequestXML = "";
        com.envmgr.labelservice.RetailAccountsResponse _getRetailAccountsXML__return = port.getRetailAccountsXML(_getRetailAccountsXML_retailAccountsRequestXML);
        System.out.println("getRetailAccountsXML.result=" + _getRetailAccountsXML__return);


        }
        {
        System.out.println("Invoking getVersion...");
        com.envmgr.labelservice.GetVersionResults _getVersion__return = port.getVersion();
        System.out.println("getVersion.result=" + _getVersion__return);


        }
        {
        System.out.println("Invoking getChallengeQuestionXML...");
        java.lang.String _getChallengeQuestionXML_challengeQuestionRequestXML = "";
        com.envmgr.labelservice.ChallengeQuestionResponse _getChallengeQuestionXML__return = port.getChallengeQuestionXML(_getChallengeQuestionXML_challengeQuestionRequestXML);
        System.out.println("getChallengeQuestionXML.result=" + _getChallengeQuestionXML__return);


        }
        {
        System.out.println("Invoking statusRequestXML...");
        java.lang.String _statusRequestXML_packageStatusRequestXML = "";
        com.envmgr.labelservice.PackageStatusResponse _statusRequestXML__return = port.statusRequestXML(_statusRequestXML_packageStatusRequestXML);
        System.out.println("statusRequestXML.result=" + _statusRequestXML__return);


        }
        {
        System.out.println("Invoking calculateDdpRateXML...");
        java.lang.String _calculateDdpRateXML_ddpRateRequest = "";
        com.envmgr.labelservice.DdpRateResponse _calculateDdpRateXML__return = port.calculateDdpRateXML(_calculateDdpRateXML_ddpRateRequest);
        System.out.println("calculateDdpRateXML.result=" + _calculateDdpRateXML__return);


        }
        {
        System.out.println("Invoking closeAccountXML...");
        java.lang.String _closeAccountXML_closeAccountRequestXML = "";
        com.envmgr.labelservice.SetPendingCloseAccountResponse _closeAccountXML__return = port.closeAccountXML(_closeAccountXML_closeAccountRequestXML);
        System.out.println("closeAccountXML.result=" + _closeAccountXML__return);


        }
        {
        System.out.println("Invoking getTransactionsListingXML...");
        java.lang.String _getTransactionsListingXML_transactionsRequestXML = "";
        com.envmgr.labelservice.TransactionsListingResponse _getTransactionsListingXML__return = port.getTransactionsListingXML(_getTransactionsListingXML_transactionsRequestXML);
        System.out.println("getTransactionsListingXML.result=" + _getTransactionsListingXML__return);


        }
        {
        System.out.println("Invoking getPackagePickupChangeXML...");
        java.lang.String _getPackagePickupChangeXML_packagePickupChangeRequestXML = "";
        com.envmgr.labelservice.PackagePickupChangeResponse _getPackagePickupChangeXML__return = port.getPackagePickupChangeXML(_getPackagePickupChangeXML_packagePickupChangeRequestXML);
        System.out.println("getPackagePickupChangeXML.result=" + _getPackagePickupChangeXML__return);


        }
        {
        System.out.println("Invoking getAccountStatusXML...");
        java.lang.String _getAccountStatusXML_accountStatusRequestXML = "";
        com.envmgr.labelservice.AccountStatusResponse _getAccountStatusXML__return = port.getAccountStatusXML(_getAccountStatusXML_accountStatusRequestXML);
        System.out.println("getAccountStatusXML.result=" + _getAccountStatusXML__return);


        }
        {
        System.out.println("Invoking voideVSLabelXML...");
        java.lang.String _voideVSLabelXML_voidLabelRequestXML = "";
        com.envmgr.labelservice.VoidLabelResponse _voideVSLabelXML__return = port.voideVSLabelXML(_voideVSLabelXML_voidLabelRequestXML);
        System.out.println("voideVSLabelXML.result=" + _voideVSLabelXML__return);


        }
        {
        System.out.println("Invoking getPackagePickupCancelXML...");
        java.lang.String _getPackagePickupCancelXML_packagePickupCancelRequestXML = "";
        com.envmgr.labelservice.PackagePickupCancelResponse _getPackagePickupCancelXML__return = port.getPackagePickupCancelXML(_getPackagePickupCancelXML_packagePickupCancelRequestXML);
        System.out.println("getPackagePickupCancelXML.result=" + _getPackagePickupCancelXML__return);


        }
        {
        System.out.println("Invoking handleDHLeCManifestXML...");
        java.lang.String _handleDHLeCManifestXML_dhleCManifestRequestXML = "";
        com.envmgr.labelservice.DHLeCManifestResponse _handleDHLeCManifestXML__return = port.handleDHLeCManifestXML(_handleDHLeCManifestXML_dhleCManifestRequestXML);
        System.out.println("handleDHLeCManifestXML.result=" + _handleDHLeCManifestXML__return);


        }
        {
        System.out.println("Invoking getPackagePickupAvailabilityXML...");
        java.lang.String _getPackagePickupAvailabilityXML_packagePickupAvailabilityRequestXML = "";
        com.envmgr.labelservice.PackagePickupAvailabilityResponse _getPackagePickupAvailabilityXML__return = port.getPackagePickupAvailabilityXML(_getPackagePickupAvailabilityXML_packagePickupAvailabilityRequestXML);
        System.out.println("getPackagePickupAvailabilityXML.result=" + _getPackagePickupAvailabilityXML__return);


        }
        {
        System.out.println("Invoking getSCANXML...");
        java.lang.String _getSCANXML_scanRequestXML = "";
        com.envmgr.labelservice.SCANResponse _getSCANXML__return = port.getSCANXML(_getSCANXML_scanRequestXML);
        System.out.println("getSCANXML.result=" + _getSCANXML__return);


        }
        {
        System.out.println("Invoking getPackagePickupXML...");
        java.lang.String _getPackagePickupXML_packagePickupRequestXML = "";
        com.envmgr.labelservice.PackagePickupResponse _getPackagePickupXML__return = port.getPackagePickupXML(_getPackagePickupXML_packagePickupRequestXML);
        System.out.println("getPackagePickupXML.result=" + _getPackagePickupXML__return);


        }
        {
        System.out.println("Invoking validateAddressXML...");
        java.lang.String _validateAddressXML_validateAddressRequestXML = "";
        com.envmgr.labelservice.ValidateAddressInfoResponse _validateAddressXML__return = port.validateAddressXML(_validateAddressXML_validateAddressRequestXML);
        System.out.println("validateAddressXML.result=" + _validateAddressXML__return);


        }
        {
        System.out.println("Invoking buyPostageXML...");
        java.lang.String _buyPostageXML_recreditRequestXML = "";
        com.envmgr.labelservice.RecreditRequestResponse _buyPostageXML__return = port.buyPostageXML(_buyPostageXML_recreditRequestXML);
        System.out.println("buyPostageXML.result=" + _buyPostageXML__return);


        }
        {
        System.out.println("Invoking resetSuspendedAccountXML...");
        java.lang.String _resetSuspendedAccountXML_resetSuspendedAccountRequestXML = "";
        com.envmgr.labelservice.ResetSuspendedAccountRequestResponse _resetSuspendedAccountXML__return = port.resetSuspendedAccountXML(_resetSuspendedAccountXML_resetSuspendedAccountRequestXML);
        System.out.println("resetSuspendedAccountXML.result=" + _resetSuspendedAccountXML__return);


        }

        System.exit(0);
    }

}
