
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
 *         &lt;element name="PostageRateResponse" type="{www.envmgr.com/LabelService}PostageRateTableResponse" minOccurs="0"/&gt;
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
    "postageRateResponse"
})
@XmlRootElement(name = "GetPostageRateTableXMLResponse")
public class GetPostageRateTableXMLResponse {

    @XmlElement(name = "PostageRateResponse")
    protected PostageRateTableResponse postageRateResponse;

    /**
     * Gets the value of the postageRateResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PostageRateTableResponse }
     *     
     */
    public PostageRateTableResponse getPostageRateResponse() {
        return postageRateResponse;
    }

    /**
     * Sets the value of the postageRateResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostageRateTableResponse }
     *     
     */
    public void setPostageRateResponse(PostageRateTableResponse value) {
        this.postageRateResponse = value;
    }

}
