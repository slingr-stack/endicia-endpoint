
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActualPackageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActualWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActualLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActualWidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActualHeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageInfo", propOrder = {
    "actualPackageType",
    "actualWeight",
    "actualLength",
    "actualWidth",
    "actualHeight"
})
public class PackageInfo {

    @XmlElement(name = "ActualPackageType")
    protected String actualPackageType;
    @XmlElement(name = "ActualWeight")
    protected String actualWeight;
    @XmlElement(name = "ActualLength")
    protected String actualLength;
    @XmlElement(name = "ActualWidth")
    protected String actualWidth;
    @XmlElement(name = "ActualHeight")
    protected String actualHeight;

    /**
     * Gets the value of the actualPackageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualPackageType() {
        return actualPackageType;
    }

    /**
     * Sets the value of the actualPackageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualPackageType(String value) {
        this.actualPackageType = value;
    }

    /**
     * Gets the value of the actualWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualWeight() {
        return actualWeight;
    }

    /**
     * Sets the value of the actualWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualWeight(String value) {
        this.actualWeight = value;
    }

    /**
     * Gets the value of the actualLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualLength() {
        return actualLength;
    }

    /**
     * Sets the value of the actualLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualLength(String value) {
        this.actualLength = value;
    }

    /**
     * Gets the value of the actualWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualWidth() {
        return actualWidth;
    }

    /**
     * Sets the value of the actualWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualWidth(String value) {
        this.actualWidth = value;
    }

    /**
     * Gets the value of the actualHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualHeight() {
        return actualHeight;
    }

    /**
     * Sets the value of the actualHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualHeight(String value) {
        this.actualHeight = value;
    }

}
