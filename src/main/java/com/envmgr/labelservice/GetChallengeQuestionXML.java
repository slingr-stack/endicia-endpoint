
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
 *         &lt;element name="ChallengeQuestionRequestXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "challengeQuestionRequestXML"
})
@XmlRootElement(name = "GetChallengeQuestionXML")
public class GetChallengeQuestionXML {

    @XmlElement(name = "ChallengeQuestionRequestXML")
    protected String challengeQuestionRequestXML;

    /**
     * Obtiene el valor de la propiedad challengeQuestionRequestXML.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallengeQuestionRequestXML() {
        return challengeQuestionRequestXML;
    }

    /**
     * Define el valor de la propiedad challengeQuestionRequestXML.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallengeQuestionRequestXML(String value) {
        this.challengeQuestionRequestXML = value;
    }

}
