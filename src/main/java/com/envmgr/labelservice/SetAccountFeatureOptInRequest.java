
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SetAccountFeatureOptInRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SetAccountFeatureOptInRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{www.envmgr.com/LabelService}DataValidator"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FeatureCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Enable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AcceptTermsAndConditions" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CertifiedIntermediary" type="{www.envmgr.com/LabelService}CertifiedIntermediary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetAccountFeatureOptInRequest", propOrder = {
    "featureCode",
    "enable",
    "acceptTermsAndConditions",
    "certifiedIntermediary"
})
public class SetAccountFeatureOptInRequest
    extends DataValidator
{

    @XmlElement(name = "FeatureCode")
    protected String featureCode;
    @XmlElement(name = "Enable")
    protected boolean enable;
    @XmlElement(name = "AcceptTermsAndConditions")
    protected boolean acceptTermsAndConditions;
    @XmlElement(name = "CertifiedIntermediary")
    protected CertifiedIntermediary certifiedIntermediary;

    /**
     * Obtiene el valor de la propiedad featureCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureCode() {
        return featureCode;
    }

    /**
     * Define el valor de la propiedad featureCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureCode(String value) {
        this.featureCode = value;
    }

    /**
     * Obtiene el valor de la propiedad enable.
     * 
     */
    public boolean isEnable() {
        return enable;
    }

    /**
     * Define el valor de la propiedad enable.
     * 
     */
    public void setEnable(boolean value) {
        this.enable = value;
    }

    /**
     * Obtiene el valor de la propiedad acceptTermsAndConditions.
     * 
     */
    public boolean isAcceptTermsAndConditions() {
        return acceptTermsAndConditions;
    }

    /**
     * Define el valor de la propiedad acceptTermsAndConditions.
     * 
     */
    public void setAcceptTermsAndConditions(boolean value) {
        this.acceptTermsAndConditions = value;
    }

    /**
     * Obtiene el valor de la propiedad certifiedIntermediary.
     * 
     * @return
     *     possible object is
     *     {@link CertifiedIntermediary }
     *     
     */
    public CertifiedIntermediary getCertifiedIntermediary() {
        return certifiedIntermediary;
    }

    /**
     * Define el valor de la propiedad certifiedIntermediary.
     * 
     * @param value
     *     allowed object is
     *     {@link CertifiedIntermediary }
     *     
     */
    public void setCertifiedIntermediary(CertifiedIntermediary value) {
        this.certifiedIntermediary = value;
    }

}
