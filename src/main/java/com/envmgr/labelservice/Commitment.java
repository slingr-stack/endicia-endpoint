
package com.envmgr.labelservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Commitment complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Commitment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CommitmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CommitmentTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{www.envmgr.com/LabelService}Location" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Commitment", propOrder = {
    "commitmentName",
    "commitmentTime",
    "location"
})
public class Commitment {

    @XmlElement(name = "CommitmentName")
    protected String commitmentName;
    @XmlElement(name = "CommitmentTime")
    protected String commitmentTime;
    @XmlElement(name = "Location")
    protected List<Location> location;

    /**
     * Obtiene el valor de la propiedad commitmentName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitmentName() {
        return commitmentName;
    }

    /**
     * Define el valor de la propiedad commitmentName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitmentName(String value) {
        this.commitmentName = value;
    }

    /**
     * Obtiene el valor de la propiedad commitmentTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitmentTime() {
        return commitmentTime;
    }

    /**
     * Define el valor de la propiedad commitmentTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitmentTime(String value) {
        this.commitmentTime = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Location }
     * 
     * 
     */
    public List<Location> getLocation() {
        if (location == null) {
            location = new ArrayList<Location>();
        }
        return this.location;
    }

}
