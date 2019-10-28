
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateAddressInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateAddressInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequesterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{www.envmgr.com/LabelService}ValidateAddressInfo" minOccurs="0"/&gt;
 *         &lt;element name="AddressMatch" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CityStateZipOK" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ResidentialDeliveryIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsPOBox" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CandidateAddresses" type="{www.envmgr.com/LabelService}ArrayOfValidateAddressInfo" minOccurs="0"/&gt;
 *         &lt;element name="StatusCodes" type="{www.envmgr.com/LabelService}StatusCodes" minOccurs="0"/&gt;
 *         &lt;element name="AddressCleansingResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VerificationLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressCleansedHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateAddressInfoResponse", propOrder = {
    "status",
    "errorMessage",
    "requesterID",
    "address",
    "addressMatch",
    "cityStateZipOK",
    "residentialDeliveryIndicator",
    "isPOBox",
    "candidateAddresses",
    "statusCodes",
    "addressCleansingResult",
    "verificationLevel",
    "addressCleansedHash"
})
public class ValidateAddressInfoResponse {

    @XmlElement(name = "Status")
    protected int status;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "RequesterID")
    protected String requesterID;
    @XmlElement(name = "Address")
    protected ValidateAddressInfo address;
    @XmlElement(name = "AddressMatch")
    protected boolean addressMatch;
    @XmlElement(name = "CityStateZipOK")
    protected boolean cityStateZipOK;
    @XmlElement(name = "ResidentialDeliveryIndicator")
    protected boolean residentialDeliveryIndicator;
    @XmlElement(name = "IsPOBox")
    protected boolean isPOBox;
    @XmlElement(name = "CandidateAddresses")
    protected ArrayOfValidateAddressInfo candidateAddresses;
    @XmlElement(name = "StatusCodes")
    protected StatusCodes statusCodes;
    @XmlElement(name = "AddressCleansingResult")
    protected String addressCleansingResult;
    @XmlElement(name = "VerificationLevel")
    protected String verificationLevel;
    @XmlElement(name = "AddressCleansedHash")
    protected String addressCleansedHash;

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
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateAddressInfo }
     *     
     */
    public ValidateAddressInfo getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateAddressInfo }
     *     
     */
    public void setAddress(ValidateAddressInfo value) {
        this.address = value;
    }

    /**
     * Gets the value of the addressMatch property.
     * 
     */
    public boolean isAddressMatch() {
        return addressMatch;
    }

    /**
     * Sets the value of the addressMatch property.
     * 
     */
    public void setAddressMatch(boolean value) {
        this.addressMatch = value;
    }

    /**
     * Gets the value of the cityStateZipOK property.
     * 
     */
    public boolean isCityStateZipOK() {
        return cityStateZipOK;
    }

    /**
     * Sets the value of the cityStateZipOK property.
     * 
     */
    public void setCityStateZipOK(boolean value) {
        this.cityStateZipOK = value;
    }

    /**
     * Gets the value of the residentialDeliveryIndicator property.
     * 
     */
    public boolean isResidentialDeliveryIndicator() {
        return residentialDeliveryIndicator;
    }

    /**
     * Sets the value of the residentialDeliveryIndicator property.
     * 
     */
    public void setResidentialDeliveryIndicator(boolean value) {
        this.residentialDeliveryIndicator = value;
    }

    /**
     * Gets the value of the isPOBox property.
     * 
     */
    public boolean isIsPOBox() {
        return isPOBox;
    }

    /**
     * Sets the value of the isPOBox property.
     * 
     */
    public void setIsPOBox(boolean value) {
        this.isPOBox = value;
    }

    /**
     * Gets the value of the candidateAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfValidateAddressInfo }
     *     
     */
    public ArrayOfValidateAddressInfo getCandidateAddresses() {
        return candidateAddresses;
    }

    /**
     * Sets the value of the candidateAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfValidateAddressInfo }
     *     
     */
    public void setCandidateAddresses(ArrayOfValidateAddressInfo value) {
        this.candidateAddresses = value;
    }

    /**
     * Gets the value of the statusCodes property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCodes }
     *     
     */
    public StatusCodes getStatusCodes() {
        return statusCodes;
    }

    /**
     * Sets the value of the statusCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCodes }
     *     
     */
    public void setStatusCodes(StatusCodes value) {
        this.statusCodes = value;
    }

    /**
     * Gets the value of the addressCleansingResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCleansingResult() {
        return addressCleansingResult;
    }

    /**
     * Sets the value of the addressCleansingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCleansingResult(String value) {
        this.addressCleansingResult = value;
    }

    /**
     * Gets the value of the verificationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationLevel() {
        return verificationLevel;
    }

    /**
     * Sets the value of the verificationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationLevel(String value) {
        this.verificationLevel = value;
    }

    /**
     * Gets the value of the addressCleansedHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCleansedHash() {
        return addressCleansedHash;
    }

    /**
     * Sets the value of the addressCleansedHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCleansedHash(String value) {
        this.addressCleansedHash = value;
    }

}
