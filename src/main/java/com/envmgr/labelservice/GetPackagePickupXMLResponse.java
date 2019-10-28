
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
 *         &lt;element name="PackagePickupResponse" type="{www.envmgr.com/LabelService}PackagePickupResponse" minOccurs="0"/&gt;
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
    "packagePickupResponse"
})
@XmlRootElement(name = "GetPackagePickupXMLResponse")
public class GetPackagePickupXMLResponse {

    @XmlElement(name = "PackagePickupResponse")
    protected PackagePickupResponse packagePickupResponse;

    /**
     * Gets the value of the packagePickupResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PackagePickupResponse }
     *     
     */
    public PackagePickupResponse getPackagePickupResponse() {
        return packagePickupResponse;
    }

    /**
     * Sets the value of the packagePickupResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagePickupResponse }
     *     
     */
    public void setPackagePickupResponse(PackagePickupResponse value) {
        this.packagePickupResponse = value;
    }

}
