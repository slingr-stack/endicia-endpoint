
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DHLeCManifestRequestParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DHLeCManifestRequestParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ImageResolution" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ImageFormat" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DHLeCManifestRequestParameters")
public class DHLeCManifestRequestParameters {

    @XmlAttribute(name = "ImageResolution")
    protected String imageResolution;
    @XmlAttribute(name = "ImageFormat")
    protected String imageFormat;

    /**
     * Gets the value of the imageResolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageResolution() {
        return imageResolution;
    }

    /**
     * Sets the value of the imageResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageResolution(String value) {
        this.imageResolution = value;
    }

    /**
     * Gets the value of the imageFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageFormat() {
        return imageFormat;
    }

    /**
     * Sets the value of the imageFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageFormat(String value) {
        this.imageFormat = value;
    }

}
