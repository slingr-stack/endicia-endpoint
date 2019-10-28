
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
 *         &lt;element name="ResetSuspendedAccountRequestXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "resetSuspendedAccountRequestXML"
})
@XmlRootElement(name = "ResetSuspendedAccountXML")
public class ResetSuspendedAccountXML {

    @XmlElement(name = "ResetSuspendedAccountRequestXML")
    protected String resetSuspendedAccountRequestXML;

    /**
     * Gets the value of the resetSuspendedAccountRequestXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResetSuspendedAccountRequestXML() {
        return resetSuspendedAccountRequestXML;
    }

    /**
     * Sets the value of the resetSuspendedAccountRequestXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResetSuspendedAccountRequestXML(String value) {
        this.resetSuspendedAccountRequestXML = value;
    }

}
