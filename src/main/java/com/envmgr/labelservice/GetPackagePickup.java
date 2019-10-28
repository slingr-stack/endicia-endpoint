
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
 *         &lt;element name="PackagePickupRequest" type="{www.envmgr.com/LabelService}PackagePickupRequest" minOccurs="0"/&gt;
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
    "packagePickupRequest"
})
@XmlRootElement(name = "GetPackagePickup")
public class GetPackagePickup {

    @XmlElement(name = "PackagePickupRequest")
    protected PackagePickupRequest packagePickupRequest;

    /**
     * Gets the value of the packagePickupRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PackagePickupRequest }
     *     
     */
    public PackagePickupRequest getPackagePickupRequest() {
        return packagePickupRequest;
    }

    /**
     * Sets the value of the packagePickupRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagePickupRequest }
     *     
     */
    public void setPackagePickupRequest(PackagePickupRequest value) {
        this.packagePickupRequest = value;
    }

}
