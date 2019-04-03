
package uasi.ws_gral;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfClaseAlojamiento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClaseAlojamiento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClaseAlojamiento" type="{http://UASI/WS_GRAL.wsdl}ClaseAlojamiento" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClaseAlojamiento", propOrder = {
    "claseAlojamiento"
})
public class ArrayOfClaseAlojamiento {

    @XmlElement(name = "ClaseAlojamiento", nillable = true)
    protected List<ClaseAlojamiento> claseAlojamiento;

    /**
     * Gets the value of the claseAlojamiento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claseAlojamiento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaseAlojamiento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaseAlojamiento }
     * 
     * 
     */
    public List<ClaseAlojamiento> getClaseAlojamiento() {
        if (claseAlojamiento == null) {
            claseAlojamiento = new ArrayList<ClaseAlojamiento>();
        }
        return this.claseAlojamiento;
    }

}
