
package com.envmgr.labelservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfCarrierPickupListDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCarrierPickupListDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarrierPickupListDetail" type="{www.envmgr.com/LabelService}CarrierPickupListDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCarrierPickupListDetail", propOrder = {
    "carrierPickupListDetail"
})
public class ArrayOfCarrierPickupListDetail {

    @XmlElement(name = "CarrierPickupListDetail", nillable = true)
    protected List<CarrierPickupListDetail> carrierPickupListDetail;

    /**
     * Gets the value of the carrierPickupListDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierPickupListDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierPickupListDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierPickupListDetail }
     * 
     * 
     */
    public List<CarrierPickupListDetail> getCarrierPickupListDetail() {
        if (carrierPickupListDetail == null) {
            carrierPickupListDetail = new ArrayList<CarrierPickupListDetail>();
        }
        return this.carrierPickupListDetail;
    }

}
