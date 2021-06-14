
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
 *         &lt;element name="AccountStatusResponse" type="{www.envmgr.com/LabelService}AccountStatusResponse" minOccurs="0"/&gt;
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
    "accountStatusResponse"
})
@XmlRootElement(name = "GetAccountStatusXMLResponse")
public class GetAccountStatusXMLResponse {

    @XmlElement(name = "AccountStatusResponse")
    protected AccountStatusResponse accountStatusResponse;

    /**
     * Obtiene el valor de la propiedad accountStatusResponse.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatusResponse }
     *     
     */
    public AccountStatusResponse getAccountStatusResponse() {
        return accountStatusResponse;
    }

    /**
     * Define el valor de la propiedad accountStatusResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatusResponse }
     *     
     */
    public void setAccountStatusResponse(AccountStatusResponse value) {
        this.accountStatusResponse = value;
    }

}
