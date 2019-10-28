
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
 *         &lt;element name="ChangePassPhraseRequestResponse" type="{www.envmgr.com/LabelService}ChangePassPhraseRequestResponse" minOccurs="0"/&gt;
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
    "changePassPhraseRequestResponse"
})
@XmlRootElement(name = "ChangePassPhraseResponse")
public class ChangePassPhraseResponse {

    @XmlElement(name = "ChangePassPhraseRequestResponse")
    protected ChangePassPhraseRequestResponse changePassPhraseRequestResponse;

    /**
     * Gets the value of the changePassPhraseRequestResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ChangePassPhraseRequestResponse }
     *     
     */
    public ChangePassPhraseRequestResponse getChangePassPhraseRequestResponse() {
        return changePassPhraseRequestResponse;
    }

    /**
     * Sets the value of the changePassPhraseRequestResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangePassPhraseRequestResponse }
     *     
     */
    public void setChangePassPhraseRequestResponse(ChangePassPhraseRequestResponse value) {
        this.changePassPhraseRequestResponse = value;
    }

}
