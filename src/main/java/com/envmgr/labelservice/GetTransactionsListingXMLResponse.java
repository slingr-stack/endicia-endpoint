
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
 *         &lt;element name="TransactionsListingResponse" type="{www.envmgr.com/LabelService}TransactionsListingResponse" minOccurs="0"/&gt;
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
    "transactionsListingResponse"
})
@XmlRootElement(name = "GetTransactionsListingXMLResponse")
public class GetTransactionsListingXMLResponse {

    @XmlElement(name = "TransactionsListingResponse")
    protected TransactionsListingResponse transactionsListingResponse;

    /**
     * Gets the value of the transactionsListingResponse property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionsListingResponse }
     *     
     */
    public TransactionsListingResponse getTransactionsListingResponse() {
        return transactionsListingResponse;
    }

    /**
     * Sets the value of the transactionsListingResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionsListingResponse }
     *     
     */
    public void setTransactionsListingResponse(TransactionsListingResponse value) {
        this.transactionsListingResponse = value;
    }

}
