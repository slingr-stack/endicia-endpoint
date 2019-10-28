
package com.envmgr.labelservice;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Fees complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fees"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CertificateOfMailing" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CertifiedMail" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CollectOnDelivery" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DeliveryConfirmation" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ElectronicReturnReceipt" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="InsuredMail" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RegisteredMail" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RestrictedDelivery" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ReturnReceipt" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ReturnReceiptForMerchandise" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SignatureConfirmation" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SpecialHandling" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="MerchandiseReturn" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="OpenAndDistribute" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="AdultSignature" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="AdultSignatureRestrictedDelivery" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="LiveAnimalSurcharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="FragileHandling" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="AMDelivery" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="GroupedExtraServices" type="{www.envmgr.com/LabelService}GroupedExtraServices" minOccurs="0"/&gt;
 *         &lt;element name="PayOnUse" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TotalAmount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fees", propOrder = {
    "certificateOfMailing",
    "certifiedMail",
    "collectOnDelivery",
    "deliveryConfirmation",
    "electronicReturnReceipt",
    "insuredMail",
    "registeredMail",
    "restrictedDelivery",
    "returnReceipt",
    "returnReceiptForMerchandise",
    "signatureConfirmation",
    "specialHandling",
    "merchandiseReturn",
    "openAndDistribute",
    "adultSignature",
    "adultSignatureRestrictedDelivery",
    "liveAnimalSurcharge",
    "fragileHandling",
    "amDelivery",
    "groupedExtraServices",
    "payOnUse"
})
public class Fees {

