
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditCardType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditCardType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Visa"/&gt;
 *     &lt;enumeration value="Mastercard"/&gt;
 *     &lt;enumeration value="AmericanExpress"/&gt;
 *     &lt;enumeration value="CarteBlanche"/&gt;
 *     &lt;enumeration value="Discover"/&gt;
 *     &lt;enumeration value="DinersClub"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CreditCardType")
@XmlEnum
public enum CreditCardType {

    @XmlEnumValue("Visa")
    VISA("Visa"),
    @XmlEnumValue("Mastercard")
    MASTERCARD("Mastercard"),
    @XmlEnumValue("AmericanExpress")
    AMERICAN_EXPRESS("AmericanExpress"),
    @XmlEnumValue("CarteBlanche")
    CARTE_BLANCHE("CarteBlanche"),
    @XmlEnumValue("Discover")
    DISCOVER("Discover"),
    @XmlEnumValue("DinersClub")
    DINERS_CLUB("DinersClub");
    private final String value;

    CreditCardType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditCardType fromValue(String v) {
        for (CreditCardType c: CreditCardType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
