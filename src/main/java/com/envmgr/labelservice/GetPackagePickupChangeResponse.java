
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
 *         &lt;element name="PackagePickupChangeResponse" type="{www.envmgr.com/LabelService}PackagePickupChangeResponse" minOccurs="0"/&gt;
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
    "packagePickupChangeResponse"
})
@XmlRootElement(name = "GetPackagePickupChangeResponse")
public class GetPackagePickupChangeResponse {

    @XmlElement(name = "PackagePickupChangeResponse")
    protected PackagePickupChangeResponse packagePickupChangeResponse;

    /**
     * Gets the value of the packagePickupChangeResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PackagePickupChangeResponse }
     *     
     */
    public PackagePickupChangeResponse getPackagePickupChangeResponse() {
        return packagePickupChangeResponse;
    }

    /**
     * Sets the value of the packagePickupChangeResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagePickupChangeResponse }
     *     
     */
    public void setPackagePickupChangeResponse(PackagePickupChangeResponse value) {
        this.packagePickupChangeResponse = value;
    }

}
