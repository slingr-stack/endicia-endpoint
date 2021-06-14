
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SpecialServices complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SpecialServices"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="DeliveryConfirmation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MailClassOnly" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CertifiedMail" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="COD" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ElectronicReturnReceipt" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="InsuredMail" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RegisteredMail" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RestrictedDelivery" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ReturnReceipt" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SignatureConfirmation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SignatureService" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="HoldForPickup" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MerchandiseReturnService" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OpenAndDistribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AdultSignature" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AdultSignatureRestrictedDelivery" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AMDelivery" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PayOnUse" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PayOnUseReturn" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ResidentialDelivery" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DeliveredDutyPaid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="InstaLabel" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialServices")
public class SpecialServices {

    @XmlAttribute(name = "DeliveryConfirmation")
    protected String deliveryConfirmation;
    @XmlAttribute(name = "MailClassOnly")
    protected String mailClassOnly;
    @XmlAttribute(name = "CertifiedMail")
    protected String certifiedMail;
    @XmlAttribute(name = "COD")
    protected String cod;
    @XmlAttribute(name = "ElectronicReturnReceipt")
    protected String electronicReturnReceipt;
    @XmlAttribute(name = "InsuredMail")
    protected String insuredMail;
    @XmlAttribute(name = "RegisteredMail")
    protected String registeredMail;
    @XmlAttribute(name = "RestrictedDelivery")
    protected String restrictedDelivery;
    @XmlAttribute(name = "ReturnReceipt")
    protected String returnReceipt;
    @XmlAttribute(name = "SignatureConfirmation")
    protected String signatureConfirmation;
    @XmlAttribute(name = "SignatureService")
    protected String signatureService;
    @XmlAttribute(name = "HoldForPickup")
    protected String holdForPickup;
    @XmlAttribute(name = "MerchandiseReturnService")
    protected String merchandiseReturnService;
    @XmlAttribute(name = "OpenAndDistribute")
    protected String openAndDistribute;
    @XmlAttribute(name = "AdultSignature")
    protected String adultSignature;
    @XmlAttribute(name = "AdultSignatureRestrictedDelivery")
    protected String adultSignatureRestrictedDelivery;
    @XmlAttribute(name = "AMDelivery")
    protected String amDelivery;
    @XmlAttribute(name = "PayOnUse")
    protected String payOnUse;
    @XmlAttribute(name = "PayOnUseReturn")
    protected String payOnUseReturn;
    @XmlAttribute(name = "ResidentialDelivery")
    protected String residentialDelivery;
    @XmlAttribute(name = "DeliveredDutyPaid")
    protected String deliveredDutyPaid;
    @XmlAttribute(name = "InstaLabel")
    protected String instaLabel;

