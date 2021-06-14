
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
 * <p>Clase Java para Fees complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
 *         &lt;element name="PayOnUseReturn" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DeliveredDutyPaid" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="InstaLabel" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
    "payOnUse",
    "payOnUseReturn",
    "deliveredDutyPaid",
    "instaLabel"
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
    @XmlElementRef(name = "PayOnUseReturn", namespace = "www.envmgr.com/LabelService", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> payOnUseReturn;
    @XmlElementRef(name = "DeliveredDutyPaid", namespace = "www.envmgr.com/LabelService", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> deliveredDutyPaid;
    @XmlElement(name = "InstaLabel", required = true, nillable = true)
    protected BigDecimal instaLabel;
    @XmlAttribute(name = "TotalAmount", required = true)
    protected BigDecimal totalAmount;

    /**
     * Obtiene el valor de la propiedad certificateOfMailing.
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
     * Define el valor de la propiedad certificateOfMailing.
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
     * Obtiene el valor de la propiedad certifiedMail.
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
     * Define el valor de la propiedad certifiedMail.
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
     * Obtiene el valor de la propiedad collectOnDelivery.
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
     * Define el valor de la propiedad collectOnDelivery.
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
     * Obtiene el valor de la propiedad deliveryConfirmation.
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
     * Define el valor de la propiedad deliveryConfirmation.
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
     * Obtiene el valor de la propiedad electronicReturnReceipt.
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
     * Define el valor de la propiedad electronicReturnReceipt.
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
     * Obtiene el valor de la propiedad insuredMail.
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
     * Define el valor de la propiedad insuredMail.
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
     * Obtiene el valor de la propiedad registeredMail.
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
     * Define el valor de la propiedad registeredMail.
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
     * Obtiene el valor de la propiedad restrictedDelivery.
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
     * Define el valor de la propiedad restrictedDelivery.
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
     * Obtiene el valor de la propiedad returnReceipt.
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
     * Define el valor de la propiedad returnReceipt.
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
     * Obtiene el valor de la propiedad returnReceiptForMerchandise.
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
     * Define el valor de la propiedad returnReceiptForMerchandise.
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
     * Obtiene el valor de la propiedad signatureConfirmation.
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
     * Define el valor de la propiedad signatureConfirmation.
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
     * Obtiene el valor de la propiedad specialHandling.
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
     * Define el valor de la propiedad specialHandling.
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
     * Obtiene el valor de la propiedad merchandiseReturn.
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
     * Define el valor de la propiedad merchandiseReturn.
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
     * Obtiene el valor de la propiedad openAndDistribute.
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
     * Define el valor de la propiedad openAndDistribute.
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
     * Obtiene el valor de la propiedad adultSignature.
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
     * Define el valor de la propiedad adultSignature.
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
     * Obtiene el valor de la propiedad adultSignatureRestrictedDelivery.
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
     * Define el valor de la propiedad adultSignatureRestrictedDelivery.
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
     * Obtiene el valor de la propiedad liveAnimalSurcharge.
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
     * Define el valor de la propiedad liveAnimalSurcharge.
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
     * Obtiene el valor de la propiedad fragileHandling.
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
     * Define el valor de la propiedad fragileHandling.
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
     * Obtiene el valor de la propiedad amDelivery.
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
     * Define el valor de la propiedad amDelivery.
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
     * Obtiene el valor de la propiedad groupedExtraServices.
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
     * Define el valor de la propiedad groupedExtraServices.
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
     * Obtiene el valor de la propiedad payOnUse.
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
     * Define el valor de la propiedad payOnUse.
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
     * Obtiene el valor de la propiedad payOnUseReturn.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPayOnUseReturn() {
        return payOnUseReturn;
    }

    /**
     * Define el valor de la propiedad payOnUseReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPayOnUseReturn(JAXBElement<BigDecimal> value) {
        this.payOnUseReturn = value;
    }

    /**
     * Obtiene el valor de la propiedad deliveredDutyPaid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDeliveredDutyPaid() {
        return deliveredDutyPaid;
    }

    /**
     * Define el valor de la propiedad deliveredDutyPaid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDeliveredDutyPaid(JAXBElement<BigDecimal> value) {
        this.deliveredDutyPaid = value;
    }

    /**
     * Obtiene el valor de la propiedad instaLabel.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInstaLabel() {
        return instaLabel;
    }

    /**
     * Define el valor de la propiedad instaLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInstaLabel(BigDecimal value) {
        this.instaLabel = value;
    }

    /**
     * Obtiene el valor de la propiedad totalAmount.
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
     * Define el valor de la propiedad totalAmount.
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
