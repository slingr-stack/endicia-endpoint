
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
 *         &lt;element name="PostageRatesResponse" type="{www.envmgr.com/LabelService}PostageRatesResponse" minOccurs="0"/&gt;
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
    "postageRatesResponse"
})
@XmlRootElement(name = "CalculatePostageRatesResponse")
public class CalculatePostageRatesResponse {

    @XmlElement(name = "PostageRatesResponse")
    protected PostageRatesResponse postageRatesResponse;

    /**
     * Gets the value of the postageRatesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PostageRatesResponse }
     *     
     */
    public PostageRatesResponse getPostageRatesResponse() {
        return postageRatesResponse;
    }

    /**
     * Sets the value of the postageRatesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostageRatesResponse }
     *     
     */
    public void setPostageRatesResponse(PostageRatesResponse value) {
        this.postageRatesResponse = value;
    }

}
