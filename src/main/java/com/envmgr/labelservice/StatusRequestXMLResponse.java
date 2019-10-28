
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
 *         &lt;element name="PackageStatusResponse" type="{www.envmgr.com/LabelService}PackageStatusResponse" minOccurs="0"/&gt;
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
    "packageStatusResponse"
})
@XmlRootElement(name = "StatusRequestXMLResponse")
public class StatusRequestXMLResponse {

    @XmlElement(name = "PackageStatusResponse")
    protected PackageStatusResponse packageStatusResponse;

    /**
     * Gets the value of the packageStatusResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PackageStatusResponse }
     *     
     */
    public PackageStatusResponse getPackageStatusResponse() {
        return packageStatusResponse;
    }

    /**
     * Sets the value of the packageStatusResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageStatusResponse }
     *     
     */
    public void setPackageStatusResponse(PackageStatusResponse value) {
        this.packageStatusResponse = value;
    }

}
