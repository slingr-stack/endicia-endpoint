
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RefundResponse" type="{www.envmgr.com/LabelService}RefundResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "refundResponse"
})
@XmlRootElement(name = "GetRefundResponse")
public class GetRefundResponse {

    @XmlElement(name = "RefundResponse")
    protected RefundResponse refundResponse;

    /**
     * Gets the value of the refundResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RefundResponse }
     *     
     */
    public RefundResponse getRefundResponse() {
        return refundResponse;
    }

    /**
     * Sets the value of the refundResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundResponse }
     *     
     */
    public void setRefundResponse(RefundResponse value) {
        this.refundResponse = value;
    }

}
