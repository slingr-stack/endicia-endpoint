
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
 *         &lt;element name="GetVersionResults" type="{www.envmgr.com/LabelService}GetVersionResults" minOccurs="0"/&gt;
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
    "getVersionResults"
})
@XmlRootElement(name = "GetVersionXMLResponse")
public class GetVersionXMLResponse {

    @XmlElement(name = "GetVersionResults")
    protected GetVersionResults getVersionResults;

    /**
     * Gets the value of the getVersionResults property.
     * 
     * @return
     *     possible object is
     *     {@link GetVersionResults }
     *     
     */
    public GetVersionResults getGetVersionResults() {
        return getVersionResults;
    }

    /**
     * Sets the value of the getVersionResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetVersionResults }
     *     
     */
    public void setGetVersionResults(GetVersionResults value) {
        this.getVersionResults = value;
    }

}
