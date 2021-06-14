
package core.labelnumberservice;

import java.math.BigDecimal;
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
     * Obtiene el valor de la propiedad restrictionCommments.
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
     * Define el valor de la propiedad restrictionCommments.
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
     * Obtiene el valor de la propiedad redirectAddress.
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
     * Define el valor de la propiedad redirectAddress.
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
     * Obtiene el valor de la propiedad sdrValue.
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
     * Define el valor de la propiedad sdrValue.
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
     * Obtiene el valor de la propiedad itnEeiNumber.
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
     * Define el valor de la propiedad itnEeiNumber.
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

}
