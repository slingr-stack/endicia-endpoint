
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
 *         &lt;element name="GetExtraServiceRatesRequest" type="{www.envmgr.com/LabelService}GetExtraServiceRatesRequest" minOccurs="0"/&gt;
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
    "getExtraServiceRatesRequest"
})
@XmlRootElement(name = "GetExtraServiceRates")
public class GetExtraServiceRates {

    @XmlElement(name = "GetExtraServiceRatesRequest")
    protected GetExtraServiceRatesRequest getExtraServiceRatesRequest;

    /**
     * Gets the value of the getExtraServiceRatesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetExtraServiceRatesRequest }
     *     
     */
    public GetExtraServiceRatesRequest getGetExtraServiceRatesRequest() {
        return getExtraServiceRatesRequest;
    }

    /**
     * Sets the value of the getExtraServiceRatesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetExtraServiceRatesRequest }
     *     
     */
    public void setGetExtraServiceRatesRequest(GetExtraServiceRatesRequest value) {
        this.getExtraServiceRatesRequest = value;
    }

}
