
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResellerInformation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResellerInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="DeviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerEndUserId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResellerInformation", propOrder = {
    "accountId",
    "deviceId",
    "customerEndUserId"
})
public class ResellerInformation {

    @XmlElement(name = "AccountId")
    protected long accountId;
    @XmlElement(name = "DeviceId")
    protected String deviceId;
    @XmlElement(name = "CustomerEndUserId")
    protected int customerEndUserId;

    /**
     * Obtiene el valor de la propiedad accountId.
     * 
     */
    public long getAccountId() {
        return accountId;
    }

    /**
     * Define el valor de la propiedad accountId.
     * 
     */
    public void setAccountId(long value) {
        this.accountId = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Define el valor de la propiedad deviceId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Obtiene el valor de la propiedad customerEndUserId.
     * 
     */
    public int getCustomerEndUserId() {
        return customerEndUserId;
    }

    /**
     * Define el valor de la propiedad customerEndUserId.
     * 
     */
    public void setCustomerEndUserId(int value) {
        this.customerEndUserId = value;
    }

}
