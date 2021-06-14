
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CustomsInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad contentsType.
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
     * Define el valor de la propiedad contentsType.
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
     * Obtiene el valor de la propiedad contentsExplanation.
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
     * Define el valor de la propiedad contentsExplanation.
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
     * Obtiene el valor de la propiedad restrictionType.
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
     * Define el valor de la propiedad restrictionType.
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
     * Obtiene el valor de la propiedad restrictionComments.
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
     * Define el valor de la propiedad restrictionComments.
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
     * Obtiene el valor de la propiedad sendersCustomsReference.
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
     * Define el valor de la propiedad sendersCustomsReference.
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
     * Obtiene el valor de la propiedad importersCustomsReference.
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
     * Define el valor de la propiedad importersCustomsReference.
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
     * Obtiene el valor de la propiedad licenseNumber.
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
     * Define el valor de la propiedad licenseNumber.
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
     * Obtiene el valor de la propiedad certificateNumber.
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
     * Define el valor de la propiedad certificateNumber.
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
     * Obtiene el valor de la propiedad invoiceNumber.
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
     * Define el valor de la propiedad invoiceNumber.
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
     * Obtiene el valor de la propiedad nonDeliveryOption.
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
     * Define el valor de la propiedad nonDeliveryOption.
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
     * Obtiene el valor de la propiedad insuredNumber.
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
     * Define el valor de la propiedad insuredNumber.
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
     * Obtiene el valor de la propiedad eelPfc.
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
     * Define el valor de la propiedad eelPfc.
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
     * Obtiene el valor de la propiedad customsItems.
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
     * Define el valor de la propiedad customsItems.
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
     * Obtiene el valor de la propiedad recipientTaxID.
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
     * Define el valor de la propiedad recipientTaxID.
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
     * Obtiene el valor de la propiedad ddpPayer.
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
     * Define el valor de la propiedad ddpPayer.
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
     * Obtiene el valor de la propiedad ddpNonPaymentOption.
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
     * Define el valor de la propiedad ddpNonPaymentOption.
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
     * Obtiene el valor de la propiedad passportNumber.
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
     * Define el valor de la propiedad passportNumber.
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
     * Obtiene el valor de la propiedad passportIssueDate.
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
     * Define el valor de la propiedad passportIssueDate.
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
     * Obtiene el valor de la propiedad passportExpiryDate.
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
     * Define el valor de la propiedad passportExpiryDate.
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
     * Obtiene el valor de la propiedad importLicenseNumber.
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
     * Define el valor de la propiedad importLicenseNumber.
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
