---
title: Endicia endpoint
keywords: 
last_updated: October 29, 2019
tags: []
summary: "Detailed description of the API of the Endicia endpoint."
---

## Overview

The Endicia endpoint allows to check package status in Endicia.

Some of the features are:

- Track by pic number
- Track by pice number
- Track by transaction id
- Track by reference id
- Listing transactions

In order to make it easy to work with the endpoint, it provides helpers so you don't need to worry
about XML request. For example, in order to track a package by pic number:

```js
var res = app.endpoints.endicia.trackByPicNumber("XXXX");
log(JSON.stringify(res));
```

## Configuration

First of all you will need to create an account for Endicia. Once you have created it and the
endpoint is configured, you can start interact with the API.

### Account Number

It is the users account number.

### Pass Phrase

Pass Phrase you selected when creating your account

### Requester ID

It is the four-character code that identifies the request as coming from aspecific partner.

### API Endpoint

Can be Sandbox or Custom. Sandbox is default value and when it is selected the Sanbox URL 
is used in each request but you can chose custom in order to provide the production URL.

### Shortcuts

Instead of having to use the generic HTTP methods, you can make use of the shortcuts provided in the endpoint. These
shortcuts follow these rules:

### Shortcuts

Following is a list of available helpers to interact with SOAP service. Check [API Documentation](https://www.endicia.com/developer/docs/v8.9.html):

- endpoint.trackByPicNumber(picNumber);

- endpoint.trackByPieceNumber(pieceNumber);

- endpoint.trackByTransactionId(transactionId);

- endpoint.trackByReferenceId(referenceId);

- endpoint.transactionListings(startDateTime, endDateTime);

```javascript

var res = app.endpoints.proxy.trackByPicNumber("0405510200830104037144");
log(JSON.stringify(res));

var res = app.endpoints.proxy.transactionListings("09/29/2019 12:00:00 AM", "10/29/2019 11:59:00 PM");
log(JSON.stringify(res));

```

## About SLINGR

SLINGR is a low-code rapid application development platform that accelerates development, with robust architecture for integrations and executing custom workflows and automation.

[More info about SLINGR](https://slingr.io)

## License

This endpoint is licensed under the Apache License 2.0. See the `LICENSE` file for more details.
