
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the disputeStatus property.
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
     * Sets the value of the disputeStatus property.
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
     * Gets the value of the disputeCreateDate property.
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
     * Sets the value of the disputeCreateDate property.
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
     * Gets the value of the disputeLastUpdateDate property.
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
     * Sets the value of the disputeLastUpdateDate property.
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
