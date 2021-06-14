
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PackageStatusRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PackageStatusRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{www.envmgr.com/LabelService}DataValidator"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestOptions" type="{www.envmgr.com/LabelService}PackageStatusRequestOptions" minOccurs="0"/&gt;
 *         &lt;element name="PicNumbers" type="{www.envmgr.com/LabelService}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="PieceNumbers" type="{www.envmgr.com/LabelService}ArrayOfString2" minOccurs="0"/&gt;
 *         &lt;element name="TransactionIds" type="{www.envmgr.com/LabelService}ArrayOfString1" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceIds" type="{www.envmgr.com/LabelService}ArrayOfString6" minOccurs="0"/&gt;
 *         &lt;element name="RequesterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertifiedIntermediary" type="{www.envmgr.com/LabelService}CertifiedIntermediary" minOccurs="0"/&gt;
 *         &lt;element name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageStatusRequest", propOrder = {
    "requestID",
    "requestOptions",
    "picNumbers",
    "pieceNumbers",
    "transactionIds",
    "referenceIds",
    "requesterID",
    "certifiedIntermediary",
    "carrier"
})
public class PackageStatusRequest
    extends DataValidator
{

    @XmlElement(name = "RequestID")
    protected String requestID;
    @XmlElement(name = "RequestOptions")
    protected PackageStatusRequestOptions requestOptions;
    @XmlElement(name = "PicNumbers")
    protected ArrayOfString picNumbers;
    @XmlElement(name = "PieceNumbers")
    protected ArrayOfString2 pieceNumbers;
    @XmlElement(name = "TransactionIds")
    protected ArrayOfString1 transactionIds;
    @XmlElement(name = "ReferenceIds")
    protected ArrayOfString6 referenceIds;
    @XmlElement(name = "RequesterID")
    protected String requesterID;
    @XmlElement(name = "CertifiedIntermediary")
    protected CertifiedIntermediary certifiedIntermediary;
    @XmlElement(name = "Carrier")
    protected String carrier;

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
     *     {@link PackageStatusRequestOptions }
     *     
     */
    public PackageStatusRequestOptions getRequestOptions() {
        return requestOptions;
    }

    /**
     * Define el valor de la propiedad requestOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageStatusRequestOptions }
     *     
     */
    public void setRequestOptions(PackageStatusRequestOptions value) {
        this.requestOptions = value;
    }

    /**
     * Obtiene el valor de la propiedad picNumbers.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getPicNumbers() {
        return picNumbers;
    }

    /**
     * Define el valor de la propiedad picNumbers.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setPicNumbers(ArrayOfString value) {
        this.picNumbers = value;
    }

    /**
     * Obtiene el valor de la propiedad pieceNumbers.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString2 }
     *     
     */
    public ArrayOfString2 getPieceNumbers() {
        return pieceNumbers;
    }

    /**
     * Define el valor de la propiedad pieceNumbers.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString2 }
     *     
     */
    public void setPieceNumbers(ArrayOfString2 value) {
        this.pieceNumbers = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionIds.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString1 }
     *     
     */
    public ArrayOfString1 getTransactionIds() {
        return transactionIds;
    }

    /**
     * Define el valor de la propiedad transactionIds.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString1 }
     *     
     */
    public void setTransactionIds(ArrayOfString1 value) {
        this.transactionIds = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceIds.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString6 }
     *     
     */
    public ArrayOfString6 getReferenceIds() {
        return referenceIds;
    }

    /**
     * Define el valor de la propiedad referenceIds.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString6 }
     *     
     */
    public void setReferenceIds(ArrayOfString6 value) {
        this.referenceIds = value;
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

    /**
     * Obtiene el valor de la propiedad carrier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Define el valor de la propiedad carrier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

}
