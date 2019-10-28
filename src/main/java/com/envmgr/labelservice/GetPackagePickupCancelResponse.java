
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
 *         &lt;element name="PackagePickupCancelResponse" type="{www.envmgr.com/LabelService}PackagePickupCancelResponse" minOccurs="0"/&gt;
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
    "packagePickupCancelResponse"
})
@XmlRootElement(name = "GetPackagePickupCancelResponse")
public class GetPackagePickupCancelResponse {

    @XmlElement(name = "PackagePickupCancelResponse")
    protected PackagePickupCancelResponse packagePickupCancelResponse;

    /**
     * Gets the value of the packagePickupCancelResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PackagePickupCancelResponse }
     *     
     */
    public PackagePickupCancelResponse getPackagePickupCancelResponse() {
        return packagePickupCancelResponse;
    }

    /**
     * Sets the value of the packagePickupCancelResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagePickupCancelResponse }
     *     
     */
    public void setPackagePickupCancelResponse(PackagePickupCancelResponse value) {
        this.packagePickupCancelResponse = value;
    }

}
