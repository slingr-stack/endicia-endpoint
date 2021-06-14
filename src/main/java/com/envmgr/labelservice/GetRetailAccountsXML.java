
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
 *         &lt;element name="RetailAccountsRequestXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "retailAccountsRequestXML"
})
@XmlRootElement(name = "GetRetailAccountsXML")
public class GetRetailAccountsXML {

    @XmlElement(name = "RetailAccountsRequestXML")
    protected String retailAccountsRequestXML;

    /**
     * Obtiene el valor de la propiedad retailAccountsRequestXML.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetailAccountsRequestXML() {
        return retailAccountsRequestXML;
    }

    /**
     * Define el valor de la propiedad retailAccountsRequestXML.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetailAccountsRequestXML(String value) {
        this.retailAccountsRequestXML = value;
    }

}
