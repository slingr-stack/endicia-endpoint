
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PackageStatusResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad status.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

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
     * Obtiene el valor de la propiedad packageStatus.
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
     * Define el valor de la propiedad packageStatus.
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
     * Obtiene el valor de la propiedad startingTransactionID.
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
     * Define el valor de la propiedad startingTransactionID.
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
     * Obtiene el valor de la propiedad endingTransactionID.
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
     * Define el valor de la propiedad endingTransactionID.
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
     * Obtiene el valor de la propiedad completeDataSet.
     * 
     */
    public boolean isCompleteDataSet() {
        return completeDataSet;
    }

    /**
     * Define el valor de la propiedad completeDataSet.
     * 
     */
    public void setCompleteDataSet(boolean value) {
        this.completeDataSet = value;
    }

}
