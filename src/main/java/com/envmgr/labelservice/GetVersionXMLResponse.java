
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
 *         &lt;element name="GetVersionResults" type="{www.envmgr.com/LabelService}GetVersionResults" minOccurs="0"/&gt;
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
    "getVersionResults"
})
@XmlRootElement(name = "GetVersionXMLResponse")
public class GetVersionXMLResponse {

    @XmlElement(name = "GetVersionResults")
    protected GetVersionResults getVersionResults;

    /**
     * Obtiene el valor de la propiedad getVersionResults.
     * 
     * @return
     *     possible object is
     *     {@link GetVersionResults }
     *     
     */
    public GetVersionResults getGetVersionResults() {
        return getVersionResults;
    }

    /**
     * Define el valor de la propiedad getVersionResults.
     * 
     * @param value
     *     allowed object is
     *     {@link GetVersionResults }
     *     
     */
    public void setGetVersionResults(GetVersionResults value) {
        this.getVersionResults = value;
    }

}
