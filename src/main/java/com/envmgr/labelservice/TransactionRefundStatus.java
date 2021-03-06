
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TransactionRefundStatus.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionRefundStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *     &lt;enumeration value="SUBMITTED"/&gt;
 *     &lt;enumeration value="VALIDATED"/&gt;
 *     &lt;enumeration value="REJECTED"/&gt;
 *     &lt;enumeration value="REFUNDED"/&gt;
 *     &lt;enumeration value="MANUAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionRefundStatus")
@XmlEnum
public enum TransactionRefundStatus {

    ALL,
    SUBMITTED,
    VALIDATED,
    REJECTED,
    REFUNDED,
    MANUAL;

    public String value() {
        return name();
    }

    public static TransactionRefundStatus fromValue(String v) {
        return valueOf(v);
    }

}
