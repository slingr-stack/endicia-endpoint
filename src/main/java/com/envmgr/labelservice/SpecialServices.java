
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialServices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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

    /**
     * Gets the value of the deliveryConfirmation property.
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
     * Sets the value of the deliveryConfirmation property.
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
     * Gets the value of the mailClassOnly property.
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
     * Sets the value of the mailClassOnly property.
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
     * Gets the value of the certifiedMail property.
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
     * Sets the value of the certifiedMail property.
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
     * Gets the value of the cod property.
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
     * Sets the value of the cod property.
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
     * Gets the value of the electronicReturnReceipt property.
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
     * Sets the value of the electronicReturnReceipt property.
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
     * Gets the value of the insuredMail property.
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
     * Sets the value of the insuredMail property.
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
     * Gets the value of the registeredMail property.
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
     * Sets the value of the registeredMail property.
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
     * Gets the value of the restrictedDelivery property.
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
     * Sets the value of the restrictedDelivery property.
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
     * Gets the value of the returnReceipt property.
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
     * Sets the value of the returnReceipt property.
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
     * Gets the value of the signatureConfirmation property.
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
     * Sets the value of the signatureConfirmation property.
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
     * Gets the value of the signatureService property.
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
     * Sets the value of the signatureService property.
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
     * Gets the value of the holdForPickup property.
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
     * Sets the value of the holdForPickup property.
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
     * Gets the value of the merchandiseReturnService property.
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
     * Sets the value of the merchandiseReturnService property.
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
     * Gets the value of the openAndDistribute property.
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
     * Sets the value of the openAndDistribute property.
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
     * Gets the value of the adultSignature property.
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
     * Sets the value of the adultSignature property.
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
     * Gets the value of the adultSignatureRestrictedDelivery property.
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
     * Sets the value of the adultSignatureRestrictedDelivery property.
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
     * Gets the value of the amDelivery property.
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
     * Sets the value of the amDelivery property.
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
     * Gets the value of the payOnUse property.
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
     * Sets the value of the payOnUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayOnUse(String value) {
        this.payOnUse = value;
    }

}
