
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LabelResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LabelResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RefundStatus" type="{www.envmgr.com/LabelService}RefundStatus"/&gt;
 *         &lt;element name="RefundStatusMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PicNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TransactionId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="PieceNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelResponse", propOrder = {
    "refundStatus",
    "refundStatusMessage"
})
public class LabelResponse {

    @XmlElement(name = "RefundStatus", required = true)
    @XmlSchemaType(name = "string")
    protected RefundStatus refundStatus;
    @XmlElement(name = "RefundStatusMessage")
    protected String refundStatusMessage;
    @XmlAttribute(name = "PicNumber")
    protected String picNumber;
    @XmlAttribute(name = "TransactionId", required = true)
    protected long transactionId;
    @XmlAttribute(name = "PieceNumber", required = true)
    protected int pieceNumber;

    /**
     * Obtiene el valor de la propiedad refundStatus.
     * 
     * @return
     *     possible object is
     *     {@link RefundStatus }
     *     
     */
    public RefundStatus getRefundStatus() {
        return refundStatus;
    }

    /**
     * Define el valor de la propiedad refundStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundStatus }
     *     
     */
    public void setRefundStatus(RefundStatus value) {
        this.refundStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad refundStatusMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundStatusMessage() {
        return refundStatusMessage;
    }

    /**
     * Define el valor de la propiedad refundStatusMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundStatusMessage(String value) {
        this.refundStatusMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad picNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPicNumber() {
        return picNumber;
    }

    /**
     * Define el valor de la propiedad picNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPicNumber(String value) {
        this.picNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionId.
     * 
     */
    public long getTransactionId() {
        return transactionId;
    }

    /**
     * Define el valor de la propiedad transactionId.
     * 
     */
    public void setTransactionId(long value) {
        this.transactionId = value;
    }

    /**
     * Obtiene el valor de la propiedad pieceNumber.
     * 
     */
    public int getPieceNumber() {
        return pieceNumber;
    }

    /**
     * Define el valor de la propiedad pieceNumber.
     * 
     */
    public void setPieceNumber(int value) {
        this.pieceNumber = value;
    }

}
