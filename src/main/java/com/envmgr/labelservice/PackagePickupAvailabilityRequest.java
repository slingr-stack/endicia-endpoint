
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackagePickupAvailabilityRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagePickupAvailabilityRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{www.envmgr.com/LabelService}DataValidator"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UseAddressOnFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalPickupAddress" type="{www.envmgr.com/LabelService}PhysicalPickupAddress" minOccurs="0"/&gt;
 *         &lt;element name="RequesterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertifiedIntermediary" type="{www.envmgr.com/LabelService}CertifiedIntermediary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagePickupAvailabilityRequest", propOrder = {
    "requestID",
    "useAddressOnFile",
    "physicalPickupAddress",
    "requesterID",
    "certifiedIntermediary"
})
public class PackagePickupAvailabilityRequest
    extends DataValidator
{

    @XmlElement(name = "RequestID")
    protected String requestID;
    @XmlElement(name = "UseAddressOnFile")
    protected String useAddressOnFile;
    @XmlElement(name = "PhysicalPickupAddress")
    protected PhysicalPickupAddress physicalPickupAddress;
    @XmlElement(name = "RequesterID")
    protected String requesterID;
    @XmlElement(name = "CertifiedIntermediary")
    protected CertifiedIntermediary certifiedIntermediary;

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
     * Gets the value of the useAddressOnFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseAddressOnFile() {
        return useAddressOnFile;
    }

    /**
     * Sets the value of the useAddressOnFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseAddressOnFile(String value) {
        this.useAddressOnFile = value;
    }

    /**
     * Gets the value of the physicalPickupAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalPickupAddress }
     *     
     */
    public PhysicalPickupAddress getPhysicalPickupAddress() {
        return physicalPickupAddress;
    }

    /**
     * Sets the value of the physicalPickupAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalPickupAddress }
     *     
     */
    public void setPhysicalPickupAddress(PhysicalPickupAddress value) {
        this.physicalPickupAddress = value;
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
     * Gets the value of the certifiedIntermediary property.
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
     * Sets the value of the certifiedIntermediary property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertifiedIntermediary }
     *     
     */
    public void setCertifiedIntermediary(CertifiedIntermediary value) {
        this.certifiedIntermediary = value;
    }

}
