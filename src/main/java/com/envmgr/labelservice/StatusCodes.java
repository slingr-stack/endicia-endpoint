
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para StatusCodes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad footnotes.
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
     * Define el valor de la propiedad footnotes.
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
     * Obtiene el valor de la propiedad dpvFootnotes.
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
     * Define el valor de la propiedad dpvFootnotes.
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
     * Obtiene el valor de la propiedad returnCode.
     * 
     */
    public int getReturnCode() {
        return returnCode;
    }

    /**
     * Define el valor de la propiedad returnCode.
     * 
     */
    public void setReturnCode(int value) {
        this.returnCode = value;
    }

}
