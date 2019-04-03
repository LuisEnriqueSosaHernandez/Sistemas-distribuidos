
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
 *         &lt;element name="wsdiasfestivosResult" type="{http://UASI/WS_GRAL.wsdl}ArrayOfClaseDiasFestivos" minOccurs="0"/>
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
    "wsdiasfestivosResult"
})
@XmlRootElement(name = "wsdiasfestivosResponse")
public class WsdiasfestivosResponse {

    protected ArrayOfClaseDiasFestivos wsdiasfestivosResult;

    /**
     * Obtiene el valor de la propiedad wsdiasfestivosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClaseDiasFestivos }
     *     
     */
    public ArrayOfClaseDiasFestivos getWsdiasfestivosResult() {
        return wsdiasfestivosResult;
    }

    /**
     * Define el valor de la propiedad wsdiasfestivosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClaseDiasFestivos }
     *     
     */
    public void setWsdiasfestivosResult(ArrayOfClaseDiasFestivos value) {
        this.wsdiasfestivosResult = value;
    }

}
