
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPackageStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetPackageStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CURRENT"/&gt;
 *     &lt;enumeration value="COMPLETE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GetPackageStatus")
@XmlEnum
public enum GetPackageStatus {

    CURRENT,
    COMPLETE;

    public String value() {
        return name();
    }

    public static GetPackageStatus fromValue(String v) {
        return valueOf(v);
    }

}
