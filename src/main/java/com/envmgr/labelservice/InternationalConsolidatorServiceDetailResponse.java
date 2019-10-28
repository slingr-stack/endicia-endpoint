
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InternationalConsolidatorServiceDetailResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InternationalConsolidatorServiceDetailResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnabledInternationalConsolidatorServiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EnabledInternationalConsolidatorBrandedServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EnabledInternationalConsolidatorGenericServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternationalConsolidatorServiceDetailResponse", propOrder = {
    "enabledInternationalConsolidatorServiceID",
    "enabledInternationalConsolidatorBrandedServiceName",
    "enabledInternationalConsolidatorGenericServiceName"
})
public class InternationalConsolidatorServiceDetailResponse {

    @XmlElement(name = "EnabledInternationalConsolidatorServiceID")
    protected String enabledInternationalConsolidatorServiceID;
    @XmlElement(name = "EnabledInternationalConsolidatorBrandedServiceName")
    protected String enabledInternationalConsolidatorBrandedServiceName;
    @XmlElement(name = "EnabledInternationalConsolidatorGenericServiceName")
    protected String enabledInternationalConsolidatorGenericServiceName;

    /**
     * Gets the value of the enabledInternationalConsolidatorServiceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnabledInternationalConsolidatorServiceID() {
        return enabledInternationalConsolidatorServiceID;
    }

    /**
     * Sets the value of the enabledInternationalConsolidatorServiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnabledInternationalConsolidatorServiceID(String value) {
        this.enabledInternationalConsolidatorServiceID = value;
    }

    /**
     * Gets the value of the enabledInternationalConsolidatorBrandedServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnabledInternationalConsolidatorBrandedServiceName() {
        return enabledInternationalConsolidatorBrandedServiceName;
    }

    /**
     * Sets the value of the enabledInternationalConsolidatorBrandedServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnabledInternationalConsolidatorBrandedServiceName(String value) {
        this.enabledInternationalConsolidatorBrandedServiceName = value;
    }

    /**
     * Gets the value of the enabledInternationalConsolidatorGenericServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnabledInternationalConsolidatorGenericServiceName() {
        return enabledInternationalConsolidatorGenericServiceName;
    }

    /**
     * Sets the value of the enabledInternationalConsolidatorGenericServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnabledInternationalConsolidatorGenericServiceName(String value) {
        this.enabledInternationalConsolidatorGenericServiceName = value;
    }

}
