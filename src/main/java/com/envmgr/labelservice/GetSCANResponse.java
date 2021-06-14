
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
 *         &lt;element name="GetSCANResponse" type="{www.envmgr.com/LabelService}SCANResponse" minOccurs="0"/&gt;
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
    "getSCANResponse"
})
@XmlRootElement(name = "GetSCANResponse")
public class GetSCANResponse {

    @XmlElement(name = "GetSCANResponse")
    protected SCANResponse getSCANResponse;

    /**
     * Obtiene el valor de la propiedad getSCANResponse.
     * 
     * @return
     *     possible object is
     *     {@link SCANResponse }
     *     
     */
    public SCANResponse getGetSCANResponse() {
        return getSCANResponse;
    }

    /**
     * Define el valor de la propiedad getSCANResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link SCANResponse }
     *     
     */
    public void setGetSCANResponse(SCANResponse value) {
        this.getSCANResponse = value;
    }

}
