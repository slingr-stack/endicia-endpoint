
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
 *         &lt;element name="DdpRateRequest" type="{www.envmgr.com/LabelService}DdpRateRequest" minOccurs="0"/&gt;
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
    "ddpRateRequest"
})
@XmlRootElement(name = "CalculateDdpRate")
public class CalculateDdpRate {

    @XmlElement(name = "DdpRateRequest")
    protected DdpRateRequest ddpRateRequest;

    /**
     * Gets the value of the ddpRateRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DdpRateRequest }
     *     
     */
    public DdpRateRequest getDdpRateRequest() {
        return ddpRateRequest;
    }

    /**
     * Sets the value of the ddpRateRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DdpRateRequest }
     *     
     */
    public void setDdpRateRequest(DdpRateRequest value) {
        this.ddpRateRequest = value;
    }

}
