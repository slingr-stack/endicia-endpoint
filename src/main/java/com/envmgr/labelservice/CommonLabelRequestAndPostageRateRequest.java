
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CommonLabelRequestAndPostageRateRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad mailpieceShape.
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
     * Define el valor de la propiedad mailpieceShape.
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
     * Obtiene el valor de la propiedad mailClass.
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
     * Define el valor de la propiedad mailClass.
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
     * Obtiene el valor de la propiedad weightOz.
     * 
     */
    public double getWeightOz() {
        return weightOz;
    }

    /**
     * Define el valor de la propiedad weightOz.
     * 
     */
    public void setWeightOz(double value) {
        this.weightOz = value;
    }

    /**
     * Obtiene el valor de la propiedad packageTypeIndicator.
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
     * Define el valor de la propiedad packageTypeIndicator.
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
     * Obtiene el valor de la propiedad dateAdvance.
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
     * Define el valor de la propiedad dateAdvance.
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
     * Obtiene el valor de la propiedad pricing.
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
     * Define el valor de la propiedad pricing.
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
     * Obtiene el valor de la propiedad sundayHolidayDelivery.
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
     * Define el valor de la propiedad sundayHolidayDelivery.
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
     * Obtiene el valor de la propiedad liveAnimalSurcharge.
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
     * Define el valor de la propiedad liveAnimalSurcharge.
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
     * Obtiene el valor de la propiedad extension.
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
     * Define el valor de la propiedad extension.
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
     * Obtiene el valor de la propiedad mailpieceDimensions.
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
     * Define el valor de la propiedad mailpieceDimensions.
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
