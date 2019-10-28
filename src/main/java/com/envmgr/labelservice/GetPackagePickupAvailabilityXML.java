
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
 *         &lt;element name="PackagePickupAvailabilityRequestXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "packagePickupAvailabilityRequestXML"
})
@XmlRootElement(name = "GetPackagePickupAvailabilityXML")
public class GetPackagePickupAvailabilityXML {

    @XmlElement(name = "PackagePickupAvailabilityRequestXML")
    protected String packagePickupAvailabilityRequestXML;

    /**
     * Gets the value of the packagePickupAvailabilityRequestXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagePickupAvailabilityRequestXML() {
        return packagePickupAvailabilityRequestXML;
    }

    /**
     * Sets the value of the packagePickupAvailabilityRequestXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagePickupAvailabilityRequestXML(String value) {
        this.packagePickupAvailabilityRequestXML = value;
    }

}
