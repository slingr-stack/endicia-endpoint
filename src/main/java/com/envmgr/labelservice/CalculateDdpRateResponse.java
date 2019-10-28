
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
 *         &lt;element name="DdpRateResponse" type="{www.envmgr.com/LabelService}DdpRateResponse" minOccurs="0"/&gt;
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
    "ddpRateResponse"
})
@XmlRootElement(name = "CalculateDdpRateResponse")
public class CalculateDdpRateResponse {

    @XmlElement(name = "DdpRateResponse")
    protected DdpRateResponse ddpRateResponse;

    /**
     * Gets the value of the ddpRateResponse property.
     * 
     * @return
     *     possible object is
     *     {@link DdpRateResponse }
     *     
     */
    public DdpRateResponse getDdpRateResponse() {
        return ddpRateResponse;
    }

    /**
     * Sets the value of the ddpRateResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DdpRateResponse }
     *     
     */
    public void setDdpRateResponse(DdpRateResponse value) {
        this.ddpRateResponse = value;
    }

}
