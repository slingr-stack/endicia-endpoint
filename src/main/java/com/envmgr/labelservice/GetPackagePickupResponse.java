
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
 *         &lt;element name="PackagePickupResponse" type="{www.envmgr.com/LabelService}PackagePickupResponse" minOccurs="0"/&gt;
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
    "packagePickupResponse"
})
@XmlRootElement(name = "GetPackagePickupResponse")
public class GetPackagePickupResponse {

    @XmlElement(name = "PackagePickupResponse")
    protected PackagePickupResponse packagePickupResponse;

    /**
     * Obtiene el valor de la propiedad packagePickupResponse.
     * 
     * @return
     *     possible object is
     *     {@link PackagePickupResponse }
     *     
     */
    public PackagePickupResponse getPackagePickupResponse() {
        return packagePickupResponse;
    }

    /**
     * Define el valor de la propiedad packagePickupResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagePickupResponse }
     *     
     */
    public void setPackagePickupResponse(PackagePickupResponse value) {
        this.packagePickupResponse = value;
    }

}
