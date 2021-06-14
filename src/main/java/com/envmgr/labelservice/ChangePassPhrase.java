
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
 *         &lt;element name="ChangePassPhraseRequest" type="{www.envmgr.com/LabelService}ChangePassPhraseRequest" minOccurs="0"/&gt;
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
    "changePassPhraseRequest"
})
@XmlRootElement(name = "ChangePassPhrase")
public class ChangePassPhrase {

    @XmlElement(name = "ChangePassPhraseRequest")
    protected ChangePassPhraseRequest changePassPhraseRequest;

    /**
     * Obtiene el valor de la propiedad changePassPhraseRequest.
     * 
     * @return
     *     possible object is
     *     {@link ChangePassPhraseRequest }
     *     
     */
    public ChangePassPhraseRequest getChangePassPhraseRequest() {
        return changePassPhraseRequest;
    }

    /**
     * Define el valor de la propiedad changePassPhraseRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangePassPhraseRequest }
     *     
     */
    public void setChangePassPhraseRequest(ChangePassPhraseRequest value) {
        this.changePassPhraseRequest = value;
    }

}
