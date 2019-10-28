
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
 *         &lt;element name="RetailAccountsRequest" type="{www.envmgr.com/LabelService}RetailAccountsRequest" minOccurs="0"/&gt;
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
    "retailAccountsRequest"
})
@XmlRootElement(name = "GetRetailAccounts")
public class GetRetailAccounts {

    @XmlElement(name = "RetailAccountsRequest")
    protected RetailAccountsRequest retailAccountsRequest;

    /**
     * Gets the value of the retailAccountsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RetailAccountsRequest }
     *     
     */
    public RetailAccountsRequest getRetailAccountsRequest() {
        return retailAccountsRequest;
    }

    /**
     * Sets the value of the retailAccountsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailAccountsRequest }
     *     
     */
    public void setRetailAccountsRequest(RetailAccountsRequest value) {
        this.retailAccountsRequest = value;
    }

}
