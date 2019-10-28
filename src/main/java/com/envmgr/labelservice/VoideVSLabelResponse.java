
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
 *         &lt;element name="VoidLabelResponse" type="{www.envmgr.com/LabelService}VoidLabelResponse" minOccurs="0"/&gt;
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
    "voidLabelResponse"
})
@XmlRootElement(name = "VoideVSLabelResponse")
public class VoideVSLabelResponse {

    @XmlElement(name = "VoidLabelResponse")
    protected VoidLabelResponse voidLabelResponse;

    /**
     * Gets the value of the voidLabelResponse property.
     * 
     * @return
     *     possible object is
     *     {@link VoidLabelResponse }
     *     
     */
    public VoidLabelResponse getVoidLabelResponse() {
        return voidLabelResponse;
    }

    /**
     * Sets the value of the voidLabelResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoidLabelResponse }
     *     
     */
    public void setVoidLabelResponse(VoidLabelResponse value) {
        this.voidLabelResponse = value;
    }

}
