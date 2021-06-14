
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CreateManifestResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CreateManifestResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManifestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManifestFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateManifestResponse", propOrder = {
    "status",
    "errorMessage",
    "manifestID",
    "manifestFile"
})
public class CreateManifestResponseComplex {

    @XmlElement(name = "Status")
    protected int status;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "ManifestID")
    protected String manifestID;
    @XmlElement(name = "ManifestFile")
    protected String manifestFile;

    /**
     * Obtiene el valor de la propiedad status.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad errorMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Define el valor de la propiedad errorMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad manifestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManifestID() {
        return manifestID;
    }

    /**
     * Define el valor de la propiedad manifestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManifestID(String value) {
        this.manifestID = value;
    }

    /**
     * Obtiene el valor de la propiedad manifestFile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManifestFile() {
        return manifestFile;
    }

    /**
     * Define el valor de la propiedad manifestFile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManifestFile(String value) {
        this.manifestFile = value;
    }

}
