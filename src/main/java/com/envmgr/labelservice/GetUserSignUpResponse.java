
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserSignUpResponse" type="{www.envmgr.com/LabelService}UserSignUpResponse" minOccurs="0"/&gt;
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
    "userSignUpResponse"
})
@XmlRootElement(name = "GetUserSignUpResponse")
public class GetUserSignUpResponse {

    @XmlElement(name = "UserSignUpResponse")
    protected UserSignUpResponse userSignUpResponse;

    /**
     * Gets the value of the userSignUpResponse property.
     * 
     * @return
     *     possible object is
     *     {@link UserSignUpResponse }
     *     
     */
    public UserSignUpResponse getUserSignUpResponse() {
        return userSignUpResponse;
    }

    /**
     * Sets the value of the userSignUpResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserSignUpResponse }
     *     
     */
    public void setUserSignUpResponse(UserSignUpResponse value) {
        this.userSignUpResponse = value;
    }

}
