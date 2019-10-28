
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManifestType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ManifestType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="All"/&gt;
 *     &lt;enumeration value="GlobalPost"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="USPS"/&gt;
 *     &lt;enumeration value="GlobalAdvantage"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ManifestType")
@XmlEnum
public enum ManifestType {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("GlobalPost")
    GLOBAL_POST("GlobalPost"),
    @XmlEnumValue("None")
    NONE("None"),
    USPS("USPS"),
    @XmlEnumValue("GlobalAdvantage")
    GLOBAL_ADVANTAGE("GlobalAdvantage");
    private final String value;

    ManifestType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ManifestType fromValue(String v) {
        for (ManifestType c: ManifestType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
