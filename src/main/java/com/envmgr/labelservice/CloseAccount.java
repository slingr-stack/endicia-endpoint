
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
 *         &lt;element name="CloseAccountRequest" type="{www.envmgr.com/LabelService}CloseAccountRequest" minOccurs="0"/&gt;
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
    "closeAccountRequest"
})
@XmlRootElement(name = "CloseAccount")
public class CloseAccount {

    @XmlElement(name = "CloseAccountRequest")
    protected CloseAccountRequest closeAccountRequest;

    /**
     * Obtiene el valor de la propiedad closeAccountRequest.
     * 
     * @return
     *     possible object is
     *     {@link CloseAccountRequest }
     *     
     */
    public CloseAccountRequest getCloseAccountRequest() {
        return closeAccountRequest;
    }

    /**
     * Define el valor de la propiedad closeAccountRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CloseAccountRequest }
     *     
     */
    public void setCloseAccountRequest(CloseAccountRequest value) {
        this.closeAccountRequest = value;
    }

}
