
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusEventList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusEventList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EventDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrackingSummary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrackingResults" type="{www.envmgr.com/LabelService}ArrayOfTrackingResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusEventList", propOrder = {
    "statusCode",
    "statusDescription",
    "eventDateTime",
    "trackingSummary",
    "trackingResults"
})
public class StatusEventList {

    @XmlElement(name = "StatusCode")
    protected String statusCode;
    @XmlElement(name = "StatusDescription")
    protected String statusDescription;
    @XmlElement(name = "EventDateTime")
    protected String eventDateTime;
    @XmlElement(name = "TrackingSummary")
    protected String trackingSummary;
    @XmlElement(name = "TrackingResults")
    protected ArrayOfTrackingResult trackingResults;

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * Sets the value of the statusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescription(String value) {
        this.statusDescription = value;
    }

    /**
     * Gets the value of the eventDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventDateTime() {
        return eventDateTime;
    }

    /**
     * Sets the value of the eventDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventDateTime(String value) {
        this.eventDateTime = value;
    }

    /**
     * Gets the value of the trackingSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingSummary() {
        return trackingSummary;
    }

    /**
     * Sets the value of the trackingSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingSummary(String value) {
        this.trackingSummary = value;
    }

    /**
     * Gets the value of the trackingResults property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTrackingResult }
     *     
     */
    public ArrayOfTrackingResult getTrackingResults() {
        return trackingResults;
    }

    /**
     * Sets the value of the trackingResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTrackingResult }
     *     
     */
    public void setTrackingResults(ArrayOfTrackingResult value) {
        this.trackingResults = value;
    }

}
