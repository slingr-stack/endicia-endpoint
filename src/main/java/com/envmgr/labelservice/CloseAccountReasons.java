
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CloseAccountReasons complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CloseAccountReasons"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ChangeInBusiness" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ServiceIsExpensive" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SwitchingToAnotherProvider" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ProductIsComplicated" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Other" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CloseAccountReasons")
public class CloseAccountReasons {

    @XmlAttribute(name = "ChangeInBusiness", required = true)
    protected boolean changeInBusiness;
    @XmlAttribute(name = "ServiceIsExpensive", required = true)
    protected boolean serviceIsExpensive;
    @XmlAttribute(name = "SwitchingToAnotherProvider", required = true)
    protected boolean switchingToAnotherProvider;
    @XmlAttribute(name = "ProductIsComplicated", required = true)
    protected boolean productIsComplicated;
    @XmlAttribute(name = "Other", required = true)
    protected boolean other;

    /**
     * Gets the value of the changeInBusiness property.
     * 
     */
    public boolean isChangeInBusiness() {
        return changeInBusiness;
    }

    /**
     * Sets the value of the changeInBusiness property.
     * 
     */
    public void setChangeInBusiness(boolean value) {
        this.changeInBusiness = value;
    }

    /**
     * Gets the value of the serviceIsExpensive property.
     * 
     */
    public boolean isServiceIsExpensive() {
        return serviceIsExpensive;
    }

    /**
     * Sets the value of the serviceIsExpensive property.
     * 
     */
    public void setServiceIsExpensive(boolean value) {
        this.serviceIsExpensive = value;
    }

    /**
     * Gets the value of the switchingToAnotherProvider property.
     * 
     */
    public boolean isSwitchingToAnotherProvider() {
        return switchingToAnotherProvider;
    }

    /**
     * Sets the value of the switchingToAnotherProvider property.
     * 
     */
    public void setSwitchingToAnotherProvider(boolean value) {
        this.switchingToAnotherProvider = value;
    }

    /**
     * Gets the value of the productIsComplicated property.
     * 
     */
    public boolean isProductIsComplicated() {
        return productIsComplicated;
    }

    /**
     * Sets the value of the productIsComplicated property.
     * 
     */
    public void setProductIsComplicated(boolean value) {
        this.productIsComplicated = value;
    }

    /**
     * Gets the value of the other property.
     * 
     */
    public boolean isOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     */
    public void setOther(boolean value) {
        this.other = value;
    }

}
