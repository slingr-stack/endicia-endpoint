
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AddCarrierRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AddCarrierRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{www.envmgr.com/LabelService}DataValidator"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequesterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertifiedIntermediary" type="{www.envmgr.com/LabelService}CertifiedIntermediary" minOccurs="0"/&gt;
 *         &lt;element name="UserOwnedAccount" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgreeToEula" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Invoice" type="{www.envmgr.com/LabelService}Invoice" minOccurs="0"/&gt;
 *         &lt;element name="NegotiatedRates" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DeviceIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PickupNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientSecret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DistributionCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCarrierRequest", propOrder = {
    "requesterID",
    "certifiedIntermediary",
    "userOwnedAccount",
    "carrier",
    "accountNumber",
    "accountZipCode",
    "accountCountry",
    "firstName",
    "lastName",
    "company",
    "address1",
    "address2",
    "city",
    "state",
    "postalCode",
    "country",
    "email",
    "phone",
    "agreeToEula",
    "invoice",
    "negotiatedRates",
    "deviceIdentity",
    "pickupNumber",
    "clientID",
    "clientSecret",
    "distributionCenter"
})
public class AddCarrierRequest
    extends DataValidator
{

    @XmlElement(name = "RequesterID")
    protected String requesterID;
    @XmlElement(name = "CertifiedIntermediary")
    protected CertifiedIntermediary certifiedIntermediary;
    @XmlElement(name = "UserOwnedAccount")
    protected boolean userOwnedAccount;
    @XmlElement(name = "Carrier")
    protected String carrier;
    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "AccountZipCode")
    protected String accountZipCode;
    @XmlElement(name = "AccountCountry")
    protected String accountCountry;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "Company")
    protected String company;
    @XmlElement(name = "Address1")
    protected String address1;
    @XmlElement(name = "Address2")
    protected String address2;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "AgreeToEula")
    protected boolean agreeToEula;
    @XmlElement(name = "Invoice")
    protected Invoice invoice;
    @XmlElement(name = "NegotiatedRates")
    protected boolean negotiatedRates;
    @XmlElement(name = "DeviceIdentity")
    protected String deviceIdentity;
    @XmlElement(name = "PickupNumber")
    protected String pickupNumber;
    @XmlElement(name = "ClientID")
    protected String clientID;
    @XmlElement(name = "ClientSecret")
    protected String clientSecret;
    @XmlElement(name = "DistributionCenter")
    protected String distributionCenter;

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
     * Obtiene el valor de la propiedad userOwnedAccount.
     * 
     */
    public boolean isUserOwnedAccount() {
        return userOwnedAccount;
    }

    /**
     * Define el valor de la propiedad userOwnedAccount.
     * 
     */
    public void setUserOwnedAccount(boolean value) {
        this.userOwnedAccount = value;
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
     * Obtiene el valor de la propiedad accountNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Define el valor de la propiedad accountNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad accountZipCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountZipCode() {
        return accountZipCode;
    }

    /**
     * Define el valor de la propiedad accountZipCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountZipCode(String value) {
        this.accountZipCode = value;
    }

    /**
     * Obtiene el valor de la propiedad accountCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCountry() {
        return accountCountry;
    }

    /**
     * Define el valor de la propiedad accountCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCountry(String value) {
        this.accountCountry = value;
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
     * Obtiene el valor de la propiedad company.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Define el valor de la propiedad company.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Obtiene el valor de la propiedad address1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Define el valor de la propiedad address1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Obtiene el valor de la propiedad address2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Define el valor de la propiedad address2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Obtiene el valor de la propiedad city.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Define el valor de la propiedad city.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Obtiene el valor de la propiedad state.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Define el valor de la propiedad state.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Obtiene el valor de la propiedad postalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Define el valor de la propiedad postalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad country.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Define el valor de la propiedad country.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad phone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Define el valor de la propiedad phone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Obtiene el valor de la propiedad agreeToEula.
     * 
     */
    public boolean isAgreeToEula() {
        return agreeToEula;
    }

    /**
     * Define el valor de la propiedad agreeToEula.
     * 
     */
    public void setAgreeToEula(boolean value) {
        this.agreeToEula = value;
    }

    /**
     * Obtiene el valor de la propiedad invoice.
     * 
     * @return
     *     possible object is
     *     {@link Invoice }
     *     
     */
    public Invoice getInvoice() {
        return invoice;
    }

    /**
     * Define el valor de la propiedad invoice.
     * 
     * @param value
     *     allowed object is
     *     {@link Invoice }
     *     
     */
    public void setInvoice(Invoice value) {
        this.invoice = value;
    }

    /**
     * Obtiene el valor de la propiedad negotiatedRates.
     * 
     */
    public boolean isNegotiatedRates() {
        return negotiatedRates;
    }

    /**
     * Define el valor de la propiedad negotiatedRates.
     * 
     */
    public void setNegotiatedRates(boolean value) {
        this.negotiatedRates = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceIdentity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceIdentity() {
        return deviceIdentity;
    }

    /**
     * Define el valor de la propiedad deviceIdentity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceIdentity(String value) {
        this.deviceIdentity = value;
    }

    /**
     * Obtiene el valor de la propiedad pickupNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupNumber() {
        return pickupNumber;
    }

    /**
     * Define el valor de la propiedad pickupNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupNumber(String value) {
        this.pickupNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad clientID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * Define el valor de la propiedad clientID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientID(String value) {
        this.clientID = value;
    }

    /**
     * Obtiene el valor de la propiedad clientSecret.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * Define el valor de la propiedad clientSecret.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientSecret(String value) {
        this.clientSecret = value;
    }

    /**
     * Obtiene el valor de la propiedad distributionCenter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionCenter() {
        return distributionCenter;
    }

    /**
     * Define el valor de la propiedad distributionCenter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionCenter(String value) {
        this.distributionCenter = value;
    }

}
