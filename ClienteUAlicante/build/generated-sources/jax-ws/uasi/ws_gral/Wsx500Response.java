
package uasi.ws_gral;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsx500Result" type="{http://UASI/WS_GRAL.wsdl}ArrayOfClaseX500" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "wsx500Result"
})
@XmlRootElement(name = "wsx500Response")
public class Wsx500Response {

    protected ArrayOfClaseX500 wsx500Result;

    /**
     * Obtiene el valor de la propiedad wsx500Result.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClaseX500 }
     *     
     */
    public ArrayOfClaseX500 getWsx500Result() {
        return wsx500Result;
    }

    /**
     * Define el valor de la propiedad wsx500Result.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClaseX500 }
     *     
     */
    public void setWsx500Result(ArrayOfClaseX500 value) {
        this.wsx500Result = value;
    }

}
