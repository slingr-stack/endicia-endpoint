
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EmailConfig complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EmailConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContentBlocks" type="{www.envmgr.com/LabelService}ArrayOfContentBlock" minOccurs="0"/&gt;
 *         &lt;element name="FromName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ReplyToEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BCCEmails" type="{www.envmgr.com/LabelService}ArrayOfBccEmail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailConfig", propOrder = {
    "contentBlocks",
    "fromName",
    "replyToEmail",
    "bccEmails"
})
public class EmailConfig {

    @XmlElement(name = "ContentBlocks")
    protected ArrayOfContentBlock contentBlocks;
    @XmlElement(name = "FromName", required = true, nillable = true)
    protected String fromName;
    @XmlElement(name = "ReplyToEmail", required = true, nillable = true)
    protected String replyToEmail;
    @XmlElement(name = "BCCEmails")
    protected ArrayOfBccEmail bccEmails;

    /**
     * Obtiene el valor de la propiedad contentBlocks.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContentBlock }
     *     
     */
    public ArrayOfContentBlock getContentBlocks() {
        return contentBlocks;
    }

    /**
     * Define el valor de la propiedad contentBlocks.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContentBlock }
     *     
     */
    public void setContentBlocks(ArrayOfContentBlock value) {
        this.contentBlocks = value;
    }

    /**
     * Obtiene el valor de la propiedad fromName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromName() {
        return fromName;
    }

    /**
     * Define el valor de la propiedad fromName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromName(String value) {
        this.fromName = value;
    }

    /**
     * Obtiene el valor de la propiedad replyToEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyToEmail() {
        return replyToEmail;
    }

    /**
     * Define el valor de la propiedad replyToEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyToEmail(String value) {
        this.replyToEmail = value;
    }

    /**
     * Obtiene el valor de la propiedad bccEmails.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBccEmail }
     *     
     */
    public ArrayOfBccEmail getBCCEmails() {
        return bccEmails;
    }

    /**
     * Define el valor de la propiedad bccEmails.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBccEmail }
     *     
     */
    public void setBCCEmails(ArrayOfBccEmail value) {
        this.bccEmails = value;
    }

}
