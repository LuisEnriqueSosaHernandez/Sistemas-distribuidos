
package uasi.ws_gral;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfClaseX500 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClaseX500">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClaseX500" type="{http://UASI/WS_GRAL.wsdl}ClaseX500" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClaseX500", propOrder = {
    "claseX500"
})
public class ArrayOfClaseX500 {

    @XmlElement(name = "ClaseX500", nillable = true)
    protected List<ClaseX500> claseX500;

    /**
     * Gets the value of the claseX500 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claseX500 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaseX500().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaseX500 }
     * 
     * 
     */
    public List<ClaseX500> getClaseX500() {
        if (claseX500 == null) {
            claseX500 = new ArrayList<ClaseX500>();
        }
        return this.claseX500;
    }

}
