
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DHLeCManifestRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DHLeCManifestRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{www.envmgr.com/LabelService}DataValidator"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{www.envmgr.com/LabelService}RequestType"/&gt;
 *         &lt;element name="TokenTimeStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManifestParameters" type="{www.envmgr.com/LabelService}DHLeCManifestRequestParameters" minOccurs="0"/&gt;
 *         &lt;element name="CertifiedIntermediary" type="{www.envmgr.com/LabelService}CertifiedIntermediary" minOccurs="0"/&gt;
 *         &lt;element name="ManifestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DHLeCManifestRequest", propOrder = {
    "type",
    "tokenTimeStamp",
    "manifestParameters",
    "certifiedIntermediary",
    "manifestID"
})
public class DHLeCManifestRequest
    extends DataValidator
{

    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected RequestType type;
    @XmlElement(name = "TokenTimeStamp")
    protected String tokenTimeStamp;
    @XmlElement(name = "ManifestParameters")
    protected DHLeCManifestRequestParameters manifestParameters;
    @XmlElement(name = "CertifiedIntermediary")
    protected CertifiedIntermediary certifiedIntermediary;
    @XmlElement(name = "ManifestID")
    protected String manifestID;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setType(RequestType value) {
        this.type = value;
    }

    /**
     * Gets the value of the tokenTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenTimeStamp() {
        return tokenTimeStamp;
    }

    /**
     * Sets the value of the tokenTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenTimeStamp(String value) {
        this.tokenTimeStamp = value;
    }

    /**
     * Gets the value of the manifestParameters property.
     * 
     * @return
     *     possible object is
     *     {@link DHLeCManifestRequestParameters }
     *     
     */
    public DHLeCManifestRequestParameters getManifestParameters() {
        return manifestParameters;
    }

    /**
     * Sets the value of the manifestParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link DHLeCManifestRequestParameters }
     *     
     */
    public void setManifestParameters(DHLeCManifestRequestParameters value) {
        this.manifestParameters = value;
    }

    /**
     * Gets the value of the certifiedIntermediary property.
     * 
     * @return
     *     possible object is
     *     {@link CertifiedIntermediary }
     *     
     */
    public CertifiedIntermediary getCertifiedIntermediary() {
        return certifiedIntermediary;
    }

    /**
     * Sets the value of the certifiedIntermediary property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertifiedIntermediary }
     *     
     */
    public void setCertifiedIntermediary(CertifiedIntermediary value) {
        this.certifiedIntermediary = value;
    }

    /**
     * Gets the value of the manifestID property.
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
     * Sets the value of the manifestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManifestID(String value) {
        this.manifestID = value;
    }

}
