
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PackagePickupRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PackagePickupRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{www.envmgr.com/LabelService}DataValidator"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UseAddressOnFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalPickupAddress" type="{www.envmgr.com/LabelService}PhysicalPickupAddress" minOccurs="0"/&gt;
 *         &lt;element name="ExpressMailCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PriorityMailCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FirstClassPackageCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ReturnsCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="InternationalCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OtherPackagesCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="EstimatedWeightLb" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="PackageLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpecialInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CostCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarrierPickupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PickupTimeEarliest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PickupTimeLatest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequesterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertifiedIntermediary" type="{www.envmgr.com/LabelService}CertifiedIntermediary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Test" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagePickupRequest", propOrder = {
    "requestID",
    "useAddressOnFile",
    "physicalPickupAddress",
    "expressMailCount",
    "priorityMailCount",
    "firstClassPackageCount",
    "returnsCount",
    "internationalCount",
    "otherPackagesCount",
    "estimatedWeightLb",
    "packageLocation",
    "specialInstructions",
    "costCenter",
    "carrierPickupType",
    "carrier",
    "pickupTimeEarliest",
    "pickupTimeLatest",
    "requesterID",
    "certifiedIntermediary"
})
@XmlSeeAlso({
    PackagePickupChangeRequest.class
})
public class PackagePickupRequest
    extends DataValidator
{

    @XmlElement(name = "RequestID")
    protected String requestID;
    @XmlElement(name = "UseAddressOnFile")
    protected String useAddressOnFile;
    @XmlElement(name = "PhysicalPickupAddress")
    protected PhysicalPickupAddress physicalPickupAddress;
    @XmlElement(name = "ExpressMailCount")
    protected int expressMailCount;
    @XmlElement(name = "PriorityMailCount")
    protected int priorityMailCount;
    @XmlElement(name = "FirstClassPackageCount")
    protected int firstClassPackageCount;
    @XmlElement(name = "ReturnsCount")
    protected int returnsCount;
    @XmlElement(name = "InternationalCount")
    protected int internationalCount;
    @XmlElement(name = "OtherPackagesCount")
    protected int otherPackagesCount;
    @XmlElement(name = "EstimatedWeightLb")
    protected double estimatedWeightLb;
    @XmlElement(name = "PackageLocation")
    protected String packageLocation;
    @XmlElement(name = "SpecialInstructions")
    protected String specialInstructions;
    @XmlElement(name = "CostCenter")
    protected String costCenter;
    @XmlElement(name = "CarrierPickupType")
    protected String carrierPickupType;
    @XmlElement(name = "Carrier")
    protected String carrier;
    @XmlElement(name = "PickupTimeEarliest")
    protected String pickupTimeEarliest;
    @XmlElement(name = "PickupTimeLatest")
    protected String pickupTimeLatest;
    @XmlElement(name = "RequesterID")
    protected String requesterID;
    @XmlElement(name = "CertifiedIntermediary")
    protected CertifiedIntermediary certifiedIntermediary;
    @XmlAttribute(name = "Test")
    protected String test;

    /**
     * Obtiene el valor de la propiedad requestID.
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
     * Define el valor de la propiedad requestID.
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
     * Obtiene el valor de la propiedad useAddressOnFile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseAddressOnFile() {
        return useAddressOnFile;
    }

    /**
     * Define el valor de la propiedad useAddressOnFile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseAddressOnFile(String value) {
        this.useAddressOnFile = value;
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
     * Obtiene el valor de la propiedad returnsCount.
     * 
     */
    public int getReturnsCount() {
        return returnsCount;
    }

    /**
     * Define el valor de la propiedad returnsCount.
     * 
     */
    public void setReturnsCount(int value) {
        this.returnsCount = value;
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
     * Obtiene el valor de la propiedad costCenter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenter() {
        return costCenter;
    }

    /**
     * Define el valor de la propiedad costCenter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenter(String value) {
        this.costCenter = value;
    }

    /**
     * Obtiene el valor de la propiedad carrierPickupType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierPickupType() {
        return carrierPickupType;
    }

    /**
     * Define el valor de la propiedad carrierPickupType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierPickupType(String value) {
        this.carrierPickupType = value;
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

    /**
     * Obtiene el valor de la propiedad pickupTimeEarliest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupTimeEarliest() {
        return pickupTimeEarliest;
    }

    /**
     * Define el valor de la propiedad pickupTimeEarliest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupTimeEarliest(String value) {
        this.pickupTimeEarliest = value;
    }

    /**
     * Obtiene el valor de la propiedad pickupTimeLatest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupTimeLatest() {
        return pickupTimeLatest;
    }

    /**
     * Define el valor de la propiedad pickupTimeLatest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupTimeLatest(String value) {
        this.pickupTimeLatest = value;
    }

    /**
     * Obtiene el valor de la propiedad requesterID.
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
     * Define el valor de la propiedad requesterID.
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
     * Obtiene el valor de la propiedad certifiedIntermediary.
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
     * Define el valor de la propiedad certifiedIntermediary.
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
     * Obtiene el valor de la propiedad test.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTest() {
        return test;
    }

    /**
     * Define el valor de la propiedad test.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTest(String value) {
        this.test = value;
    }

}
