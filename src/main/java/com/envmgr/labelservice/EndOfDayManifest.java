
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EndOfDayManifest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad manifestType.
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
     * Define el valor de la propiedad manifestType.
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
     * Obtiene el valor de la propiedad pickUpCarrier.
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
     * Define el valor de la propiedad pickUpCarrier.
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
     * Obtiene el valor de la propiedad manifestID.
     * 
     */
    public int getManifestID() {
        return manifestID;
    }

    /**
     * Define el valor de la propiedad manifestID.
     * 
     */
    public void setManifestID(int value) {
        this.manifestID = value;
    }

    /**
     * Obtiene el valor de la propiedad manifestUrl.
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
     * Define el valor de la propiedad manifestUrl.
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
     * Obtiene el valor de la propiedad containerLabels.
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
     * Define el valor de la propiedad containerLabels.
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
