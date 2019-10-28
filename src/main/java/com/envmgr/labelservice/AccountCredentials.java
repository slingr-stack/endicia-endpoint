
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountCredentials complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the webPassword property.
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
     * Sets the value of the webPassword property.
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
     * Gets the value of the temporaryPassPhrase property.
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
     * Sets the value of the temporaryPassPhrase property.
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
     * Gets the value of the securityQuestion property.
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
     * Sets the value of the securityQuestion property.
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
     * Gets the value of the securityAnswer property.
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
     * Sets the value of the securityAnswer property.
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
