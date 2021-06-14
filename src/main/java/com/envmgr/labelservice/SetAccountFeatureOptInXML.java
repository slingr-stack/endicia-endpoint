
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
 *         &lt;element name="SetAccountFeatureOptInRequestXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "setAccountFeatureOptInRequestXML"
})
@XmlRootElement(name = "SetAccountFeatureOptInXML")
public class SetAccountFeatureOptInXML {

    @XmlElement(name = "SetAccountFeatureOptInRequestXML")
    protected String setAccountFeatureOptInRequestXML;

    /**
     * Obtiene el valor de la propiedad setAccountFeatureOptInRequestXML.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetAccountFeatureOptInRequestXML() {
        return setAccountFeatureOptInRequestXML;
    }

    /**
     * Define el valor de la propiedad setAccountFeatureOptInRequestXML.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetAccountFeatureOptInRequestXML(String value) {
        this.setAccountFeatureOptInRequestXML = value;
    }

}
