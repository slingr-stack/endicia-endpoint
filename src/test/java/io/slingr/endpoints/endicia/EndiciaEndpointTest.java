package io.slingr.endpoints.endicia;

import com.envmgr.labelservice.*;
import io.slingr.endpoints.framework.annotations.EndpointConfiguration;
import io.slingr.endpoints.utils.Json;
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
        API_URL = new URL("https://elstestserver2.endicia.com/LabelService/EwsLabelService.asmx?wsdl");
        accountNumber = endpoint.configuration.string("accountNumber");
        passphrase = endpoint. configuration.string("passphrase");
        requesterId = endpoint. configuration.string("requesterId");
    }

    @Test
    @Ignore
    public void testChangePassPhrase() {

        EwsLabelService ewsLabelService = new EwsLabelService(API_URL);

        CertifiedIntermediary certifiedIntermediary = new CertifiedIntermediary();
        certifiedIntermediary.setAccountID(accountNumber);
        certifiedIntermediary.setPassPhrase(passphrase);

        ChangePassPhraseRequest changePassPhraseReq = new ChangePassPhraseRequest();
        changePassPhraseReq.setCertifiedIntermediary(certifiedIntermediary);
        changePassPhraseReq.setRequesterID(requesterId);
        changePassPhraseReq.setRequestID("1");
        changePassPhraseReq.setNewPassPhrase("maipu is cool");

        ChangePassPhraseRequestResponse response = ewsLabelService.getEwsLabelServiceSoap().changePassPhrase(changePassPhraseReq);

        String strRes = JSONUtils.toJson(response, true);
        Assert.assertNotNull(strRes);
        System.out.println(strRes);

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
    @Ignore
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

    @Test
    @Ignore
    public void testTransactionListRequest() {

        EwsLabelService ewsLabelService = new EwsLabelService(API_URL);

        CertifiedIntermediary certifiedIntermediary = new CertifiedIntermediary();
        certifiedIntermediary.setAccountID(accountNumber);
        certifiedIntermediary.setPassPhrase(passphrase);

        GetTransactionsListingRequest txListReq = new GetTransactionsListingRequest();
        txListReq.setCertifiedIntermediary(certifiedIntermediary);
        txListReq.setRequestID("1");
        txListReq.setRequesterID(requesterId);

        TransactionListingsRequestOptions options = new TransactionListingsRequestOptions();
        options.setStartDateTime("09/29/2019 12:00:00 AM");
        options.setEndDateTime("10/29/2019 11:59:00 PM");

        TransactionsListingResponse response = ewsLabelService.getEwsLabelServiceSoap().getTransactionsListing(txListReq);

        String strRes = JSONUtils.toJson(response, true);
        Assert.assertNotNull(strRes);
        System.out.println(strRes);
        System.out.println("---END---");

    }

    @Test
    public void testTrackByPicNumber() {
        Json response = endpoint.trackByPicNumber(Json.map().set("picNumber","281362593420"));
        System.out.println(response);
    }
}
