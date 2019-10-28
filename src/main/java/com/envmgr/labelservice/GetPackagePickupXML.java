
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
 *         &lt;element name="PackagePickupRequestXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "packagePickupRequestXML"
})
@XmlRootElement(name = "GetPackagePickupXML")
public class GetPackagePickupXML {

    @XmlElement(name = "PackagePickupRequestXML")
    protected String packagePickupRequestXML;

    /**
     * Gets the value of the packagePickupRequestXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagePickupRequestXML() {
        return packagePickupRequestXML;
    }

    /**
     * Sets the value of the packagePickupRequestXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagePickupRequestXML(String value) {
        this.packagePickupRequestXML = value;
    }

}
