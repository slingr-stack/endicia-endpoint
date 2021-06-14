
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AccountDiscounts complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccountDiscounts"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PriorityMail" type="{www.envmgr.com/LabelService}Discounts" minOccurs="0"/&gt;
 *         &lt;element name="PMExpress" type="{www.envmgr.com/LabelService}Discounts" minOccurs="0"/&gt;
 *         &lt;element name="FCPS" type="{www.envmgr.com/LabelService}Discounts" minOccurs="0"/&gt;
 *         &lt;element name="PMI" type="{www.envmgr.com/LabelService}DiscountRates" minOccurs="0"/&gt;
 *         &lt;element name="EMI" type="{www.envmgr.com/LabelService}DiscountRates" minOccurs="0"/&gt;
 *         &lt;element name="FCPIS" type="{www.envmgr.com/LabelService}DiscountRates" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountDiscounts", propOrder = {
    "priorityMail",
    "pmExpress",
    "fcps",
    "pmi",
    "emi",
    "fcpis"
})
public class AccountDiscounts {

    @XmlElement(name = "PriorityMail")
    protected Discounts priorityMail;
    @XmlElement(name = "PMExpress")
    protected Discounts pmExpress;
    @XmlElement(name = "FCPS")
    protected Discounts fcps;
    @XmlElement(name = "PMI")
    protected DiscountRates pmi;
    @XmlElement(name = "EMI")
    protected DiscountRates emi;
    @XmlElement(name = "FCPIS")
    protected DiscountRates fcpis;

    /**
     * Obtiene el valor de la propiedad priorityMail.
     * 
     * @return
     *     possible object is
     *     {@link Discounts }
     *     
     */
    public Discounts getPriorityMail() {
        return priorityMail;
    }

    /**
     * Define el valor de la propiedad priorityMail.
     * 
     * @param value
     *     allowed object is
     *     {@link Discounts }
     *     
     */
    public void setPriorityMail(Discounts value) {
        this.priorityMail = value;
    }

    /**
     * Obtiene el valor de la propiedad pmExpress.
     * 
     * @return
     *     possible object is
     *     {@link Discounts }
     *     
     */
    public Discounts getPMExpress() {
        return pmExpress;
    }

    /**
     * Define el valor de la propiedad pmExpress.
     * 
     * @param value
     *     allowed object is
     *     {@link Discounts }
     *     
     */
    public void setPMExpress(Discounts value) {
        this.pmExpress = value;
    }

    /**
     * Obtiene el valor de la propiedad fcps.
     * 
     * @return
     *     possible object is
     *     {@link Discounts }
     *     
     */
    public Discounts getFCPS() {
        return fcps;
    }

    /**
     * Define el valor de la propiedad fcps.
     * 
     * @param value
     *     allowed object is
     *     {@link Discounts }
     *     
     */
    public void setFCPS(Discounts value) {
        this.fcps = value;
    }

    /**
     * Obtiene el valor de la propiedad pmi.
     * 
     * @return
     *     possible object is
     *     {@link DiscountRates }
     *     
     */
    public DiscountRates getPMI() {
        return pmi;
    }

    /**
     * Define el valor de la propiedad pmi.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountRates }
     *     
     */
    public void setPMI(DiscountRates value) {
        this.pmi = value;
    }

    /**
     * Obtiene el valor de la propiedad emi.
     * 
     * @return
     *     possible object is
     *     {@link DiscountRates }
     *     
     */
    public DiscountRates getEMI() {
        return emi;
    }

    /**
     * Define el valor de la propiedad emi.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountRates }
     *     
     */
    public void setEMI(DiscountRates value) {
        this.emi = value;
    }

    /**
     * Obtiene el valor de la propiedad fcpis.
     * 
     * @return
     *     possible object is
     *     {@link DiscountRates }
     *     
     */
    public DiscountRates getFCPIS() {
        return fcpis;
    }

    /**
     * Define el valor de la propiedad fcpis.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountRates }
     *     
     */
    public void setFCPIS(DiscountRates value) {
        this.fcpis = value;
    }

}
