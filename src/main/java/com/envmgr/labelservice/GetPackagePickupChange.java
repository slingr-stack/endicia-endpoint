
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
 *         &lt;element name="PackagePickupChangeRequest" type="{www.envmgr.com/LabelService}PackagePickupChangeRequest" minOccurs="0"/&gt;
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
    "packagePickupChangeRequest"
})
@XmlRootElement(name = "GetPackagePickupChange")
public class GetPackagePickupChange {

    @XmlElement(name = "PackagePickupChangeRequest")
    protected PackagePickupChangeRequest packagePickupChangeRequest;

    /**
     * Obtiene el valor de la propiedad packagePickupChangeRequest.
     * 
     * @return
     *     possible object is
     *     {@link PackagePickupChangeRequest }
     *     
     */
    public PackagePickupChangeRequest getPackagePickupChangeRequest() {
        return packagePickupChangeRequest;
    }

    /**
     * Define el valor de la propiedad packagePickupChangeRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagePickupChangeRequest }
     *     
     */
    public void setPackagePickupChangeRequest(PackagePickupChangeRequest value) {
        this.packagePickupChangeRequest = value;
    }

}
