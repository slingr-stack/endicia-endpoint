
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailAccountsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetailAccountsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetailAccounts" type="{www.envmgr.com/LabelService}ArrayOfRetailAccount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Status" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailAccountsResponse", propOrder = {
    "retailAccounts"
})
public class RetailAccountsResponse {

    @XmlElement(name = "RetailAccounts")
    protected ArrayOfRetailAccount retailAccounts;
    @XmlAttribute(name = "Status", required = true)
    protected int status;
    @XmlAttribute(name = "ErrorMessage")
    protected String errorMessage;

    /**
     * Gets the value of the retailAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRetailAccount }
     *     
     */
    public ArrayOfRetailAccount getRetailAccounts() {
        return retailAccounts;
    }

    /**
     * Sets the value of the retailAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRetailAccount }
     *     
     */
    public void setRetailAccounts(ArrayOfRetailAccount value) {
        this.retailAccounts = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

}
