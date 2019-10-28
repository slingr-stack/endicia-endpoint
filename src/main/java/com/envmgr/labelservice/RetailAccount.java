
package com.envmgr.labelservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RetailAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetailAccount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferredBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SignupDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DomesticContractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InternationalContractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Purchased" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Printed" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Refunded" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailAccount", propOrder = {
    "accountNumber",
    "name",
    "companyName",
    "phoneNumber",
    "phoneExt",
    "faxNumber",
    "emailAddress",
    "referredBy",
    "signupDate",
    "domesticContractId",
    "internationalContractId",
    "physicalAddress",
    "physicalCity",
    "physicalState",
    "physicalZip",
    "accountStatus",
    "purchased",
    "printed",
    "refunded",
    "balance"
})
public class RetailAccount {

    @XmlElement(name = "AccountNumber")
    protected int accountNumber;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "PhoneExt")
    protected String phoneExt;
    @XmlElement(name = "FaxNumber")
    protected String faxNumber;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "ReferredBy")
    protected String referredBy;
    @XmlElement(name = "SignupDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signupDate;
    @XmlElement(name = "DomesticContractId")
    protected String domesticContractId;
    @XmlElement(name = "InternationalContractId")
    protected String internationalContractId;
    @XmlElement(name = "PhysicalAddress")
    protected String physicalAddress;
    @XmlElement(name = "PhysicalCity")
    protected String physicalCity;
    @XmlElement(name = "PhysicalState")
    protected String physicalState;
    @XmlElement(name = "PhysicalZip")
    protected String physicalZip;
    @XmlElement(name = "AccountStatus")
    protected String accountStatus;
    @XmlElement(name = "Purchased", required = true)
    protected BigDecimal purchased;
    @XmlElement(name = "Printed", required = true)
    protected BigDecimal printed;
    @XmlElement(name = "Refunded", required = true)
    protected BigDecimal refunded;
    @XmlElement(name = "Balance", required = true)
    protected BigDecimal balance;

    /**
     * Gets the value of the accountNumber property.
     * 
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     */
    public void setAccountNumber(int value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
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
     * Gets the value of the phoneExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneExt() {
        return phoneExt;
    }

    /**
     * Sets the value of the phoneExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneExt(String value) {
        this.phoneExt = value;
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
     * Gets the value of the referredBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferredBy() {
        return referredBy;
    }

    /**
     * Sets the value of the referredBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferredBy(String value) {
        this.referredBy = value;
    }

    /**
     * Gets the value of the signupDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignupDate() {
        return signupDate;
    }

    /**
     * Sets the value of the signupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignupDate(XMLGregorianCalendar value) {
        this.signupDate = value;
    }

    /**
     * Gets the value of the domesticContractId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomesticContractId() {
        return domesticContractId;
    }

    /**
     * Sets the value of the domesticContractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomesticContractId(String value) {
        this.domesticContractId = value;
    }

    /**
     * Gets the value of the internationalContractId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalContractId() {
        return internationalContractId;
    }

    /**
     * Sets the value of the internationalContractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalContractId(String value) {
        this.internationalContractId = value;
    }

    /**
     * Gets the value of the physicalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalAddress() {
        return physicalAddress;
    }

    /**
     * Sets the value of the physicalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalAddress(String value) {
        this.physicalAddress = value;
    }

    /**
     * Gets the value of the physicalCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalCity() {
        return physicalCity;
    }

    /**
     * Sets the value of the physicalCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalCity(String value) {
        this.physicalCity = value;
    }

    /**
     * Gets the value of the physicalState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalState() {
        return physicalState;
    }

    /**
     * Sets the value of the physicalState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalState(String value) {
        this.physicalState = value;
    }

    /**
     * Gets the value of the physicalZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalZip() {
        return physicalZip;
    }

    /**
     * Sets the value of the physicalZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalZip(String value) {
        this.physicalZip = value;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatus(String value) {
        this.accountStatus = value;
    }

    /**
     * Gets the value of the purchased property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPurchased() {
        return purchased;
    }

    /**
     * Sets the value of the purchased property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPurchased(BigDecimal value) {
        this.purchased = value;
    }

    /**
     * Gets the value of the printed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrinted() {
        return printed;
    }

    /**
     * Sets the value of the printed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrinted(BigDecimal value) {
        this.printed = value;
    }

    /**
     * Gets the value of the refunded property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRefunded() {
        return refunded;
    }

    /**
     * Sets the value of the refunded property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRefunded(BigDecimal value) {
        this.refunded = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

}
