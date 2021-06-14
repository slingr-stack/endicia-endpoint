
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
 *         &lt;element name="ValidateAddressResponse" type="{www.envmgr.com/LabelService}ValidateAddressInfoResponse" minOccurs="0"/&gt;
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
    "validateAddressResponse"
})
@XmlRootElement(name = "ValidateAddressXMLResponse")
public class ValidateAddressXMLResponse {

    @XmlElement(name = "ValidateAddressResponse")
    protected ValidateAddressInfoResponse validateAddressResponse;

    /**
     * Obtiene el valor de la propiedad validateAddressResponse.
     * 
     * @return
     *     possible object is
     *     {@link ValidateAddressInfoResponse }
     *     
     */
    public ValidateAddressInfoResponse getValidateAddressResponse() {
        return validateAddressResponse;
    }

    /**
     * Define el valor de la propiedad validateAddressResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateAddressInfoResponse }
     *     
     */
    public void setValidateAddressResponse(ValidateAddressInfoResponse value) {
        this.validateAddressResponse = value;
    }

}
