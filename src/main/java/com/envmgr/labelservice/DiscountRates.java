
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DiscountRates complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DiscountRates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Discount" use="required" type="{www.envmgr.com/LabelService}MailDiscount" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountRates")
public class DiscountRates {

    @XmlAttribute(name = "Discount", required = true)
    protected MailDiscount discount;

    /**
     * Obtiene el valor de la propiedad discount.
     * 
     * @return
     *     possible object is
     *     {@link MailDiscount }
     *     
     */
    public MailDiscount getDiscount() {
        return discount;
    }

    /**
     * Define el valor de la propiedad discount.
     * 
     * @param value
     *     allowed object is
     *     {@link MailDiscount }
     *     
     */
    public void setDiscount(MailDiscount value) {
        this.discount = value;
    }

}
