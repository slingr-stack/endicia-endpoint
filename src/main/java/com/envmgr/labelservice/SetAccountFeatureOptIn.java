
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SetAccountFeatureOptInRequest" type="{www.envmgr.com/LabelService}SetAccountFeatureOptInRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "setAccountFeatureOptInRequest"
})
@XmlRootElement(name = "SetAccountFeatureOptIn")
public class SetAccountFeatureOptIn {

    @XmlElement(name = "SetAccountFeatureOptInRequest")
    protected SetAccountFeatureOptInRequest setAccountFeatureOptInRequest;

    /**
     * Gets the value of the setAccountFeatureOptInRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SetAccountFeatureOptInRequest }
     *     
     */
    public SetAccountFeatureOptInRequest getSetAccountFeatureOptInRequest() {
        return setAccountFeatureOptInRequest;
    }

    /**
     * Sets the value of the setAccountFeatureOptInRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetAccountFeatureOptInRequest }
     *     
     */
    public void setSetAccountFeatureOptInRequest(SetAccountFeatureOptInRequest value) {
        this.setAccountFeatureOptInRequest = value;
    }

}
