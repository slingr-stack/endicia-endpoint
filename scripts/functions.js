endpoint.trackByPicNumber = function (picNumber) {
    var options = {
        picNumber: picNumber
    };
    return endpoint._trackByPicNumber(options);
};

endpoint.trackByPieceNumber = function (pieceNumber) {
    var options = {
        pieceNumber: pieceNumber
    };
    return endpoint._trackByPieceNumber(options);
};

endpoint.trackByTransactionId = function (transactionId) {
    var options = {
        transactionId: transactionId
    };
    return endpoint._trackByTransactionId(options);
};

endpoint.trackByReferenceId = function (referenceId) {
    var options = {
        referenceId: referenceId
    };
    return endpoint._trackByReferenceId(options);
};
