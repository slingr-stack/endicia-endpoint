
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
 *         &lt;element name="PostageRatesRequest" type="{www.envmgr.com/LabelService}PostageRatesRequest" minOccurs="0"/&gt;
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
    "postageRatesRequest"
})
@XmlRootElement(name = "CalculatePostageRates")
public class CalculatePostageRates {

    @XmlElement(name = "PostageRatesRequest")
    protected PostageRatesRequest postageRatesRequest;

    /**
     * Gets the value of the postageRatesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PostageRatesRequest }
     *     
     */
    public PostageRatesRequest getPostageRatesRequest() {
        return postageRatesRequest;
    }

    /**
     * Sets the value of the postageRatesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostageRatesRequest }
     *     
     */
    public void setPostageRatesRequest(PostageRatesRequest value) {
        this.postageRatesRequest = value;
    }

}
