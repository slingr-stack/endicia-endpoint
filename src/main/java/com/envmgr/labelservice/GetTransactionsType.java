
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTransactionsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetTransactionsType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *     &lt;enumeration value="PRINTS"/&gt;
 *     &lt;enumeration value="PURCHASES"/&gt;
 *     &lt;enumeration value="ADJUSTMENTS"/&gt;
 *     &lt;enumeration value="OUTSTANDING"/&gt;
 *     &lt;enumeration value="PAYONUSE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GetTransactionsType")
@XmlEnum
public enum GetTransactionsType {

    ALL,
    PRINTS,
    PURCHASES,
    ADJUSTMENTS,
    OUTSTANDING,
    PAYONUSE;

    public String value() {
        return name();
    }

    public static GetTransactionsType fromValue(String v) {
        return valueOf(v);
    }

}
