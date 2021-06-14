
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
 *         &lt;element name="VoidLabelRequest" type="{www.envmgr.com/LabelService}VoidLabelRequest" minOccurs="0"/&gt;
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
    "voidLabelRequest"
})
@XmlRootElement(name = "VoideVSLabel")
public class VoideVSLabel {

    @XmlElement(name = "VoidLabelRequest")
    protected VoidLabelRequest voidLabelRequest;

    /**
     * Obtiene el valor de la propiedad voidLabelRequest.
     * 
     * @return
     *     possible object is
     *     {@link VoidLabelRequest }
     *     
     */
    public VoidLabelRequest getVoidLabelRequest() {
        return voidLabelRequest;
    }

    /**
     * Define el valor de la propiedad voidLabelRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link VoidLabelRequest }
     *     
     */
    public void setVoidLabelRequest(VoidLabelRequest value) {
        this.voidLabelRequest = value;
    }

}
