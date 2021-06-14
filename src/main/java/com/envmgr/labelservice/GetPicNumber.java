
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
 *         &lt;element name="PicNumberRequest" type="{www.envmgr.com/LabelService}PicNumberRequest" minOccurs="0"/&gt;
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
    "picNumberRequest"
})
@XmlRootElement(name = "GetPicNumber")
public class GetPicNumber {

    @XmlElement(name = "PicNumberRequest")
    protected PicNumberRequest picNumberRequest;

    /**
     * Obtiene el valor de la propiedad picNumberRequest.
     * 
     * @return
     *     possible object is
     *     {@link PicNumberRequest }
     *     
     */
    public PicNumberRequest getPicNumberRequest() {
        return picNumberRequest;
    }

    /**
     * Define el valor de la propiedad picNumberRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link PicNumberRequest }
     *     
     */
    public void setPicNumberRequest(PicNumberRequest value) {
        this.picNumberRequest = value;
    }

}
