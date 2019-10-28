
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomsInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{www.envmgr.com/LabelService}DataValidator"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContentsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContentsExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RestrictionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RestrictionComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SendersCustomsReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImportersCustomsReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NonDeliveryOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsuredNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EelPfc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomsItems" type="{www.envmgr.com/LabelService}ArrayOfCustomsItem" minOccurs="0"/&gt;
 *         &lt;element name="RecipientTaxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DDPPayer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DDPNonPaymentOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PassportNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PassportIssueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PassportExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImportLicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomsInfo", propOrder = {
    "contentsType",
    "contentsExplanation",
    "restrictionType",
    "restrictionComments",
    "sendersCustomsReference",
    "importersCustomsReference",
    "licenseNumber",
    "certificateNumber",
    "invoiceNumber",
    "nonDeliveryOption",
    "insuredNumber",
    "eelPfc",
    "customsItems",
    "recipientTaxID",
    "ddpPayer",
    "ddpNonPaymentOption",
    "passportNumber",
    "passportIssueDate",
    "passportExpiryDate",
    "importLicenseNumber"
})
public class CustomsInfo
    extends DataValidator
{

    @XmlElement(name = "ContentsType")
    protected String contentsType;
    @XmlElement(name = "ContentsExplanation")
    protected String contentsExplanation;
    @XmlElement(name = "RestrictionType")
    protected String restrictionType;
    @XmlElement(name = "RestrictionComments")
    protected String restrictionComments;
    @XmlElement(name = "SendersCustomsReference")
    protected String sendersCustomsReference;
    @XmlElement(name = "ImportersCustomsReference")
    protected String importersCustomsReference;
    @XmlElement(name = "LicenseNumber")
    protected String licenseNumber;
    @XmlElement(name = "CertificateNumber")
    protected String certificateNumber;
    @XmlElement(name = "InvoiceNumber")
    protected String invoiceNumber;
    @XmlElement(name = "NonDeliveryOption")
    protected String nonDeliveryOption;
    @XmlElement(name = "InsuredNumber")
    protected String insuredNumber;
    @XmlElement(name = "EelPfc")
    protected String eelPfc;
    @XmlElement(name = "CustomsItems")
    protected ArrayOfCustomsItem customsItems;
    @XmlElement(name = "RecipientTaxID")
    protected String recipientTaxID;
    @XmlElement(name = "DDPPayer")
    protected String ddpPayer;
    @XmlElement(name = "DDPNonPaymentOption")
    protected String ddpNonPaymentOption;
    @XmlElement(name = "PassportNumber")
    protected String passportNumber;
    @XmlElement(name = "PassportIssueDate")
    protected String passportIssueDate;
    @XmlElement(name = "PassportExpiryDate")
    protected String passportExpiryDate;
    @XmlElement(name = "ImportLicenseNumber")
    protected String importLicenseNumber;

    /**
     * Gets the value of the contentsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentsType() {
        return contentsType;
    }

    /**
     * Sets the value of the contentsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentsType(String value) {
        this.contentsType = value;
    }

    /**
     * Gets the value of the contentsExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentsExplanation() {
        return contentsExplanation;
    }

    /**
     * Sets the value of the contentsExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentsExplanation(String value) {
        this.contentsExplanation = value;
    }

    /**
     * Gets the value of the restrictionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictionType() {
        return restrictionType;
    }

    /**
     * Sets the value of the restrictionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictionType(String value) {
        this.restrictionType = value;
    }

    /**
     * Gets the value of the restrictionComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictionComments() {
        return restrictionComments;
    }

    /**
     * Sets the value of the restrictionComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictionComments(String value) {
        this.restrictionComments = value;
    }

    /**
     * Gets the value of the sendersCustomsReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendersCustomsReference() {
        return sendersCustomsReference;
    }

    /**
     * Sets the value of the sendersCustomsReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendersCustomsReference(String value) {
        this.sendersCustomsReference = value;
    }

    /**
     * Gets the value of the importersCustomsReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportersCustomsReference() {
        return importersCustomsReference;
    }

    /**
     * Sets the value of the importersCustomsReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportersCustomsReference(String value) {
        this.importersCustomsReference = value;
    }

    /**
     * Gets the value of the licenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Sets the value of the licenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNumber(String value) {
        this.licenseNumber = value;
    }

    /**
     * Gets the value of the certificateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * Sets the value of the certificateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateNumber(String value) {
        this.certificateNumber = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the nonDeliveryOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonDeliveryOption() {
        return nonDeliveryOption;
    }

    /**
     * Sets the value of the nonDeliveryOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonDeliveryOption(String value) {
        this.nonDeliveryOption = value;
    }

    /**
     * Gets the value of the insuredNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredNumber() {
        return insuredNumber;
    }

    /**
     * Sets the value of the insuredNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredNumber(String value) {
        this.insuredNumber = value;
    }

    /**
     * Gets the value of the eelPfc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEelPfc() {
        return eelPfc;
    }

    /**
     * Sets the value of the eelPfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEelPfc(String value) {
        this.eelPfc = value;
    }

    /**
     * Gets the value of the customsItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomsItem }
     *     
     */
    public ArrayOfCustomsItem getCustomsItems() {
        return customsItems;
    }

    /**
     * Sets the value of the customsItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomsItem }
     *     
     */
    public void setCustomsItems(ArrayOfCustomsItem value) {
        this.customsItems = value;
    }

    /**
     * Gets the value of the recipientTaxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientTaxID() {
        return recipientTaxID;
    }

    /**
     * Sets the value of the recipientTaxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientTaxID(String value) {
        this.recipientTaxID = value;
    }

    /**
     * Gets the value of the ddpPayer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDPPayer() {
        return ddpPayer;
    }

    /**
     * Sets the value of the ddpPayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDPPayer(String value) {
        this.ddpPayer = value;
    }

    /**
     * Gets the value of the ddpNonPaymentOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDPNonPaymentOption() {
        return ddpNonPaymentOption;
    }

    /**
     * Sets the value of the ddpNonPaymentOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDPNonPaymentOption(String value) {
        this.ddpNonPaymentOption = value;
    }

    /**
     * Gets the value of the passportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNumber() {
        return passportNumber;
    }

    /**
     * Sets the value of the passportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNumber(String value) {
        this.passportNumber = value;
    }

    /**
     * Gets the value of the passportIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportIssueDate() {
        return passportIssueDate;
    }

    /**
     * Sets the value of the passportIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportIssueDate(String value) {
        this.passportIssueDate = value;
    }

    /**
     * Gets the value of the passportExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportExpiryDate() {
        return passportExpiryDate;
    }

    /**
     * Sets the value of the passportExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportExpiryDate(String value) {
        this.passportExpiryDate = value;
    }

    /**
     * Gets the value of the importLicenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportLicenseNumber() {
        return importLicenseNumber;
    }

    /**
     * Sets the value of the importLicenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportLicenseNumber(String value) {
        this.importLicenseNumber = value;
    }

}
