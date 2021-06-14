
package com.envmgr.labelservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NotificationType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="NotificationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ShipmentCreated"/&gt;
 *     &lt;enumeration value="DeliveryDateAnnounced"/&gt;
 *     &lt;enumeration value="OutForDelivery"/&gt;
 *     &lt;enumeration value="Delivered"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NotificationType")
@XmlEnum
public enum NotificationType {

    @XmlEnumValue("ShipmentCreated")
    SHIPMENT_CREATED("ShipmentCreated"),
    @XmlEnumValue("DeliveryDateAnnounced")
    DELIVERY_DATE_ANNOUNCED("DeliveryDateAnnounced"),
    @XmlEnumValue("OutForDelivery")
    OUT_FOR_DELIVERY("OutForDelivery"),
    @XmlEnumValue("Delivered")
    DELIVERED("Delivered");
    private final String value;

    NotificationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NotificationType fromValue(String v) {
        for (NotificationType c: NotificationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
