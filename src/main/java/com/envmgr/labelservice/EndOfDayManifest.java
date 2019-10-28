
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EndOfDayManifest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndOfDayManifest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ManifestType" type="{www.envmgr.com/LabelService}ManifestType"/&gt;
 *         &lt;element name="PickUpCarrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManifestID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ManifestUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContainerLabels" type="{www.envmgr.com/LabelService}ArrayOfContainerLabel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndOfDayManifest", propOrder = {
    "manifestType",
    "pickUpCarrier",
    "manifestID",
    "manifestUrl",
    "containerLabels"
})
public class EndOfDayManifest {

    @XmlElement(name = "ManifestType", required = true)
    @XmlSchemaType(name = "string")
    protected ManifestType manifestType;
    @XmlElement(name = "PickUpCarrier")
    protected String pickUpCarrier;
    @XmlElement(name = "ManifestID")
    protected int manifestID;
    @XmlElement(name = "ManifestUrl")
    protected String manifestUrl;
    @XmlElement(name = "ContainerLabels")
    protected ArrayOfContainerLabel containerLabels;

    /**
     * Gets the value of the manifestType property.
     * 
     * @return
     *     possible object is
     *     {@link ManifestType }
     *     
     */
    public ManifestType getManifestType() {
        return manifestType;
    }

    /**
     * Sets the value of the manifestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManifestType }
     *     
     */
    public void setManifestType(ManifestType value) {
        this.manifestType = value;
    }

    /**
     * Gets the value of the pickUpCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpCarrier() {
        return pickUpCarrier;
    }

    /**
     * Sets the value of the pickUpCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpCarrier(String value) {
        this.pickUpCarrier = value;
    }

    /**
     * Gets the value of the manifestID property.
     * 
     */
    public int getManifestID() {
        return manifestID;
    }

    /**
     * Sets the value of the manifestID property.
     * 
     */
    public void setManifestID(int value) {
        this.manifestID = value;
    }

    /**
     * Gets the value of the manifestUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManifestUrl() {
        return manifestUrl;
    }

    /**
     * Sets the value of the manifestUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManifestUrl(String value) {
        this.manifestUrl = value;
    }

    /**
     * Gets the value of the containerLabels property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContainerLabel }
     *     
     */
    public ArrayOfContainerLabel getContainerLabels() {
        return containerLabels;
    }

    /**
     * Sets the value of the containerLabels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContainerLabel }
     *     
     */
    public void setContainerLabels(ArrayOfContainerLabel value) {
        this.containerLabels = value;
    }

}
