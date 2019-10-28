
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageStatusResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequesterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageStatus" type="{www.envmgr.com/LabelService}ArrayOfStatusResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="StartingTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EndingTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CompleteDataSet" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageStatusResponse", propOrder = {
    "status",
    "errorMessage",
    "requesterID",
    "requestID",
    "packageStatus"
})
public class PackageStatusResponse {

    @XmlElement(name = "Status")
    protected int status;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "RequesterID")
    protected String requesterID;
    @XmlElement(name = "RequestID")
    protected String requestID;
    @XmlElement(name = "PackageStatus")
    protected ArrayOfStatusResponse packageStatus;
    @XmlAttribute(name = "StartingTransactionID")
    protected String startingTransactionID;
    @XmlAttribute(name = "EndingTransactionID")
    protected String endingTransactionID;
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
     * Gets the value of the packageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStatusResponse }
     *     
     */
    public ArrayOfStatusResponse getPackageStatus() {
        return packageStatus;
    }

    /**
     * Sets the value of the packageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStatusResponse }
     *     
     */
    public void setPackageStatus(ArrayOfStatusResponse value) {
        this.packageStatus = value;
    }

    /**
     * Gets the value of the startingTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartingTransactionID() {
        return startingTransactionID;
    }

    /**
     * Sets the value of the startingTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartingTransactionID(String value) {
        this.startingTransactionID = value;
    }

    /**
     * Gets the value of the endingTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndingTransactionID() {
        return endingTransactionID;
    }

    /**
     * Sets the value of the endingTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndingTransactionID(String value) {
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
