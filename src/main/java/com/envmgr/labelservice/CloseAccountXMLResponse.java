
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
 *         &lt;element name="CloseAccountResponse" type="{www.envmgr.com/LabelService}SetPendingCloseAccountResponse" minOccurs="0"/&gt;
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
    "closeAccountResponse"
})
@XmlRootElement(name = "CloseAccountXMLResponse")
public class CloseAccountXMLResponse {

    @XmlElement(name = "CloseAccountResponse")
    protected SetPendingCloseAccountResponse closeAccountResponse;

    /**
     * Obtiene el valor de la propiedad closeAccountResponse.
     * 
     * @return
     *     possible object is
     *     {@link SetPendingCloseAccountResponse }
     *     
     */
    public SetPendingCloseAccountResponse getCloseAccountResponse() {
        return closeAccountResponse;
    }

    /**
     * Define el valor de la propiedad closeAccountResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link SetPendingCloseAccountResponse }
     *     
     */
    public void setCloseAccountResponse(SetPendingCloseAccountResponse value) {
        this.closeAccountResponse = value;
    }

}
