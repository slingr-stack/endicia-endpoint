
package core.labelnumberservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the core.labelnumberservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CustomsInfo_QNAME = new QName("LabelNumberService.Core", "CustomsInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: core.labelnumberservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomsInfo }
     * 
     */
    public CustomsInfo createCustomsInfo() {
        return new CustomsInfo();
    }

    /**
     * Create an instance of {@link DataValidator }
     * 
     */
    public DataValidator createDataValidator() {
        return new DataValidator();
    }

    /**
     * Create an instance of {@link CustomsItem }
     * 
     */
    public CustomsItem createCustomsItem() {
        return new CustomsItem();
    }

    /**
     * Create an instance of {@link ArrayOfCustomsItem }
     * 
     */
    public ArrayOfCustomsItem createArrayOfCustomsItem() {
        return new ArrayOfCustomsItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "LabelNumberService.Core", name = "CustomsInfo")
    public JAXBElement<CustomsInfo> createCustomsInfo(CustomsInfo value) {
        return new JAXBElement<CustomsInfo>(_CustomsInfo_QNAME, CustomsInfo.class, null, value);
    }

}
