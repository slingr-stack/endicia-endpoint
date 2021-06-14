
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
 *         &lt;element name="CreateDhlgmManifestResponse" type="{www.envmgr.com/LabelService}DhlgmManifestResponse" minOccurs="0"/&gt;
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
    "createDhlgmManifestResponse"
})
@XmlRootElement(name = "CreateDhlgmManifestXMLResponse")
public class CreateDhlgmManifestXMLResponse {

    @XmlElement(name = "CreateDhlgmManifestResponse")
    protected DhlgmManifestResponse createDhlgmManifestResponse;

    /**
     * Obtiene el valor de la propiedad createDhlgmManifestResponse.
     * 
     * @return
     *     possible object is
     *     {@link DhlgmManifestResponse }
     *     
     */
    public DhlgmManifestResponse getCreateDhlgmManifestResponse() {
        return createDhlgmManifestResponse;
    }

    /**
     * Define el valor de la propiedad createDhlgmManifestResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link DhlgmManifestResponse }
     *     
     */
    public void setCreateDhlgmManifestResponse(DhlgmManifestResponse value) {
        this.createDhlgmManifestResponse = value;
    }

}
