
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UpdatePaymentInfoRequestXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "updatePaymentInfoRequestXML"
})
@XmlRootElement(name = "UpdatePaymentInformationXML")
public class UpdatePaymentInformationXML {

    @XmlElement(name = "UpdatePaymentInfoRequestXML")
    protected String updatePaymentInfoRequestXML;

    /**
     * Obtiene el valor de la propiedad updatePaymentInfoRequestXML.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatePaymentInfoRequestXML() {
        return updatePaymentInfoRequestXML;
    }

    /**
     * Define el valor de la propiedad updatePaymentInfoRequestXML.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatePaymentInfoRequestXML(String value) {
        this.updatePaymentInfoRequestXML = value;
    }

}
