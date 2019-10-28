
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
 *         &lt;element name="GetSCANResponse" type="{www.envmgr.com/LabelService}SCANResponse" minOccurs="0"/&gt;
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
    "getSCANResponse"
})
@XmlRootElement(name = "GetSCANResponse")
public class GetSCANResponse {

    @XmlElement(name = "GetSCANResponse")
    protected SCANResponse getSCANResponse;

    /**
     * Gets the value of the getSCANResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SCANResponse }
     *     
     */
    public SCANResponse getGetSCANResponse() {
        return getSCANResponse;
    }

    /**
     * Sets the value of the getSCANResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCANResponse }
     *     
     */
    public void setGetSCANResponse(SCANResponse value) {
        this.getSCANResponse = value;
    }

}
