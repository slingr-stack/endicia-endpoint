
package com.envmgr.labelservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PicNumberRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PicNumberRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{www.envmgr.com/LabelService}LabelNumberRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InsuredMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsuredMailFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RestrictedDeliveryFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ReturnReceipt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnReceiptFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ReturnReceiptRegular" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ReturnReceiptRegularFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ReturnReceiptElectronic" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ReturnReceiptElectronicFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ReturnReceiptMerchandise" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ReturnReceiptMerchandiseFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ServiceLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SundayHolidayDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SundayDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="HolidayDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="NoDeliverySaturday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FacilityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WaiverOfSignature" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AMDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AMDeliveryFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PicNumberRequest", propOrder = {
    "insuredMail",
    "insuredMailFee",
    "restrictedDeliveryFee",
    "returnReceipt",
    "returnReceiptFee",
    "returnReceiptRegular",
    "returnReceiptRegularFee",
    "returnReceiptElectronic",
    "returnReceiptElectronicFee",
    "returnReceiptMerchandise",
    "returnReceiptMerchandiseFee",
    "serviceLevel",
    "sundayHolidayDelivery",
    "sundayDelivery",
    "holidayDelivery",
    "noDeliverySaturday",
    "facilityID",
    "waiverOfSignature",
    "amDelivery",
    "amDeliveryFee"
})
public class PicNumberRequest
    extends LabelNumberRequest
{

    @XmlElement(name = "InsuredMail")
    protected String insuredMail;
    @XmlElement(name = "InsuredMailFee", required = true)
    protected BigDecimal insuredMailFee;
    @XmlElement(name = "RestrictedDeliveryFee", required = true)
    protected BigDecimal restrictedDeliveryFee;
    @XmlElement(name = "ReturnReceipt")
    protected String returnReceipt;
    @XmlElement(name = "ReturnReceiptFee", required = true)
    protected BigDecimal returnReceiptFee;
    @XmlElement(name = "ReturnReceiptRegular")
    protected boolean returnReceiptRegular;
    @XmlElement(name = "ReturnReceiptRegularFee", required = true)
    protected BigDecimal returnReceiptRegularFee;
    @XmlElement(name = "ReturnReceiptElectronic")
    protected boolean returnReceiptElectronic;
    @XmlElement(name = "ReturnReceiptElectronicFee", required = true)
    protected BigDecimal returnReceiptElectronicFee;
    @XmlElement(name = "ReturnReceiptMerchandise")
    protected boolean returnReceiptMerchandise;
    @XmlElement(name = "ReturnReceiptMerchandiseFee", required = true)
    protected BigDecimal returnReceiptMerchandiseFee;
    @XmlElement(name = "ServiceLevel")
    protected String serviceLevel;
    @XmlElement(name = "SundayHolidayDelivery")
    protected boolean sundayHolidayDelivery;
    @XmlElement(name = "SundayDelivery")
    protected boolean sundayDelivery;
    @XmlElement(name = "HolidayDelivery")
    protected boolean holidayDelivery;
    @XmlElement(name = "NoDeliverySaturday")
    protected boolean noDeliverySaturday;
    @XmlElement(name = "FacilityID")
    protected String facilityID;
    @XmlElement(name = "WaiverOfSignature")
    protected boolean waiverOfSignature;
    @XmlElement(name = "AMDelivery")
    protected boolean amDelivery;
    @XmlElement(name = "AMDeliveryFee", required = true)
    protected BigDecimal amDeliveryFee;

    /**
     * Gets the value of the insuredMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredMail() {
        return insuredMail;
    }

    /**
     * Sets the value of the insuredMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredMail(String value) {
        this.insuredMail = value;
    }

    /**
     * Gets the value of the insuredMailFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsuredMailFee() {
        return insuredMailFee;
    }

    /**
     * Sets the value of the insuredMailFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInsuredMailFee(BigDecimal value) {
        this.insuredMailFee = value;
    }

    /**
     * Gets the value of the restrictedDeliveryFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRestrictedDeliveryFee() {
        return restrictedDeliveryFee;
    }

    /**
     * Sets the value of the restrictedDeliveryFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRestrictedDeliveryFee(BigDecimal value) {
        this.restrictedDeliveryFee = value;
    }

    /**
     * Gets the value of the returnReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnReceipt() {
        return returnReceipt;
    }

    /**
     * Sets the value of the returnReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnReceipt(String value) {
        this.returnReceipt = value;
    }

    /**
     * Gets the value of the returnReceiptFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnReceiptFee() {
        return returnReceiptFee;
    }

    /**
     * Sets the value of the returnReceiptFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnReceiptFee(BigDecimal value) {
        this.returnReceiptFee = value;
    }

    /**
     * Gets the value of the returnReceiptRegular property.
     * 
     */
    public boolean isReturnReceiptRegular() {
        return returnReceiptRegular;
    }

    /**
     * Sets the value of the returnReceiptRegular property.
     * 
     */
    public void setReturnReceiptRegular(boolean value) {
        this.returnReceiptRegular = value;
    }

    /**
     * Gets the value of the returnReceiptRegularFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnReceiptRegularFee() {
        return returnReceiptRegularFee;
    }

    /**
     * Sets the value of the returnReceiptRegularFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnReceiptRegularFee(BigDecimal value) {
        this.returnReceiptRegularFee = value;
    }

    /**
     * Gets the value of the returnReceiptElectronic property.
     * 
     */
    public boolean isReturnReceiptElectronic() {
        return returnReceiptElectronic;
    }

    /**
     * Sets the value of the returnReceiptElectronic property.
     * 
     */
    public void setReturnReceiptElectronic(boolean value) {
        this.returnReceiptElectronic = value;
    }

    /**
     * Gets the value of the returnReceiptElectronicFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnReceiptElectronicFee() {
        return returnReceiptElectronicFee;
    }

    /**
     * Sets the value of the returnReceiptElectronicFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnReceiptElectronicFee(BigDecimal value) {
        this.returnReceiptElectronicFee = value;
    }

    /**
     * Gets the value of the returnReceiptMerchandise property.
     * 
     */
    public boolean isReturnReceiptMerchandise() {
        return returnReceiptMerchandise;
    }

    /**
     * Sets the value of the returnReceiptMerchandise property.
     * 
     */
    public void setReturnReceiptMerchandise(boolean value) {
        this.returnReceiptMerchandise = value;
    }

    /**
     * Gets the value of the returnReceiptMerchandiseFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnReceiptMerchandiseFee() {
        return returnReceiptMerchandiseFee;
    }

    /**
     * Sets the value of the returnReceiptMerchandiseFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnReceiptMerchandiseFee(BigDecimal value) {
        this.returnReceiptMerchandiseFee = value;
    }

    /**
     * Gets the value of the serviceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLevel() {
        return serviceLevel;
    }

    /**
     * Sets the value of the serviceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLevel(String value) {
        this.serviceLevel = value;
    }

    /**
     * Gets the value of the sundayHolidayDelivery property.
     * 
     */
    public boolean isSundayHolidayDelivery() {
        return sundayHolidayDelivery;
    }

    /**
     * Sets the value of the sundayHolidayDelivery property.
     * 
     */
    public void setSundayHolidayDelivery(boolean value) {
        this.sundayHolidayDelivery = value;
    }

    /**
     * Gets the value of the sundayDelivery property.
     * 
     */
    public boolean isSundayDelivery() {
        return sundayDelivery;
    }

    /**
     * Sets the value of the sundayDelivery property.
     * 
     */
    public void setSundayDelivery(boolean value) {
        this.sundayDelivery = value;
    }

    /**
     * Gets the value of the holidayDelivery property.
     * 
     */
    public boolean isHolidayDelivery() {
        return holidayDelivery;
    }

    /**
     * Sets the value of the holidayDelivery property.
     * 
     */
    public void setHolidayDelivery(boolean value) {
        this.holidayDelivery = value;
    }

    /**
     * Gets the value of the noDeliverySaturday property.
     * 
     */
    public boolean isNoDeliverySaturday() {
        return noDeliverySaturday;
    }

    /**
     * Sets the value of the noDeliverySaturday property.
     * 
     */
    public void setNoDeliverySaturday(boolean value) {
        this.noDeliverySaturday = value;
    }

    /**
     * Gets the value of the facilityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityID() {
        return facilityID;
    }

    /**
     * Sets the value of the facilityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityID(String value) {
        this.facilityID = value;
    }

    /**
     * Gets the value of the waiverOfSignature property.
     * 
     */
    public boolean isWaiverOfSignature() {
        return waiverOfSignature;
    }

    /**
     * Sets the value of the waiverOfSignature property.
     * 
     */
    public void setWaiverOfSignature(boolean value) {
        this.waiverOfSignature = value;
    }

    /**
     * Gets the value of the amDelivery property.
     * 
     */
    public boolean isAMDelivery() {
        return amDelivery;
    }

    /**
     * Sets the value of the amDelivery property.
     * 
     */
    public void setAMDelivery(boolean value) {
        this.amDelivery = value;
    }

    /**
     * Gets the value of the amDeliveryFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMDeliveryFee() {
        return amDeliveryFee;
    }

    /**
     * Sets the value of the amDeliveryFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMDeliveryFee(BigDecimal value) {
        this.amDeliveryFee = value;
    }

}
