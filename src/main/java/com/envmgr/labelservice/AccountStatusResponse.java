
package com.envmgr.labelservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AccountStatusResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
 *         &lt;element name="PayOnUse" type="{www.envmgr.com/LabelService}PayOnUse" minOccurs="0"/&gt;
 *         &lt;element name="ConfiguredCarriers" type="{www.envmgr.com/LabelService}ConfiguredCarriers" minOccurs="0"/&gt;
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
    "accountFeatures",
    "payOnUse",
    "configuredCarriers"
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
    @XmlElement(name = "PayOnUse")
    protected PayOnUse payOnUse;
    @XmlElement(name = "ConfiguredCarriers")
    protected ConfiguredCarriers configuredCarriers;

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
     * Obtiene el valor de la propiedad certifiedIntermediary.
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
     * Define el valor de la propiedad certifiedIntermediary.
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
     * Obtiene el valor de la propiedad discounts.
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
     * Define el valor de la propiedad discounts.
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
     * Obtiene el valor de la propiedad accountType.
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
     * Define el valor de la propiedad accountType.
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
     * Obtiene el valor de la propiedad approvedShipper.
     * 
     */
    public boolean isApprovedShipper() {
        return approvedShipper;
    }

    /**
     * Define el valor de la propiedad approvedShipper.
     * 
     */
    public void setApprovedShipper(boolean value) {
        this.approvedShipper = value;
    }

    /**
     * Obtiene el valor de la propiedad consolidatorServices.
     * 
     */
    public boolean isConsolidatorServices() {
        return consolidatorServices;
    }

    /**
     * Define el valor de la propiedad consolidatorServices.
     * 
     */
    public void setConsolidatorServices(boolean value) {
        this.consolidatorServices = value;
    }

    /**
     * Obtiene el valor de la propiedad consolidatorServiceDetail.
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
     * Define el valor de la propiedad consolidatorServiceDetail.
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
     * Obtiene el valor de la propiedad contractID.
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
     * Define el valor de la propiedad contractID.
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
     * Obtiene el valor de la propiedad insuranceAgreement.
     * 
     */
    public boolean isInsuranceAgreement() {
        return insuranceAgreement;
    }

    /**
     * Define el valor de la propiedad insuranceAgreement.
     * 
     */
    public void setInsuranceAgreement(boolean value) {
        this.insuranceAgreement = value;
    }

    /**
     * Obtiene el valor de la propiedad accountStatus.
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
     * Define el valor de la propiedad accountStatus.
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
     * Obtiene el valor de la propiedad controlRegister.
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
     * Define el valor de la propiedad controlRegister.
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
     * Obtiene el valor de la propiedad licenseZip5.
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
     * Define el valor de la propiedad licenseZip5.
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
     * Obtiene el valor de la propiedad address.
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
     * Define el valor de la propiedad address.
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
     * Obtiene el valor de la propiedad accountFeatures.
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
     * Define el valor de la propiedad accountFeatures.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountFeatures }
     *     
     */
    public void setAccountFeatures(AccountFeatures value) {
        this.accountFeatures = value;
    }

    /**
     * Obtiene el valor de la propiedad payOnUse.
     * 
     * @return
     *     possible object is
     *     {@link PayOnUse }
     *     
     */
    public PayOnUse getPayOnUse() {
        return payOnUse;
    }

    /**
     * Define el valor de la propiedad payOnUse.
     * 
     * @param value
     *     allowed object is
     *     {@link PayOnUse }
     *     
     */
    public void setPayOnUse(PayOnUse value) {
        this.payOnUse = value;
    }

    /**
     * Obtiene el valor de la propiedad configuredCarriers.
     * 
     * @return
     *     possible object is
     *     {@link ConfiguredCarriers }
     *     
     */
    public ConfiguredCarriers getConfiguredCarriers() {
        return configuredCarriers;
    }

    /**
     * Define el valor de la propiedad configuredCarriers.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfiguredCarriers }
     *     
     */
    public void setConfiguredCarriers(ConfiguredCarriers value) {
        this.configuredCarriers = value;
    }

}
