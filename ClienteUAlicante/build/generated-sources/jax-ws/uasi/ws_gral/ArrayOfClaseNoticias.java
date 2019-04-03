
package uasi.ws_gral;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfClaseNoticias complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClaseNoticias">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClaseNoticias" type="{http://UASI/WS_GRAL.wsdl}ClaseNoticias" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClaseNoticias", propOrder = {
    "claseNoticias"
})
public class ArrayOfClaseNoticias {

    @XmlElement(name = "ClaseNoticias", nillable = true)
    protected List<ClaseNoticias> claseNoticias;

    /**
     * Gets the value of the claseNoticias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claseNoticias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaseNoticias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaseNoticias }
     * 
     * 
     */
    public List<ClaseNoticias> getClaseNoticias() {
        if (claseNoticias == null) {
            claseNoticias = new ArrayList<ClaseNoticias>();
        }
        return this.claseNoticias;
    }

}
