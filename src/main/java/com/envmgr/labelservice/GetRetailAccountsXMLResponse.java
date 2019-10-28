
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
@XmlRootElement(name = "GetRetailAccountsXMLResponse")
public class GetRetailAccountsXMLResponse {

    @XmlElement(name = "RetailAccountsResponse")
    protected RetailAccountsResponse retailAccountsResponse;

    /**
     * Gets the value of the retailAccountsResponse property.
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
     * Sets the value of the retailAccountsResponse property.
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
