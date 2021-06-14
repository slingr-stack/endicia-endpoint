
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SCANResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
 *         &lt;element name="ExcludedItems" type="{www.envmgr.com/LabelService}ArrayOfString3" minOccurs="0"/&gt;
 *         &lt;element name="EndOfDayManifest" type="{www.envmgr.com/LabelService}EndOfDayManifest" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalScanForms" type="{www.envmgr.com/LabelService}ArrayOfString4" minOccurs="0"/&gt;
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
    "endOfDayManifest",
    "additionalScanForms"
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
    protected ArrayOfString3 excludedItems;
    @XmlElement(name = "EndOfDayManifest")
    protected EndOfDayManifest endOfDayManifest;
    @XmlElement(name = "AdditionalScanForms")
    protected ArrayOfString4 additionalScanForms;

    /**
     * Obtiene el valor de la propiedad errorMessage.
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
     * Define el valor de la propiedad errorMessage.
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
     * Obtiene el valor de la propiedad requesterID.
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
     * Define el valor de la propiedad requesterID.
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
     * Obtiene el valor de la propiedad requestID.
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
     * Define el valor de la propiedad requestID.
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
     * Obtiene el valor de la propiedad submissionID.
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
     * Define el valor de la propiedad submissionID.
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
     * Obtiene el valor de la propiedad scanForm.
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
     * Define el valor de la propiedad scanForm.
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
     * Obtiene el valor de la propiedad submissionIdOld.
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
     * Define el valor de la propiedad submissionIdOld.
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
     * Obtiene el valor de la propiedad scanFormOld.
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
     * Define el valor de la propiedad scanFormOld.
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
     * Obtiene el valor de la propiedad excludedItems.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString3 }
     *     
     */
    public ArrayOfString3 getExcludedItems() {
        return excludedItems;
    }

    /**
     * Define el valor de la propiedad excludedItems.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString3 }
     *     
     */
    public void setExcludedItems(ArrayOfString3 value) {
        this.excludedItems = value;
    }

    /**
     * Obtiene el valor de la propiedad endOfDayManifest.
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
     * Define el valor de la propiedad endOfDayManifest.
     * 
     * @param value
     *     allowed object is
     *     {@link EndOfDayManifest }
     *     
     */
    public void setEndOfDayManifest(EndOfDayManifest value) {
        this.endOfDayManifest = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalScanForms.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString4 }
     *     
     */
    public ArrayOfString4 getAdditionalScanForms() {
        return additionalScanForms;
    }

    /**
     * Define el valor de la propiedad additionalScanForms.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString4 }
     *     
     */
    public void setAdditionalScanForms(ArrayOfString4 value) {
        this.additionalScanForms = value;
    }

}
