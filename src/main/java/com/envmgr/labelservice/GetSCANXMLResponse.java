
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
 *         &lt;element name="SCANResponse" type="{www.envmgr.com/LabelService}SCANResponse" minOccurs="0"/&gt;
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
    "scanResponse"
})
@XmlRootElement(name = "GetSCANXMLResponse")
public class GetSCANXMLResponse {

    @XmlElement(name = "SCANResponse")
    protected SCANResponse scanResponse;

    /**
     * Obtiene el valor de la propiedad scanResponse.
     * 
     * @return
     *     possible object is
     *     {@link SCANResponse }
     *     
     */
    public SCANResponse getSCANResponse() {
        return scanResponse;
    }

    /**
     * Define el valor de la propiedad scanResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link SCANResponse }
     *     
     */
    public void setSCANResponse(SCANResponse value) {
        this.scanResponse = value;
    }

}
