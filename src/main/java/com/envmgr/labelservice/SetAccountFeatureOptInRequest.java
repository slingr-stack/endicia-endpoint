
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetAccountFeatureOptInRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the featureCode property.
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
     * Sets the value of the featureCode property.
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
     * Gets the value of the enable property.
     * 
     */
    public boolean isEnable() {
        return enable;
    }

    /**
     * Sets the value of the enable property.
     * 
     */
    public void setEnable(boolean value) {
        this.enable = value;
    }

    /**
     * Gets the value of the acceptTermsAndConditions property.
     * 
     */
    public boolean isAcceptTermsAndConditions() {
        return acceptTermsAndConditions;
    }

    /**
     * Sets the value of the acceptTermsAndConditions property.
     * 
     */
    public void setAcceptTermsAndConditions(boolean value) {
        this.acceptTermsAndConditions = value;
    }

    /**
     * Gets the value of the certifiedIntermediary property.
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
     * Sets the value of the certifiedIntermediary property.
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
