
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
 *         &lt;element name="UpdatePaymentInfoRequest" type="{www.envmgr.com/LabelService}UpdatePaymentInfoRequest" minOccurs="0"/&gt;
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
    "updatePaymentInfoRequest"
})
@XmlRootElement(name = "UpdatePaymentInformation")
public class UpdatePaymentInformation {

    @XmlElement(name = "UpdatePaymentInfoRequest")
    protected UpdatePaymentInfoRequest updatePaymentInfoRequest;

    /**
     * Obtiene el valor de la propiedad updatePaymentInfoRequest.
     * 
     * @return
     *     possible object is
     *     {@link UpdatePaymentInfoRequest }
     *     
     */
    public UpdatePaymentInfoRequest getUpdatePaymentInfoRequest() {
        return updatePaymentInfoRequest;
    }

    /**
     * Define el valor de la propiedad updatePaymentInfoRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatePaymentInfoRequest }
     *     
     */
    public void setUpdatePaymentInfoRequest(UpdatePaymentInfoRequest value) {
        this.updatePaymentInfoRequest = value;
    }

}
