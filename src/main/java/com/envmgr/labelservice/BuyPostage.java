
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
 *         &lt;element name="RecreditRequest" type="{www.envmgr.com/LabelService}RecreditRequest" minOccurs="0"/&gt;
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
    "recreditRequest"
})
@XmlRootElement(name = "BuyPostage")
public class BuyPostage {

    @XmlElement(name = "RecreditRequest")
    protected RecreditRequest recreditRequest;

    /**
     * Obtiene el valor de la propiedad recreditRequest.
     * 
     * @return
     *     possible object is
     *     {@link RecreditRequest }
     *     
     */
    public RecreditRequest getRecreditRequest() {
        return recreditRequest;
    }

    /**
     * Define el valor de la propiedad recreditRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link RecreditRequest }
     *     
     */
    public void setRecreditRequest(RecreditRequest value) {
        this.recreditRequest = value;
    }

}
