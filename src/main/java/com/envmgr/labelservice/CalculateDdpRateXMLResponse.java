
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
 *         &lt;element name="DdpRateResponse" type="{www.envmgr.com/LabelService}DdpRateResponse" minOccurs="0"/&gt;
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
    "ddpRateResponse"
})
@XmlRootElement(name = "CalculateDdpRateXMLResponse")
public class CalculateDdpRateXMLResponse {

    @XmlElement(name = "DdpRateResponse")
    protected DdpRateResponse ddpRateResponse;

    /**
     * Obtiene el valor de la propiedad ddpRateResponse.
     * 
     * @return
     *     possible object is
     *     {@link DdpRateResponse }
     *     
     */
    public DdpRateResponse getDdpRateResponse() {
        return ddpRateResponse;
    }

    /**
     * Define el valor de la propiedad ddpRateResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link DdpRateResponse }
     *     
     */
    public void setDdpRateResponse(DdpRateResponse value) {
        this.ddpRateResponse = value;
    }

}
