
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
 *         &lt;element name="GetTransactionsListingRequest" type="{www.envmgr.com/LabelService}GetTransactionsListingRequest" minOccurs="0"/&gt;
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
    "getTransactionsListingRequest"
})
@XmlRootElement(name = "GetTransactionsListing")
public class GetTransactionsListing {

    @XmlElement(name = "GetTransactionsListingRequest")
    protected GetTransactionsListingRequest getTransactionsListingRequest;

    /**
     * Obtiene el valor de la propiedad getTransactionsListingRequest.
     * 
     * @return
     *     possible object is
     *     {@link GetTransactionsListingRequest }
     *     
     */
    public GetTransactionsListingRequest getGetTransactionsListingRequest() {
        return getTransactionsListingRequest;
    }

    /**
     * Define el valor de la propiedad getTransactionsListingRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTransactionsListingRequest }
     *     
     */
    public void setGetTransactionsListingRequest(GetTransactionsListingRequest value) {
        this.getTransactionsListingRequest = value;
    }

}
