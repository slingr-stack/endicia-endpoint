
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ValidateAddressInfoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad address.
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
     * Define el valor de la propiedad address.
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
     * Obtiene el valor de la propiedad addressMatch.
     * 
     */
    public boolean isAddressMatch() {
        return addressMatch;
    }

    /**
     * Define el valor de la propiedad addressMatch.
     * 
     */
    public void setAddressMatch(boolean value) {
        this.addressMatch = value;
    }

    /**
     * Obtiene el valor de la propiedad cityStateZipOK.
     * 
     */
    public boolean isCityStateZipOK() {
        return cityStateZipOK;
    }

    /**
     * Define el valor de la propiedad cityStateZipOK.
     * 
     */
    public void setCityStateZipOK(boolean value) {
        this.cityStateZipOK = value;
    }

    /**
     * Obtiene el valor de la propiedad residentialDeliveryIndicator.
     * 
     */
    public boolean isResidentialDeliveryIndicator() {
        return residentialDeliveryIndicator;
    }

    /**
     * Define el valor de la propiedad residentialDeliveryIndicator.
     * 
     */
    public void setResidentialDeliveryIndicator(boolean value) {
        this.residentialDeliveryIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad isPOBox.
     * 
     */
    public boolean isIsPOBox() {
        return isPOBox;
    }

    /**
     * Define el valor de la propiedad isPOBox.
     * 
     */
    public void setIsPOBox(boolean value) {
        this.isPOBox = value;
    }

    /**
     * Obtiene el valor de la propiedad candidateAddresses.
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
     * Define el valor de la propiedad candidateAddresses.
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
     * Obtiene el valor de la propiedad statusCodes.
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
     * Define el valor de la propiedad statusCodes.
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
     * Obtiene el valor de la propiedad addressCleansingResult.
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
     * Define el valor de la propiedad addressCleansingResult.
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
     * Obtiene el valor de la propiedad verificationLevel.
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
     * Define el valor de la propiedad verificationLevel.
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
     * Obtiene el valor de la propiedad addressCleansedHash.
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
     * Define el valor de la propiedad addressCleansedHash.
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
