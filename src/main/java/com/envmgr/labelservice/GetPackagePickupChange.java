
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
 *         &lt;element name="PackagePickupChangeRequest" type="{www.envmgr.com/LabelService}PackagePickupChangeRequest" minOccurs="0"/&gt;
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
    "packagePickupChangeRequest"
})
@XmlRootElement(name = "GetPackagePickupChange")
public class GetPackagePickupChange {

    @XmlElement(name = "PackagePickupChangeRequest")
    protected PackagePickupChangeRequest packagePickupChangeRequest;

    /**
     * Gets the value of the packagePickupChangeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PackagePickupChangeRequest }
     *     
     */
    public PackagePickupChangeRequest getPackagePickupChangeRequest() {
        return packagePickupChangeRequest;
    }

    /**
     * Sets the value of the packagePickupChangeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagePickupChangeRequest }
     *     
     */
    public void setPackagePickupChangeRequest(PackagePickupChangeRequest value) {
        this.packagePickupChangeRequest = value;
    }

}
