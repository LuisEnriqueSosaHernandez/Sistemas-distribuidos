
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
 *         &lt;element name="wsnoticiasResult" type="{http://UASI/WS_GRAL.wsdl}ArrayOfClaseNoticias" minOccurs="0"/>
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
    "wsnoticiasResult"
})
@XmlRootElement(name = "wsnoticiasResponse")
public class WsnoticiasResponse {

    protected ArrayOfClaseNoticias wsnoticiasResult;

    /**
     * Obtiene el valor de la propiedad wsnoticiasResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClaseNoticias }
     *     
     */
    public ArrayOfClaseNoticias getWsnoticiasResult() {
        return wsnoticiasResult;
    }

    /**
     * Define el valor de la propiedad wsnoticiasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClaseNoticias }
     *     
     */
    public void setWsnoticiasResult(ArrayOfClaseNoticias value) {
        this.wsnoticiasResult = value;
    }

}
