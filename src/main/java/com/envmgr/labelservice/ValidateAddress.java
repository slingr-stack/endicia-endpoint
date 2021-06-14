
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
 *         &lt;element name="ValidateAddressRequest" type="{www.envmgr.com/LabelService}ValidateAddressInfoRequest" minOccurs="0"/&gt;
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
    "validateAddressRequest"
})
@XmlRootElement(name = "ValidateAddress")
public class ValidateAddress {

    @XmlElement(name = "ValidateAddressRequest")
    protected ValidateAddressInfoRequest validateAddressRequest;

    /**
     * Obtiene el valor de la propiedad validateAddressRequest.
     * 
     * @return
     *     possible object is
     *     {@link ValidateAddressInfoRequest }
     *     
     */
    public ValidateAddressInfoRequest getValidateAddressRequest() {
        return validateAddressRequest;
    }

    /**
     * Define el valor de la propiedad validateAddressRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateAddressInfoRequest }
     *     
     */
    public void setValidateAddressRequest(ValidateAddressInfoRequest value) {
        this.validateAddressRequest = value;
    }

}
