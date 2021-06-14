
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CloseAccountReasons complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad changeInBusiness.
     * 
     */
    public boolean isChangeInBusiness() {
        return changeInBusiness;
    }

    /**
     * Define el valor de la propiedad changeInBusiness.
     * 
     */
    public void setChangeInBusiness(boolean value) {
        this.changeInBusiness = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceIsExpensive.
     * 
     */
    public boolean isServiceIsExpensive() {
        return serviceIsExpensive;
    }

    /**
     * Define el valor de la propiedad serviceIsExpensive.
     * 
     */
    public void setServiceIsExpensive(boolean value) {
        this.serviceIsExpensive = value;
    }

    /**
     * Obtiene el valor de la propiedad switchingToAnotherProvider.
     * 
     */
    public boolean isSwitchingToAnotherProvider() {
        return switchingToAnotherProvider;
    }

    /**
     * Define el valor de la propiedad switchingToAnotherProvider.
     * 
     */
    public void setSwitchingToAnotherProvider(boolean value) {
        this.switchingToAnotherProvider = value;
    }

    /**
     * Obtiene el valor de la propiedad productIsComplicated.
     * 
     */
    public boolean isProductIsComplicated() {
        return productIsComplicated;
    }

    /**
     * Define el valor de la propiedad productIsComplicated.
     * 
     */
    public void setProductIsComplicated(boolean value) {
        this.productIsComplicated = value;
    }

    /**
     * Obtiene el valor de la propiedad other.
     * 
     */
    public boolean isOther() {
        return other;
    }

    /**
     * Define el valor de la propiedad other.
     * 
     */
    public void setOther(boolean value) {
        this.other = value;
    }

}
