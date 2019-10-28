
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
@XmlRootElement(name = "ValidateAddressResponse")
public class ValidateAddressResponse {

    @XmlElement(name = "ValidateAddressResponse")
    protected ValidateAddressInfoResponse validateAddressResponse;

    /**
     * Gets the value of the validateAddressResponse property.
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
     * Sets the value of the validateAddressResponse property.
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
