
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
     * Obtiene el valor de la propiedad userSignUpResponse.
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
     * Define el valor de la propiedad userSignUpResponse.
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
