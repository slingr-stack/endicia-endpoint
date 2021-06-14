
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para StatusResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="StatusResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PicNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PieceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageStatusEventList" type="{www.envmgr.com/LabelService}ArrayOfStatusEventList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusResponse", propOrder = {
    "picNumber",
    "pieceId",
    "transactionID",
    "packageStatusEventList"
})
public class StatusResponse {

    @XmlElement(name = "PicNumber")
    protected String picNumber;
    @XmlElement(name = "PieceId")
    protected String pieceId;
    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "PackageStatusEventList")
    protected ArrayOfStatusEventList packageStatusEventList;

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
     * Obtiene el valor de la propiedad pieceId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPieceId() {
        return pieceId;
    }

    /**
     * Define el valor de la propiedad pieceId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPieceId(String value) {
        this.pieceId = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Define el valor de la propiedad transactionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Obtiene el valor de la propiedad packageStatusEventList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStatusEventList }
     *     
     */
    public ArrayOfStatusEventList getPackageStatusEventList() {
        return packageStatusEventList;
    }

    /**
     * Define el valor de la propiedad packageStatusEventList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStatusEventList }
     *     
     */
    public void setPackageStatusEventList(ArrayOfStatusEventList value) {
        this.packageStatusEventList = value;
    }

}
