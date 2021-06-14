
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PackagePickup complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PackagePickup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DayOfWeek" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarrierRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PickupTimeEarliest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PickupTimeLatest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagePickup", propOrder = {
    "dayOfWeek",
    "date",
    "carrierRoute",
    "pickupTimeEarliest",
    "pickupTimeLatest"
})
public class PackagePickup {

    @XmlElement(name = "DayOfWeek")
    protected String dayOfWeek;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "CarrierRoute")
    protected String carrierRoute;
    @XmlElement(name = "PickupTimeEarliest")
    protected String pickupTimeEarliest;
    @XmlElement(name = "PickupTimeLatest")
    protected String pickupTimeLatest;

    /**
     * Obtiene el valor de la propiedad dayOfWeek.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Define el valor de la propiedad dayOfWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayOfWeek(String value) {
        this.dayOfWeek = value;
    }

    /**
     * Obtiene el valor de la propiedad date.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Define el valor de la propiedad date.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Obtiene el valor de la propiedad carrierRoute.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierRoute() {
        return carrierRoute;
    }

    /**
     * Define el valor de la propiedad carrierRoute.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierRoute(String value) {
        this.carrierRoute = value;
    }

    /**
     * Obtiene el valor de la propiedad pickupTimeEarliest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupTimeEarliest() {
        return pickupTimeEarliest;
    }

    /**
     * Define el valor de la propiedad pickupTimeEarliest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupTimeEarliest(String value) {
        this.pickupTimeEarliest = value;
    }

    /**
     * Obtiene el valor de la propiedad pickupTimeLatest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupTimeLatest() {
        return pickupTimeLatest;
    }

    /**
     * Define el valor de la propiedad pickupTimeLatest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupTimeLatest(String value) {
        this.pickupTimeLatest = value;
    }

}
