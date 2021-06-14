
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
 *         &lt;element name="DdpRateRequest" type="{www.envmgr.com/LabelService}DdpRateRequest" minOccurs="0"/&gt;
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
    "ddpRateRequest"
})
@XmlRootElement(name = "CalculateDdpRate")
public class CalculateDdpRate {

    @XmlElement(name = "DdpRateRequest")
    protected DdpRateRequest ddpRateRequest;

    /**
     * Obtiene el valor de la propiedad ddpRateRequest.
     * 
     * @return
     *     possible object is
     *     {@link DdpRateRequest }
     *     
     */
    public DdpRateRequest getDdpRateRequest() {
        return ddpRateRequest;
    }

    /**
     * Define el valor de la propiedad ddpRateRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link DdpRateRequest }
     *     
     */
    public void setDdpRateRequest(DdpRateRequest value) {
        this.ddpRateRequest = value;
    }

}
