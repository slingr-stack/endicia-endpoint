
package com.envmgr.labelservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfDpvFootnote complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDpvFootnote"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DpvFootnote" type="{www.envmgr.com/LabelService}DpvFootnote" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDpvFootnote", propOrder = {
    "dpvFootnote"
})
public class ArrayOfDpvFootnote {

    @XmlElement(name = "DpvFootnote", nillable = true)
    protected List<DpvFootnote> dpvFootnote;

    /**
     * Gets the value of the dpvFootnote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dpvFootnote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDpvFootnote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DpvFootnote }
     * 
     * 
     */
    public List<DpvFootnote> getDpvFootnote() {
        if (dpvFootnote == null) {
            dpvFootnote = new ArrayList<DpvFootnote>();
        }
        return this.dpvFootnote;
    }

}
