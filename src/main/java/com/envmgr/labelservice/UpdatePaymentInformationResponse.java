
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
 *         &lt;element name="UpdatePaymentInfoResponse" type="{www.envmgr.com/LabelService}UpdatePaymentInfoResponse" minOccurs="0"/&gt;
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
    "updatePaymentInfoResponse"
})
@XmlRootElement(name = "UpdatePaymentInformationResponse")
public class UpdatePaymentInformationResponse {

    @XmlElement(name = "UpdatePaymentInfoResponse")
    protected UpdatePaymentInfoResponse updatePaymentInfoResponse;

    /**
     * Obtiene el valor de la propiedad updatePaymentInfoResponse.
     * 
     * @return
     *     possible object is
     *     {@link UpdatePaymentInfoResponse }
     *     
     */
    public UpdatePaymentInfoResponse getUpdatePaymentInfoResponse() {
        return updatePaymentInfoResponse;
    }

    /**
     * Define el valor de la propiedad updatePaymentInfoResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatePaymentInfoResponse }
     *     
     */
    public void setUpdatePaymentInfoResponse(UpdatePaymentInfoResponse value) {
        this.updatePaymentInfoResponse = value;
    }

}
