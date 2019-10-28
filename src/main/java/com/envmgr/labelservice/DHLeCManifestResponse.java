
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DHLeCManifestResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DHLeCManifestResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DHLeCDomesticManifestID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DriversSummaryManifest" type="{www.envmgr.com/LabelService}ArrayOfString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DHLeCManifestResponse", propOrder = {
    "status",
    "errorMessage",
    "dhLeCDomesticManifestID",
    "driversSummaryManifest"
})
public class DHLeCManifestResponse {

    @XmlElement(name = "Status")
    protected int status;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "DHLeCDomesticManifestID")
    protected int dhLeCDomesticManifestID;
    @XmlElement(name = "DriversSummaryManifest")
    protected ArrayOfString driversSummaryManifest;

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
     * Gets the value of the dhLeCDomesticManifestID property.
     * 
     */
    public int getDHLeCDomesticManifestID() {
        return dhLeCDomesticManifestID;
    }

    /**
     * Sets the value of the dhLeCDomesticManifestID property.
     * 
     */
    public void setDHLeCDomesticManifestID(int value) {
        this.dhLeCDomesticManifestID = value;
    }

    /**
     * Gets the value of the driversSummaryManifest property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getDriversSummaryManifest() {
        return driversSummaryManifest;
    }

    /**
     * Sets the value of the driversSummaryManifest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setDriversSummaryManifest(ArrayOfString value) {
        this.driversSummaryManifest = value;
    }

}
