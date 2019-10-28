
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
 *         &lt;element name="CloseAccountRequest" type="{www.envmgr.com/LabelService}CloseAccountRequest" minOccurs="0"/&gt;
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
    "closeAccountRequest"
})
@XmlRootElement(name = "CloseAccount")
public class CloseAccount {

    @XmlElement(name = "CloseAccountRequest")
    protected CloseAccountRequest closeAccountRequest;

    /**
     * Gets the value of the closeAccountRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CloseAccountRequest }
     *     
     */
    public CloseAccountRequest getCloseAccountRequest() {
        return closeAccountRequest;
    }

    /**
     * Sets the value of the closeAccountRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CloseAccountRequest }
     *     
     */
    public void setCloseAccountRequest(CloseAccountRequest value) {
        this.closeAccountRequest = value;
    }

}
