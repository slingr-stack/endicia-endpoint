
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
 *         &lt;element name="ChangePassPhraseRequestResponse" type="{www.envmgr.com/LabelService}ChangePassPhraseRequestResponse" minOccurs="0"/&gt;
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
    "changePassPhraseRequestResponse"
})
@XmlRootElement(name = "ChangePassPhraseResponse")
public class ChangePassPhraseResponse {

    @XmlElement(name = "ChangePassPhraseRequestResponse")
    protected ChangePassPhraseRequestResponse changePassPhraseRequestResponse;

    /**
     * Obtiene el valor de la propiedad changePassPhraseRequestResponse.
     * 
     * @return
     *     possible object is
     *     {@link ChangePassPhraseRequestResponse }
     *     
     */
    public ChangePassPhraseRequestResponse getChangePassPhraseRequestResponse() {
        return changePassPhraseRequestResponse;
    }

    /**
     * Define el valor de la propiedad changePassPhraseRequestResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangePassPhraseRequestResponse }
     *     
     */
    public void setChangePassPhraseRequestResponse(ChangePassPhraseRequestResponse value) {
        this.changePassPhraseRequestResponse = value;
    }

}
