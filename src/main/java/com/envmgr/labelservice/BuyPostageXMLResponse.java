
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
 *         &lt;element name="RecreditRequestResponse" type="{www.envmgr.com/LabelService}RecreditRequestResponse" minOccurs="0"/&gt;
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
    "recreditRequestResponse"
})
@XmlRootElement(name = "BuyPostageXMLResponse")
public class BuyPostageXMLResponse {

    @XmlElement(name = "RecreditRequestResponse")
    protected RecreditRequestResponse recreditRequestResponse;

    /**
     * Gets the value of the recreditRequestResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RecreditRequestResponse }
     *     
     */
    public RecreditRequestResponse getRecreditRequestResponse() {
        return recreditRequestResponse;
    }

    /**
     * Sets the value of the recreditRequestResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecreditRequestResponse }
     *     
     */
    public void setRecreditRequestResponse(RecreditRequestResponse value) {
        this.recreditRequestResponse = value;
    }

}
