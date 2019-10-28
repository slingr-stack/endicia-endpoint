
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsolidatorServiceDetailResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsolidatorServiceDetailResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InternationalConsolidator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EnabledInternationalConsolidatorServices" type="{www.envmgr.com/LabelService}ArrayOfInternationalConsolidatorServiceDetailResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsolidatorServiceDetailResponse", propOrder = {
    "internationalConsolidator",
    "enabledInternationalConsolidatorServices"
})
public class ConsolidatorServiceDetailResponse {

    @XmlElement(name = "InternationalConsolidator")
    protected boolean internationalConsolidator;
    @XmlElement(name = "EnabledInternationalConsolidatorServices")
    protected ArrayOfInternationalConsolidatorServiceDetailResponse enabledInternationalConsolidatorServices;

    /**
     * Gets the value of the internationalConsolidator property.
     * 
     */
    public boolean isInternationalConsolidator() {
        return internationalConsolidator;
    }

    /**
     * Sets the value of the internationalConsolidator property.
     * 
     */
    public void setInternationalConsolidator(boolean value) {
        this.internationalConsolidator = value;
    }

    /**
     * Gets the value of the enabledInternationalConsolidatorServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInternationalConsolidatorServiceDetailResponse }
     *     
     */
    public ArrayOfInternationalConsolidatorServiceDetailResponse getEnabledInternationalConsolidatorServices() {
        return enabledInternationalConsolidatorServices;
    }

    /**
     * Sets the value of the enabledInternationalConsolidatorServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInternationalConsolidatorServiceDetailResponse }
     *     
     */
    public void setEnabledInternationalConsolidatorServices(ArrayOfInternationalConsolidatorServiceDetailResponse value) {
        this.enabledInternationalConsolidatorServices = value;
    }

}
