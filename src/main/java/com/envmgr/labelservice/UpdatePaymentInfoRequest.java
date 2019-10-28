
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdatePaymentInfoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdatePaymentInfoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{www.envmgr.com/LabelService}DataValidator"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UpdateCreditCardInfo" type="{www.envmgr.com/LabelService}UpdateCreditCardInformation" minOccurs="0"/&gt;
 *         &lt;element name="UpdateACHInfo" type="{www.envmgr.com/LabelService}UpdateACHInformation" minOccurs="0"/&gt;
 *         &lt;element name="RequesterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertifiedIntermediary" type="{www.envmgr.com/LabelService}CertifiedIntermediary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ResponseVersion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatePaymentInfoRequest", propOrder = {
    "requestID",
    "updateCreditCardInfo",
    "updateACHInfo",
    "requesterID",
    "certifiedIntermediary"
})
public class UpdatePaymentInfoRequest
    extends DataValidator
{

    @XmlElement(name = "RequestID")
    protected String requestID;
    @XmlElement(name = "UpdateCreditCardInfo")
    protected UpdateCreditCardInformation updateCreditCardInfo;
    @XmlElement(name = "UpdateACHInfo")
    protected UpdateACHInformation updateACHInfo;
    @XmlElement(name = "RequesterID")
    protected String requesterID;
    @XmlElement(name = "CertifiedIntermediary")
    protected CertifiedIntermediary certifiedIntermediary;
    @XmlAttribute(name = "ResponseVersion")
    protected String responseVersion;

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
     * Gets the value of the updateCreditCardInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateCreditCardInformation }
     *     
     */
    public UpdateCreditCardInformation getUpdateCreditCardInfo() {
        return updateCreditCardInfo;
    }

    /**
     * Sets the value of the updateCreditCardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateCreditCardInformation }
     *     
     */
    public void setUpdateCreditCardInfo(UpdateCreditCardInformation value) {
        this.updateCreditCardInfo = value;
    }

    /**
     * Gets the value of the updateACHInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateACHInformation }
     *     
     */
    public UpdateACHInformation getUpdateACHInfo() {
        return updateACHInfo;
    }

    /**
     * Sets the value of the updateACHInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateACHInformation }
     *     
     */
    public void setUpdateACHInfo(UpdateACHInformation value) {
        this.updateACHInfo = value;
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

    /**
     * Gets the value of the responseVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseVersion() {
        return responseVersion;
    }

    /**
     * Sets the value of the responseVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseVersion(String value) {
        this.responseVersion = value;
    }

}
