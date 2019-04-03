
package uasi.ws_gral;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClaseDiasFestivos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClaseDiasFestivos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaini" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechafin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ambito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomambito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomtipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codcen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaseDiasFestivos", propOrder = {
    "caca",
    "fechaini",
    "fechafin",
    "descripcion",
    "ambito",
    "nomambito",
    "tipo",
    "nomtipo",
    "codcen"
})
public class ClaseDiasFestivos {

    protected String caca;
    protected String fechaini;
    protected String fechafin;
    protected String descripcion;
    protected String ambito;
    protected String nomambito;
    protected String tipo;
    protected String nomtipo;
    protected String codcen;

    /**
     * Obtiene el valor de la propiedad caca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaca() {
        return caca;
    }

    /**
     * Define el valor de la propiedad caca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaca(String value) {
        this.caca = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaini.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaini() {
        return fechaini;
    }

    /**
     * Define el valor de la propiedad fechaini.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaini(String value) {
        this.fechaini = value;
    }

    /**
     * Obtiene el valor de la propiedad fechafin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechafin() {
        return fechafin;
    }

    /**
     * Define el valor de la propiedad fechafin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechafin(String value) {
        this.fechafin = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad ambito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmbito() {
        return ambito;
    }

    /**
     * Define el valor de la propiedad ambito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmbito(String value) {
        this.ambito = value;
    }

    /**
     * Obtiene el valor de la propiedad nomambito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomambito() {
        return nomambito;
    }

    /**
     * Define el valor de la propiedad nomambito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomambito(String value) {
        this.nomambito = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad nomtipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomtipo() {
        return nomtipo;
    }

    /**
     * Define el valor de la propiedad nomtipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomtipo(String value) {
        this.nomtipo = value;
    }

    /**
     * Obtiene el valor de la propiedad codcen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodcen() {
        return codcen;
    }

    /**
     * Define el valor de la propiedad codcen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodcen(String value) {
        this.codcen = value;
    }

}
