
package com.envmgr.labelservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PayOnUse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PayOnUse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OutstandingLabelBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="MaxOutstandingLabelBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="POURMailerID" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayOnUse", propOrder = {
    "outstandingLabelBalance",
    "maxOutstandingLabelBalance",
    "pourMailerID"
})
public class PayOnUse {

    @XmlElement(name = "OutstandingLabelBalance", required = true)
    protected BigDecimal outstandingLabelBalance;
    @XmlElement(name = "MaxOutstandingLabelBalance", required = true)
    protected BigDecimal maxOutstandingLabelBalance;
    @XmlElement(name = "POURMailerID")
    protected boolean pourMailerID;

    /**
     * Obtiene el valor de la propiedad outstandingLabelBalance.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutstandingLabelBalance() {
        return outstandingLabelBalance;
    }

    /**
     * Define el valor de la propiedad outstandingLabelBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutstandingLabelBalance(BigDecimal value) {
        this.outstandingLabelBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad maxOutstandingLabelBalance.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxOutstandingLabelBalance() {
        return maxOutstandingLabelBalance;
    }

    /**
     * Define el valor de la propiedad maxOutstandingLabelBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxOutstandingLabelBalance(BigDecimal value) {
        this.maxOutstandingLabelBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad pourMailerID.
     * 
     */
    public boolean isPOURMailerID() {
        return pourMailerID;
    }

    /**
     * Define el valor de la propiedad pourMailerID.
     * 
     */
    public void setPOURMailerID(boolean value) {
        this.pourMailerID = value;
    }

}
