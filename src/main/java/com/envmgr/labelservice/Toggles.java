
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Toggles complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Toggles"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShowCustomColors" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ShowSocialMedia" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ShowStoreUrl" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ShowMenuLinks" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ShowReturnPolicy" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ShowEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ShowPhone" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ShowShipmentDetails" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ShowItemImages" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ShowShipmentPrices" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ShowStoreAddress" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Toggles", propOrder = {
    "showCustomColors",
    "showSocialMedia",
    "showStoreUrl",
    "showMenuLinks",
    "showReturnPolicy",
    "showEmail",
    "showPhone",
    "showShipmentDetails",
    "showItemImages",
    "showShipmentPrices",
    "showStoreAddress"
})
public class Toggles {

    @XmlElement(name = "ShowCustomColors", required = true, type = Boolean.class, nillable = true)
    protected Boolean showCustomColors;
    @XmlElement(name = "ShowSocialMedia", required = true, type = Boolean.class, nillable = true)
    protected Boolean showSocialMedia;
    @XmlElement(name = "ShowStoreUrl", required = true, type = Boolean.class, nillable = true)
    protected Boolean showStoreUrl;
    @XmlElement(name = "ShowMenuLinks", required = true, type = Boolean.class, nillable = true)
    protected Boolean showMenuLinks;
    @XmlElement(name = "ShowReturnPolicy", required = true, type = Boolean.class, nillable = true)
    protected Boolean showReturnPolicy;
    @XmlElement(name = "ShowEmail", required = true, type = Boolean.class, nillable = true)
    protected Boolean showEmail;
    @XmlElement(name = "ShowPhone", required = true, type = Boolean.class, nillable = true)
    protected Boolean showPhone;
    @XmlElement(name = "ShowShipmentDetails", required = true, type = Boolean.class, nillable = true)
    protected Boolean showShipmentDetails;
    @XmlElement(name = "ShowItemImages", required = true, type = Boolean.class, nillable = true)
    protected Boolean showItemImages;
    @XmlElement(name = "ShowShipmentPrices", required = true, type = Boolean.class, nillable = true)
    protected Boolean showShipmentPrices;
    @XmlElement(name = "ShowStoreAddress", required = true, type = Boolean.class, nillable = true)
    protected Boolean showStoreAddress;

    /**
     * Obtiene el valor de la propiedad showCustomColors.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowCustomColors() {
        return showCustomColors;
    }

    /**
     * Define el valor de la propiedad showCustomColors.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowCustomColors(Boolean value) {
        this.showCustomColors = value;
    }

    /**
     * Obtiene el valor de la propiedad showSocialMedia.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowSocialMedia() {
        return showSocialMedia;
    }

    /**
     * Define el valor de la propiedad showSocialMedia.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowSocialMedia(Boolean value) {
        this.showSocialMedia = value;
    }

    /**
     * Obtiene el valor de la propiedad showStoreUrl.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowStoreUrl() {
        return showStoreUrl;
    }

    /**
     * Define el valor de la propiedad showStoreUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowStoreUrl(Boolean value) {
        this.showStoreUrl = value;
    }

    /**
     * Obtiene el valor de la propiedad showMenuLinks.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowMenuLinks() {
        return showMenuLinks;
    }

    /**
     * Define el valor de la propiedad showMenuLinks.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowMenuLinks(Boolean value) {
        this.showMenuLinks = value;
    }

    /**
     * Obtiene el valor de la propiedad showReturnPolicy.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowReturnPolicy() {
        return showReturnPolicy;
    }

    /**
     * Define el valor de la propiedad showReturnPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowReturnPolicy(Boolean value) {
        this.showReturnPolicy = value;
    }

    /**
     * Obtiene el valor de la propiedad showEmail.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowEmail() {
        return showEmail;
    }

    /**
     * Define el valor de la propiedad showEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowEmail(Boolean value) {
        this.showEmail = value;
    }

    /**
     * Obtiene el valor de la propiedad showPhone.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowPhone() {
        return showPhone;
    }

    /**
     * Define el valor de la propiedad showPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowPhone(Boolean value) {
        this.showPhone = value;
    }

    /**
     * Obtiene el valor de la propiedad showShipmentDetails.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowShipmentDetails() {
        return showShipmentDetails;
    }

    /**
     * Define el valor de la propiedad showShipmentDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowShipmentDetails(Boolean value) {
        this.showShipmentDetails = value;
    }

    /**
     * Obtiene el valor de la propiedad showItemImages.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowItemImages() {
        return showItemImages;
    }

    /**
     * Define el valor de la propiedad showItemImages.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowItemImages(Boolean value) {
        this.showItemImages = value;
    }

    /**
     * Obtiene el valor de la propiedad showShipmentPrices.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowShipmentPrices() {
        return showShipmentPrices;
    }

    /**
     * Define el valor de la propiedad showShipmentPrices.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowShipmentPrices(Boolean value) {
        this.showShipmentPrices = value;
    }

    /**
     * Obtiene el valor de la propiedad showStoreAddress.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowStoreAddress() {
        return showStoreAddress;
    }

    /**
     * Define el valor de la propiedad showStoreAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowStoreAddress(Boolean value) {
        this.showStoreAddress = value;
    }

}
