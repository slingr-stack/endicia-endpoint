
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Adjustment complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad adjustmentStatus.
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
     * Define el valor de la propiedad adjustmentStatus.
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
     * Obtiene el valor de la propiedad dateAdjustmentProcessed.
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
     * Define el valor de la propiedad dateAdjustmentProcessed.
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
     * Obtiene el valor de la propiedad dateRecorded.
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
     * Define el valor de la propiedad dateRecorded.
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
     * Obtiene el valor de la propiedad actualTrackingNumber.
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
     * Define el valor de la propiedad actualTrackingNumber.
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
     * Obtiene el valor de la propiedad actualFromZIPCode.
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
     * Define el valor de la propiedad actualFromZIPCode.
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
     * Obtiene el valor de la propiedad actualToCountry.
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
     * Define el valor de la propiedad actualToCountry.
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
     * Obtiene el valor de la propiedad actualToZip.
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
     * Define el valor de la propiedad actualToZip.
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
     * Obtiene el valor de la propiedad actualMailClass.
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
     * Define el valor de la propiedad actualMailClass.
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
     * Obtiene el valor de la propiedad adjustedAmount.
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
     * Define el valor de la propiedad adjustedAmount.
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
     * Obtiene el valor de la propiedad actualPackageInfo.
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
     * Define el valor de la propiedad actualPackageInfo.
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
     * Obtiene el valor de la propiedad dispute.
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
     * Define el valor de la propiedad dispute.
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
     * Obtiene el valor de la propiedad actualService.
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
     * Define el valor de la propiedad actualService.
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
