
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
 *         &lt;element name="ChallengeQuestionResponse" type="{www.envmgr.com/LabelService}ChallengeQuestionResponse" minOccurs="0"/&gt;
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
    "challengeQuestionResponse"
})
@XmlRootElement(name = "GetChallengeQuestionXMLResponse")
public class GetChallengeQuestionXMLResponse {

    @XmlElement(name = "ChallengeQuestionResponse")
    protected ChallengeQuestionResponse challengeQuestionResponse;

    /**
     * Obtiene el valor de la propiedad challengeQuestionResponse.
     * 
     * @return
     *     possible object is
     *     {@link ChallengeQuestionResponse }
     *     
     */
    public ChallengeQuestionResponse getChallengeQuestionResponse() {
        return challengeQuestionResponse;
    }

    /**
     * Define el valor de la propiedad challengeQuestionResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link ChallengeQuestionResponse }
     *     
     */
    public void setChallengeQuestionResponse(ChallengeQuestionResponse value) {
        this.challengeQuestionResponse = value;
    }

}
