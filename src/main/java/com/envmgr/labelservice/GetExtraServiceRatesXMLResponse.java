
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
 *         &lt;element name="GetExtraServiceRatesResponse" type="{www.envmgr.com/LabelService}GetExtraServiceRateResponse" minOccurs="0"/&gt;
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
    "getExtraServiceRatesResponse"
})
@XmlRootElement(name = "GetExtraServiceRatesXMLResponse")
public class GetExtraServiceRatesXMLResponse {

    @XmlElement(name = "GetExtraServiceRatesResponse")
    protected GetExtraServiceRateResponse getExtraServiceRatesResponse;

    /**
     * Gets the value of the getExtraServiceRatesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GetExtraServiceRateResponse }
     *     
     */
    public GetExtraServiceRateResponse getGetExtraServiceRatesResponse() {
        return getExtraServiceRatesResponse;
    }

    /**
     * Sets the value of the getExtraServiceRatesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetExtraServiceRateResponse }
     *     
     */
    public void setGetExtraServiceRatesResponse(GetExtraServiceRateResponse value) {
        this.getExtraServiceRatesResponse = value;
    }

}
