
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para CreateShipmentNotificationRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CreateShipmentNotificationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{www.envmgr.com/LabelService}DataValidator"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequesterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertifiedIntermediary" type="{www.envmgr.com/LabelService}CertifiedIntermediary" minOccurs="0"/&gt;
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WeightOz" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TrackingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BrandingID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NotificationSettingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailSenderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderDetails" type="{www.envmgr.com/LabelService}OrderDetails" minOccurs="0"/&gt;
 *         &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="SendEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateShipmentNotificationRequest", propOrder = {
    "requesterID",
    "certifiedIntermediary",
    "trackingNumber",
    "carrier",
    "weightOz",
    "trackingType",
    "brandingID",
    "notificationSettingId",
    "emailSenderName",
    "fromName",
    "fromCompany",
    "returnAddress1",
    "returnAddress2",
    "returnAddress3",
    "fromCity",
    "fromState",
    "fromPostalCode",
    "fromCountry",
    "fromPhone",
    "fromEmail",
    "toName",
    "toCompany",
    "toAddress1",
    "toAddress2",
    "toAddress3",
    "toCity",
    "toState",
    "toPostalCode",
    "toCountry",
    "toPhone",
    "toEmail",
    "orderDetails",
    "shipDate",
    "sendEmail"
})
public class CreateShipmentNotificationRequest
    extends DataValidator
{

    @XmlElement(name = "RequesterID")
    protected String requesterID;
    @XmlElement(name = "CertifiedIntermediary")
    protected CertifiedIntermediary certifiedIntermediary;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "Carrier")
    protected String carrier;
    @XmlElement(name = "WeightOz")
    protected double weightOz;
    @XmlElement(name = "TrackingType")
    protected String trackingType;
    @XmlElement(name = "BrandingID")
    protected String brandingID;
    @XmlElement(name = "NotificationSettingId")
    protected String notificationSettingId;
    @XmlElement(name = "EmailSenderName")
    protected String emailSenderName;
    @XmlElement(name = "FromName")
    protected String fromName;
    @XmlElement(name = "FromCompany")
    protected String fromCompany;
    @XmlElement(name = "ReturnAddress1")
    protected String returnAddress1;
    @XmlElement(name = "ReturnAddress2")
    protected String returnAddress2;
    @XmlElement(name = "ReturnAddress3")
    protected String returnAddress3;
    @XmlElement(name = "FromCity")
    protected String fromCity;
    @XmlElement(name = "FromState")
    protected String fromState;
    @XmlElement(name = "FromPostalCode")
    protected String fromPostalCode;
    @XmlElement(name = "FromCountry")
    protected String fromCountry;
    @XmlElement(name = "FromPhone")
    protected String fromPhone;
    @XmlElement(name = "FromEmail")
    protected String fromEmail;
    @XmlElement(name = "ToName")
    protected String toName;
    @XmlElement(name = "ToCompany")
    protected String toCompany;
    @XmlElement(name = "ToAddress1")
    protected String toAddress1;
    @XmlElement(name = "ToAddress2")
    protected String toAddress2;
    @XmlElement(name = "ToAddress3")
    protected String toAddress3;
    @XmlElement(name = "ToCity")
    protected String toCity;
    @XmlElement(name = "ToState")
    protected String toState;
    @XmlElement(name = "ToPostalCode")
    protected String toPostalCode;
    @XmlElement(name = "ToCountry")
    protected String toCountry;
    @XmlElement(name = "ToPhone")
    protected String toPhone;
    @XmlElement(name = "ToEmail")
    protected String toEmail;
    @XmlElement(name = "OrderDetails")
    protected OrderDetails orderDetails;
    @XmlElement(name = "ShipDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shipDate;
    @XmlElement(name = "SendEmail")
    protected boolean sendEmail;

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
     * Obtiene el valor de la propiedad trackingNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Define el valor de la propiedad trackingNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
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
     * Obtiene el valor de la propiedad trackingType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingType() {
        return trackingType;
    }

    /**
     * Define el valor de la propiedad trackingType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingType(String value) {
        this.trackingType = value;
    }

    /**
     * Obtiene el valor de la propiedad brandingID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandingID() {
        return brandingID;
    }

    /**
     * Define el valor de la propiedad brandingID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandingID(String value) {
        this.brandingID = value;
    }

    /**
     * Obtiene el valor de la propiedad notificationSettingId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationSettingId() {
        return notificationSettingId;
    }

    /**
     * Define el valor de la propiedad notificationSettingId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationSettingId(String value) {
        this.notificationSettingId = value;
    }

    /**
     * Obtiene el valor de la propiedad emailSenderName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailSenderName() {
        return emailSenderName;
    }

    /**
     * Define el valor de la propiedad emailSenderName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailSenderName(String value) {
        this.emailSenderName = value;
    }

    /**
     * Obtiene el valor de la propiedad fromName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromName() {
        return fromName;
    }

    /**
     * Define el valor de la propiedad fromName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromName(String value) {
        this.fromName = value;
    }

    /**
     * Obtiene el valor de la propiedad fromCompany.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCompany() {
        return fromCompany;
    }

    /**
     * Define el valor de la propiedad fromCompany.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCompany(String value) {
        this.fromCompany = value;
    }

    /**
     * Obtiene el valor de la propiedad returnAddress1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnAddress1() {
        return returnAddress1;
    }

    /**
     * Define el valor de la propiedad returnAddress1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnAddress1(String value) {
        this.returnAddress1 = value;
    }

    /**
     * Obtiene el valor de la propiedad returnAddress2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnAddress2() {
        return returnAddress2;
    }

    /**
     * Define el valor de la propiedad returnAddress2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnAddress2(String value) {
        this.returnAddress2 = value;
    }

    /**
     * Obtiene el valor de la propiedad returnAddress3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnAddress3() {
        return returnAddress3;
    }

    /**
     * Define el valor de la propiedad returnAddress3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnAddress3(String value) {
        this.returnAddress3 = value;
    }

    /**
     * Obtiene el valor de la propiedad fromCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCity() {
        return fromCity;
    }

    /**
     * Define el valor de la propiedad fromCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCity(String value) {
        this.fromCity = value;
    }

    /**
     * Obtiene el valor de la propiedad fromState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromState() {
        return fromState;
    }

    /**
     * Define el valor de la propiedad fromState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromState(String value) {
        this.fromState = value;
    }

    /**
     * Obtiene el valor de la propiedad fromPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromPostalCode() {
        return fromPostalCode;
    }

    /**
     * Define el valor de la propiedad fromPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromPostalCode(String value) {
        this.fromPostalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad fromCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCountry() {
        return fromCountry;
    }

    /**
     * Define el valor de la propiedad fromCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCountry(String value) {
        this.fromCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad fromPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromPhone() {
        return fromPhone;
    }

    /**
     * Define el valor de la propiedad fromPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromPhone(String value) {
        this.fromPhone = value;
    }

    /**
     * Obtiene el valor de la propiedad fromEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromEmail() {
        return fromEmail;
    }

    /**
     * Define el valor de la propiedad fromEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromEmail(String value) {
        this.fromEmail = value;
    }

    /**
     * Obtiene el valor de la propiedad toName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToName() {
        return toName;
    }

    /**
     * Define el valor de la propiedad toName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToName(String value) {
        this.toName = value;
    }

    /**
     * Obtiene el valor de la propiedad toCompany.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCompany() {
        return toCompany;
    }

    /**
     * Define el valor de la propiedad toCompany.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCompany(String value) {
        this.toCompany = value;
    }

    /**
     * Obtiene el valor de la propiedad toAddress1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToAddress1() {
        return toAddress1;
    }

    /**
     * Define el valor de la propiedad toAddress1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToAddress1(String value) {
        this.toAddress1 = value;
    }

    /**
     * Obtiene el valor de la propiedad toAddress2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToAddress2() {
        return toAddress2;
    }

    /**
     * Define el valor de la propiedad toAddress2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToAddress2(String value) {
        this.toAddress2 = value;
    }

    /**
     * Obtiene el valor de la propiedad toAddress3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToAddress3() {
        return toAddress3;
    }

    /**
     * Define el valor de la propiedad toAddress3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToAddress3(String value) {
        this.toAddress3 = value;
    }

    /**
     * Obtiene el valor de la propiedad toCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCity() {
        return toCity;
    }

    /**
     * Define el valor de la propiedad toCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCity(String value) {
        this.toCity = value;
    }

    /**
     * Obtiene el valor de la propiedad toState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToState() {
        return toState;
    }

    /**
     * Define el valor de la propiedad toState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToState(String value) {
        this.toState = value;
    }

    /**
     * Obtiene el valor de la propiedad toPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToPostalCode() {
        return toPostalCode;
    }

    /**
     * Define el valor de la propiedad toPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToPostalCode(String value) {
        this.toPostalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad toCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCountry() {
        return toCountry;
    }

    /**
     * Define el valor de la propiedad toCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCountry(String value) {
        this.toCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad toPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToPhone() {
        return toPhone;
    }

    /**
     * Define el valor de la propiedad toPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToPhone(String value) {
        this.toPhone = value;
    }

    /**
     * Obtiene el valor de la propiedad toEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToEmail() {
        return toEmail;
    }

    /**
     * Define el valor de la propiedad toEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToEmail(String value) {
        this.toEmail = value;
    }

    /**
     * Obtiene el valor de la propiedad orderDetails.
     * 
     * @return
     *     possible object is
     *     {@link OrderDetails }
     *     
     */
    public OrderDetails getOrderDetails() {
        return orderDetails;
    }

    /**
     * Define el valor de la propiedad orderDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDetails }
     *     
     */
    public void setOrderDetails(OrderDetails value) {
        this.orderDetails = value;
    }

    /**
     * Obtiene el valor de la propiedad shipDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipDate() {
        return shipDate;
    }

    /**
     * Define el valor de la propiedad shipDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipDate(XMLGregorianCalendar value) {
        this.shipDate = value;
    }

    /**
     * Obtiene el valor de la propiedad sendEmail.
     * 
     */
    public boolean isSendEmail() {
        return sendEmail;
    }

    /**
     * Define el valor de la propiedad sendEmail.
     * 
     */
    public void setSendEmail(boolean value) {
        this.sendEmail = value;
    }

}
