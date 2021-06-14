
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
 *         &lt;element name="RecreditRequestResponse" type="{www.envmgr.com/LabelService}RecreditRequestResponse" minOccurs="0"/&gt;
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
    "recreditRequestResponse"
})
@XmlRootElement(name = "BuyPostageResponse")
public class BuyPostageResponse {

    @XmlElement(name = "RecreditRequestResponse")
    protected RecreditRequestResponse recreditRequestResponse;

    /**
     * Obtiene el valor de la propiedad recreditRequestResponse.
     * 
     * @return
     *     possible object is
     *     {@link RecreditRequestResponse }
     *     
     */
    public RecreditRequestResponse getRecreditRequestResponse() {
        return recreditRequestResponse;
    }

    /**
     * Define el valor de la propiedad recreditRequestResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link RecreditRequestResponse }
     *     
     */
    public void setRecreditRequestResponse(RecreditRequestResponse value) {
        this.recreditRequestResponse = value;
    }

}
