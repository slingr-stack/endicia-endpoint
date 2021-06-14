
package com.envmgr.labelservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PostageRateResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PostageRateResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Postage" type="{www.envmgr.com/LabelService}PostageRate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PostagePrice" type="{www.envmgr.com/LabelService}PostagePrice" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PriorityMailExpressCommitments" type="{www.envmgr.com/LabelService}ArrayOfCommitment" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostageRateResponse", propOrder = {
    "status",
    "errorMessage",
    "zone",
    "postage",
    "postagePrice",
    "priorityMailExpressCommitments"
})
public class PostageRateResponse {

    @XmlElement(name = "Status")
    protected int status;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "Zone")
    protected String zone;
    @XmlElement(name = "Postage")
    protected List<PostageRate> postage;
    @XmlElement(name = "PostagePrice")
    protected List<PostagePrice> postagePrice;
    @XmlElement(name = "PriorityMailExpressCommitments")
    protected ArrayOfCommitment priorityMailExpressCommitments;

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

    /**
     * Obtiene el valor de la propiedad zone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZone() {
        return zone;
    }

    /**
     * Define el valor de la propiedad zone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZone(String value) {
        this.zone = value;
    }

    /**
     * Gets the value of the postage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostageRate }
     * 
     * 
     */
    public List<PostageRate> getPostage() {
        if (postage == null) {
            postage = new ArrayList<PostageRate>();
        }
        return this.postage;
    }

    /**
     * Gets the value of the postagePrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postagePrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostagePrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostagePrice }
     * 
     * 
     */
    public List<PostagePrice> getPostagePrice() {
        if (postagePrice == null) {
            postagePrice = new ArrayList<PostagePrice>();
        }
        return this.postagePrice;
    }

    /**
     * Obtiene el valor de la propiedad priorityMailExpressCommitments.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommitment }
     *     
     */
    public ArrayOfCommitment getPriorityMailExpressCommitments() {
        return priorityMailExpressCommitments;
    }

    /**
     * Define el valor de la propiedad priorityMailExpressCommitments.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommitment }
     *     
     */
    public void setPriorityMailExpressCommitments(ArrayOfCommitment value) {
        this.priorityMailExpressCommitments = value;
    }

}
