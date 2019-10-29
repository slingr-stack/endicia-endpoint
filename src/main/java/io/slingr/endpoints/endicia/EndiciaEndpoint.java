package io.slingr.endpoints.endicia;

import com.envmgr.labelservice.*;
import io.slingr.endpoints.Endpoint;
import io.slingr.endpoints.framework.annotations.EndpointFunction;
import io.slingr.endpoints.framework.annotations.EndpointProperty;
import io.slingr.endpoints.framework.annotations.SlingrEndpoint;
import io.slingr.endpoints.utils.Json;
import org.apache.log4j.Logger;

import java.net.URL;

@SlingrEndpoint(name = "endicia")
public class EndiciaEndpoint extends Endpoint {

    private static final Logger logger = Logger.getLogger(EndiciaEndpoint.class);

    @EndpointProperty
    private String accountNumber;

    @EndpointProperty
    private String passphrase;

    @EndpointProperty
    private String requesterId;

    @EndpointProperty
    private String sandbox;

    @Override
    public void endpointStarted() {
        logger.info("Starting Endicia track client...");
    }

    @EndpointFunction(name = "_trackByPicNumber")
    public Json trackByPicNumber(Json params) {

        EwsLabelService ewsLabelService = getLabelService();
        PackageStatusRequest packageStatusReq = getPackageStatusRequest();

        String picNumber = params.string("picNumber");

        ArrayOfString1 arrayOfString1 = new ArrayOfString1();
        arrayOfString1.getPicNumber().add(picNumber);
        packageStatusReq.setPicNumbers(arrayOfString1);

        PackageStatusResponse response = ewsLabelService.getEwsLabelServiceSoap().statusRequest(packageStatusReq);
        return Json.parse(JSONUtils.toJson(response, true));
    }

    @EndpointFunction(name = "_trackByPieceNumber")
    public Json trackByPieceNumber(Json params) {

        EwsLabelService ewsLabelService = getLabelService();
        PackageStatusRequest packageStatusReq = getPackageStatusRequest();

        String pieceNumber = params.string("pieceNumber");
        ArrayOfString2 arrayOfString2 = new ArrayOfString2();
        arrayOfString2.getPieceNumber().add(pieceNumber);
        packageStatusReq.setPieceNumbers(arrayOfString2);

        PackageStatusResponse response = ewsLabelService.getEwsLabelServiceSoap().statusRequest(packageStatusReq);
        return Json.parse(JSONUtils.toJson(response, true));
    }

    @EndpointFunction(name = "_trackByTransactionId")
    public Json trackByTransactionId(Json params) {
        EwsLabelService ewsLabelService = getLabelService();
        PackageStatusRequest packageStatusReq = getPackageStatusRequest();

        String transactionId = params.string("transactionId");
        ArrayOfString3 arrayOfString3 = new ArrayOfString3();
        arrayOfString3.getTransactionId().add(transactionId);
        packageStatusReq.setTransactionIds(arrayOfString3);

        PackageStatusResponse response = ewsLabelService.getEwsLabelServiceSoap().statusRequest(packageStatusReq);
        return Json.parse(JSONUtils.toJson(response, true));
    }

    @EndpointFunction(name = "_trackByReferenceId")
    public Json trackByReferenceId(Json params) {
        EwsLabelService ewsLabelService = getLabelService();
        PackageStatusRequest packageStatusReq = getPackageStatusRequest();

        String referenceId = params.string("referenceId");
        ArrayOfString4 arrayOfString4 = new ArrayOfString4();
        arrayOfString4.getReferenceId().add(referenceId);
        packageStatusReq.setReferenceIds(arrayOfString4);

        PackageStatusResponse response = ewsLabelService.getEwsLabelServiceSoap().statusRequest(packageStatusReq);
        return Json.parse(JSONUtils.toJson(response, true));
    }

    @EndpointFunction(name = "_transactionListings")
    public Json transactionListings(Json params){

        EwsLabelService ewsLabelService = getLabelService();

        String startDateTime = params.string("pieceNumber");
        String endDateTime = params.string("pieceNumber");

        GetTransactionsListingRequest txListReq = new GetTransactionsListingRequest();
        txListReq.setCertifiedIntermediary(getCredentials());
        txListReq.setRequestID("1");
        txListReq.setRequesterID(requesterId);

        TransactionListingsRequestOptions options = new TransactionListingsRequestOptions();
        options.setStartDateTime(startDateTime);
        options.setEndDateTime(endDateTime);

        TransactionsListingResponse response = ewsLabelService.getEwsLabelServiceSoap().getTransactionsListing(txListReq);

        return Json.parse(JSONUtils.toJson(response, true));
    }

    private CertifiedIntermediary getCredentials() {
        CertifiedIntermediary certifiedIntermediary = new CertifiedIntermediary();
        certifiedIntermediary.setAccountID(accountNumber);
        certifiedIntermediary.setPassPhrase(passphrase);
        return certifiedIntermediary;
    }

    private PackageStatusRequest getPackageStatusRequest() {
        PackageStatusRequest packageStatusReq = new PackageStatusRequest();
        packageStatusReq.setCertifiedIntermediary(getCredentials());
        packageStatusReq.setRequesterID(requesterId);
        packageStatusReq.setRequestID("1");
        return packageStatusReq;
    }

    private EwsLabelService getLabelService() {
        try {
            URL URL = new URL("https://elstestserver.endicia.com/LabelService/EwsLabelService.asmx?wsdl");
            EwsLabelService ewsLabelService = new EwsLabelService(URL);
            return ewsLabelService;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
