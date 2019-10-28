
package com.envmgr.labelservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStatusEventList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStatusEventList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusEventList" type="{www.envmgr.com/LabelService}StatusEventList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStatusEventList", propOrder = {
    "statusEventList"
})
public class ArrayOfStatusEventList {

    @XmlElement(name = "StatusEventList", nillable = true)
    protected List<StatusEventList> statusEventList;

    /**
     * Gets the value of the statusEventList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusEventList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusEventList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusEventList }
     * 
     * 
     */
    public List<StatusEventList> getStatusEventList() {
        if (statusEventList == null) {
            statusEventList = new ArrayList<StatusEventList>();
        }
        return this.statusEventList;
    }

}
