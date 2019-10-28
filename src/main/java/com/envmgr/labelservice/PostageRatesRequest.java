
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostageRatesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostageRatesRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{www.envmgr.com/LabelService}DataValidator"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MailClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WeightOz" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="MailpieceShape" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MailpieceDimensions" type="{www.envmgr.com/LabelService}Dimensions" minOccurs="0"/&gt;
 *         &lt;element name="Machinable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Services" type="{www.envmgr.com/LabelService}SpecialServices" minOccurs="0"/&gt;
 *         &lt;element name="CODAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="InsuredValue" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="RegisteredMailValue" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="FromPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateAdvance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryTimeDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContentsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequesterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertifiedIntermediary" type="{www.envmgr.com/LabelService}CertifiedIntermediary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ResponseVersion" use="required" type="{www.envmgr.com/LabelService}RespVersion" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostageRatesRequest", propOrder = {
    "mailClass",
    "weightOz",
    "mailpieceShape",
    "mailpieceDimensions",
    "machinable",
    "services",
    "codAmount",
    "insuredValue",
    "registeredMailValue",
    "fromPostalCode",
    "toPostalCode",
    "toCountry",
    "toCountryCode",
    "dateAdvance",
    "extension",
    "deliveryTimeDays",
    "estimatedDeliveryDate",
    "contentsType",
    "requesterID",
    "certifiedIntermediary"
})
public class PostageRatesRequest
    extends DataValidator
{

    @XmlElement(name = "MailClass")
    protected String mailClass;
    @XmlElement(name = "WeightOz")
    protected double weightOz;
    @XmlElement(name = "MailpieceShape")
    protected String mailpieceShape;
    @XmlElement(name = "MailpieceDimensions")
    protected Dimensions mailpieceDimensions;
    @XmlElement(name = "Machinable")
    protected String machinable;
    @XmlElement(name = "Services")
    protected SpecialServices services;
    @XmlElement(name = "CODAmount")
    protected double codAmount;
    @XmlElement(name = "InsuredValue")
    protected double insuredValue;
    @XmlElement(name = "RegisteredMailValue")
    protected double registeredMailValue;
    @XmlElement(name = "FromPostalCode")
    protected String fromPostalCode;
    @XmlElement(name = "ToPostalCode")
    protected String toPostalCode;
    @XmlElement(name = "ToCountry")
    protected String toCountry;
    @XmlElement(name = "ToCountryCode")
    protected String toCountryCode;
    @XmlElement(name = "DateAdvance", defaultValue = "0")
    protected Integer dateAdvance;
    @XmlElement(name = "Extension")
    protected String extension;
    @XmlElement(name = "DeliveryTimeDays")
    protected String deliveryTimeDays;
    @XmlElement(name = "EstimatedDeliveryDate")
    protected String estimatedDeliveryDate;
    @XmlElement(name = "ContentsType")
    protected String contentsType;
    @XmlElement(name = "RequesterID")
    protected String requesterID;
    @XmlElement(name = "CertifiedIntermediary")
    protected CertifiedIntermediary certifiedIntermediary;
    @XmlAttribute(name = "ResponseVersion", required = true)
    protected String responseVersion;

    /**
     * Gets the value of the mailClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailClass() {
        return mailClass;
    }

    /**
     * Sets the value of the mailClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailClass(String value) {
        this.mailClass = value;
    }

    /**
     * Gets the value of the weightOz property.
     * 
     */
    public double getWeightOz() {
        return weightOz;
    }

    /**
     * Sets the value of the weightOz property.
     * 
     */
    public void setWeightOz(double value) {
        this.weightOz = value;
    }

    /**
     * Gets the value of the mailpieceShape property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailpieceShape() {
        return mailpieceShape;
    }

    /**
     * Sets the value of the mailpieceShape property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailpieceShape(String value) {
        this.mailpieceShape = value;
    }

    /**
     * Gets the value of the mailpieceDimensions property.
     * 
     * @return
     *     possible object is
     *     {@link Dimensions }
     *     
     */
    public Dimensions getMailpieceDimensions() {
        return mailpieceDimensions;
    }

    /**
     * Sets the value of the mailpieceDimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dimensions }
     *     
     */
    public void setMailpieceDimensions(Dimensions value) {
        this.mailpieceDimensions = value;
    }

    /**
     * Gets the value of the machinable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMachinable() {
        return machinable;
    }

    /**
     * Sets the value of the machinable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMachinable(String value) {
        this.machinable = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialServices }
     *     
     */
    public SpecialServices getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialServices }
     *     
     */
    public void setServices(SpecialServices value) {
        this.services = value;
    }

    /**
     * Gets the value of the codAmount property.
     * 
     */
    public double getCODAmount() {
        return codAmount;
    }

    /**
     * Sets the value of the codAmount property.
     * 
     */
    public void setCODAmount(double value) {
        this.codAmount = value;
    }

    /**
     * Gets the value of the insuredValue property.
     * 
     */
    public double getInsuredValue() {
        return insuredValue;
    }

    /**
     * Sets the value of the insuredValue property.
     * 
     */
    public void setInsuredValue(double value) {
        this.insuredValue = value;
    }

    /**
     * Gets the value of the registeredMailValue property.
     * 
     */
    public double getRegisteredMailValue() {
        return registeredMailValue;
    }

    /**
     * Sets the value of the registeredMailValue property.
     * 
     */
    public void setRegisteredMailValue(double value) {
        this.registeredMailValue = value;
    }

    /**
     * Gets the value of the fromPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromPostalCode() {
        return fromPostalCode;
    }

    /**
     * Sets the value of the fromPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromPostalCode(String value) {
        this.fromPostalCode = value;
    }

    /**
     * Gets the value of the toPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToPostalCode() {
        return toPostalCode;
    }

    /**
     * Sets the value of the toPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToPostalCode(String value) {
        this.toPostalCode = value;
    }

    /**
     * Gets the value of the toCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCountry() {
        return toCountry;
    }

    /**
     * Sets the value of the toCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCountry(String value) {
        this.toCountry = value;
    }

    /**
     * Gets the value of the toCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCountryCode() {
        return toCountryCode;
    }

    /**
     * Sets the value of the toCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCountryCode(String value) {
        this.toCountryCode = value;
    }

    /**
     * Gets the value of the dateAdvance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDateAdvance() {
        return dateAdvance;
    }

    /**
     * Sets the value of the dateAdvance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDateAdvance(Integer value) {
        this.dateAdvance = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Gets the value of the deliveryTimeDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryTimeDays() {
        return deliveryTimeDays;
    }

    /**
     * Sets the value of the deliveryTimeDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryTimeDays(String value) {
        this.deliveryTimeDays = value;
    }

    /**
     * Gets the value of the estimatedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    /**
     * Sets the value of the estimatedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedDeliveryDate(String value) {
        this.estimatedDeliveryDate = value;
    }

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
