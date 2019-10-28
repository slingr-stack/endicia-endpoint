
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
 *         &lt;element name="PackagePickupCancelRequest" type="{www.envmgr.com/LabelService}PackagePickupCancelRequest" minOccurs="0"/&gt;
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
    "packagePickupCancelRequest"
})
@XmlRootElement(name = "GetPackagePickupCancel")
public class GetPackagePickupCancel {

    @XmlElement(name = "PackagePickupCancelRequest")
    protected PackagePickupCancelRequest packagePickupCancelRequest;

    /**
     * Gets the value of the packagePickupCancelRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PackagePickupCancelRequest }
     *     
     */
    public PackagePickupCancelRequest getPackagePickupCancelRequest() {
        return packagePickupCancelRequest;
    }

    /**
     * Sets the value of the packagePickupCancelRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagePickupCancelRequest }
     *     
     */
    public void setPackagePickupCancelRequest(PackagePickupCancelRequest value) {
        this.packagePickupCancelRequest = value;
    }

}
