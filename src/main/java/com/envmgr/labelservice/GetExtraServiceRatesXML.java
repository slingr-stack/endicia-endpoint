
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
 *         &lt;element name="GetExtraServiceRatesRequestXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getExtraServiceRatesRequestXML"
})
@XmlRootElement(name = "GetExtraServiceRatesXML")
public class GetExtraServiceRatesXML {

    @XmlElement(name = "GetExtraServiceRatesRequestXML")
    protected String getExtraServiceRatesRequestXML;

    /**
     * Gets the value of the getExtraServiceRatesRequestXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetExtraServiceRatesRequestXML() {
        return getExtraServiceRatesRequestXML;
    }

    /**
     * Sets the value of the getExtraServiceRatesRequestXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetExtraServiceRatesRequestXML(String value) {
        this.getExtraServiceRatesRequestXML = value;
    }

}
