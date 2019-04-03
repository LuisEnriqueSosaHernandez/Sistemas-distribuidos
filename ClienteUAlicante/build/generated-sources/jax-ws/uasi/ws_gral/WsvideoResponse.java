
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
 *         &lt;element name="wsvideoResult" type="{http://UASI/WS_GRAL.wsdl}ArrayOfClaseVideo" minOccurs="0"/>
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
    "wsvideoResult"
})
@XmlRootElement(name = "wsvideoResponse")
public class WsvideoResponse {

    protected ArrayOfClaseVideo wsvideoResult;

    /**
     * Obtiene el valor de la propiedad wsvideoResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClaseVideo }
     *     
     */
    public ArrayOfClaseVideo getWsvideoResult() {
        return wsvideoResult;
    }

    /**
     * Define el valor de la propiedad wsvideoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClaseVideo }
     *     
     */
    public void setWsvideoResult(ArrayOfClaseVideo value) {
        this.wsvideoResult = value;
    }

}
