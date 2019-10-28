
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
 *         &lt;element name="DHLeCManifestRequestXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "dhLeCManifestRequestXML"
})
@XmlRootElement(name = "HandleDHLeCManifestXML")
public class HandleDHLeCManifestXML {

    @XmlElement(name = "DHLeCManifestRequestXML")
    protected String dhLeCManifestRequestXML;

    /**
     * Gets the value of the dhLeCManifestRequestXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDHLeCManifestRequestXML() {
        return dhLeCManifestRequestXML;
    }

    /**
     * Sets the value of the dhLeCManifestRequestXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDHLeCManifestRequestXML(String value) {
        this.dhLeCManifestRequestXML = value;
    }

}
