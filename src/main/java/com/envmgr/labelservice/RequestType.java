
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Create"/&gt;
 *     &lt;enumeration value="Resubmit"/&gt;
 *     &lt;enumeration value="Reprint"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RequestType")
@XmlEnum
public enum RequestType {

    @XmlEnumValue("Create")
    CREATE("Create"),
    @XmlEnumValue("Resubmit")
    RESUBMIT("Resubmit"),
    @XmlEnumValue("Reprint")
    REPRINT("Reprint");
    private final String value;

    RequestType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestType fromValue(String v) {
        for (RequestType c: RequestType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
