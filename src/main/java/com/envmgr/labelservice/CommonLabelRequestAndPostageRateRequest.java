
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonLabelRequestAndPostageRateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonLabelRequestAndPostageRateRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{www.envmgr.com/LabelService}DataValidator"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MailpieceShape" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MailClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WeightOz" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="PackageTypeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateAdvance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Pricing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SundayHolidayDelivery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LiveAnimalSurcharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MailpieceDimensions" type="{www.envmgr.com/LabelService}Dimensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonLabelRequestAndPostageRateRequest", propOrder = {
    "mailpieceShape",
    "mailClass",
    "weightOz",
    "packageTypeIndicator",
    "dateAdvance",
    "pricing",
    "sundayHolidayDelivery",
    "liveAnimalSurcharge",
    "extension",
    "mailpieceDimensions"
})
@XmlSeeAlso({
    PostageRateRequest.class,
    LabelRequest.class
})
public abstract class CommonLabelRequestAndPostageRateRequest
    extends DataValidator
{

    @XmlElement(name = "MailpieceShape")
    protected String mailpieceShape;
    @XmlElement(name = "MailClass")
    protected String mailClass;
    @XmlElement(name = "WeightOz")
    protected double weightOz;
    @XmlElement(name = "PackageTypeIndicator")
    protected String packageTypeIndicator;
    @XmlElement(name = "DateAdvance", defaultValue = "0")
    protected Integer dateAdvance;
    @XmlElement(name = "Pricing")
    protected String pricing;
    @XmlElement(name = "SundayHolidayDelivery")
    protected String sundayHolidayDelivery;
    @XmlElement(name = "LiveAnimalSurcharge")
    protected String liveAnimalSurcharge;
    @XmlElement(name = "Extension")
    protected String extension;
    @XmlElement(name = "MailpieceDimensions")
    protected Dimensions mailpieceDimensions;

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
     * Gets the value of the packageTypeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageTypeIndicator() {
        return packageTypeIndicator;
    }

    /**
     * Sets the value of the packageTypeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageTypeIndicator(String value) {
        this.packageTypeIndicator = value;
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
     * Gets the value of the pricing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricing() {
        return pricing;
    }

    /**
     * Sets the value of the pricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricing(String value) {
        this.pricing = value;
    }

    /**
     * Gets the value of the sundayHolidayDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSundayHolidayDelivery() {
        return sundayHolidayDelivery;
    }

    /**
     * Sets the value of the sundayHolidayDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSundayHolidayDelivery(String value) {
        this.sundayHolidayDelivery = value;
    }

    /**
     * Gets the value of the liveAnimalSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiveAnimalSurcharge() {
        return liveAnimalSurcharge;
    }

    /**
     * Sets the value of the liveAnimalSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiveAnimalSurcharge(String value) {
        this.liveAnimalSurcharge = value;
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

}