    @XmlElement(name = "CertificateOfMailing", required = true)
    protected BigDecimal certificateOfMailing;
    @XmlElement(name = "CertifiedMail", required = true)
    protected BigDecimal certifiedMail;
    @XmlElement(name = "CollectOnDelivery", required = true)
    protected BigDecimal collectOnDelivery;
    @XmlElement(name = "DeliveryConfirmation", required = true)
    protected BigDecimal deliveryConfirmation;
    @XmlElement(name = "ElectronicReturnReceipt", required = true)
    protected BigDecimal electronicReturnReceipt;
    @XmlElement(name = "InsuredMail", required = true)
    protected BigDecimal insuredMail;
    @XmlElement(name = "RegisteredMail", required = true)
    protected BigDecimal registeredMail;
    @XmlElement(name = "RestrictedDelivery", required = true)
    protected BigDecimal restrictedDelivery;
    @XmlElement(name = "ReturnReceipt", required = true)
    protected BigDecimal returnReceipt;
    @XmlElement(name = "ReturnReceiptForMerchandise", required = true)
    protected BigDecimal returnReceiptForMerchandise;
    @XmlElement(name = "SignatureConfirmation", required = true)
    protected BigDecimal signatureConfirmation;
    @XmlElement(name = "SpecialHandling", required = true)
    protected BigDecimal specialHandling;
    @XmlElement(name = "MerchandiseReturn", required = true)
    protected BigDecimal merchandiseReturn;
    @XmlElement(name = "OpenAndDistribute", required = true)
    protected BigDecimal openAndDistribute;
    @XmlElement(name = "AdultSignature", required = true)
    protected BigDecimal adultSignature;
    @XmlElement(name = "AdultSignatureRestrictedDelivery", required = true)
    protected BigDecimal adultSignatureRestrictedDelivery;
    @XmlElement(name = "LiveAnimalSurcharge", required = true)
    protected BigDecimal liveAnimalSurcharge;
    @XmlElement(name = "FragileHandling", required = true)
    protected BigDecimal fragileHandling;
    @XmlElement(name = "AMDelivery", required = true)
    protected BigDecimal amDelivery;
    @XmlElement(name = "GroupedExtraServices")
    protected GroupedExtraServices groupedExtraServices;
    @XmlElementRef(name = "PayOnUse", namespace = "www.envmgr.com/LabelService", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> payOnUse;
    @XmlAttribute(name = "TotalAmount", required = true)
    protected BigDecimal totalAmount;

    /**
     * Gets the value of the certificateOfMailing property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCertificateOfMailing() {
        return certificateOfMailing;
    }

    /**
     * Sets the value of the certificateOfMailing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCertificateOfMailing(BigDecimal value) {
        this.certificateOfMailing = value;
    }

    /**
     * Gets the value of the certifiedMail property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCertifiedMail() {
        return certifiedMail;
    }

    /**
     * Sets the value of the certifiedMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCertifiedMail(BigDecimal value) {
        this.certifiedMail = value;
    }

    /**
     * Gets the value of the collectOnDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCollectOnDelivery() {
        return collectOnDelivery;
    }

    /**
     * Sets the value of the collectOnDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCollectOnDelivery(BigDecimal value) {
        this.collectOnDelivery = value;
    }

    /**
     * Gets the value of the deliveryConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeliveryConfirmation() {
        return deliveryConfirmation;
    }

    /**
     * Sets the value of the deliveryConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeliveryConfirmation(BigDecimal value) {
        this.deliveryConfirmation = value;
    }

    /**
     * Gets the value of the electronicReturnReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getElectronicReturnReceipt() {
        return electronicReturnReceipt;
    }

    /**
     * Sets the value of the electronicReturnReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setElectronicReturnReceipt(BigDecimal value) {
        this.electronicReturnReceipt = value;
    }

    /**
     * Gets the value of the insuredMail property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsuredMail() {
        return insuredMail;
    }

    /**
     * Sets the value of the insuredMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInsuredMail(BigDecimal value) {
        this.insuredMail = value;
    }

    /**
     * Gets the value of the registeredMail property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRegisteredMail() {
        return registeredMail;
    }

    /**
     * Sets the value of the registeredMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRegisteredMail(BigDecimal value) {
        this.registeredMail = value;
    }

    /**
     * Gets the value of the restrictedDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRestrictedDelivery() {
        return restrictedDelivery;
    }

    /**
     * Sets the value of the restrictedDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRestrictedDelivery(BigDecimal value) {
        this.restrictedDelivery = value;
    }

    /**
     * Gets the value of the returnReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnReceipt() {
        return returnReceipt;
    }

    /**
     * Sets the value of the returnReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnReceipt(BigDecimal value) {
        this.returnReceipt = value;
    }

    /**
     * Gets the value of the returnReceiptForMerchandise property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnReceiptForMerchandise() {
        return returnReceiptForMerchandise;
    }

    /**
     * Sets the value of the returnReceiptForMerchandise property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnReceiptForMerchandise(BigDecimal value) {
        this.returnReceiptForMerchandise = value;
    }

    /**
     * Gets the value of the signatureConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSignatureConfirmation() {
        return signatureConfirmation;
    }

    /**
     * Sets the value of the signatureConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSignatureConfirmation(BigDecimal value) {
        this.signatureConfirmation = value;
    }

    /**
     * Gets the value of the specialHandling property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpecialHandling() {
        return specialHandling;
    }

    /**
     * Sets the value of the specialHandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpecialHandling(BigDecimal value) {
        this.specialHandling = value;
    }

    /**
     * Gets the value of the merchandiseReturn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMerchandiseReturn() {
        return merchandiseReturn;
    }

    /**
     * Sets the value of the merchandiseReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMerchandiseReturn(BigDecimal value) {
        this.merchandiseReturn = value;
    }

    /**
     * Gets the value of the openAndDistribute property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpenAndDistribute() {
        return openAndDistribute;
    }

    /**
     * Sets the value of the openAndDistribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpenAndDistribute(BigDecimal value) {
        this.openAndDistribute = value;
    }

    /**
     * Gets the value of the adultSignature property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdultSignature() {
        return adultSignature;
    }

    /**
     * Sets the value of the adultSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdultSignature(BigDecimal value) {
        this.adultSignature = value;
    }

    /**
     * Gets the value of the adultSignatureRestrictedDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdultSignatureRestrictedDelivery() {
        return adultSignatureRestrictedDelivery;
    }

    /**
     * Sets the value of the adultSignatureRestrictedDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdultSignatureRestrictedDelivery(BigDecimal value) {
        this.adultSignatureRestrictedDelivery = value;
    }

    /**
     * Gets the value of the liveAnimalSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLiveAnimalSurcharge() {
        return liveAnimalSurcharge;
    }

    /**
     * Sets the value of the liveAnimalSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLiveAnimalSurcharge(BigDecimal value) {
        this.liveAnimalSurcharge = value;
    }

    /**
     * Gets the value of the fragileHandling property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFragileHandling() {
        return fragileHandling;
    }

    /**
     * Sets the value of the fragileHandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFragileHandling(BigDecimal value) {
        this.fragileHandling = value;
    }

    /**
     * Gets the value of the amDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMDelivery() {
        return amDelivery;
    }

    /**
     * Sets the value of the amDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMDelivery(BigDecimal value) {
        this.amDelivery = value;
    }

    /**
     * Gets the value of the groupedExtraServices property.
     * 
     * @return
     *     possible object is
     *     {@link GroupedExtraServices }
     *     
     */
    public GroupedExtraServices getGroupedExtraServices() {
        return groupedExtraServices;
    }

    /**
     * Sets the value of the groupedExtraServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupedExtraServices }
     *     
     */
    public void setGroupedExtraServices(GroupedExtraServices value) {
        this.groupedExtraServices = value;
    }

    /**
     * Gets the value of the payOnUse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPayOnUse() {
        return payOnUse;
    }

    /**
     * Sets the value of the payOnUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPayOnUse(JAXBElement<BigDecimal> value) {
        this.payOnUse = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
    }

}
