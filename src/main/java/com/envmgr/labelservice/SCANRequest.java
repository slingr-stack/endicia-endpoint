
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SCANRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCANRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{www.envmgr.com/LabelService}DataValidator"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GetSCANRequestParameters" type="{www.envmgr.com/LabelService}GetSCANParameters" minOccurs="0"/&gt;
 *         &lt;element name="PicNumbers" type="{www.envmgr.com/LabelService}ArrayOfString1" minOccurs="0"/&gt;
 *         &lt;element name="TransactionIds" type="{www.envmgr.com/LabelService}ArrayOfString3" minOccurs="0"/&gt;
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
    protected ArrayOfString1 picNumbers;
    @XmlElement(name = "TransactionIds")
    protected ArrayOfString3 transactionIds;
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
     * Gets the value of the getSCANRequestParameters property.
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
     * Sets the value of the getSCANRequestParameters property.
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
     * Gets the value of the picNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString1 }
     *     
     */
    public ArrayOfString1 getPicNumbers() {
        return picNumbers;
    }

    /**
     * Sets the value of the picNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString1 }
     *     
     */
    public void setPicNumbers(ArrayOfString1 value) {
        this.picNumbers = value;
    }

    /**
     * Gets the value of the transactionIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString3 }
     *     
     */
    public ArrayOfString3 getTransactionIds() {
        return transactionIds;
    }

    /**
     * Sets the value of the transactionIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString3 }
     *     
     */
    public void setTransactionIds(ArrayOfString3 value) {
        this.transactionIds = value;
    }

    /**
     * Gets the value of the pieceNumbers property.
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
     * Sets the value of the pieceNumbers property.
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
     * Gets the value of the manifestType property.
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
     * Sets the value of the manifestType property.
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
     * Gets the value of the numberOfContainerLabels property.
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
     * Sets the value of the numberOfContainerLabels property.
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
     * Gets the value of the certifiedIntermediary property.
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
     * Sets the value of the certifiedIntermediary property.
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
