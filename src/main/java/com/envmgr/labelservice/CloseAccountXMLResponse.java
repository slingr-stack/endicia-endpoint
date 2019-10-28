
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
 *         &lt;element name="CloseAccountResponse" type="{www.envmgr.com/LabelService}SetPendingCloseAccountResponse" minOccurs="0"/&gt;
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
    "closeAccountResponse"
})
@XmlRootElement(name = "CloseAccountXMLResponse")
public class CloseAccountXMLResponse {

    @XmlElement(name = "CloseAccountResponse")
    protected SetPendingCloseAccountResponse closeAccountResponse;

    /**
     * Gets the value of the closeAccountResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SetPendingCloseAccountResponse }
     *     
     */
    public SetPendingCloseAccountResponse getCloseAccountResponse() {
        return closeAccountResponse;
    }

    /**
     * Sets the value of the closeAccountResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetPendingCloseAccountResponse }
     *     
     */
    public void setCloseAccountResponse(SetPendingCloseAccountResponse value) {
        this.closeAccountResponse = value;
    }

}
