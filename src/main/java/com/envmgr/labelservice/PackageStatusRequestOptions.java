
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageStatusRequestOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageStatusRequestOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="CostCenter" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PackageStatus" use="required" type="{www.envmgr.com/LabelService}GetPackageStatus" /&gt;
 *       &lt;attribute name="StartingTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageStatusRequestOptions")
public class PackageStatusRequestOptions {

    @XmlAttribute(name = "CostCenter")
    protected String costCenter;
    @XmlAttribute(name = "ReferenceID")
    protected String referenceID;
    @XmlAttribute(name = "PackageStatus", required = true)
    protected GetPackageStatus packageStatus;
    @XmlAttribute(name = "StartingTransactionID")
    protected String startingTransactionID;

    /**
     * Gets the value of the costCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenter() {
        return costCenter;
    }

    /**
     * Sets the value of the costCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenter(String value) {
        this.costCenter = value;
    }

    /**
     * Gets the value of the referenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceID() {
        return referenceID;
    }

    /**
     * Sets the value of the referenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceID(String value) {
        this.referenceID = value;
    }

    /**
     * Gets the value of the packageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link GetPackageStatus }
     *     
     */
    public GetPackageStatus getPackageStatus() {
        return packageStatus;
    }

    /**
     * Sets the value of the packageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPackageStatus }
     *     
     */
    public void setPackageStatus(GetPackageStatus value) {
        this.packageStatus = value;
    }

    /**
     * Gets the value of the startingTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartingTransactionID() {
        return startingTransactionID;
    }

    /**
     * Sets the value of the startingTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartingTransactionID(String value) {
        this.startingTransactionID = value;
    }

}
