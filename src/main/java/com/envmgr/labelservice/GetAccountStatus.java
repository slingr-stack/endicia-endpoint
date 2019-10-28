
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
 *         &lt;element name="AccountStatusRequest" type="{www.envmgr.com/LabelService}AccountStatusRequest" minOccurs="0"/&gt;
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
    "accountStatusRequest"
})
@XmlRootElement(name = "GetAccountStatus")
public class GetAccountStatus {

    @XmlElement(name = "AccountStatusRequest")
    protected AccountStatusRequest accountStatusRequest;

    /**
     * Gets the value of the accountStatusRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatusRequest }
     *     
     */
    public AccountStatusRequest getAccountStatusRequest() {
        return accountStatusRequest;
    }

    /**
     * Sets the value of the accountStatusRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatusRequest }
     *     
     */
    public void setAccountStatusRequest(AccountStatusRequest value) {
        this.accountStatusRequest = value;
    }

}
