
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RefundType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="RefundType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Undefined"/&gt;
 *     &lt;enumeration value="Physical"/&gt;
 *     &lt;enumeration value="Electronic"/&gt;
 *     &lt;enumeration value="Both"/&gt;
 *     &lt;enumeration value="SmartSaver"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RefundType")
@XmlEnum
public enum RefundType {

    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined"),
    @XmlEnumValue("Physical")
    PHYSICAL("Physical"),
    @XmlEnumValue("Electronic")
    ELECTRONIC("Electronic"),
    @XmlEnumValue("Both")
    BOTH("Both"),
    @XmlEnumValue("SmartSaver")
    SMART_SAVER("SmartSaver");
    private final String value;

    RefundType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefundType fromValue(String v) {
        for (RefundType c: RefundType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
