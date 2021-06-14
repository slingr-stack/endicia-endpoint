
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PackageStatusRequestOptions complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad costCenter.
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
     * Define el valor de la propiedad costCenter.
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
     * Obtiene el valor de la propiedad referenceID.
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
     * Define el valor de la propiedad referenceID.
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
     * Obtiene el valor de la propiedad packageStatus.
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
     * Define el valor de la propiedad packageStatus.
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
     * Obtiene el valor de la propiedad startingTransactionID.
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
     * Define el valor de la propiedad startingTransactionID.
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
