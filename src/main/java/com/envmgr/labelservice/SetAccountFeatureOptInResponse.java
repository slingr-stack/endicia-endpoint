
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
 *         &lt;element name="SetAccountFeatureOptInResponse" type="{www.envmgr.com/LabelService}SetAccountFeatureOptInResult" minOccurs="0"/&gt;
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
    "setAccountFeatureOptInResponse"
})
@XmlRootElement(name = "SetAccountFeatureOptInResponse")
public class SetAccountFeatureOptInResponse {

    @XmlElement(name = "SetAccountFeatureOptInResponse")
    protected SetAccountFeatureOptInResult setAccountFeatureOptInResponse;

    /**
     * Gets the value of the setAccountFeatureOptInResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SetAccountFeatureOptInResult }
     *     
     */
    public SetAccountFeatureOptInResult getSetAccountFeatureOptInResponse() {
        return setAccountFeatureOptInResponse;
    }

    /**
     * Sets the value of the setAccountFeatureOptInResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetAccountFeatureOptInResult }
     *     
     */
    public void setSetAccountFeatureOptInResponse(SetAccountFeatureOptInResult value) {
        this.setAccountFeatureOptInResponse = value;
    }

}
