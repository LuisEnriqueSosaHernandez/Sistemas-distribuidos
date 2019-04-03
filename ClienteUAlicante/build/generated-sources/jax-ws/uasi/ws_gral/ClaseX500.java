
package uasi.ws_gral;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClaseX500 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClaseX500">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="colectivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cod_persona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apellido1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apellido2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idsubunidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subunidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idcargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idunidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoestudio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estudios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefono1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefono2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fax1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fax2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="foto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaseX500", propOrder = {
    "colectivo",
    "codPersona",
    "nombre",
    "apellido1",
    "apellido2",
    "idsubunidad",
    "subunidad",
    "email",
    "idcargo",
    "cargo",
    "idunidad",
    "unidad",
    "tipoestudio",
    "estudios",
    "url",
    "telefono1",
    "telefono2",
    "fax1",
    "fax2",
    "movil",
    "nif",
    "foto"
})
public class ClaseX500 {

    protected String colectivo;
    @XmlElement(name = "cod_persona")
    protected String codPersona;
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected String idsubunidad;
    protected String subunidad;
    protected String email;
    protected String idcargo;
    protected String cargo;
    protected String idunidad;
    protected String unidad;
    protected String tipoestudio;
    protected String estudios;
    protected String url;
    protected String telefono1;
    protected String telefono2;
    protected String fax1;
    protected String fax2;
    protected String movil;
    protected String nif;
    protected String foto;

    /**
     * Obtiene el valor de la propiedad colectivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColectivo() {
        return colectivo;
    }

    /**
     * Define el valor de la propiedad colectivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColectivo(String value) {
        this.colectivo = value;
    }

    /**
     * Obtiene el valor de la propiedad codPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPersona() {
        return codPersona;
    }

    /**
     * Define el valor de la propiedad codPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPersona(String value) {
        this.codPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad apellido1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * Define el valor de la propiedad apellido1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido1(String value) {
        this.apellido1 = value;
    }

    /**
     * Obtiene el valor de la propiedad apellido2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * Define el valor de la propiedad apellido2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido2(String value) {
        this.apellido2 = value;
    }

    /**
     * Obtiene el valor de la propiedad idsubunidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdsubunidad() {
        return idsubunidad;
    }

    /**
     * Define el valor de la propiedad idsubunidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdsubunidad(String value) {
        this.idsubunidad = value;
    }

    /**
     * Obtiene el valor de la propiedad subunidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubunidad() {
        return subunidad;
    }

    /**
     * Define el valor de la propiedad subunidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubunidad(String value) {
        this.subunidad = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad idcargo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcargo() {
        return idcargo;
    }

    /**
     * Define el valor de la propiedad idcargo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcargo(String value) {
        this.idcargo = value;
    }

    /**
     * Obtiene el valor de la propiedad cargo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Define el valor de la propiedad cargo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargo(String value) {
        this.cargo = value;
    }

    /**
     * Obtiene el valor de la propiedad idunidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdunidad() {
        return idunidad;
    }

    /**
     * Define el valor de la propiedad idunidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdunidad(String value) {
        this.idunidad = value;
    }

    /**
     * Obtiene el valor de la propiedad unidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidad() {
        return unidad;
    }

    /**
     * Define el valor de la propiedad unidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidad(String value) {
        this.unidad = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoestudio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoestudio() {
        return tipoestudio;
    }

    /**
     * Define el valor de la propiedad tipoestudio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoestudio(String value) {
        this.tipoestudio = value;
    }

    /**
     * Obtiene el valor de la propiedad estudios.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstudios() {
        return estudios;
    }

    /**
     * Define el valor de la propiedad estudios.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstudios(String value) {
        this.estudios = value;
    }

    /**
     * Obtiene el valor de la propiedad url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Define el valor de la propiedad url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono1() {
        return telefono1;
    }

    /**
     * Define el valor de la propiedad telefono1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono1(String value) {
        this.telefono1 = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono2() {
        return telefono2;
    }

    /**
     * Define el valor de la propiedad telefono2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono2(String value) {
        this.telefono2 = value;
    }

    /**
     * Obtiene el valor de la propiedad fax1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax1() {
        return fax1;
    }

    /**
     * Define el valor de la propiedad fax1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax1(String value) {
        this.fax1 = value;
    }

    /**
     * Obtiene el valor de la propiedad fax2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax2() {
        return fax2;
    }

    /**
     * Define el valor de la propiedad fax2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax2(String value) {
        this.fax2 = value;
    }

    /**
     * Obtiene el valor de la propiedad movil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovil() {
        return movil;
    }

    /**
     * Define el valor de la propiedad movil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovil(String value) {
        this.movil = value;
    }

    /**
     * Obtiene el valor de la propiedad nif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNif() {
        return nif;
    }

    /**
     * Define el valor de la propiedad nif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNif(String value) {
        this.nif = value;
    }

    /**
     * Obtiene el valor de la propiedad foto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoto() {
        return foto;
    }

    /**
     * Define el valor de la propiedad foto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoto(String value) {
        this.foto = value;
    }

}
