
package com.envmgr.labelservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CarrierPickupListDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CarrierPickupListDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConfirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackagePickup" type="{www.envmgr.com/LabelService}PackagePickup" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalPickupAddress" type="{www.envmgr.com/LabelService}PhysicalPickupAddress" minOccurs="0"/&gt;
 *         &lt;element name="PackageLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpecialInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ExpressMailCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PriorityMailCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FirstClassPackageCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="InternationalCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OtherPackagesCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="EstimatedWeightLb" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierPickupListDetail", propOrder = {
    "confirmationNumber",
    "packagePickup",
    "physicalPickupAddress",
    "packageLocation",
    "specialInstructions",
    "estimatedAmount",
    "expressMailCount",
    "priorityMailCount",
    "firstClassPackageCount",
    "internationalCount",
    "otherPackagesCount",
    "estimatedWeightLb",
    "carrier"
})
public class CarrierPickupListDetail {

    @XmlElement(name = "ConfirmationNumber")
    protected String confirmationNumber;
    @XmlElement(name = "PackagePickup")
    protected PackagePickup packagePickup;
    @XmlElement(name = "PhysicalPickupAddress")
    protected PhysicalPickupAddress physicalPickupAddress;
    @XmlElement(name = "PackageLocation")
    protected String packageLocation;
    @XmlElement(name = "SpecialInstructions")
    protected String specialInstructions;
    @XmlElement(name = "EstimatedAmount", required = true)
    protected BigDecimal estimatedAmount;
    @XmlElement(name = "ExpressMailCount")
    protected int expressMailCount;
    @XmlElement(name = "PriorityMailCount")
    protected int priorityMailCount;
    @XmlElement(name = "FirstClassPackageCount")
    protected int firstClassPackageCount;
    @XmlElement(name = "InternationalCount")
    protected int internationalCount;
    @XmlElement(name = "OtherPackagesCount")
    protected int otherPackagesCount;
    @XmlElement(name = "EstimatedWeightLb")
    protected double estimatedWeightLb;
    @XmlElement(name = "Carrier")
    protected String carrier;

    /**
     * Obtiene el valor de la propiedad confirmationNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * Define el valor de la propiedad confirmationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationNumber(String value) {
        this.confirmationNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad packagePickup.
     * 
     * @return
     *     possible object is
     *     {@link PackagePickup }
     *     
     */
    public PackagePickup getPackagePickup() {
        return packagePickup;
    }

    /**
     * Define el valor de la propiedad packagePickup.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagePickup }
     *     
     */
    public void setPackagePickup(PackagePickup value) {
        this.packagePickup = value;
    }

    /**
     * Obtiene el valor de la propiedad physicalPickupAddress.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalPickupAddress }
     *     
     */
    public PhysicalPickupAddress getPhysicalPickupAddress() {
        return physicalPickupAddress;
    }

    /**
     * Define el valor de la propiedad physicalPickupAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalPickupAddress }
     *     
     */
    public void setPhysicalPickupAddress(PhysicalPickupAddress value) {
        this.physicalPickupAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad packageLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageLocation() {
        return packageLocation;
    }

    /**
     * Define el valor de la propiedad packageLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageLocation(String value) {
        this.packageLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad specialInstructions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialInstructions() {
        return specialInstructions;
    }

    /**
     * Define el valor de la propiedad specialInstructions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialInstructions(String value) {
        this.specialInstructions = value;
    }

    /**
     * Obtiene el valor de la propiedad estimatedAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEstimatedAmount() {
        return estimatedAmount;
    }

    /**
     * Define el valor de la propiedad estimatedAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEstimatedAmount(BigDecimal value) {
        this.estimatedAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad expressMailCount.
     * 
     */
    public int getExpressMailCount() {
        return expressMailCount;
    }

    /**
     * Define el valor de la propiedad expressMailCount.
     * 
     */
    public void setExpressMailCount(int value) {
        this.expressMailCount = value;
    }

    /**
     * Obtiene el valor de la propiedad priorityMailCount.
     * 
     */
    public int getPriorityMailCount() {
        return priorityMailCount;
    }

    /**
     * Define el valor de la propiedad priorityMailCount.
     * 
     */
    public void setPriorityMailCount(int value) {
        this.priorityMailCount = value;
    }

    /**
     * Obtiene el valor de la propiedad firstClassPackageCount.
     * 
     */
    public int getFirstClassPackageCount() {
        return firstClassPackageCount;
    }

    /**
     * Define el valor de la propiedad firstClassPackageCount.
     * 
     */
    public void setFirstClassPackageCount(int value) {
        this.firstClassPackageCount = value;
    }

    /**
     * Obtiene el valor de la propiedad internationalCount.
     * 
     */
    public int getInternationalCount() {
        return internationalCount;
    }

    /**
     * Define el valor de la propiedad internationalCount.
     * 
     */
    public void setInternationalCount(int value) {
        this.internationalCount = value;
    }

    /**
     * Obtiene el valor de la propiedad otherPackagesCount.
     * 
     */
    public int getOtherPackagesCount() {
        return otherPackagesCount;
    }

    /**
     * Define el valor de la propiedad otherPackagesCount.
     * 
     */
    public void setOtherPackagesCount(int value) {
        this.otherPackagesCount = value;
    }

    /**
     * Obtiene el valor de la propiedad estimatedWeightLb.
     * 
     */
    public double getEstimatedWeightLb() {
        return estimatedWeightLb;
    }

    /**
     * Define el valor de la propiedad estimatedWeightLb.
     * 
     */
    public void setEstimatedWeightLb(double value) {
        this.estimatedWeightLb = value;
    }

    /**
     * Obtiene el valor de la propiedad carrier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Define el valor de la propiedad carrier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

}
