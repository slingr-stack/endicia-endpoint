
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActualService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ActualService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="DeliveryConfirmation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="InsuredMail" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActualService")
public class ActualService {

    @XmlAttribute(name = "DeliveryConfirmation")
    protected String deliveryConfirmation;
    @XmlAttribute(name = "InsuredMail")
    protected String insuredMail;

    /**
     * Obtiene el valor de la propiedad deliveryConfirmation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryConfirmation() {
        return deliveryConfirmation;
    }

    /**
     * Define el valor de la propiedad deliveryConfirmation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryConfirmation(String value) {
        this.deliveryConfirmation = value;
    }

    /**
     * Obtiene el valor de la propiedad insuredMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredMail() {
        return insuredMail;
    }

    /**
     * Define el valor de la propiedad insuredMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredMail(String value) {
        this.insuredMail = value;
    }

}
