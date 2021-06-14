
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BrandingProperties complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BrandingProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReturnPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LogoTargetUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LogoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LogoType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MenuLinks" type="{www.envmgr.com/LabelService}ArrayOfMenuLink" minOccurs="0"/&gt;
 *         &lt;element name="SocialMedia" type="{www.envmgr.com/LabelService}ArrayOfSocialMedia" minOccurs="0"/&gt;
 *         &lt;element name="Toggles" type="{www.envmgr.com/LabelService}Toggles" minOccurs="0"/&gt;
 *         &lt;element name="Colors" type="{www.envmgr.com/LabelService}Colors" minOccurs="0"/&gt;
 *         &lt;element name="Theme" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrandingProperties", propOrder = {
    "returnPolicy",
    "email",
    "phone",
    "logoTargetUrl",
    "brandName",
    "logoUrl",
    "logoType",
    "menuLinks",
    "socialMedia",
    "toggles",
    "colors",
    "theme"
})
public class BrandingProperties {

    @XmlElement(name = "ReturnPolicy")
    protected String returnPolicy;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "LogoTargetUrl")
    protected String logoTargetUrl;
    @XmlElement(name = "BrandName")
    protected String brandName;
    @XmlElement(name = "LogoUrl")
    protected String logoUrl;
    @XmlElement(name = "LogoType", required = true, nillable = true)
    protected String logoType;
    @XmlElement(name = "MenuLinks")
    protected ArrayOfMenuLink menuLinks;
    @XmlElement(name = "SocialMedia")
    protected ArrayOfSocialMedia socialMedia;
    @XmlElement(name = "Toggles")
    protected Toggles toggles;
    @XmlElement(name = "Colors")
    protected Colors colors;
    @XmlElement(name = "Theme", required = true, nillable = true)
    protected String theme;

    /**
     * Obtiene el valor de la propiedad returnPolicy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnPolicy() {
        return returnPolicy;
    }

    /**
     * Define el valor de la propiedad returnPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnPolicy(String value) {
        this.returnPolicy = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad phone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Define el valor de la propiedad phone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Obtiene el valor de la propiedad logoTargetUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoTargetUrl() {
        return logoTargetUrl;
    }

    /**
     * Define el valor de la propiedad logoTargetUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoTargetUrl(String value) {
        this.logoTargetUrl = value;
    }

    /**
     * Obtiene el valor de la propiedad brandName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * Define el valor de la propiedad brandName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandName(String value) {
        this.brandName = value;
    }

    /**
     * Obtiene el valor de la propiedad logoUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * Define el valor de la propiedad logoUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoUrl(String value) {
        this.logoUrl = value;
    }

    /**
     * Obtiene el valor de la propiedad logoType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoType() {
        return logoType;
    }

    /**
     * Define el valor de la propiedad logoType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoType(String value) {
        this.logoType = value;
    }

    /**
     * Obtiene el valor de la propiedad menuLinks.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMenuLink }
     *     
     */
    public ArrayOfMenuLink getMenuLinks() {
        return menuLinks;
    }

    /**
     * Define el valor de la propiedad menuLinks.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMenuLink }
     *     
     */
    public void setMenuLinks(ArrayOfMenuLink value) {
        this.menuLinks = value;
    }

    /**
     * Obtiene el valor de la propiedad socialMedia.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSocialMedia }
     *     
     */
    public ArrayOfSocialMedia getSocialMedia() {
        return socialMedia;
    }

    /**
     * Define el valor de la propiedad socialMedia.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSocialMedia }
     *     
     */
    public void setSocialMedia(ArrayOfSocialMedia value) {
        this.socialMedia = value;
    }

    /**
     * Obtiene el valor de la propiedad toggles.
     * 
     * @return
     *     possible object is
     *     {@link Toggles }
     *     
     */
    public Toggles getToggles() {
        return toggles;
    }

    /**
     * Define el valor de la propiedad toggles.
     * 
     * @param value
     *     allowed object is
     *     {@link Toggles }
     *     
     */
    public void setToggles(Toggles value) {
        this.toggles = value;
    }

    /**
     * Obtiene el valor de la propiedad colors.
     * 
     * @return
     *     possible object is
     *     {@link Colors }
     *     
     */
    public Colors getColors() {
        return colors;
    }

    /**
     * Define el valor de la propiedad colors.
     * 
     * @param value
     *     allowed object is
     *     {@link Colors }
     *     
     */
    public void setColors(Colors value) {
        this.colors = value;
    }

    /**
     * Obtiene el valor de la propiedad theme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTheme() {
        return theme;
    }

    /**
     * Define el valor de la propiedad theme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTheme(String value) {
        this.theme = value;
    }

}
