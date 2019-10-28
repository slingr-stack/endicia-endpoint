package io.slingr.endpoints.endicia;

import com.envmgr.labelservice.*;
import io.slingr.endpoints.utils.tests.EndpointTests;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

@Ignore("For dev purposes only")
public class EndiciaEndpointTest {

    private static EndpointTests test;
    private static EndiciaEndpoint endpoint;

    @BeforeClass
    public static void init() throws Exception {
        test = EndpointTests.start(new io.slingr.endpoints.endicia.Runner(), "test.properties");
        endpoint = (EndiciaEndpoint) test.getEndpoint();
    }

    @Test
    public void trackByTrackNumber() {

        try {

            URL URL = new URL("https://elstestserver.endicia.com/LabelService/EwsLabelService.asmx?wsdl");

            String accountNumber = "";
            String passphrase = "";
            String requesterId = "";

            EwsLabelService ewsLabelService = new EwsLabelService(URL);

            CertifiedIntermediary certifiedIntermediary = new CertifiedIntermediary();
            certifiedIntermediary.setAccountID(accountNumber);
            certifiedIntermediary.setPassPhrase(passphrase);

            RecreditRequest recreditRequest = new RecreditRequest();
            recreditRequest.setCertifiedIntermediary(certifiedIntermediary);
            recreditRequest.setRequesterID(requesterId);
            recreditRequest.setRecreditAmount("500");
            recreditRequest.setRequestID("1");


            PackageStatusRequest packageStatusRequest = new PackageStatusRequest();
            packageStatusRequest.setCertifiedIntermediary(certifiedIntermediary);
//            packageStatusRequest.setTransactionIds();

//            StatusRequest statusRequest = new StatusRequest();
//            statusRequest.

            RecreditRequestResponse res = ewsLabelService.getEwsLabelServiceSoap().buyPostage(recreditRequest);

            String str = JSONUtils.toJson(res, true);
            System.out.println(str);

        } catch (MalformedURLException uex) {
            uex.printStackTrace();
        }

    }

}
