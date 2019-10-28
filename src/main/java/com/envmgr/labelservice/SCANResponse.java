
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SCANResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCANResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequesterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubmissionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SCANForm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubmissionIdOld" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ScanFormOld" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExcludedItems" type="{www.envmgr.com/LabelService}ArrayOfString10" minOccurs="0"/&gt;
 *         &lt;element name="EndOfDayManifest" type="{www.envmgr.com/LabelService}EndOfDayManifest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCANResponse", propOrder = {
    "errorMessage",
    "requesterID",
    "requestID",
    "submissionID",
    "scanForm",
    "submissionIdOld",
    "scanFormOld",
    "excludedItems",
    "endOfDayManifest"
})
public class SCANResponse {

    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "RequesterID")
    protected String requesterID;
    @XmlElement(name = "RequestID")
    protected String requestID;
    @XmlElement(name = "SubmissionID")
    protected String submissionID;
    @XmlElement(name = "SCANForm")
    protected String scanForm;
    @XmlElement(name = "SubmissionIdOld")
    protected String submissionIdOld;
    @XmlElement(name = "ScanFormOld")
    protected String scanFormOld;
    @XmlElement(name = "ExcludedItems")
    protected ArrayOfString10 excludedItems;
    @XmlElement(name = "EndOfDayManifest")
    protected EndOfDayManifest endOfDayManifest;

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
     * Gets the value of the submissionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmissionID() {
        return submissionID;
    }

    /**
     * Sets the value of the submissionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmissionID(String value) {
        this.submissionID = value;
    }

    /**
     * Gets the value of the scanForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCANForm() {
        return scanForm;
    }

    /**
     * Sets the value of the scanForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCANForm(String value) {
        this.scanForm = value;
    }

    /**
     * Gets the value of the submissionIdOld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmissionIdOld() {
        return submissionIdOld;
    }

    /**
     * Sets the value of the submissionIdOld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmissionIdOld(String value) {
        this.submissionIdOld = value;
    }

    /**
     * Gets the value of the scanFormOld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanFormOld() {
        return scanFormOld;
    }

    /**
     * Sets the value of the scanFormOld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanFormOld(String value) {
        this.scanFormOld = value;
    }

    /**
     * Gets the value of the excludedItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString10 }
     *     
     */
    public ArrayOfString10 getExcludedItems() {
        return excludedItems;
    }

    /**
     * Sets the value of the excludedItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString10 }
     *     
     */
    public void setExcludedItems(ArrayOfString10 value) {
        this.excludedItems = value;
    }

    /**
     * Gets the value of the endOfDayManifest property.
     * 
     * @return
     *     possible object is
     *     {@link EndOfDayManifest }
     *     
     */
    public EndOfDayManifest getEndOfDayManifest() {
        return endOfDayManifest;
    }

    /**
     * Sets the value of the endOfDayManifest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndOfDayManifest }
     *     
     */
    public void setEndOfDayManifest(EndOfDayManifest value) {
        this.endOfDayManifest = value;
    }

}
