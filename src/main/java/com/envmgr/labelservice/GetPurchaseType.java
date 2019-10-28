
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPurchaseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetPurchaseType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *     &lt;enumeration value="MANUAL"/&gt;
 *     &lt;enumeration value="AUTO"/&gt;
 *     &lt;enumeration value="OVERDRAFT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GetPurchaseType")
@XmlEnum
public enum GetPurchaseType {

    ALL,
    MANUAL,
    AUTO,
    OVERDRAFT;

    public String value() {
        return name();
    }

    public static GetPurchaseType fromValue(String v) {
        return valueOf(v);
    }

}
