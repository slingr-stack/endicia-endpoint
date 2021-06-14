
package com.envmgr.labelservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Surcharge complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Surcharge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElevatedRisk" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ExporterValidation" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Fuel" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="OverSized" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="OverWeight" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RemoteAreaDelivery" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RestrictedDestination" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="AdditionalHandling" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="NorthernCanada" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DeliveryArea" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DeliveryAreaExtended" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RemoteAreaExtended" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Surcharge", propOrder = {
    "elevatedRisk",
    "exporterValidation",
    "fuel",
    "overSized",
    "overWeight",
    "remoteAreaDelivery",
    "restrictedDestination",
    "additionalHandling",
    "northernCanada",
    "deliveryArea",
    "deliveryAreaExtended",
    "remoteAreaExtended"
})
public class Surcharge {

    @XmlElement(name = "ElevatedRisk", required = true)
    protected BigDecimal elevatedRisk;
    @XmlElement(name = "ExporterValidation", required = true)
    protected BigDecimal exporterValidation;
    @XmlElement(name = "Fuel", required = true)
    protected BigDecimal fuel;
    @XmlElement(name = "OverSized", required = true)
    protected BigDecimal overSized;
    @XmlElement(name = "OverWeight", required = true)
    protected BigDecimal overWeight;
    @XmlElement(name = "RemoteAreaDelivery", required = true)
    protected BigDecimal remoteAreaDelivery;
    @XmlElement(name = "RestrictedDestination", required = true)
    protected BigDecimal restrictedDestination;
    @XmlElement(name = "AdditionalHandling", required = true)
    protected BigDecimal additionalHandling;
    @XmlElement(name = "NorthernCanada", required = true)
    protected BigDecimal northernCanada;
    @XmlElement(name = "DeliveryArea", required = true)
    protected BigDecimal deliveryArea;
    @XmlElement(name = "DeliveryAreaExtended", required = true)
    protected BigDecimal deliveryAreaExtended;
    @XmlElement(name = "RemoteAreaExtended", required = true)
    protected BigDecimal remoteAreaExtended;

    /**
     * Obtiene el valor de la propiedad elevatedRisk.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getElevatedRisk() {
        return elevatedRisk;
    }

    /**
     * Define el valor de la propiedad elevatedRisk.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setElevatedRisk(BigDecimal value) {
        this.elevatedRisk = value;
    }

    /**
     * Obtiene el valor de la propiedad exporterValidation.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExporterValidation() {
        return exporterValidation;
    }

    /**
     * Define el valor de la propiedad exporterValidation.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExporterValidation(BigDecimal value) {
        this.exporterValidation = value;
    }

    /**
     * Obtiene el valor de la propiedad fuel.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFuel() {
        return fuel;
    }

    /**
     * Define el valor de la propiedad fuel.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFuel(BigDecimal value) {
        this.fuel = value;
    }

    /**
     * Obtiene el valor de la propiedad overSized.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverSized() {
        return overSized;
    }

    /**
     * Define el valor de la propiedad overSized.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverSized(BigDecimal value) {
        this.overSized = value;
    }

    /**
     * Obtiene el valor de la propiedad overWeight.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverWeight() {
        return overWeight;
    }

    /**
     * Define el valor de la propiedad overWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverWeight(BigDecimal value) {
        this.overWeight = value;
    }

    /**
     * Obtiene el valor de la propiedad remoteAreaDelivery.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemoteAreaDelivery() {
        return remoteAreaDelivery;
    }

    /**
     * Define el valor de la propiedad remoteAreaDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemoteAreaDelivery(BigDecimal value) {
        this.remoteAreaDelivery = value;
    }

    /**
     * Obtiene el valor de la propiedad restrictedDestination.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRestrictedDestination() {
        return restrictedDestination;
    }

    /**
     * Define el valor de la propiedad restrictedDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRestrictedDestination(BigDecimal value) {
        this.restrictedDestination = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalHandling.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdditionalHandling() {
        return additionalHandling;
    }

    /**
     * Define el valor de la propiedad additionalHandling.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdditionalHandling(BigDecimal value) {
        this.additionalHandling = value;
    }

    /**
     * Obtiene el valor de la propiedad northernCanada.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNorthernCanada() {
        return northernCanada;
    }

    /**
     * Define el valor de la propiedad northernCanada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNorthernCanada(BigDecimal value) {
        this.northernCanada = value;
    }

    /**
     * Obtiene el valor de la propiedad deliveryArea.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeliveryArea() {
        return deliveryArea;
    }

    /**
     * Define el valor de la propiedad deliveryArea.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeliveryArea(BigDecimal value) {
        this.deliveryArea = value;
    }

    /**
     * Obtiene el valor de la propiedad deliveryAreaExtended.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeliveryAreaExtended() {
        return deliveryAreaExtended;
    }

    /**
     * Define el valor de la propiedad deliveryAreaExtended.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeliveryAreaExtended(BigDecimal value) {
        this.deliveryAreaExtended = value;
    }

    /**
     * Obtiene el valor de la propiedad remoteAreaExtended.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemoteAreaExtended() {
        return remoteAreaExtended;
    }

    /**
     * Define el valor de la propiedad remoteAreaExtended.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemoteAreaExtended(BigDecimal value) {
        this.remoteAreaExtended = value;
    }

}
