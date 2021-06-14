
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
 *         &lt;element name="LabelNumberResponse" type="{www.envmgr.com/LabelService}LabelNumberResponse" minOccurs="0"/&gt;
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
    "labelNumberResponse"
})
@XmlRootElement(name = "GetPicNumberXmlResponse")
public class GetPicNumberXmlResponse {

    @XmlElement(name = "LabelNumberResponse")
    protected LabelNumberResponse labelNumberResponse;

    /**
     * Obtiene el valor de la propiedad labelNumberResponse.
     * 
     * @return
     *     possible object is
     *     {@link LabelNumberResponse }
     *     
     */
    public LabelNumberResponse getLabelNumberResponse() {
        return labelNumberResponse;
    }

    /**
     * Define el valor de la propiedad labelNumberResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelNumberResponse }
     *     
     */
    public void setLabelNumberResponse(LabelNumberResponse value) {
        this.labelNumberResponse = value;
    }

}
