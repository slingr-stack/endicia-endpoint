
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusCodes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusCodes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="footnotes" type="{www.envmgr.com/LabelService}ArrayOfFootnote" minOccurs="0"/&gt;
 *         &lt;element name="dpvFootnotes" type="{www.envmgr.com/LabelService}ArrayOfDpvFootnote" minOccurs="0"/&gt;
 *         &lt;element name="ReturnCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusCodes", propOrder = {
    "footnotes",
    "dpvFootnotes",
    "returnCode"
})
public class StatusCodes {

    protected ArrayOfFootnote footnotes;
    protected ArrayOfDpvFootnote dpvFootnotes;
    @XmlElement(name = "ReturnCode")
    protected int returnCode;

    /**
     * Gets the value of the footnotes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFootnote }
     *     
     */
    public ArrayOfFootnote getFootnotes() {
        return footnotes;
    }

    /**
     * Sets the value of the footnotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFootnote }
     *     
     */
    public void setFootnotes(ArrayOfFootnote value) {
        this.footnotes = value;
    }

    /**
     * Gets the value of the dpvFootnotes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDpvFootnote }
     *     
     */
    public ArrayOfDpvFootnote getDpvFootnotes() {
        return dpvFootnotes;
    }

    /**
     * Sets the value of the dpvFootnotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDpvFootnote }
     *     
     */
    public void setDpvFootnotes(ArrayOfDpvFootnote value) {
        this.dpvFootnotes = value;
    }

    /**
     * Gets the value of the returnCode property.
     * 
     */
    public int getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     */
    public void setReturnCode(int value) {
        this.returnCode = value;
    }

}
