
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
 *         &lt;element name="ResetSuspendedAccountRequest" type="{www.envmgr.com/LabelService}ResetSuspendedAccountRequest" minOccurs="0"/&gt;
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
    "resetSuspendedAccountRequest"
})
@XmlRootElement(name = "ResetSuspendedAccount")
public class ResetSuspendedAccount {

    @XmlElement(name = "ResetSuspendedAccountRequest")
    protected ResetSuspendedAccountRequest resetSuspendedAccountRequest;

    /**
     * Obtiene el valor de la propiedad resetSuspendedAccountRequest.
     * 
     * @return
     *     possible object is
     *     {@link ResetSuspendedAccountRequest }
     *     
     */
    public ResetSuspendedAccountRequest getResetSuspendedAccountRequest() {
        return resetSuspendedAccountRequest;
    }

    /**
     * Define el valor de la propiedad resetSuspendedAccountRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResetSuspendedAccountRequest }
     *     
     */
    public void setResetSuspendedAccountRequest(ResetSuspendedAccountRequest value) {
        this.resetSuspendedAccountRequest = value;
    }

}
