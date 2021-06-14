
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PackagePickupAvailabilityResponse" type="{www.envmgr.com/LabelService}PackagePickupAvailabilityResponse" minOccurs="0"/&gt;
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
    "packagePickupAvailabilityResponse"
})
@XmlRootElement(name = "GetPackagePickupAvailabilityResponse")
public class GetPackagePickupAvailabilityResponse {

    @XmlElement(name = "PackagePickupAvailabilityResponse")
    protected PackagePickupAvailabilityResponse packagePickupAvailabilityResponse;

    /**
     * Obtiene el valor de la propiedad packagePickupAvailabilityResponse.
     * 
     * @return
     *     possible object is
     *     {@link PackagePickupAvailabilityResponse }
     *     
     */
    public PackagePickupAvailabilityResponse getPackagePickupAvailabilityResponse() {
        return packagePickupAvailabilityResponse;
    }

    /**
     * Define el valor de la propiedad packagePickupAvailabilityResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagePickupAvailabilityResponse }
     *     
     */
    public void setPackagePickupAvailabilityResponse(PackagePickupAvailabilityResponse value) {
        this.packagePickupAvailabilityResponse = value;
    }

}
