
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
 *         &lt;element name="ResetSuspendedAccountRequestResponse" type="{www.envmgr.com/LabelService}ResetSuspendedAccountRequestResponse" minOccurs="0"/&gt;
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
    "resetSuspendedAccountRequestResponse"
})
@XmlRootElement(name = "ResetSuspendedAccountResponse")
public class ResetSuspendedAccountResponse {

    @XmlElement(name = "ResetSuspendedAccountRequestResponse")
    protected ResetSuspendedAccountRequestResponse resetSuspendedAccountRequestResponse;

    /**
     * Obtiene el valor de la propiedad resetSuspendedAccountRequestResponse.
     * 
     * @return
     *     possible object is
     *     {@link ResetSuspendedAccountRequestResponse }
     *     
     */
    public ResetSuspendedAccountRequestResponse getResetSuspendedAccountRequestResponse() {
        return resetSuspendedAccountRequestResponse;
    }

    /**
     * Define el valor de la propiedad resetSuspendedAccountRequestResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link ResetSuspendedAccountRequestResponse }
     *     
     */
    public void setResetSuspendedAccountRequestResponse(ResetSuspendedAccountRequestResponse value) {
        this.resetSuspendedAccountRequestResponse = value;
    }

}
