
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
 *         &lt;element name="PackagePickupListRequest" type="{www.envmgr.com/LabelService}PackagePickupListRequest" minOccurs="0"/&gt;
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
    "packagePickupListRequest"
})
@XmlRootElement(name = "GetPackagePickupList")
public class GetPackagePickupList {

    @XmlElement(name = "PackagePickupListRequest")
    protected PackagePickupListRequest packagePickupListRequest;

    /**
     * Obtiene el valor de la propiedad packagePickupListRequest.
     * 
     * @return
     *     possible object is
     *     {@link PackagePickupListRequest }
     *     
     */
    public PackagePickupListRequest getPackagePickupListRequest() {
        return packagePickupListRequest;
    }

    /**
     * Define el valor de la propiedad packagePickupListRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagePickupListRequest }
     *     
     */
    public void setPackagePickupListRequest(PackagePickupListRequest value) {
        this.packagePickupListRequest = value;
    }

}
