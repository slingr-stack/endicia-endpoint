
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
 *         &lt;element name="CreateManifestRequest" type="{www.envmgr.com/LabelService}CreateManifestRequest" minOccurs="0"/&gt;
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
    "createManifestRequest"
})
@XmlRootElement(name = "CreateManifest")
public class CreateManifest {

    @XmlElement(name = "CreateManifestRequest")
    protected CreateManifestRequest createManifestRequest;

    /**
     * Obtiene el valor de la propiedad createManifestRequest.
     * 
     * @return
     *     possible object is
     *     {@link CreateManifestRequest }
     *     
     */
    public CreateManifestRequest getCreateManifestRequest() {
        return createManifestRequest;
    }

    /**
     * Define el valor de la propiedad createManifestRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateManifestRequest }
     *     
     */
    public void setCreateManifestRequest(CreateManifestRequest value) {
        this.createManifestRequest = value;
    }

}
