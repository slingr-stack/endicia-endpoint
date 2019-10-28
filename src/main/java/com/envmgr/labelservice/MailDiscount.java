
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MailDiscount.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MailDiscount"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ComBase"/&gt;
 *     &lt;enumeration value="CPP"/&gt;
 *     &lt;enumeration value="Custom"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MailDiscount")
@XmlEnum
public enum MailDiscount {

    @XmlEnumValue("ComBase")
    COM_BASE("ComBase"),
    CPP("CPP"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom");
    private final String value;

    MailDiscount(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MailDiscount fromValue(String v) {
        for (MailDiscount c: MailDiscount.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
