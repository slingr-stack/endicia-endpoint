
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
 *         &lt;element name="CloseAccountRequestXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "closeAccountRequestXML"
})
@XmlRootElement(name = "CloseAccountXML")
public class CloseAccountXML {

    @XmlElement(name = "CloseAccountRequestXML")
    protected String closeAccountRequestXML;

    /**
     * Obtiene el valor de la propiedad closeAccountRequestXML.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloseAccountRequestXML() {
        return closeAccountRequestXML;
    }

    /**
     * Define el valor de la propiedad closeAccountRequestXML.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloseAccountRequestXML(String value) {
        this.closeAccountRequestXML = value;
    }

}
