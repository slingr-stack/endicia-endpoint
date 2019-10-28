
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackagePickupRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
    @XmlElement(name = "RequesterID")
    protected String requesterID;
    @XmlElement(name = "CertifiedIntermediary")
    protected CertifiedIntermediary certifiedIntermediary;
    @XmlAttribute(name = "Test")
    protected String test;

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
     * Gets the value of the useAddressOnFile property.
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
     * Sets the value of the useAddressOnFile property.
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
     * Gets the value of the physicalPickupAddress property.
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
     * Sets the value of the physicalPickupAddress property.
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
     * Gets the value of the expressMailCount property.
     * 
     */
    public int getExpressMailCount() {
        return expressMailCount;
    }

    /**
     * Sets the value of the expressMailCount property.
     * 
     */
    public void setExpressMailCount(int value) {
        this.expressMailCount = value;
    }

    /**
     * Gets the value of the priorityMailCount property.
     * 
     */
    public int getPriorityMailCount() {
        return priorityMailCount;
    }

    /**
     * Sets the value of the priorityMailCount property.
     * 
     */
    public void setPriorityMailCount(int value) {
        this.priorityMailCount = value;
    }

    /**
     * Gets the value of the firstClassPackageCount property.
     * 
     */
    public int getFirstClassPackageCount() {
        return firstClassPackageCount;
    }

    /**
     * Sets the value of the firstClassPackageCount property.
     * 
     */
    public void setFirstClassPackageCount(int value) {
        this.firstClassPackageCount = value;
    }

    /**
     * Gets the value of the returnsCount property.
     * 
     */
    public int getReturnsCount() {
        return returnsCount;
    }

    /**
     * Sets the value of the returnsCount property.
     * 
     */
    public void setReturnsCount(int value) {
        this.returnsCount = value;
    }

    /**
     * Gets the value of the internationalCount property.
     * 
     */
    public int getInternationalCount() {
        return internationalCount;
    }

    /**
     * Sets the value of the internationalCount property.
     * 
     */
    public void setInternationalCount(int value) {
        this.internationalCount = value;
    }

    /**
     * Gets the value of the otherPackagesCount property.
     * 
     */
    public int getOtherPackagesCount() {
        return otherPackagesCount;
    }

    /**
     * Sets the value of the otherPackagesCount property.
     * 
     */
    public void setOtherPackagesCount(int value) {
        this.otherPackagesCount = value;
    }

    /**
     * Gets the value of the estimatedWeightLb property.
     * 
     */
    public double getEstimatedWeightLb() {
        return estimatedWeightLb;
    }

    /**
     * Sets the value of the estimatedWeightLb property.
     * 
     */
    public void setEstimatedWeightLb(double value) {
        this.estimatedWeightLb = value;
    }

    /**
     * Gets the value of the packageLocation property.
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
     * Sets the value of the packageLocation property.
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
     * Gets the value of the specialInstructions property.
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
     * Sets the value of the specialInstructions property.
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
     * Gets the value of the costCenter property.
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
     * Sets the value of the costCenter property.
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
     * Gets the value of the test property.
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
     * Sets the value of the test property.
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
