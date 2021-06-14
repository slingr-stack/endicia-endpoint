
package com.envmgr.labelservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfContainerLabel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfContainerLabel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContainerLabel" type="{www.envmgr.com/LabelService}ContainerLabel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfContainerLabel", propOrder = {
    "containerLabel"
})
public class ArrayOfContainerLabel {

    @XmlElement(name = "ContainerLabel", nillable = true)
    protected List<ContainerLabel> containerLabel;

    /**
     * Gets the value of the containerLabel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containerLabel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContainerLabel }
     * 
     * 
     */
    public List<ContainerLabel> getContainerLabel() {
        if (containerLabel == null) {
            containerLabel = new ArrayList<ContainerLabel>();
        }
        return this.containerLabel;
    }

}
