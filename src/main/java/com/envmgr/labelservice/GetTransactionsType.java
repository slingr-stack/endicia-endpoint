
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetTransactionsType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
 *     &lt;enumeration value="PAYONUSERETURN"/&gt;
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
    PAYONUSE,
    PAYONUSERETURN;

    public String value() {
        return name();
    }

    public static GetTransactionsType fromValue(String v) {
        return valueOf(v);
    }

}
