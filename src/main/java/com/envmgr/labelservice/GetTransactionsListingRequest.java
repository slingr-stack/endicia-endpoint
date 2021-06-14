
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetTransactionsListingRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetTransactionsListingRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{www.envmgr.com/LabelService}DataValidator"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestOptions" type="{www.envmgr.com/LabelService}TransactionListingsRequestOptions" minOccurs="0"/&gt;
 *         &lt;element name="PicNumbers" type="{www.envmgr.com/LabelService}ArrayOfString7" minOccurs="0"/&gt;
 *         &lt;element name="PieceIDs" type="{www.envmgr.com/LabelService}ArrayOfString8" minOccurs="0"/&gt;
 *         &lt;element name="TransactionIDs" type="{www.envmgr.com/LabelService}ArrayOfString9" minOccurs="0"/&gt;
 *         &lt;element name="CostCenters" type="{www.envmgr.com/LabelService}ArrayOfString10" minOccurs="0"/&gt;
 *         &lt;element name="IncludeTracking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IncludeFromAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IncludeAdjustmentDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequesterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertifiedIntermediary" type="{www.envmgr.com/LabelService}CertifiedIntermediary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTransactionsListingRequest", propOrder = {
    "requestID",
    "requestOptions",
    "picNumbers",
    "pieceIDs",
    "transactionIDs",
    "costCenters",
    "includeTracking",
    "includeFromAddress",
    "includeAdjustmentDetails",
    "requesterID",
    "certifiedIntermediary"
})
public class GetTransactionsListingRequest
    extends DataValidator
{

    @XmlElement(name = "RequestID")
    protected String requestID;
    @XmlElement(name = "RequestOptions")
    protected TransactionListingsRequestOptions requestOptions;
    @XmlElement(name = "PicNumbers")
    protected ArrayOfString7 picNumbers;
    @XmlElement(name = "PieceIDs")
    protected ArrayOfString8 pieceIDs;
    @XmlElement(name = "TransactionIDs")
    protected ArrayOfString9 transactionIDs;
    @XmlElement(name = "CostCenters")
    protected ArrayOfString10 costCenters;
    @XmlElement(name = "IncludeTracking")
    protected String includeTracking;
    @XmlElement(name = "IncludeFromAddress")
    protected String includeFromAddress;
    @XmlElement(name = "IncludeAdjustmentDetails")
    protected String includeAdjustmentDetails;
    @XmlElement(name = "RequesterID")
    protected String requesterID;
    @XmlElement(name = "CertifiedIntermediary")
    protected CertifiedIntermediary certifiedIntermediary;

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
     * Obtiene el valor de la propiedad requestOptions.
     * 
     * @return
     *     possible object is
     *     {@link TransactionListingsRequestOptions }
     *     
     */
    public TransactionListingsRequestOptions getRequestOptions() {
        return requestOptions;
    }

    /**
     * Define el valor de la propiedad requestOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionListingsRequestOptions }
     *     
     */
    public void setRequestOptions(TransactionListingsRequestOptions value) {
        this.requestOptions = value;
    }

    /**
     * Obtiene el valor de la propiedad picNumbers.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString7 }
     *     
     */
    public ArrayOfString7 getPicNumbers() {
        return picNumbers;
    }

    /**
     * Define el valor de la propiedad picNumbers.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString7 }
     *     
     */
    public void setPicNumbers(ArrayOfString7 value) {
        this.picNumbers = value;
    }

    /**
     * Obtiene el valor de la propiedad pieceIDs.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString8 }
     *     
     */
    public ArrayOfString8 getPieceIDs() {
        return pieceIDs;
    }

    /**
     * Define el valor de la propiedad pieceIDs.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString8 }
     *     
     */
    public void setPieceIDs(ArrayOfString8 value) {
        this.pieceIDs = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionIDs.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString9 }
     *     
     */
    public ArrayOfString9 getTransactionIDs() {
        return transactionIDs;
    }

    /**
     * Define el valor de la propiedad transactionIDs.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString9 }
     *     
     */
    public void setTransactionIDs(ArrayOfString9 value) {
        this.transactionIDs = value;
    }

    /**
     * Obtiene el valor de la propiedad costCenters.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString10 }
     *     
     */
    public ArrayOfString10 getCostCenters() {
        return costCenters;
    }

    /**
     * Define el valor de la propiedad costCenters.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString10 }
     *     
     */
    public void setCostCenters(ArrayOfString10 value) {
        this.costCenters = value;
    }

    /**
     * Obtiene el valor de la propiedad includeTracking.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeTracking() {
        return includeTracking;
    }

    /**
     * Define el valor de la propiedad includeTracking.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeTracking(String value) {
        this.includeTracking = value;
    }

    /**
     * Obtiene el valor de la propiedad includeFromAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeFromAddress() {
        return includeFromAddress;
    }

    /**
     * Define el valor de la propiedad includeFromAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeFromAddress(String value) {
        this.includeFromAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad includeAdjustmentDetails.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeAdjustmentDetails() {
        return includeAdjustmentDetails;
    }

    /**
     * Define el valor de la propiedad includeAdjustmentDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeAdjustmentDetails(String value) {
        this.includeAdjustmentDetails = value;
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
     * Obtiene el valor de la propiedad certifiedIntermediary.
     * 
     * @return
     *     possible object is
     *     {@link CertifiedIntermediary }
     *     
     */
    public CertifiedIntermediary getCertifiedIntermediary() {
        return certifiedIntermediary;
    }

    /**
     * Define el valor de la propiedad certifiedIntermediary.
     * 
     * @param value
     *     allowed object is
     *     {@link CertifiedIntermediary }
     *     
     */
    public void setCertifiedIntermediary(CertifiedIntermediary value) {
        this.certifiedIntermediary = value;
    }

}
