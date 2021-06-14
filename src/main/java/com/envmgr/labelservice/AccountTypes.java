
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AccountTypes.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="USPS"/&gt;
 *     &lt;enumeration value="Retail"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountTypes")
@XmlEnum
public enum AccountTypes {

    USPS("USPS"),
    @XmlEnumValue("Retail")
    RETAIL("Retail");
    private final String value;

    AccountTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountTypes fromValue(String v) {
        for (AccountTypes c: AccountTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
