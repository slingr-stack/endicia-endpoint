
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Adjustment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Adjustment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdjustmentStatus" type="{www.envmgr.com/LabelService}AdjustmentStatus"/&gt;
 *         &lt;element name="DateAdjustmentProcessed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateRecorded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActualTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActualFromZIPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActualToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActualToZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActualMailClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdjustedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActualPackageInfo" type="{www.envmgr.com/LabelService}PackageInfo" minOccurs="0"/&gt;
 *         &lt;element name="Dispute" type="{www.envmgr.com/LabelService}DisputeDetails" minOccurs="0"/&gt;
 *         &lt;element name="ActualService" type="{www.envmgr.com/LabelService}ActualService" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adjustment", propOrder = {
    "adjustmentStatus",
    "dateAdjustmentProcessed",
    "dateRecorded",
    "actualTrackingNumber",
    "actualFromZIPCode",
    "actualToCountry",
    "actualToZip",
    "actualMailClass",
    "adjustedAmount",
    "actualPackageInfo",
    "dispute",
    "actualService"
})
public class Adjustment {

    @XmlElement(name = "AdjustmentStatus", required = true)
    @XmlSchemaType(name = "string")
    protected AdjustmentStatus adjustmentStatus;
    @XmlElement(name = "DateAdjustmentProcessed")
    protected String dateAdjustmentProcessed;
    @XmlElement(name = "DateRecorded")
    protected String dateRecorded;
    @XmlElement(name = "ActualTrackingNumber")
    protected String actualTrackingNumber;
    @XmlElement(name = "ActualFromZIPCode")
    protected String actualFromZIPCode;
    @XmlElement(name = "ActualToCountry")
    protected String actualToCountry;
    @XmlElement(name = "ActualToZip")
    protected String actualToZip;
    @XmlElement(name = "ActualMailClass")
    protected String actualMailClass;
    @XmlElement(name = "AdjustedAmount")
    protected String adjustedAmount;
    @XmlElement(name = "ActualPackageInfo")
    protected PackageInfo actualPackageInfo;
    @XmlElement(name = "Dispute")
    protected DisputeDetails dispute;
    @XmlElement(name = "ActualService")
    protected ActualService actualService;

    /**
     * Gets the value of the adjustmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentStatus }
     *     
     */
    public AdjustmentStatus getAdjustmentStatus() {
        return adjustmentStatus;
    }

    /**
     * Sets the value of the adjustmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentStatus }
     *     
     */
    public void setAdjustmentStatus(AdjustmentStatus value) {
        this.adjustmentStatus = value;
    }

    /**
     * Gets the value of the dateAdjustmentProcessed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateAdjustmentProcessed() {
        return dateAdjustmentProcessed;
    }

    /**
     * Sets the value of the dateAdjustmentProcessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateAdjustmentProcessed(String value) {
        this.dateAdjustmentProcessed = value;
    }

    /**
     * Gets the value of the dateRecorded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateRecorded() {
        return dateRecorded;
    }

    /**
     * Sets the value of the dateRecorded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateRecorded(String value) {
        this.dateRecorded = value;
    }

    /**
     * Gets the value of the actualTrackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualTrackingNumber() {
        return actualTrackingNumber;
    }

    /**
     * Sets the value of the actualTrackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualTrackingNumber(String value) {
        this.actualTrackingNumber = value;
    }

    /**
     * Gets the value of the actualFromZIPCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualFromZIPCode() {
        return actualFromZIPCode;
    }

    /**
     * Sets the value of the actualFromZIPCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualFromZIPCode(String value) {
        this.actualFromZIPCode = value;
    }

    /**
     * Gets the value of the actualToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualToCountry() {
        return actualToCountry;
    }

    /**
     * Sets the value of the actualToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualToCountry(String value) {
        this.actualToCountry = value;
    }

    /**
     * Gets the value of the actualToZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualToZip() {
        return actualToZip;
    }

    /**
     * Sets the value of the actualToZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualToZip(String value) {
        this.actualToZip = value;
    }

    /**
     * Gets the value of the actualMailClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualMailClass() {
        return actualMailClass;
    }

    /**
     * Sets the value of the actualMailClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualMailClass(String value) {
        this.actualMailClass = value;
    }

    /**
     * Gets the value of the adjustedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustedAmount() {
        return adjustedAmount;
    }

    /**
     * Sets the value of the adjustedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustedAmount(String value) {
        this.adjustedAmount = value;
    }

    /**
     * Gets the value of the actualPackageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PackageInfo }
     *     
     */
    public PackageInfo getActualPackageInfo() {
        return actualPackageInfo;
    }

    /**
     * Sets the value of the actualPackageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageInfo }
     *     
     */
    public void setActualPackageInfo(PackageInfo value) {
        this.actualPackageInfo = value;
    }

    /**
     * Gets the value of the dispute property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeDetails }
     *     
     */
    public DisputeDetails getDispute() {
        return dispute;
    }

    /**
     * Sets the value of the dispute property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeDetails }
     *     
     */
    public void setDispute(DisputeDetails value) {
        this.dispute = value;
    }

    /**
     * Gets the value of the actualService property.
     * 
     * @return
     *     possible object is
     *     {@link ActualService }
     *     
     */
    public ActualService getActualService() {
        return actualService;
    }

    /**
     * Sets the value of the actualService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualService }
     *     
     */
    public void setActualService(ActualService value) {
        this.actualService = value;
    }

}
