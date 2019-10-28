
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
 *         &lt;element name="ResetSuspendedAccountRequestResponse" type="{www.envmgr.com/LabelService}ResetSuspendedAccountRequestResponse" minOccurs="0"/&gt;
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
    "resetSuspendedAccountRequestResponse"
})
@XmlRootElement(name = "ResetSuspendedAccountXMLResponse")
public class ResetSuspendedAccountXMLResponse {

    @XmlElement(name = "ResetSuspendedAccountRequestResponse")
    protected ResetSuspendedAccountRequestResponse resetSuspendedAccountRequestResponse;

    /**
     * Gets the value of the resetSuspendedAccountRequestResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ResetSuspendedAccountRequestResponse }
     *     
     */
    public ResetSuspendedAccountRequestResponse getResetSuspendedAccountRequestResponse() {
        return resetSuspendedAccountRequestResponse;
    }

    /**
     * Sets the value of the resetSuspendedAccountRequestResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResetSuspendedAccountRequestResponse }
     *     
     */
    public void setResetSuspendedAccountRequestResponse(ResetSuspendedAccountRequestResponse value) {
        this.resetSuspendedAccountRequestResponse = value;
    }

}
