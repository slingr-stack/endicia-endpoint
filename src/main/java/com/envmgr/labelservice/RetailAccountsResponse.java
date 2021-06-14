
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RetailAccountsResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RetailAccountsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetailAccounts" type="{www.envmgr.com/LabelService}ArrayOfRetailAccount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Status" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailAccountsResponse", propOrder = {
    "retailAccounts"
})
public class RetailAccountsResponse {

    @XmlElement(name = "RetailAccounts")
    protected ArrayOfRetailAccount retailAccounts;
    @XmlAttribute(name = "Status", required = true)
    protected int status;
    @XmlAttribute(name = "ErrorMessage")
    protected String errorMessage;

    /**
     * Obtiene el valor de la propiedad retailAccounts.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRetailAccount }
     *     
     */
    public ArrayOfRetailAccount getRetailAccounts() {
        return retailAccounts;
    }

    /**
     * Define el valor de la propiedad retailAccounts.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRetailAccount }
     *     
     */
    public void setRetailAccounts(ArrayOfRetailAccount value) {
        this.retailAccounts = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad errorMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Define el valor de la propiedad errorMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

}
