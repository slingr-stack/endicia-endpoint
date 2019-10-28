
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the picNumber property.
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
     * Sets the value of the picNumber property.
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
     * Gets the value of the pieceId property.
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
     * Sets the value of the pieceId property.
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
     * Gets the value of the transactionID property.
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
     * Sets the value of the transactionID property.
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
     * Gets the value of the packageStatusEventList property.
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
     * Sets the value of the packageStatusEventList property.
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
