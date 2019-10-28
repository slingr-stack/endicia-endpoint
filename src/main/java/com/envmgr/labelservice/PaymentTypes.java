
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Postage"/&gt;
 *     &lt;enumeration value="ServiceFees"/&gt;
 *     &lt;enumeration value="Both"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentTypes")
@XmlEnum
public enum PaymentTypes {

    @XmlEnumValue("Postage")
    POSTAGE("Postage"),
    @XmlEnumValue("ServiceFees")
    SERVICE_FEES("ServiceFees"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    PaymentTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentTypes fromValue(String v) {
        for (PaymentTypes c: PaymentTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
