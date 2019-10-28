
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
 *         &lt;element name="LabelRequestResponse" type="{www.envmgr.com/LabelService}LabelRequestResponse" minOccurs="0"/&gt;
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
    "labelRequestResponse"
})
@XmlRootElement(name = "GetPostageLabelResponse")
public class GetPostageLabelResponse {

    @XmlElement(name = "LabelRequestResponse")
    protected LabelRequestResponse labelRequestResponse;

    /**
     * Gets the value of the labelRequestResponse property.
     * 
     * @return
     *     possible object is
     *     {@link LabelRequestResponse }
     *     
     */
    public LabelRequestResponse getLabelRequestResponse() {
        return labelRequestResponse;
    }

    /**
     * Sets the value of the labelRequestResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelRequestResponse }
     *     
     */
    public void setLabelRequestResponse(LabelRequestResponse value) {
        this.labelRequestResponse = value;
    }

}
