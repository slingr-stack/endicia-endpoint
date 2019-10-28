
package com.envmgr.labelservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelNumberResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LabelNumberResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LabelNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LabelNumberType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LabelNumberSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RDC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServerDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BarcodeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Banner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MailerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisplayLabelNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PicId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="SDRValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DeliveryTimeDays" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelNumberResponse", propOrder = {
    "status",
    "errorMessage",
    "labelNumber",
    "labelNumberType",
    "labelNumberSource",
    "rdc",
    "serverName",
    "serverDateTime",
    "barcodeNumber",
    "banner",
    "mailerID",
    "displayLabelNumber",
    "picId",
    "sdrValue",
    "deliveryTimeDays"
})
public class LabelNumberResponse {

    @XmlElement(name = "Status")
    protected int status;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "LabelNumber")
    protected String labelNumber;
    @XmlElement(name = "LabelNumberType")
    protected String labelNumberType;
    @XmlElement(name = "LabelNumberSource")
    protected String labelNumberSource;
    @XmlElement(name = "RDC")
    protected String rdc;
    @XmlElement(name = "ServerName")
    protected String serverName;
    @XmlElement(name = "ServerDateTime")
    protected String serverDateTime;
    @XmlElement(name = "BarcodeNumber")
    protected String barcodeNumber;
    @XmlElement(name = "Banner")
    protected String banner;
    @XmlElement(name = "MailerID")
    protected String mailerID;
    @XmlElement(name = "DisplayLabelNumber")
    protected String displayLabelNumber;
    @XmlElement(name = "PicId")
    protected long picId;
    @XmlElement(name = "SDRValue", required = true)
    protected BigDecimal sdrValue;
    @XmlElement(name = "DeliveryTimeDays")
    protected int deliveryTimeDays;

    /**
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the labelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelNumber() {
        return labelNumber;
    }

    /**
     * Sets the value of the labelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelNumber(String value) {
        this.labelNumber = value;
    }

    /**
     * Gets the value of the labelNumberType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelNumberType() {
        return labelNumberType;
    }

    /**
     * Sets the value of the labelNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelNumberType(String value) {
        this.labelNumberType = value;
    }

    /**
     * Gets the value of the labelNumberSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelNumberSource() {
        return labelNumberSource;
    }

    /**
     * Sets the value of the labelNumberSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelNumberSource(String value) {
        this.labelNumberSource = value;
    }

    /**
     * Gets the value of the rdc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRDC() {
        return rdc;
    }

    /**
     * Sets the value of the rdc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRDC(String value) {
        this.rdc = value;
    }

    /**
     * Gets the value of the serverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * Sets the value of the serverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerName(String value) {
        this.serverName = value;
    }

    /**
     * Gets the value of the serverDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerDateTime() {
        return serverDateTime;
    }

    /**
     * Sets the value of the serverDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerDateTime(String value) {
        this.serverDateTime = value;
    }

    /**
     * Gets the value of the barcodeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarcodeNumber() {
        return barcodeNumber;
    }

    /**
     * Sets the value of the barcodeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarcodeNumber(String value) {
        this.barcodeNumber = value;
    }

    /**
     * Gets the value of the banner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanner() {
        return banner;
    }

    /**
     * Sets the value of the banner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanner(String value) {
        this.banner = value;
    }

    /**
     * Gets the value of the mailerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailerID() {
        return mailerID;
    }

    /**
     * Sets the value of the mailerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailerID(String value) {
        this.mailerID = value;
    }

    /**
     * Gets the value of the displayLabelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayLabelNumber() {
        return displayLabelNumber;
    }

    /**
     * Sets the value of the displayLabelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayLabelNumber(String value) {
        this.displayLabelNumber = value;
    }

    /**
     * Gets the value of the picId property.
     * 
     */
    public long getPicId() {
        return picId;
    }

    /**
     * Sets the value of the picId property.
     * 
     */
    public void setPicId(long value) {
        this.picId = value;
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
     * Gets the value of the deliveryTimeDays property.
     * 
     */
    public int getDeliveryTimeDays() {
        return deliveryTimeDays;
    }

    /**
     * Sets the value of the deliveryTimeDays property.
     * 
     */
    public void setDeliveryTimeDays(int value) {
        this.deliveryTimeDays = value;
    }

}
