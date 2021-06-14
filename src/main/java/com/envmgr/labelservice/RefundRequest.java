
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RefundRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RefundRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{www.envmgr.com/LabelService}DataValidator"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PicNumbers" type="{www.envmgr.com/LabelService}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="TransactionIds" type="{www.envmgr.com/LabelService}ArrayOfLong" minOccurs="0"/&gt;
 *         &lt;element name="PieceNumbers" type="{www.envmgr.com/LabelService}ArrayOfInt" minOccurs="0"/&gt;
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
@XmlType(name = "RefundRequest", propOrder = {
    "requestID",
    "picNumbers",
    "transactionIds",
    "pieceNumbers",
    "requesterID",
    "certifiedIntermediary"
})
public class RefundRequest
    extends DataValidator
{

    @XmlElement(name = "RequestID")
    protected String requestID;
    @XmlElement(name = "PicNumbers")
    protected ArrayOfString picNumbers;
    @XmlElement(name = "TransactionIds")
    protected ArrayOfLong transactionIds;
    @XmlElement(name = "PieceNumbers")
    protected ArrayOfInt pieceNumbers;
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
     * Obtiene el valor de la propiedad transactionIds.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getTransactionIds() {
        return transactionIds;
    }

    /**
     * Define el valor de la propiedad transactionIds.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setTransactionIds(ArrayOfLong value) {
        this.transactionIds = value;
    }

    /**
     * Obtiene el valor de la propiedad pieceNumbers.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getPieceNumbers() {
        return pieceNumbers;
    }

    /**
     * Define el valor de la propiedad pieceNumbers.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setPieceNumbers(ArrayOfInt value) {
        this.pieceNumbers = value;
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
