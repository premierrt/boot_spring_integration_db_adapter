//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 12:15:46 PM CET 
//


package rt.eureka.importy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uslugiLinkiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uslugiLinkiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uslugiLinki" type="{http://rafal/types}uslugaLinkiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uslugiLinkiType", propOrder = {
    "uslugiLinki"
})
public class UslugiLinkiType {

    protected List<UslugaLinkiType> uslugiLinki;

    /**
     * Gets the value of the uslugiLinki property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uslugiLinki property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUslugiLinki().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UslugaLinkiType }
     * 
     * 
     */
    public List<UslugaLinkiType> getUslugiLinki() {
        if (uslugiLinki == null) {
            uslugiLinki = new ArrayList<UslugaLinkiType>();
        }
        return this.uslugiLinki;
    }

}
