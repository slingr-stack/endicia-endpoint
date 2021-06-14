
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
 *         &lt;element name="RetailAccountsResponse" type="{www.envmgr.com/LabelService}RetailAccountsResponse" minOccurs="0"/&gt;
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
    "retailAccountsResponse"
})
@XmlRootElement(name = "GetRetailAccountsResponse")
public class GetRetailAccountsResponse {

    @XmlElement(name = "RetailAccountsResponse")
    protected RetailAccountsResponse retailAccountsResponse;

    /**
     * Obtiene el valor de la propiedad retailAccountsResponse.
     * 
     * @return
     *     possible object is
     *     {@link RetailAccountsResponse }
     *     
     */
    public RetailAccountsResponse getRetailAccountsResponse() {
        return retailAccountsResponse;
    }

    /**
     * Define el valor de la propiedad retailAccountsResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailAccountsResponse }
     *     
     */
    public void setRetailAccountsResponse(RetailAccountsResponse value) {
        this.retailAccountsResponse = value;
    }

}
