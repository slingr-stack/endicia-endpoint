
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para StatusEventList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad statusCode.
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
     * Define el valor de la propiedad statusCode.
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
     * Obtiene el valor de la propiedad statusDescription.
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
     * Define el valor de la propiedad statusDescription.
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
     * Obtiene el valor de la propiedad eventDateTime.
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
     * Define el valor de la propiedad eventDateTime.
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
     * Obtiene el valor de la propiedad trackingSummary.
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
     * Define el valor de la propiedad trackingSummary.
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
     * Obtiene el valor de la propiedad trackingResults.
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
     * Define el valor de la propiedad trackingResults.
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
