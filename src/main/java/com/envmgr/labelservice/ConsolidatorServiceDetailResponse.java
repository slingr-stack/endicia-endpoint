
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsolidatorServiceDetailResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsolidatorServiceDetailResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InternationalConsolidator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EnabledInternationalConsolidatorServices" type="{www.envmgr.com/LabelService}ArrayOfInternationalConsolidatorServiceDetailResponse" minOccurs="0"/&gt;
 *         &lt;element name="TypeCodes" type="{www.envmgr.com/LabelService}ArrayOfConsolidatorTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="ServiceInfo" type="{www.envmgr.com/LabelService}ConsolidatorServiceInfo" minOccurs="0"/&gt;
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
    "enabledInternationalConsolidatorServices",
    "typeCodes",
    "serviceInfo"
})
public class ConsolidatorServiceDetailResponse {

    @XmlElement(name = "InternationalConsolidator")
    protected boolean internationalConsolidator;
    @XmlElement(name = "EnabledInternationalConsolidatorServices")
    protected ArrayOfInternationalConsolidatorServiceDetailResponse enabledInternationalConsolidatorServices;
    @XmlElement(name = "TypeCodes")
    protected ArrayOfConsolidatorTypeCode typeCodes;
    @XmlElement(name = "ServiceInfo")
    protected ConsolidatorServiceInfo serviceInfo;

    /**
     * Obtiene el valor de la propiedad internationalConsolidator.
     * 
     */
    public boolean isInternationalConsolidator() {
        return internationalConsolidator;
    }

    /**
     * Define el valor de la propiedad internationalConsolidator.
     * 
     */
    public void setInternationalConsolidator(boolean value) {
        this.internationalConsolidator = value;
    }

    /**
     * Obtiene el valor de la propiedad enabledInternationalConsolidatorServices.
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
     * Define el valor de la propiedad enabledInternationalConsolidatorServices.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInternationalConsolidatorServiceDetailResponse }
     *     
     */
    public void setEnabledInternationalConsolidatorServices(ArrayOfInternationalConsolidatorServiceDetailResponse value) {
        this.enabledInternationalConsolidatorServices = value;
    }

    /**
     * Obtiene el valor de la propiedad typeCodes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConsolidatorTypeCode }
     *     
     */
    public ArrayOfConsolidatorTypeCode getTypeCodes() {
        return typeCodes;
    }

    /**
     * Define el valor de la propiedad typeCodes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConsolidatorTypeCode }
     *     
     */
    public void setTypeCodes(ArrayOfConsolidatorTypeCode value) {
        this.typeCodes = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceInfo.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidatorServiceInfo }
     *     
     */
    public ConsolidatorServiceInfo getServiceInfo() {
        return serviceInfo;
    }

    /**
     * Define el valor de la propiedad serviceInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidatorServiceInfo }
     *     
     */
    public void setServiceInfo(ConsolidatorServiceInfo value) {
        this.serviceInfo = value;
    }

}
