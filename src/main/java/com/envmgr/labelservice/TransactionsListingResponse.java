
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionsListingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionsListingResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequesterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransactionsResults" type="{www.envmgr.com/LabelService}ArrayOfTransaction" minOccurs="0"/&gt;
 *         &lt;element name="ResponseOptions" type="{www.envmgr.com/LabelService}TransactionsResponseOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="StartingTransactionID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="EndingTransactionID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="CompleteDataSet" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionsListingResponse", propOrder = {
    "status",
    "errorMessage",
    "requesterID",
    "requestID",
    "transactionsResults",
    "responseOptions"
})
public class TransactionsListingResponse {

    @XmlElement(name = "Status")
    protected int status;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "RequesterID")
    protected String requesterID;
    @XmlElement(name = "RequestID")
    protected String requestID;
    @XmlElement(name = "TransactionsResults")
    protected ArrayOfTransaction transactionsResults;
    @XmlElement(name = "ResponseOptions")
    protected TransactionsResponseOptions responseOptions;
    @XmlAttribute(name = "StartingTransactionID", required = true)
    protected long startingTransactionID;
    @XmlAttribute(name = "EndingTransactionID", required = true)
    protected long endingTransactionID;
    @XmlAttribute(name = "CompleteDataSet", required = true)
    protected boolean completeDataSet;

    /**
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the requesterID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterID() {
        return requesterID;
    }

    /**
     * Sets the value of the requesterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterID(String value) {
        this.requesterID = value;
    }

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the transactionsResults property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransaction }
     *     
     */
    public ArrayOfTransaction getTransactionsResults() {
        return transactionsResults;
    }

    /**
     * Sets the value of the transactionsResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransaction }
     *     
     */
    public void setTransactionsResults(ArrayOfTransaction value) {
        this.transactionsResults = value;
    }

    /**
     * Gets the value of the responseOptions property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionsResponseOptions }
     *     
     */
    public TransactionsResponseOptions getResponseOptions() {
        return responseOptions;
    }

    /**
     * Sets the value of the responseOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionsResponseOptions }
     *     
     */
    public void setResponseOptions(TransactionsResponseOptions value) {
        this.responseOptions = value;
    }

    /**
     * Gets the value of the startingTransactionID property.
     * 
     */
    public long getStartingTransactionID() {
        return startingTransactionID;
    }

    /**
     * Sets the value of the startingTransactionID property.
     * 
     */
    public void setStartingTransactionID(long value) {
        this.startingTransactionID = value;
    }

    /**
     * Gets the value of the endingTransactionID property.
     * 
     */
    public long getEndingTransactionID() {
        return endingTransactionID;
    }

    /**
     * Sets the value of the endingTransactionID property.
     * 
     */
    public void setEndingTransactionID(long value) {
        this.endingTransactionID = value;
    }

    /**
     * Gets the value of the completeDataSet property.
     * 
     */
    public boolean isCompleteDataSet() {
        return completeDataSet;
    }

    /**
     * Sets the value of the completeDataSet property.
     * 
     */
    public void setCompleteDataSet(boolean value) {
        this.completeDataSet = value;
    }

}
