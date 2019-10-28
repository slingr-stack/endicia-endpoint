package io.slingr.endpoints.endicia;

import com.envmgr.labelservice.CertifiedIntermediary;
import com.envmgr.labelservice.EwsLabelService;
import com.envmgr.labelservice.PackageStatusRequest;
import com.envmgr.labelservice.PackageStatusResponse;
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
        packageStatusReq.getPicNumbers().getPicNumber().add(picNumber);

        PackageStatusResponse response = ewsLabelService.getEwsLabelServiceSoap().statusRequest(packageStatusReq);
        return Json.parse(JSONUtils.toJson(response, true));
    }

    @EndpointFunction(name = "_trackByPieceNumber")
    public Json trackByPieceNumber(Json params) {

        EwsLabelService ewsLabelService = getLabelService();
        PackageStatusRequest packageStatusReq = getPackageStatusRequest();

        String pieceNumber = params.string("pieceNumber");
        packageStatusReq.getPieceNumbers().getPieceNumber().add(pieceNumber);

        PackageStatusResponse response = ewsLabelService.getEwsLabelServiceSoap().statusRequest(packageStatusReq);
        return Json.parse(JSONUtils.toJson(response, true));
    }

    @EndpointFunction(name = "_trackByTransactionId")
    public Json trackByTransactionId(Json params) {
        EwsLabelService ewsLabelService = getLabelService();
        PackageStatusRequest packageStatusReq = getPackageStatusRequest();

        String transactionId = params.string("transactionId");
        packageStatusReq.getTransactionIds().getTransactionId().add(transactionId);

        PackageStatusResponse response = ewsLabelService.getEwsLabelServiceSoap().statusRequest(packageStatusReq);
        return Json.parse(JSONUtils.toJson(response, true));
    }

    @EndpointFunction(name = "_trackByReferenceId")
    public Json trackByReferenceId(Json params) {
        EwsLabelService ewsLabelService = getLabelService();
        PackageStatusRequest packageStatusReq = getPackageStatusRequest();

        String referenceId = params.string("referenceId");
        packageStatusReq.getReferenceIds().getReferenceId().add(referenceId);

        PackageStatusResponse response = ewsLabelService.getEwsLabelServiceSoap().statusRequest(packageStatusReq);
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
