
package com.envmgr.labelservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostageRateTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostageRateTable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MailClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntraBMC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pricing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Postage" type="{www.envmgr.com/LabelService}PostageWeightRatePair" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostageRateTable", propOrder = {
    "mailClass",
    "zone",
    "intraBMC",
    "pricing",
    "postage"
})
public class PostageRateTable {

    @XmlElement(name = "MailClass")
    protected String mailClass;
    @XmlElement(name = "Zone")
    protected String zone;
    @XmlElement(name = "IntraBMC")
    protected String intraBMC;
    @XmlElement(name = "Pricing")
    protected String pricing;
    @XmlElement(name = "Postage")
    protected List<PostageWeightRatePair> postage;

    /**
     * Gets the value of the mailClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailClass() {
        return mailClass;
    }

    /**
     * Sets the value of the mailClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailClass(String value) {
        this.mailClass = value;
    }

    /**
     * Gets the value of the zone property.
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
     * Sets the value of the zone property.
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
     * Gets the value of the intraBMC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntraBMC() {
        return intraBMC;
    }

    /**
     * Sets the value of the intraBMC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntraBMC(String value) {
        this.intraBMC = value;
    }

    /**
     * Gets the value of the pricing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricing() {
        return pricing;
    }

    /**
     * Sets the value of the pricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricing(String value) {
        this.pricing = value;
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
     * {@link PostageWeightRatePair }
     * 
     * 
     */
    public List<PostageWeightRatePair> getPostage() {
        if (postage == null) {
            postage = new ArrayList<PostageWeightRatePair>();
        }
        return this.postage;
    }

}
