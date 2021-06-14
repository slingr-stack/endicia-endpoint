
package com.envmgr.labelservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PicNumberRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad insuredMail.
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
     * Define el valor de la propiedad insuredMail.
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
     * Obtiene el valor de la propiedad insuredMailFee.
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
     * Define el valor de la propiedad insuredMailFee.
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
     * Obtiene el valor de la propiedad restrictedDeliveryFee.
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
     * Define el valor de la propiedad restrictedDeliveryFee.
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
     * Obtiene el valor de la propiedad returnReceipt.
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
     * Define el valor de la propiedad returnReceipt.
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
     * Obtiene el valor de la propiedad returnReceiptFee.
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
     * Define el valor de la propiedad returnReceiptFee.
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
     * Obtiene el valor de la propiedad returnReceiptRegular.
     * 
     */
    public boolean isReturnReceiptRegular() {
        return returnReceiptRegular;
    }

    /**
     * Define el valor de la propiedad returnReceiptRegular.
     * 
     */
    public void setReturnReceiptRegular(boolean value) {
        this.returnReceiptRegular = value;
    }

    /**
     * Obtiene el valor de la propiedad returnReceiptRegularFee.
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
     * Define el valor de la propiedad returnReceiptRegularFee.
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
     * Obtiene el valor de la propiedad returnReceiptElectronic.
     * 
     */
    public boolean isReturnReceiptElectronic() {
        return returnReceiptElectronic;
    }

    /**
     * Define el valor de la propiedad returnReceiptElectronic.
     * 
     */
    public void setReturnReceiptElectronic(boolean value) {
        this.returnReceiptElectronic = value;
    }

    /**
     * Obtiene el valor de la propiedad returnReceiptElectronicFee.
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
     * Define el valor de la propiedad returnReceiptElectronicFee.
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
     * Obtiene el valor de la propiedad returnReceiptMerchandise.
     * 
     */
    public boolean isReturnReceiptMerchandise() {
        return returnReceiptMerchandise;
    }

    /**
     * Define el valor de la propiedad returnReceiptMerchandise.
     * 
     */
    public void setReturnReceiptMerchandise(boolean value) {
        this.returnReceiptMerchandise = value;
    }

    /**
     * Obtiene el valor de la propiedad returnReceiptMerchandiseFee.
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
     * Define el valor de la propiedad returnReceiptMerchandiseFee.
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
     * Obtiene el valor de la propiedad serviceLevel.
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
     * Define el valor de la propiedad serviceLevel.
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
     * Obtiene el valor de la propiedad sundayHolidayDelivery.
     * 
     */
    public boolean isSundayHolidayDelivery() {
        return sundayHolidayDelivery;
    }

    /**
     * Define el valor de la propiedad sundayHolidayDelivery.
     * 
     */
    public void setSundayHolidayDelivery(boolean value) {
        this.sundayHolidayDelivery = value;
    }

    /**
     * Obtiene el valor de la propiedad sundayDelivery.
     * 
     */
    public boolean isSundayDelivery() {
        return sundayDelivery;
    }

    /**
     * Define el valor de la propiedad sundayDelivery.
     * 
     */
    public void setSundayDelivery(boolean value) {
        this.sundayDelivery = value;
    }

    /**
     * Obtiene el valor de la propiedad holidayDelivery.
     * 
     */
    public boolean isHolidayDelivery() {
        return holidayDelivery;
    }

    /**
     * Define el valor de la propiedad holidayDelivery.
     * 
     */
    public void setHolidayDelivery(boolean value) {
        this.holidayDelivery = value;
    }

    /**
     * Obtiene el valor de la propiedad noDeliverySaturday.
     * 
     */
    public boolean isNoDeliverySaturday() {
        return noDeliverySaturday;
    }

    /**
     * Define el valor de la propiedad noDeliverySaturday.
     * 
     */
    public void setNoDeliverySaturday(boolean value) {
        this.noDeliverySaturday = value;
    }

    /**
     * Obtiene el valor de la propiedad facilityID.
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
     * Define el valor de la propiedad facilityID.
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
     * Obtiene el valor de la propiedad waiverOfSignature.
     * 
     */
    public boolean isWaiverOfSignature() {
        return waiverOfSignature;
    }

    /**
     * Define el valor de la propiedad waiverOfSignature.
     * 
     */
    public void setWaiverOfSignature(boolean value) {
        this.waiverOfSignature = value;
    }

    /**
     * Obtiene el valor de la propiedad amDelivery.
     * 
     */
    public boolean isAMDelivery() {
        return amDelivery;
    }

    /**
     * Define el valor de la propiedad amDelivery.
     * 
     */
    public void setAMDelivery(boolean value) {
        this.amDelivery = value;
    }

    /**
     * Obtiene el valor de la propiedad amDeliveryFee.
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
     * Define el valor de la propiedad amDeliveryFee.
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
