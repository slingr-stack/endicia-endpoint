
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
 *         &lt;element name="ChallengeQuestionRequest" type="{www.envmgr.com/LabelService}ChallengeQuestionRequest" minOccurs="0"/&gt;
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
    "challengeQuestionRequest"
})
@XmlRootElement(name = "GetChallengeQuestion")
public class GetChallengeQuestion {

    @XmlElement(name = "ChallengeQuestionRequest")
    protected ChallengeQuestionRequest challengeQuestionRequest;

    /**
     * Obtiene el valor de la propiedad challengeQuestionRequest.
     * 
     * @return
     *     possible object is
     *     {@link ChallengeQuestionRequest }
     *     
     */
    public ChallengeQuestionRequest getChallengeQuestionRequest() {
        return challengeQuestionRequest;
    }

    /**
     * Define el valor de la propiedad challengeQuestionRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ChallengeQuestionRequest }
     *     
     */
    public void setChallengeQuestionRequest(ChallengeQuestionRequest value) {
        this.challengeQuestionRequest = value;
    }

}