    /**
     * Obtiene el valor de la propiedad deliveryConfirmation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryConfirmation() {
        return deliveryConfirmation;
    }

    /**
     * Define el valor de la propiedad deliveryConfirmation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryConfirmation(String value) {
        this.deliveryConfirmation = value;
    }

    /**
     * Obtiene el valor de la propiedad mailClassOnly.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailClassOnly() {
        return mailClassOnly;
    }

    /**
     * Define el valor de la propiedad mailClassOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailClassOnly(String value) {
        this.mailClassOnly = value;
    }

    /**
     * Obtiene el valor de la propiedad certifiedMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertifiedMail() {
        return certifiedMail;
    }

    /**
     * Define el valor de la propiedad certifiedMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertifiedMail(String value) {
        this.certifiedMail = value;
    }

    /**
     * Obtiene el valor de la propiedad cod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOD() {
        return cod;
    }

    /**
     * Define el valor de la propiedad cod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOD(String value) {
        this.cod = value;
    }

    /**
     * Obtiene el valor de la propiedad electronicReturnReceipt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectronicReturnReceipt() {
        return electronicReturnReceipt;
    }

    /**
     * Define el valor de la propiedad electronicReturnReceipt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectronicReturnReceipt(String value) {
        this.electronicReturnReceipt = value;
    }

    /**
     * Obtiene el valor de la propiedad insuredMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredMail() {
        return insuredMail;
    }

    /**
     * Define el valor de la propiedad insuredMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredMail(String value) {
        this.insuredMail = value;
    }

    /**
     * Obtiene el valor de la propiedad registeredMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredMail() {
        return registeredMail;
    }

    /**
     * Define el valor de la propiedad registeredMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredMail(String value) {
        this.registeredMail = value;
    }

    /**
     * Obtiene el valor de la propiedad restrictedDelivery.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictedDelivery() {
        return restrictedDelivery;
    }

    /**
     * Define el valor de la propiedad restrictedDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictedDelivery(String value) {
        this.restrictedDelivery = value;
    }

    /**
     * Obtiene el valor de la propiedad returnReceipt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnReceipt() {
        return returnReceipt;
    }

    /**
     * Define el valor de la propiedad returnReceipt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnReceipt(String value) {
        this.returnReceipt = value;
    }

    /**
     * Obtiene el valor de la propiedad signatureConfirmation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureConfirmation() {
        return signatureConfirmation;
    }

    /**
     * Define el valor de la propiedad signatureConfirmation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureConfirmation(String value) {
        this.signatureConfirmation = value;
    }

    /**
     * Obtiene el valor de la propiedad signatureService.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureService() {
        return signatureService;
    }

    /**
     * Define el valor de la propiedad signatureService.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureService(String value) {
        this.signatureService = value;
    }

    /**
     * Obtiene el valor de la propiedad holdForPickup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldForPickup() {
        return holdForPickup;
    }

    /**
     * Define el valor de la propiedad holdForPickup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldForPickup(String value) {
        this.holdForPickup = value;
    }

    /**
     * Obtiene el valor de la propiedad merchandiseReturnService.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchandiseReturnService() {
        return merchandiseReturnService;
    }

    /**
     * Define el valor de la propiedad merchandiseReturnService.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchandiseReturnService(String value) {
        this.merchandiseReturnService = value;
    }

    /**
     * Obtiene el valor de la propiedad openAndDistribute.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenAndDistribute() {
        return openAndDistribute;
    }

    /**
     * Define el valor de la propiedad openAndDistribute.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenAndDistribute(String value) {
        this.openAndDistribute = value;
    }

    /**
     * Obtiene el valor de la propiedad adultSignature.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdultSignature() {
        return adultSignature;
    }

    /**
     * Define el valor de la propiedad adultSignature.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdultSignature(String value) {
        this.adultSignature = value;
    }

    /**
     * Obtiene el valor de la propiedad adultSignatureRestrictedDelivery.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdultSignatureRestrictedDelivery() {
        return adultSignatureRestrictedDelivery;
    }

    /**
     * Define el valor de la propiedad adultSignatureRestrictedDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdultSignatureRestrictedDelivery(String value) {
        this.adultSignatureRestrictedDelivery = value;
    }

    /**
     * Obtiene el valor de la propiedad amDelivery.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMDelivery() {
        return amDelivery;
    }

    /**
     * Define el valor de la propiedad amDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMDelivery(String value) {
        this.amDelivery = value;
    }

    /**
     * Obtiene el valor de la propiedad payOnUse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayOnUse() {
        return payOnUse;
    }

    /**
     * Define el valor de la propiedad payOnUse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayOnUse(String value) {
        this.payOnUse = value;
    }

    /**
     * Obtiene el valor de la propiedad payOnUseReturn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayOnUseReturn() {
        return payOnUseReturn;
    }

    /**
     * Define el valor de la propiedad payOnUseReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayOnUseReturn(String value) {
        this.payOnUseReturn = value;
    }

    /**
     * Obtiene el valor de la propiedad residentialDelivery.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentialDelivery() {
        return residentialDelivery;
    }

    /**
     * Define el valor de la propiedad residentialDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentialDelivery(String value) {
        this.residentialDelivery = value;
    }

    /**
     * Obtiene el valor de la propiedad deliveredDutyPaid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveredDutyPaid() {
        return deliveredDutyPaid;
    }

    /**
     * Define el valor de la propiedad deliveredDutyPaid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveredDutyPaid(String value) {
        this.deliveredDutyPaid = value;
    }

    /**
     * Obtiene el valor de la propiedad instaLabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstaLabel() {
        return instaLabel;
    }

    /**
     * Define el valor de la propiedad instaLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstaLabel(String value) {
        this.instaLabel = value;
    }

}
