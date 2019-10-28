
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserSignUpRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
    @XmlElement(name = "RequesterID")
    protected String requesterID;
    @XmlAttribute(name = "TokenRequested", required = true)
    protected boolean tokenRequested;

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
     * Gets the value of the firstName property.
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
     * Sets the value of the firstName property.
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
     * Gets the value of the lastName property.
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
     * Sets the value of the lastName property.
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
     * Gets the value of the middleName property.
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
     * Sets the value of the middleName property.
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
     * Gets the value of the title property.
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
     * Sets the value of the title property.
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
     * Gets the value of the emailAddress property.
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
     * Sets the value of the emailAddress property.
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
     * Gets the value of the phoneNumber property.
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
     * Sets the value of the phoneNumber property.
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
     * Gets the value of the phoneNumberExt property.
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
     * Sets the value of the phoneNumberExt property.
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
     * Gets the value of the faxNumber property.
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
     * Sets the value of the faxNumber property.
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
     * Gets the value of the billingType property.
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
     * Sets the value of the billingType property.
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
     * Gets the value of the partnerID property.
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
     * Sets the value of the partnerID property.
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
     * Gets the value of the originatingIpAddress property.
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
     * Sets the value of the originatingIpAddress property.
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
     * Gets the value of the contracts property.
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
     * Sets the value of the contracts property.
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
     * Gets the value of the accountCredentials property.
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
     * Sets the value of the accountCredentials property.
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
     * Gets the value of the creditCard property.
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
     * Sets the value of the creditCard property.
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
     * Gets the value of the checkingAccount property.
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
     * Sets the value of the checkingAccount property.
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
     * Gets the value of the physicalAddress property.
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
     * Sets the value of the physicalAddress property.
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
     * Gets the value of the mailingAddress property.
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
     * Sets the value of the mailingAddress property.
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
     * Gets the value of the paymentDetailsDeferred property.
     * 
     */
    public boolean isPaymentDetailsDeferred() {
        return paymentDetailsDeferred;
    }

    /**
     * Sets the value of the paymentDetailsDeferred property.
     * 
     */
    public void setPaymentDetailsDeferred(boolean value) {
        this.paymentDetailsDeferred = value;
    }

    /**
     * Gets the value of the uspsRep property.
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
     * Sets the value of the uspsRep property.
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
     * Gets the value of the dedicatedResellerAccount property.
     * 
     */
    public boolean isDedicatedResellerAccount() {
        return dedicatedResellerAccount;
    }

    /**
     * Sets the value of the dedicatedResellerAccount property.
     * 
     */
    public void setDedicatedResellerAccount(boolean value) {
        this.dedicatedResellerAccount = value;
    }

    /**
     * Gets the value of the iCertify property.
     * 
     */
    public boolean isICertify() {
        return iCertify;
    }

    /**
     * Sets the value of the iCertify property.
     * 
     */
    public void setICertify(boolean value) {
        this.iCertify = value;
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
     * Gets the value of the tokenRequested property.
     * 
     */
    public boolean isTokenRequested() {
        return tokenRequested;
    }

    /**
     * Sets the value of the tokenRequested property.
     * 
     */
    public void setTokenRequested(boolean value) {
        this.tokenRequested = value;
    }

}
