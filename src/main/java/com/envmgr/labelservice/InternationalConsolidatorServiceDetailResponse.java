
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InternationalConsolidatorServiceDetailResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad enabledInternationalConsolidatorServiceID.
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
     * Define el valor de la propiedad enabledInternationalConsolidatorServiceID.
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
     * Obtiene el valor de la propiedad enabledInternationalConsolidatorBrandedServiceName.
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
     * Define el valor de la propiedad enabledInternationalConsolidatorBrandedServiceName.
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
     * Obtiene el valor de la propiedad enabledInternationalConsolidatorGenericServiceName.
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
     * Define el valor de la propiedad enabledInternationalConsolidatorGenericServiceName.
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
