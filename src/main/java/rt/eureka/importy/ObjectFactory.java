//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 12:15:46 PM CET 
//


package rt.eureka.importy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the rt.eureka.importy package. 
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

    private final static QName _UslugiLinki_QNAME = new QName("http://rafal/types", "uslugiLinki");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: rt.eureka.importy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UslugiLinkiType }
     * 
     */
    public UslugiLinkiType createUslugiLinkiType() {
        return new UslugiLinkiType();
    }

    /**
     * Create an instance of {@link UslugaLinkiType }
     * 
     */
    public UslugaLinkiType createUslugaLinkiType() {
        return new UslugaLinkiType();
    }

    /**
     * Create an instance of {@link Powiazanie }
     * 
     */
    public Powiazanie createPowiazanie() {
        return new Powiazanie();
    }

    /**
     * Create an instance of {@link RelacjaPowiazania }
     * 
     */
    public RelacjaPowiazania createRelacjaPowiazania() {
        return new RelacjaPowiazania();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UslugiLinkiType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rafal/types", name = "uslugiLinki")
    public JAXBElement<UslugiLinkiType> createUslugiLinki(UslugiLinkiType value) {
        return new JAXBElement<UslugiLinkiType>(_UslugiLinki_QNAME, UslugiLinkiType.class, null, value);
    }

}