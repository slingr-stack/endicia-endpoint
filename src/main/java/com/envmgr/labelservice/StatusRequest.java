
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
 *         &lt;element name="PackageStatusRequest" type="{www.envmgr.com/LabelService}PackageStatusRequest" minOccurs="0"/&gt;
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
    "packageStatusRequest"
})
@XmlRootElement(name = "StatusRequest")
public class StatusRequest {

    @XmlElement(name = "PackageStatusRequest")
    protected PackageStatusRequest packageStatusRequest;

    /**
     * Gets the value of the packageStatusRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PackageStatusRequest }
     *     
     */
    public PackageStatusRequest getPackageStatusRequest() {
        return packageStatusRequest;
    }

    /**
     * Sets the value of the packageStatusRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageStatusRequest }
     *     
     */
    public void setPackageStatusRequest(PackageStatusRequest value) {
        this.packageStatusRequest = value;
    }

}
