
package uasi.ws_gral;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfClaseVideo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClaseVideo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClaseVideo" type="{http://UASI/WS_GRAL.wsdl}ClaseVideo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClaseVideo", propOrder = {
    "claseVideo"
})
public class ArrayOfClaseVideo {

    @XmlElement(name = "ClaseVideo", nillable = true)
    protected List<ClaseVideo> claseVideo;

    /**
     * Gets the value of the claseVideo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claseVideo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaseVideo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaseVideo }
     * 
     * 
     */
    public List<ClaseVideo> getClaseVideo() {
        if (claseVideo == null) {
            claseVideo = new ArrayList<ClaseVideo>();
        }
        return this.claseVideo;
    }

}
