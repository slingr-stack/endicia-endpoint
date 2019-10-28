
package com.envmgr.labelservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInternationalConsolidatorServiceDetailResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInternationalConsolidatorServiceDetailResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnabledInternationalConsolidatorService" type="{www.envmgr.com/LabelService}InternationalConsolidatorServiceDetailResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInternationalConsolidatorServiceDetailResponse", propOrder = {
    "enabledInternationalConsolidatorService"
})
public class ArrayOfInternationalConsolidatorServiceDetailResponse {

    @XmlElement(name = "EnabledInternationalConsolidatorService", nillable = true)
    protected List<InternationalConsolidatorServiceDetailResponse> enabledInternationalConsolidatorService;

    /**
     * Gets the value of the enabledInternationalConsolidatorService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enabledInternationalConsolidatorService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnabledInternationalConsolidatorService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalConsolidatorServiceDetailResponse }
     * 
     * 
     */
    public List<InternationalConsolidatorServiceDetailResponse> getEnabledInternationalConsolidatorService() {
        if (enabledInternationalConsolidatorService == null) {
            enabledInternationalConsolidatorService = new ArrayList<InternationalConsolidatorServiceDetailResponse>();
        }
        return this.enabledInternationalConsolidatorService;
    }

}
