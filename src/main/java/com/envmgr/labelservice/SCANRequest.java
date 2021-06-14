
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SCANRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SCANRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{www.envmgr.com/LabelService}DataValidator"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GetSCANRequestParameters" type="{www.envmgr.com/LabelService}GetSCANParameters" minOccurs="0"/&gt;
 *         &lt;element name="PicNumbers" type="{www.envmgr.com/LabelService}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="TransactionIds" type="{www.envmgr.com/LabelService}ArrayOfString1" minOccurs="0"/&gt;
 *         &lt;element name="PieceNumbers" type="{www.envmgr.com/LabelService}ArrayOfString2" minOccurs="0"/&gt;
 *         &lt;element name="ManifestType" type="{www.envmgr.com/LabelService}ManifestType" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfContainerLabels" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
@XmlType(name = "SCANRequest", propOrder = {
    "requestID",
    "getSCANRequestParameters",
    "picNumbers",
    "transactionIds",
    "pieceNumbers",
    "manifestType",
    "numberOfContainerLabels",
    "requesterID",
    "certifiedIntermediary"
})
public class SCANRequest
    extends DataValidator
{

    @XmlElement(name = "RequestID")
    protected String requestID;
    @XmlElement(name = "GetSCANRequestParameters")
    protected GetSCANParameters getSCANRequestParameters;
    @XmlElement(name = "PicNumbers")
    protected ArrayOfString picNumbers;
    @XmlElement(name = "TransactionIds")
    protected ArrayOfString1 transactionIds;
    @XmlElement(name = "PieceNumbers")
    protected ArrayOfString2 pieceNumbers;
    @XmlElement(name = "ManifestType")
    @XmlSchemaType(name = "string")
    protected ManifestType manifestType;
    @XmlElement(name = "NumberOfContainerLabels")
    protected Integer numberOfContainerLabels;
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
     * Obtiene el valor de la propiedad getSCANRequestParameters.
     * 
     * @return
     *     possible object is
     *     {@link GetSCANParameters }
     *     
     */
    public GetSCANParameters getGetSCANRequestParameters() {
        return getSCANRequestParameters;
    }

    /**
     * Define el valor de la propiedad getSCANRequestParameters.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSCANParameters }
     *     
     */
    public void setGetSCANRequestParameters(GetSCANParameters value) {
        this.getSCANRequestParameters = value;
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
     * Obtiene el valor de la propiedad manifestType.
     * 
     * @return
     *     possible object is
     *     {@link ManifestType }
     *     
     */
    public ManifestType getManifestType() {
        return manifestType;
    }

    /**
     * Define el valor de la propiedad manifestType.
     * 
     * @param value
     *     allowed object is
     *     {@link ManifestType }
     *     
     */
    public void setManifestType(ManifestType value) {
        this.manifestType = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfContainerLabels.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfContainerLabels() {
        return numberOfContainerLabels;
    }

    /**
     * Define el valor de la propiedad numberOfContainerLabels.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfContainerLabels(Integer value) {
        this.numberOfContainerLabels = value;
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
