
package core.labelnumberservice;

import java.math.BigDecimal;
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
 *     &lt;extension base="{LabelNumberService.Core}DataValidator"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContentsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContentsExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RestrictionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RestrictionCommments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SendersCustomsReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImportersCustomsReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NonDeliveryOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedirectAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsuredNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SDRValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ItnEeiNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomsItems" type="{LabelNumberService.Core}ArrayOfCustomsItem" minOccurs="0"/&gt;
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
    "restrictionCommments",
    "sendersCustomsReference",
    "importersCustomsReference",
    "licenseNumber",
    "certificateNumber",
    "invoiceNumber",
    "nonDeliveryOption",
    "redirectAddress",
    "insuredNumber",
    "sdrValue",
    "itnEeiNumber",
    "customsItems"
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
    @XmlElement(name = "RestrictionCommments")
    protected String restrictionCommments;
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
    @XmlElement(name = "RedirectAddress")
    protected String redirectAddress;
    @XmlElement(name = "InsuredNumber")
    protected String insuredNumber;
    @XmlElement(name = "SDRValue", required = true)
    protected BigDecimal sdrValue;
    @XmlElement(name = "ItnEeiNumber")
    protected String itnEeiNumber;
    @XmlElement(name = "CustomsItems")
    protected ArrayOfCustomsItem customsItems;

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
     * Gets the value of the restrictionCommments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictionCommments() {
        return restrictionCommments;
    }

    /**
     * Sets the value of the restrictionCommments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictionCommments(String value) {
        this.restrictionCommments = value;
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
     * Gets the value of the redirectAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectAddress() {
        return redirectAddress;
    }

    /**
     * Sets the value of the redirectAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectAddress(String value) {
        this.redirectAddress = value;
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
     * Gets the value of the sdrValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSDRValue() {
        return sdrValue;
    }

    /**
     * Sets the value of the sdrValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSDRValue(BigDecimal value) {
        this.sdrValue = value;
    }

    /**
     * Gets the value of the itnEeiNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItnEeiNumber() {
        return itnEeiNumber;
    }

    /**
     * Sets the value of the itnEeiNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItnEeiNumber(String value) {
        this.itnEeiNumber = value;
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

}
