
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
 *         &lt;element name="CreateManifestResponse" type="{www.envmgr.com/LabelService}CreateManifestResponse" minOccurs="0"/&gt;
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
    "createManifestResponse"
})
@XmlRootElement(name = "CreateManifestResponse")
public class CreateManifestResponse {

    @XmlElement(name = "CreateManifestResponse")
    protected CreateManifestResponseComplex createManifestResponse;

    /**
     * Obtiene el valor de la propiedad createManifestResponse.
     * 
     * @return
     *     possible object is
     *     {@link CreateManifestResponseComplex }
     *     
     */
    public CreateManifestResponseComplex getCreateManifestResponse() {
        return createManifestResponse;
    }

    /**
     * Define el valor de la propiedad createManifestResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateManifestResponseComplex }
     *     
     */
    public void setCreateManifestResponse(CreateManifestResponseComplex value) {
        this.createManifestResponse = value;
    }

}
