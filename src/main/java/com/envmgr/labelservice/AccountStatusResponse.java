
package com.envmgr.labelservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountStatusResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequesterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertifiedIntermediary" type="{www.envmgr.com/LabelService}CertifiedIntermediaryStatus" minOccurs="0"/&gt;
 *         &lt;element name="Discounts" type="{www.envmgr.com/LabelService}AccountDiscounts" minOccurs="0"/&gt;
 *         &lt;element name="AccountType" type="{www.envmgr.com/LabelService}AccountTypes"/&gt;
 *         &lt;element name="ApprovedShipper" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ConsolidatorServices" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ConsolidatorServiceDetail" type="{www.envmgr.com/LabelService}ConsolidatorServiceDetailResponse" minOccurs="0"/&gt;
 *         &lt;element name="ContractID" type="{www.envmgr.com/LabelService}AccountContractIDs" minOccurs="0"/&gt;
 *         &lt;element name="InsuranceAgreement" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AccountStatus" type="{www.envmgr.com/LabelService}AccountStatus" minOccurs="0"/&gt;
 *         &lt;element name="ControlRegister" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="LicenseZip5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{www.envmgr.com/LabelService}Address" minOccurs="0"/&gt;
 *         &lt;element name="AccountFeatures" type="{www.envmgr.com/LabelService}AccountFeatures" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountStatusResponse", propOrder = {
    "status",
    "errorMessage",
    "requesterID",
    "requestID",
    "certifiedIntermediary",
    "discounts",
    "accountType",
    "approvedShipper",
    "consolidatorServices",
    "consolidatorServiceDetail",
    "contractID",
    "insuranceAgreement",
    "accountStatus",
    "controlRegister",
    "licenseZip5",
    "address",
    "accountFeatures"
})
public class AccountStatusResponse {

    @XmlElement(name = "Status")
    protected int status;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "RequesterID")
    protected String requesterID;
    @XmlElement(name = "RequestID")
    protected String requestID;
    @XmlElement(name = "CertifiedIntermediary")
    protected CertifiedIntermediaryStatus certifiedIntermediary;
    @XmlElement(name = "Discounts")
    protected AccountDiscounts discounts;
    @XmlElement(name = "AccountType", required = true)
    @XmlSchemaType(name = "string")
    protected AccountTypes accountType;
    @XmlElement(name = "ApprovedShipper")
    protected boolean approvedShipper;
    @XmlElement(name = "ConsolidatorServices")
    protected boolean consolidatorServices;
    @XmlElement(name = "ConsolidatorServiceDetail")
    protected ConsolidatorServiceDetailResponse consolidatorServiceDetail;
    @XmlElement(name = "ContractID")
    protected AccountContractIDs contractID;
    @XmlElement(name = "InsuranceAgreement")
    protected boolean insuranceAgreement;
    @XmlElement(name = "AccountStatus")
    protected AccountStatus accountStatus;
    @XmlElement(name = "ControlRegister", required = true)
    protected BigDecimal controlRegister;
    @XmlElement(name = "LicenseZip5")
    protected String licenseZip5;
    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "AccountFeatures")
    protected AccountFeatures accountFeatures;

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
     * Gets the value of the certifiedIntermediary property.
     * 
     * @return
     *     possible object is
     *     {@link CertifiedIntermediaryStatus }
     *     
     */
    public CertifiedIntermediaryStatus getCertifiedIntermediary() {
        return certifiedIntermediary;
    }

    /**
     * Sets the value of the certifiedIntermediary property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertifiedIntermediaryStatus }
     *     
     */
    public void setCertifiedIntermediary(CertifiedIntermediaryStatus value) {
        this.certifiedIntermediary = value;
    }

    /**
     * Gets the value of the discounts property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDiscounts }
     *     
     */
    public AccountDiscounts getDiscounts() {
        return discounts;
    }

    /**
     * Sets the value of the discounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDiscounts }
     *     
     */
    public void setDiscounts(AccountDiscounts value) {
        this.discounts = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountTypes }
     *     
     */
    public AccountTypes getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountTypes }
     *     
     */
    public void setAccountType(AccountTypes value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the approvedShipper property.
     * 
     */
    public boolean isApprovedShipper() {
        return approvedShipper;
    }

    /**
     * Sets the value of the approvedShipper property.
     * 
     */
    public void setApprovedShipper(boolean value) {
        this.approvedShipper = value;
    }

    /**
     * Gets the value of the consolidatorServices property.
     * 
     */
    public boolean isConsolidatorServices() {
        return consolidatorServices;
    }

    /**
     * Sets the value of the consolidatorServices property.
     * 
     */
    public void setConsolidatorServices(boolean value) {
        this.consolidatorServices = value;
    }

    /**
     * Gets the value of the consolidatorServiceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidatorServiceDetailResponse }
     *     
     */
    public ConsolidatorServiceDetailResponse getConsolidatorServiceDetail() {
        return consolidatorServiceDetail;
    }

    /**
     * Sets the value of the consolidatorServiceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidatorServiceDetailResponse }
     *     
     */
    public void setConsolidatorServiceDetail(ConsolidatorServiceDetailResponse value) {
        this.consolidatorServiceDetail = value;
    }

    /**
     * Gets the value of the contractID property.
     * 
     * @return
     *     possible object is
     *     {@link AccountContractIDs }
     *     
     */
    public AccountContractIDs getContractID() {
        return contractID;
    }

    /**
     * Sets the value of the contractID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountContractIDs }
     *     
     */
    public void setContractID(AccountContractIDs value) {
        this.contractID = value;
    }

    /**
     * Gets the value of the insuranceAgreement property.
     * 
     */
    public boolean isInsuranceAgreement() {
        return insuranceAgreement;
    }

    /**
     * Sets the value of the insuranceAgreement property.
     * 
     */
    public void setInsuranceAgreement(boolean value) {
        this.insuranceAgreement = value;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatus }
     *     
     */
    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatus }
     *     
     */
    public void setAccountStatus(AccountStatus value) {
        this.accountStatus = value;
    }

    /**
     * Gets the value of the controlRegister property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getControlRegister() {
        return controlRegister;
    }

    /**
     * Sets the value of the controlRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setControlRegister(BigDecimal value) {
        this.controlRegister = value;
    }

    /**
     * Gets the value of the licenseZip5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseZip5() {
        return licenseZip5;
    }

    /**
     * Sets the value of the licenseZip5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseZip5(String value) {
        this.licenseZip5 = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the accountFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link AccountFeatures }
     *     
     */
    public AccountFeatures getAccountFeatures() {
        return accountFeatures;
    }

    /**
     * Sets the value of the accountFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountFeatures }
     *     
     */
    public void setAccountFeatures(AccountFeatures value) {
        this.accountFeatures = value;
    }

}
