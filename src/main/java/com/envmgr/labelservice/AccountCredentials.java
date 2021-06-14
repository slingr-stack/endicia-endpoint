
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AccountCredentials complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccountCredentials"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{www.envmgr.com/LabelService}DataValidator"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WebPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TemporaryPassPhrase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecurityQuestion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecurityAnswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountCredentials", propOrder = {
    "webPassword",
    "temporaryPassPhrase",
    "securityQuestion",
    "securityAnswer"
})
public class AccountCredentials
    extends DataValidator
{

    @XmlElement(name = "WebPassword")
    protected String webPassword;
    @XmlElement(name = "TemporaryPassPhrase")
    protected String temporaryPassPhrase;
    @XmlElement(name = "SecurityQuestion")
    protected String securityQuestion;
    @XmlElement(name = "SecurityAnswer")
    protected String securityAnswer;

    /**
     * Obtiene el valor de la propiedad webPassword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebPassword() {
        return webPassword;
    }

    /**
     * Define el valor de la propiedad webPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebPassword(String value) {
        this.webPassword = value;
    }

    /**
     * Obtiene el valor de la propiedad temporaryPassPhrase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemporaryPassPhrase() {
        return temporaryPassPhrase;
    }

    /**
     * Define el valor de la propiedad temporaryPassPhrase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemporaryPassPhrase(String value) {
        this.temporaryPassPhrase = value;
    }

    /**
     * Obtiene el valor de la propiedad securityQuestion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityQuestion() {
        return securityQuestion;
    }

    /**
     * Define el valor de la propiedad securityQuestion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityQuestion(String value) {
        this.securityQuestion = value;
    }

    /**
     * Obtiene el valor de la propiedad securityAnswer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityAnswer() {
        return securityAnswer;
    }

    /**
     * Define el valor de la propiedad securityAnswer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityAnswer(String value) {
        this.securityAnswer = value;
    }

}
