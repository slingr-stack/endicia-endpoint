
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
 *         &lt;element name="ResetSuspendedAccountRequest" type="{www.envmgr.com/LabelService}ResetSuspendedAccountRequest" minOccurs="0"/&gt;
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
    "resetSuspendedAccountRequest"
})
@XmlRootElement(name = "ResetSuspendedAccount")
public class ResetSuspendedAccount {

    @XmlElement(name = "ResetSuspendedAccountRequest")
    protected ResetSuspendedAccountRequest resetSuspendedAccountRequest;

    /**
     * Gets the value of the resetSuspendedAccountRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ResetSuspendedAccountRequest }
     *     
     */
    public ResetSuspendedAccountRequest getResetSuspendedAccountRequest() {
        return resetSuspendedAccountRequest;
    }

    /**
     * Sets the value of the resetSuspendedAccountRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResetSuspendedAccountRequest }
     *     
     */
    public void setResetSuspendedAccountRequest(ResetSuspendedAccountRequest value) {
        this.resetSuspendedAccountRequest = value;
    }

}
