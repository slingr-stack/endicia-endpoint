
package com.envmgr.labelservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LabelNumberResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad status.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad errorMessage.
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
     * Define el valor de la propiedad errorMessage.
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
     * Obtiene el valor de la propiedad labelNumber.
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
     * Define el valor de la propiedad labelNumber.
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
     * Obtiene el valor de la propiedad labelNumberType.
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
     * Define el valor de la propiedad labelNumberType.
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
     * Obtiene el valor de la propiedad labelNumberSource.
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
     * Define el valor de la propiedad labelNumberSource.
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
     * Obtiene el valor de la propiedad rdc.
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
     * Define el valor de la propiedad rdc.
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
     * Obtiene el valor de la propiedad serverName.
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
     * Define el valor de la propiedad serverName.
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
     * Obtiene el valor de la propiedad serverDateTime.
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
     * Define el valor de la propiedad serverDateTime.
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
     * Obtiene el valor de la propiedad barcodeNumber.
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
     * Define el valor de la propiedad barcodeNumber.
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
     * Obtiene el valor de la propiedad banner.
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
     * Define el valor de la propiedad banner.
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
     * Obtiene el valor de la propiedad mailerID.
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
     * Define el valor de la propiedad mailerID.
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
     * Obtiene el valor de la propiedad displayLabelNumber.
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
     * Define el valor de la propiedad displayLabelNumber.
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
     * Obtiene el valor de la propiedad picId.
     * 
     */
    public long getPicId() {
        return picId;
    }

    /**
     * Define el valor de la propiedad picId.
     * 
     */
    public void setPicId(long value) {
        this.picId = value;
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
     * Obtiene el valor de la propiedad deliveryTimeDays.
     * 
     */
    public int getDeliveryTimeDays() {
        return deliveryTimeDays;
    }

    /**
     * Define el valor de la propiedad deliveryTimeDays.
     * 
     */
    public void setDeliveryTimeDays(int value) {
        this.deliveryTimeDays = value;
    }

}
