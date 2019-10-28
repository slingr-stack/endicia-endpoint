
package com.envmgr.labelservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRetailAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRetailAccount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetailAccount" type="{www.envmgr.com/LabelService}RetailAccount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRetailAccount", propOrder = {
    "retailAccount"
})
public class ArrayOfRetailAccount {

    @XmlElement(name = "RetailAccount", nillable = true)
    protected List<RetailAccount> retailAccount;

    /**
     * Gets the value of the retailAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retailAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetailAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetailAccount }
     * 
     * 
     */
    public List<RetailAccount> getRetailAccount() {
        if (retailAccount == null) {
            retailAccount = new ArrayList<RetailAccount>();
        }
        return this.retailAccount;
    }

}
