
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
 *         &lt;element name="wsalojamientosResult" type="{http://UASI/WS_GRAL.wsdl}ArrayOfClaseAlojamiento" minOccurs="0"/>
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
    "wsalojamientosResult"
})
@XmlRootElement(name = "wsalojamientosResponse")
public class WsalojamientosResponse {

    protected ArrayOfClaseAlojamiento wsalojamientosResult;

    /**
     * Obtiene el valor de la propiedad wsalojamientosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClaseAlojamiento }
     *     
     */
    public ArrayOfClaseAlojamiento getWsalojamientosResult() {
        return wsalojamientosResult;
    }

    /**
     * Define el valor de la propiedad wsalojamientosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClaseAlojamiento }
     *     
     */
    public void setWsalojamientosResult(ArrayOfClaseAlojamiento value) {
        this.wsalojamientosResult = value;
    }

}
