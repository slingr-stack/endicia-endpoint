
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
 *         &lt;element name="RefundRequest" type="{www.envmgr.com/LabelService}RefundRequest" minOccurs="0"/&gt;
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
    "refundRequest"
})
@XmlRootElement(name = "GetRefund")
public class GetRefund {

    @XmlElement(name = "RefundRequest")
    protected RefundRequest refundRequest;

    /**
     * Obtiene el valor de la propiedad refundRequest.
     * 
     * @return
     *     possible object is
     *     {@link RefundRequest }
     *     
     */
    public RefundRequest getRefundRequest() {
        return refundRequest;
    }

    /**
     * Define el valor de la propiedad refundRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundRequest }
     *     
     */
    public void setRefundRequest(RefundRequest value) {
        this.refundRequest = value;
    }

}
