
package uasi.ws_gral;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfClaseDiasFestivos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClaseDiasFestivos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClaseDiasFestivos" type="{http://UASI/WS_GRAL.wsdl}ClaseDiasFestivos" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClaseDiasFestivos", propOrder = {
    "claseDiasFestivos"
})
public class ArrayOfClaseDiasFestivos {

    @XmlElement(name = "ClaseDiasFestivos", nillable = true)
    protected List<ClaseDiasFestivos> claseDiasFestivos;

    /**
     * Gets the value of the claseDiasFestivos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claseDiasFestivos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaseDiasFestivos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaseDiasFestivos }
     * 
     * 
     */
    public List<ClaseDiasFestivos> getClaseDiasFestivos() {
        if (claseDiasFestivos == null) {
            claseDiasFestivos = new ArrayList<ClaseDiasFestivos>();
        }
        return this.claseDiasFestivos;
    }

}
