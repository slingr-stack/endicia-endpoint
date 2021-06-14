
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
 *         &lt;element name="PackageStatusRequest" type="{www.envmgr.com/LabelService}PackageStatusRequest" minOccurs="0"/&gt;
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
    "packageStatusRequest"
})
@XmlRootElement(name = "StatusRequest")
public class StatusRequest {

    @XmlElement(name = "PackageStatusRequest")
    protected PackageStatusRequest packageStatusRequest;

    /**
     * Obtiene el valor de la propiedad packageStatusRequest.
     * 
     * @return
     *     possible object is
     *     {@link PackageStatusRequest }
     *     
     */
    public PackageStatusRequest getPackageStatusRequest() {
        return packageStatusRequest;
    }

    /**
     * Define el valor de la propiedad packageStatusRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageStatusRequest }
     *     
     */
    public void setPackageStatusRequest(PackageStatusRequest value) {
        this.packageStatusRequest = value;
    }

}
