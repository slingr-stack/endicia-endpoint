
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RefundStatus.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="RefundStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Approved"/&gt;
 *     &lt;enumeration value="DeniedInvalid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RefundStatus")
@XmlEnum
public enum RefundStatus {

    @XmlEnumValue("Approved")
    APPROVED("Approved"),
    @XmlEnumValue("DeniedInvalid")
    DENIED_INVALID("DeniedInvalid");
    private final String value;

    RefundStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefundStatus fromValue(String v) {
        for (RefundStatus c: RefundStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
