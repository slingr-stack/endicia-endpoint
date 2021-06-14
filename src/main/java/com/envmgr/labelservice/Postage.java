
package com.envmgr.labelservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Postage complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Postage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MailService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntraBMC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pricing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DimWeighting" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TotalAmount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Postage", propOrder = {
    "mailService",
    "zone",
    "intraBMC",
    "pricing",
    "dimWeighting"
})
public class Postage {

    @XmlElement(name = "MailService")
    protected String mailService;
    @XmlElement(name = "Zone")
    protected String zone;
    @XmlElement(name = "IntraBMC")
    protected String intraBMC;
    @XmlElement(name = "Pricing")
    protected String pricing;
    @XmlElement(name = "DimWeighting")
    protected boolean dimWeighting;
    @XmlAttribute(name = "TotalAmount", required = true)
    protected BigDecimal totalAmount;

    /**
     * Obtiene el valor de la propiedad mailService.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailService() {
        return mailService;
    }

    /**
     * Define el valor de la propiedad mailService.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailService(String value) {
        this.mailService = value;
    }

    /**
     * Obtiene el valor de la propiedad zone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZone() {
        return zone;
    }

    /**
     * Define el valor de la propiedad zone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZone(String value) {
        this.zone = value;
    }

    /**
     * Obtiene el valor de la propiedad intraBMC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntraBMC() {
        return intraBMC;
    }

    /**
     * Define el valor de la propiedad intraBMC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntraBMC(String value) {
        this.intraBMC = value;
    }

    /**
     * Obtiene el valor de la propiedad pricing.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricing() {
        return pricing;
    }

    /**
     * Define el valor de la propiedad pricing.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricing(String value) {
        this.pricing = value;
    }

    /**
     * Obtiene el valor de la propiedad dimWeighting.
     * 
     */
    public boolean isDimWeighting() {
        return dimWeighting;
    }

    /**
     * Define el valor de la propiedad dimWeighting.
     * 
     */
    public void setDimWeighting(boolean value) {
        this.dimWeighting = value;
    }

    /**
     * Obtiene el valor de la propiedad totalAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Define el valor de la propiedad totalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
    }

}
