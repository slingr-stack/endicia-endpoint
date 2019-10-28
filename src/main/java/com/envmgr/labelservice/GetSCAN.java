
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
 *         &lt;element name="GetSCANRequest" type="{www.envmgr.com/LabelService}SCANRequest" minOccurs="0"/&gt;
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
    "getSCANRequest"
})
@XmlRootElement(name = "GetSCAN")
public class GetSCAN {

    @XmlElement(name = "GetSCANRequest")
    protected SCANRequest getSCANRequest;

    /**
     * Gets the value of the getSCANRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SCANRequest }
     *     
     */
    public SCANRequest getGetSCANRequest() {
        return getSCANRequest;
    }

    /**
     * Sets the value of the getSCANRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCANRequest }
     *     
     */
    public void setGetSCANRequest(SCANRequest value) {
        this.getSCANRequest = value;
    }

}
