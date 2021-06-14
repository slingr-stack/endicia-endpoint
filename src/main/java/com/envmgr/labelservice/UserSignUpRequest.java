
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UserSignUpRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UserSignUpRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{www.envmgr.com/LabelService}DataValidator"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumberExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PartnerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginatingIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contracts" type="{www.envmgr.com/LabelService}ArrayOfString5" minOccurs="0"/&gt;
 *         &lt;element name="AccountCredentials" type="{www.envmgr.com/LabelService}AccountCredentials" minOccurs="0"/&gt;
 *         &lt;element name="CreditCard" type="{www.envmgr.com/LabelService}CreditCard" minOccurs="0"/&gt;
 *         &lt;element name="CheckingAccount" type="{www.envmgr.com/LabelService}CheckingAccount" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalAddress" type="{www.envmgr.com/LabelService}PhysicalPickupAddress" minOccurs="0"/&gt;
 *         &lt;element name="MailingAddress" type="{www.envmgr.com/LabelService}PhysicalPickupAddress" minOccurs="0"/&gt;
 *         &lt;element name="PaymentDetailsDeferred" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="USPSRep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DedicatedResellerAccount" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ICertify" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequesterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TokenRequested" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserSignUpRequest", propOrder = {
    "requestID",
    "firstName",
    "lastName",
    "middleName",
    "title",
    "emailAddress",
    "phoneNumber",
    "phoneNumberExt",
    "faxNumber",
    "billingType",
    "partnerID",
    "originatingIpAddress",
    "contracts",
    "accountCredentials",
    "creditCard",
    "checkingAccount",
    "physicalAddress",
    "mailingAddress",
    "paymentDetailsDeferred",
    "uspsRep",
    "dedicatedResellerAccount",
    "iCertify",
    "userName",
    "requesterID"
})
public class UserSignUpRequest
    extends DataValidator
{

    @XmlElement(name = "RequestID")
    protected String requestID;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "PhoneNumberExt")
    protected String phoneNumberExt;
    @XmlElement(name = "FaxNumber")
    protected String faxNumber;
    @XmlElement(name = "BillingType")
    protected String billingType;
    @XmlElement(name = "PartnerID")
    protected String partnerID;
    @XmlElement(name = "OriginatingIpAddress")
    protected String originatingIpAddress;
    @XmlElement(name = "Contracts")
    protected ArrayOfString5 contracts;
    @XmlElement(name = "AccountCredentials")
    protected AccountCredentials accountCredentials;
    @XmlElement(name = "CreditCard")
    protected CreditCard creditCard;
    @XmlElement(name = "CheckingAccount")
    protected CheckingAccount checkingAccount;
    @XmlElement(name = "PhysicalAddress")
    protected PhysicalPickupAddress physicalAddress;
    @XmlElement(name = "MailingAddress")
    protected PhysicalPickupAddress mailingAddress;
    @XmlElement(name = "PaymentDetailsDeferred")
    protected boolean paymentDetailsDeferred;
    @XmlElement(name = "USPSRep")
    protected String uspsRep;
    @XmlElement(name = "DedicatedResellerAccount")
    protected boolean dedicatedResellerAccount;
    @XmlElement(name = "ICertify")
    protected boolean iCertify;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "RequesterID")
    protected String requesterID;
    @XmlAttribute(name = "TokenRequested", required = true)
    protected boolean tokenRequested;

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
     * Obtiene el valor de la propiedad firstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Define el valor de la propiedad firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Obtiene el valor de la propiedad lastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Define el valor de la propiedad lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Obtiene el valor de la propiedad middleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Define el valor de la propiedad middleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Obtiene el valor de la propiedad title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define el valor de la propiedad title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtiene el valor de la propiedad emailAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Define el valor de la propiedad emailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Define el valor de la propiedad phoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneNumberExt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberExt() {
        return phoneNumberExt;
    }

    /**
     * Define el valor de la propiedad phoneNumberExt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumberExt(String value) {
        this.phoneNumberExt = value;
    }

    /**
     * Obtiene el valor de la propiedad faxNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * Define el valor de la propiedad faxNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumber(String value) {
        this.faxNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad billingType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingType() {
        return billingType;
    }

    /**
     * Define el valor de la propiedad billingType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingType(String value) {
        this.billingType = value;
    }

    /**
     * Obtiene el valor de la propiedad partnerID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerID() {
        return partnerID;
    }

    /**
     * Define el valor de la propiedad partnerID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerID(String value) {
        this.partnerID = value;
    }

    /**
     * Obtiene el valor de la propiedad originatingIpAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingIpAddress() {
        return originatingIpAddress;
    }

    /**
     * Define el valor de la propiedad originatingIpAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingIpAddress(String value) {
        this.originatingIpAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad contracts.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString5 }
     *     
     */
    public ArrayOfString5 getContracts() {
        return contracts;
    }

    /**
     * Define el valor de la propiedad contracts.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString5 }
     *     
     */
    public void setContracts(ArrayOfString5 value) {
        this.contracts = value;
    }

    /**
     * Obtiene el valor de la propiedad accountCredentials.
     * 
     * @return
     *     possible object is
     *     {@link AccountCredentials }
     *     
     */
    public AccountCredentials getAccountCredentials() {
        return accountCredentials;
    }

    /**
     * Define el valor de la propiedad accountCredentials.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountCredentials }
     *     
     */
    public void setAccountCredentials(AccountCredentials value) {
        this.accountCredentials = value;
    }

    /**
     * Obtiene el valor de la propiedad creditCard.
     * 
     * @return
     *     possible object is
     *     {@link CreditCard }
     *     
     */
    public CreditCard getCreditCard() {
        return creditCard;
    }

    /**
     * Define el valor de la propiedad creditCard.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCard }
     *     
     */
    public void setCreditCard(CreditCard value) {
        this.creditCard = value;
    }

    /**
     * Obtiene el valor de la propiedad checkingAccount.
     * 
     * @return
     *     possible object is
     *     {@link CheckingAccount }
     *     
     */
    public CheckingAccount getCheckingAccount() {
        return checkingAccount;
    }

    /**
     * Define el valor de la propiedad checkingAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckingAccount }
     *     
     */
    public void setCheckingAccount(CheckingAccount value) {
        this.checkingAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad physicalAddress.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalPickupAddress }
     *     
     */
    public PhysicalPickupAddress getPhysicalAddress() {
        return physicalAddress;
    }

    /**
     * Define el valor de la propiedad physicalAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalPickupAddress }
     *     
     */
    public void setPhysicalAddress(PhysicalPickupAddress value) {
        this.physicalAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad mailingAddress.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalPickupAddress }
     *     
     */
    public PhysicalPickupAddress getMailingAddress() {
        return mailingAddress;
    }

    /**
     * Define el valor de la propiedad mailingAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalPickupAddress }
     *     
     */
    public void setMailingAddress(PhysicalPickupAddress value) {
        this.mailingAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentDetailsDeferred.
     * 
     */
    public boolean isPaymentDetailsDeferred() {
        return paymentDetailsDeferred;
    }

    /**
     * Define el valor de la propiedad paymentDetailsDeferred.
     * 
     */
    public void setPaymentDetailsDeferred(boolean value) {
        this.paymentDetailsDeferred = value;
    }

    /**
     * Obtiene el valor de la propiedad uspsRep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSPSRep() {
        return uspsRep;
    }

    /**
     * Define el valor de la propiedad uspsRep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSPSRep(String value) {
        this.uspsRep = value;
    }

    /**
     * Obtiene el valor de la propiedad dedicatedResellerAccount.
     * 
     */
    public boolean isDedicatedResellerAccount() {
        return dedicatedResellerAccount;
    }

    /**
     * Define el valor de la propiedad dedicatedResellerAccount.
     * 
     */
    public void setDedicatedResellerAccount(boolean value) {
        this.dedicatedResellerAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad iCertify.
     * 
     */
    public boolean isICertify() {
        return iCertify;
    }

    /**
     * Define el valor de la propiedad iCertify.
     * 
     */
    public void setICertify(boolean value) {
        this.iCertify = value;
    }

    /**
     * Obtiene el valor de la propiedad userName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Define el valor de la propiedad userName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
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
     * Obtiene el valor de la propiedad tokenRequested.
     * 
     */
    public boolean isTokenRequested() {
        return tokenRequested;
    }

    /**
     * Define el valor de la propiedad tokenRequested.
     * 
     */
    public void setTokenRequested(boolean value) {
        this.tokenRequested = value;
    }

}
