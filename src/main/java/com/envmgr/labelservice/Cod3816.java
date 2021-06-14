
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Cod3816 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Cod3816"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AS3816" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USPSCA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PMExpressReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OptionalEndorsement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cod3816", propOrder = {
    "as3816",
    "uspsca",
    "pmExpressReturn",
    "optionalEndorsement",
    "returnName",
    "returnCompany",
    "returnAddress1",
    "returnAddress2",
    "returnCity",
    "returnState",
    "returnPostalCode"
})
public class Cod3816 {

    @XmlElement(name = "AS3816")
    protected String as3816;
    @XmlElement(name = "USPSCA")
    protected String uspsca;
    @XmlElement(name = "PMExpressReturn")
    protected String pmExpressReturn;
    @XmlElement(name = "OptionalEndorsement")
    protected String optionalEndorsement;
    @XmlElement(name = "ReturnName")
    protected String returnName;
    @XmlElement(name = "ReturnCompany")
    protected String returnCompany;
    @XmlElement(name = "ReturnAddress1")
    protected String returnAddress1;
    @XmlElement(name = "ReturnAddress2")
    protected String returnAddress2;
    @XmlElement(name = "ReturnCity")
    protected String returnCity;
    @XmlElement(name = "ReturnState")
    protected String returnState;
    @XmlElement(name = "ReturnPostalCode")
    protected String returnPostalCode;

    /**
     * Obtiene el valor de la propiedad as3816.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAS3816() {
        return as3816;
    }

    /**
     * Define el valor de la propiedad as3816.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAS3816(String value) {
        this.as3816 = value;
    }

    /**
     * Obtiene el valor de la propiedad uspsca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSPSCA() {
        return uspsca;
    }

    /**
     * Define el valor de la propiedad uspsca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSPSCA(String value) {
        this.uspsca = value;
    }

    /**
     * Obtiene el valor de la propiedad pmExpressReturn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMExpressReturn() {
        return pmExpressReturn;
    }

    /**
     * Define el valor de la propiedad pmExpressReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMExpressReturn(String value) {
        this.pmExpressReturn = value;
    }

    /**
     * Obtiene el valor de la propiedad optionalEndorsement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalEndorsement() {
        return optionalEndorsement;
    }

    /**
     * Define el valor de la propiedad optionalEndorsement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionalEndorsement(String value) {
        this.optionalEndorsement = value;
    }

    /**
     * Obtiene el valor de la propiedad returnName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnName() {
        return returnName;
    }

    /**
     * Define el valor de la propiedad returnName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnName(String value) {
        this.returnName = value;
    }

    /**
     * Obtiene el valor de la propiedad returnCompany.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCompany() {
        return returnCompany;
    }

    /**
     * Define el valor de la propiedad returnCompany.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCompany(String value) {
        this.returnCompany = value;
    }

    /**
     * Obtiene el valor de la propiedad returnAddress1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnAddress1() {
        return returnAddress1;
    }

    /**
     * Define el valor de la propiedad returnAddress1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnAddress1(String value) {
        this.returnAddress1 = value;
    }

    /**
     * Obtiene el valor de la propiedad returnAddress2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnAddress2() {
        return returnAddress2;
    }

    /**
     * Define el valor de la propiedad returnAddress2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnAddress2(String value) {
        this.returnAddress2 = value;
    }

    /**
     * Obtiene el valor de la propiedad returnCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCity() {
        return returnCity;
    }

    /**
     * Define el valor de la propiedad returnCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCity(String value) {
        this.returnCity = value;
    }

    /**
     * Obtiene el valor de la propiedad returnState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnState() {
        return returnState;
    }

    /**
     * Define el valor de la propiedad returnState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnState(String value) {
        this.returnState = value;
    }

    /**
     * Obtiene el valor de la propiedad returnPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnPostalCode() {
        return returnPostalCode;
    }

    /**
     * Define el valor de la propiedad returnPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnPostalCode(String value) {
        this.returnPostalCode = value;
    }

}
