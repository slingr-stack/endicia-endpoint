
package com.envmgr.labelservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para RetailAccount complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad accountNumber.
     * 
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Define el valor de la propiedad accountNumber.
     * 
     */
    public void setAccountNumber(int value) {
        this.accountNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
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
     * Define el valor de la propiedad name.
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
     * Obtiene el valor de la propiedad companyName.
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
     * Define el valor de la propiedad companyName.
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
     * Obtiene el valor de la propiedad phoneExt.
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
     * Define el valor de la propiedad phoneExt.
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
     * Obtiene el valor de la propiedad referredBy.
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
     * Define el valor de la propiedad referredBy.
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
     * Obtiene el valor de la propiedad signupDate.
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
     * Define el valor de la propiedad signupDate.
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
     * Obtiene el valor de la propiedad domesticContractId.
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
     * Define el valor de la propiedad domesticContractId.
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
     * Obtiene el valor de la propiedad internationalContractId.
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
     * Define el valor de la propiedad internationalContractId.
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
     * Obtiene el valor de la propiedad physicalAddress.
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
     * Define el valor de la propiedad physicalAddress.
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
     * Obtiene el valor de la propiedad physicalCity.
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
     * Define el valor de la propiedad physicalCity.
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
     * Obtiene el valor de la propiedad physicalState.
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
     * Define el valor de la propiedad physicalState.
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
     * Obtiene el valor de la propiedad physicalZip.
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
     * Define el valor de la propiedad physicalZip.
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
     * Obtiene el valor de la propiedad accountStatus.
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
     * Define el valor de la propiedad accountStatus.
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
     * Obtiene el valor de la propiedad purchased.
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
     * Define el valor de la propiedad purchased.
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
     * Obtiene el valor de la propiedad printed.
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
     * Define el valor de la propiedad printed.
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
     * Obtiene el valor de la propiedad refunded.
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
     * Define el valor de la propiedad refunded.
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
     * Obtiene el valor de la propiedad balance.
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
     * Define el valor de la propiedad balance.
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
