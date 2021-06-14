
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ContainerLabel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ContainerLabel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContainerTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContainerLabelImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContainerLabel", propOrder = {
    "containerTrackingNumber",
    "containerLabelImage"
})
public class ContainerLabel {

    @XmlElement(name = "ContainerTrackingNumber")
    protected String containerTrackingNumber;
    @XmlElement(name = "ContainerLabelImage")
    protected String containerLabelImage;

    /**
     * Obtiene el valor de la propiedad containerTrackingNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerTrackingNumber() {
        return containerTrackingNumber;
    }

    /**
     * Define el valor de la propiedad containerTrackingNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerTrackingNumber(String value) {
        this.containerTrackingNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad containerLabelImage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerLabelImage() {
        return containerLabelImage;
    }

    /**
     * Define el valor de la propiedad containerLabelImage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerLabelImage(String value) {
        this.containerLabelImage = value;
    }

}
