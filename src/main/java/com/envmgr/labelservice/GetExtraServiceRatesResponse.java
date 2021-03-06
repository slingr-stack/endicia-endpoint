
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetExtraServiceRatesResponse" type="{www.envmgr.com/LabelService}GetExtraServiceRateResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getExtraServiceRatesResponse"
})
@XmlRootElement(name = "GetExtraServiceRatesResponse")
public class GetExtraServiceRatesResponse {

    @XmlElement(name = "GetExtraServiceRatesResponse")
    protected GetExtraServiceRateResponse getExtraServiceRatesResponse;

    /**
     * Obtiene el valor de la propiedad getExtraServiceRatesResponse.
     * 
     * @return
     *     possible object is
     *     {@link GetExtraServiceRateResponse }
     *     
     */
    public GetExtraServiceRateResponse getGetExtraServiceRatesResponse() {
        return getExtraServiceRatesResponse;
    }

    /**
     * Define el valor de la propiedad getExtraServiceRatesResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GetExtraServiceRateResponse }
     *     
     */
    public void setGetExtraServiceRatesResponse(GetExtraServiceRateResponse value) {
        this.getExtraServiceRatesResponse = value;
    }

}
