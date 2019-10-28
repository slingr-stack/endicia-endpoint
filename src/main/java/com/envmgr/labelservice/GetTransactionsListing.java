
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
     * Gets the value of the getTransactionsListingRequest property.
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
     * Sets the value of the getTransactionsListingRequest property.
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
