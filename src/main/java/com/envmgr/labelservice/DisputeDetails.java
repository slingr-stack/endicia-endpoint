
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DisputeDetails complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DisputeDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisputeStatus" type="{www.envmgr.com/LabelService}DisputeStatus"/&gt;
 *         &lt;element name="DisputeCreateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisputeLastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeDetails", propOrder = {
    "disputeStatus",
    "disputeCreateDate",
    "disputeLastUpdateDate"
})
public class DisputeDetails {

    @XmlElement(name = "DisputeStatus", required = true)
    @XmlSchemaType(name = "string")
    protected DisputeStatus disputeStatus;
    @XmlElement(name = "DisputeCreateDate")
    protected String disputeCreateDate;
    @XmlElement(name = "DisputeLastUpdateDate")
    protected String disputeLastUpdateDate;

    /**
     * Obtiene el valor de la propiedad disputeStatus.
     * 
     * @return
     *     possible object is
     *     {@link DisputeStatus }
     *     
     */
    public DisputeStatus getDisputeStatus() {
        return disputeStatus;
    }

    /**
     * Define el valor de la propiedad disputeStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeStatus }
     *     
     */
    public void setDisputeStatus(DisputeStatus value) {
        this.disputeStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad disputeCreateDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisputeCreateDate() {
        return disputeCreateDate;
    }

    /**
     * Define el valor de la propiedad disputeCreateDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputeCreateDate(String value) {
        this.disputeCreateDate = value;
    }

    /**
     * Obtiene el valor de la propiedad disputeLastUpdateDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisputeLastUpdateDate() {
        return disputeLastUpdateDate;
    }

    /**
     * Define el valor de la propiedad disputeLastUpdateDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputeLastUpdateDate(String value) {
        this.disputeLastUpdateDate = value;
    }

}
