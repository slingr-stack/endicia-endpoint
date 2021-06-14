
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
 *         &lt;element name="SetAccountFeatureOptInResponse" type="{www.envmgr.com/LabelService}SetAccountFeatureOptInResult" minOccurs="0"/&gt;
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
    "setAccountFeatureOptInResponse"
})
@XmlRootElement(name = "SetAccountFeatureOptInResponse")
public class SetAccountFeatureOptInResponse {

    @XmlElement(name = "SetAccountFeatureOptInResponse")
    protected SetAccountFeatureOptInResult setAccountFeatureOptInResponse;

    /**
     * Obtiene el valor de la propiedad setAccountFeatureOptInResponse.
     * 
     * @return
     *     possible object is
     *     {@link SetAccountFeatureOptInResult }
     *     
     */
    public SetAccountFeatureOptInResult getSetAccountFeatureOptInResponse() {
        return setAccountFeatureOptInResponse;
    }

    /**
     * Define el valor de la propiedad setAccountFeatureOptInResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link SetAccountFeatureOptInResult }
     *     
     */
    public void setSetAccountFeatureOptInResponse(SetAccountFeatureOptInResult value) {
        this.setAccountFeatureOptInResponse = value;
    }

}
