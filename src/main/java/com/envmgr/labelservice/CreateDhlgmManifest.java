
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
 *         &lt;element name="CreateDhlgmManifestRequest" type="{www.envmgr.com/LabelService}CreateDhlgmManifestRequest" minOccurs="0"/&gt;
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
    "createDhlgmManifestRequest"
})
@XmlRootElement(name = "CreateDhlgmManifest")
public class CreateDhlgmManifest {

    @XmlElement(name = "CreateDhlgmManifestRequest")
    protected CreateDhlgmManifestRequest createDhlgmManifestRequest;

    /**
     * Obtiene el valor de la propiedad createDhlgmManifestRequest.
     * 
     * @return
     *     possible object is
     *     {@link CreateDhlgmManifestRequest }
     *     
     */
    public CreateDhlgmManifestRequest getCreateDhlgmManifestRequest() {
        return createDhlgmManifestRequest;
    }

    /**
     * Define el valor de la propiedad createDhlgmManifestRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateDhlgmManifestRequest }
     *     
     */
    public void setCreateDhlgmManifestRequest(CreateDhlgmManifestRequest value) {
        this.createDhlgmManifestRequest = value;
    }

}
