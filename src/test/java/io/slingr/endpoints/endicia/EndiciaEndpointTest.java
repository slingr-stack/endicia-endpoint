package io.slingr.endpoints.endicia;

import com.envmgr.labelservice.*;
import io.slingr.endpoints.utils.tests.EndpointTests;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.net.URL;

@Ignore("For dev purposes only")
public class EndiciaEndpointTest {

    private static EndpointTests test;
    private static EndiciaEndpoint endpoint;

    private static URL API_URL;
    private static String accountNumber = "";
    private static String passphrase = "";
    private static String requesterId = "";

    @BeforeClass
    public static void init() throws Exception {
        test = EndpointTests.start(new io.slingr.endpoints.endicia.Runner(), "test.properties");
        endpoint = (EndiciaEndpoint) test.getEndpoint();
        API_URL = new URL("https://elstestserver.endicia.com/LabelService/EwsLabelService.asmx?wsdl");
    }

    @Test
    @Ignore
    public void testChangePassPhrase() {

//        EwsLabelService ewsLabelService = new EwsLabelService(API_URL);
//
//        CertifiedIntermediary certifiedIntermediary = new CertifiedIntermediary();
//        certifiedIntermediary.setAccountID(accountNumber);
//        certifiedIntermediary.setPassPhrase(passphrase);
//
//        ChangePassPhraseRequest changePassPhraseReq = new ChangePassPhraseRequest();
//        changePassPhraseReq.setCertifiedIntermediary(certifiedIntermediary);
//        changePassPhraseReq.setRequesterID(requesterId);
//        changePassPhraseReq.setRequestID("1");
//        changePassPhraseReq.setNewPassPhrase("maipu is cool");
//
//        ChangePassPhraseRequestResponse response = ewsLabelService.getEwsLabelServiceSoap().changePassPhrase(changePassPhraseReq);
//
//        String strRes = JSONUtils.toJson(response, true);
//        Assert.assertNotNull(strRes);
//        System.out.println(strRes);

    }

    @Test
    @Ignore
    public void testRecredit() {

        EwsLabelService ewsLabelService = new EwsLabelService(API_URL);

        CertifiedIntermediary certifiedIntermediary = new CertifiedIntermediary();
        certifiedIntermediary.setAccountID(accountNumber);
        certifiedIntermediary.setPassPhrase(passphrase);

        RecreditRequest recreditRequest = new RecreditRequest();
        recreditRequest.setCertifiedIntermediary(certifiedIntermediary);
        recreditRequest.setRequesterID(requesterId);
        recreditRequest.setRecreditAmount("500");
        recreditRequest.setRequestID("1");

        RecreditRequestResponse response = ewsLabelService.getEwsLabelServiceSoap().buyPostage(recreditRequest);

        String strRes = JSONUtils.toJson(response, true);
        Assert.assertNotNull(strRes);
        System.out.println(strRes);

    }


    @Test
    public void testLabelRequest() {

        EwsLabelService ewsLabelService = new EwsLabelService(API_URL);

        CertifiedIntermediary certifiedIntermediary = new CertifiedIntermediary();
        certifiedIntermediary.setAccountID(accountNumber);
        certifiedIntermediary.setPassPhrase(passphrase);

        LabelRequest labelRequest = new LabelRequest();
        labelRequest.setRequesterID(requesterId);
        labelRequest.setAccountID(accountNumber);
        labelRequest.setPassPhrase(passphrase);
        labelRequest.setMailClass("Priority");
        labelRequest.setWeightOz(16);
        labelRequest.setPartnerCustomerID("100");
        labelRequest.setPartnerTransactionID("200");
        labelRequest.setToName("Jane Doe");
        labelRequest.setToAddress1("1 Hacker Way");
        labelRequest.setToCity("Palo Alto");
        labelRequest.setToState("CA");
        labelRequest.setToPostalCode("94025");
        labelRequest.setFromCompany("Endicia, Inc.");
        labelRequest.setFromName("John Doe");
        labelRequest.setReturnAddress1("278 Castro Street");
        labelRequest.setFromCity("Mountain View");
        labelRequest.setFromState("CA");
        labelRequest.setFromPostalCode("94041");

        LabelRequestResponse response = ewsLabelService.getEwsLabelServiceSoap().getPostageLabel(labelRequest);

        String strRes = JSONUtils.toJson(response, true);
        Assert.assertNotNull(strRes);
        System.out.println(strRes);
        System.out.println("---END---");

    }

//    @Test
//    @Ignore
//    public void testPackageStatusByPicNumbers() {
//
//        EwsLabelService ewsLabelService = new EwsLabelService(API_URL);
//
//        CertifiedIntermediary certifiedIntermediary = new CertifiedIntermediary();
//        certifiedIntermediary.setAccountID(accountNumber);
//        certifiedIntermediary.setPassPhrase(passphrase);
//
//        PackageStatusRequest packageStatusReq = new PackageStatusRequest();
//        packageStatusReq.setCertifiedIntermediary(certifiedIntermediary);
//        packageStatusReq.setRequesterID(requesterId);
//
//        packageStatusReq.getPicNumbers().getPicNumber().add(picNumber);
//
//        PackageStatusResponse response =
//                ewsLabelService.getEwsLabelServiceSoap().statusRequest(packageStatusReq);
//
//        String strRes = JSONUtils.toJson(response, true);
//        Assert.assertNotNull(strRes);
//        System.out.println(strRes);
//
//    }

}
