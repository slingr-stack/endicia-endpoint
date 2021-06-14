
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
 *         &lt;element name="VoidLabelResponse" type="{www.envmgr.com/LabelService}VoidLabelResponse" minOccurs="0"/&gt;
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
    "voidLabelResponse"
})
@XmlRootElement(name = "VoideVSLabelXMLResponse")
public class VoideVSLabelXMLResponse {

    @XmlElement(name = "VoidLabelResponse")
    protected VoidLabelResponse voidLabelResponse;

    /**
     * Obtiene el valor de la propiedad voidLabelResponse.
     * 
     * @return
     *     possible object is
     *     {@link VoidLabelResponse }
     *     
     */
    public VoidLabelResponse getVoidLabelResponse() {
        return voidLabelResponse;
    }

    /**
     * Define el valor de la propiedad voidLabelResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link VoidLabelResponse }
     *     
     */
    public void setVoidLabelResponse(VoidLabelResponse value) {
        this.voidLabelResponse = value;
    }

}
