
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
 *         &lt;element name="LabelRequestResponse" type="{www.envmgr.com/LabelService}LabelRequestResponse" minOccurs="0"/&gt;
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
    "labelRequestResponse"
})
@XmlRootElement(name = "GetPostageLabelXMLResponse")
public class GetPostageLabelXMLResponse {

    @XmlElement(name = "LabelRequestResponse")
    protected LabelRequestResponse labelRequestResponse;

    /**
     * Obtiene el valor de la propiedad labelRequestResponse.
     * 
     * @return
     *     possible object is
     *     {@link LabelRequestResponse }
     *     
     */
    public LabelRequestResponse getLabelRequestResponse() {
        return labelRequestResponse;
    }

    /**
     * Define el valor de la propiedad labelRequestResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelRequestResponse }
     *     
     */
    public void setLabelRequestResponse(LabelRequestResponse value) {
        this.labelRequestResponse = value;
    }

}
