
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PackageInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad actualPackageType.
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
     * Define el valor de la propiedad actualPackageType.
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
     * Obtiene el valor de la propiedad actualWeight.
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
     * Define el valor de la propiedad actualWeight.
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
     * Obtiene el valor de la propiedad actualLength.
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
     * Define el valor de la propiedad actualLength.
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
     * Obtiene el valor de la propiedad actualWidth.
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
     * Define el valor de la propiedad actualWidth.
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
     * Obtiene el valor de la propiedad actualHeight.
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
     * Define el valor de la propiedad actualHeight.
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
