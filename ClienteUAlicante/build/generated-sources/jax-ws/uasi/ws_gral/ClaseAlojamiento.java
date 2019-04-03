
package uasi.ws_gral;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClaseAlojamiento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClaseAlojamiento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idalojamiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idtipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripciontipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigotipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idregimen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionregimen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoregimen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idzona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionzona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaalta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="latitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="longitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habitaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plazas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlinfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urladicional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailcontacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaseAlojamiento", propOrder = {
    "idalojamiento",
    "direccion",
    "contacto",
    "precio",
    "fecha",
    "observaciones",
    "idtipo",
    "descripciontipo",
    "codigotipo",
    "idregimen",
    "descripcionregimen",
    "codigoregimen",
    "idzona",
    "descripcionzona",
    "fechaalta",
    "latitud",
    "longitud",
    "telefono",
    "habitaciones",
    "plazas",
    "urlinfo",
    "urladicional",
    "emailcontacto"
})
public class ClaseAlojamiento {

    protected String idalojamiento;
    protected String direccion;
    protected String contacto;
    protected String precio;
    protected String fecha;
    protected String observaciones;
    protected String idtipo;
    protected String descripciontipo;
    protected String codigotipo;
    protected String idregimen;
    protected String descripcionregimen;
    protected String codigoregimen;
    protected String idzona;
    protected String descripcionzona;
    protected String fechaalta;
    protected String latitud;
    protected String longitud;
    protected String telefono;
    protected String habitaciones;
    protected String plazas;
    protected String urlinfo;
    protected String urladicional;
    protected String emailcontacto;

    /**
     * Obtiene el valor de la propiedad idalojamiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdalojamiento() {
        return idalojamiento;
    }

    /**
     * Define el valor de la propiedad idalojamiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdalojamiento(String value) {
        this.idalojamiento = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad contacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContacto() {
        return contacto;
    }

    /**
     * Define el valor de la propiedad contacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContacto(String value) {
        this.contacto = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecio(String value) {
        this.precio = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad observaciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Define el valor de la propiedad observaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservaciones(String value) {
        this.observaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad idtipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdtipo() {
        return idtipo;
    }

    /**
     * Define el valor de la propiedad idtipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdtipo(String value) {
        this.idtipo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripciontipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripciontipo() {
        return descripciontipo;
    }

    /**
     * Define el valor de la propiedad descripciontipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripciontipo(String value) {
        this.descripciontipo = value;
    }

    /**
     * Obtiene el valor de la propiedad codigotipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigotipo() {
        return codigotipo;
    }

    /**
     * Define el valor de la propiedad codigotipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigotipo(String value) {
        this.codigotipo = value;
    }

    /**
     * Obtiene el valor de la propiedad idregimen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdregimen() {
        return idregimen;
    }

    /**
     * Define el valor de la propiedad idregimen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdregimen(String value) {
        this.idregimen = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionregimen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionregimen() {
        return descripcionregimen;
    }

    /**
     * Define el valor de la propiedad descripcionregimen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionregimen(String value) {
        this.descripcionregimen = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoregimen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoregimen() {
        return codigoregimen;
    }

    /**
     * Define el valor de la propiedad codigoregimen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoregimen(String value) {
        this.codigoregimen = value;
    }

    /**
     * Obtiene el valor de la propiedad idzona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdzona() {
        return idzona;
    }

    /**
     * Define el valor de la propiedad idzona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdzona(String value) {
        this.idzona = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionzona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionzona() {
        return descripcionzona;
    }

    /**
     * Define el valor de la propiedad descripcionzona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionzona(String value) {
        this.descripcionzona = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaalta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaalta() {
        return fechaalta;
    }

    /**
     * Define el valor de la propiedad fechaalta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaalta(String value) {
        this.fechaalta = value;
    }

    /**
     * Obtiene el valor de la propiedad latitud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitud() {
        return latitud;
    }

    /**
     * Define el valor de la propiedad latitud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitud(String value) {
        this.latitud = value;
    }

    /**
     * Obtiene el valor de la propiedad longitud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitud() {
        return longitud;
    }

    /**
     * Define el valor de la propiedad longitud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitud(String value) {
        this.longitud = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad habitaciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabitaciones() {
        return habitaciones;
    }

    /**
     * Define el valor de la propiedad habitaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabitaciones(String value) {
        this.habitaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad plazas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlazas() {
        return plazas;
    }

    /**
     * Define el valor de la propiedad plazas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlazas(String value) {
        this.plazas = value;
    }

    /**
     * Obtiene el valor de la propiedad urlinfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlinfo() {
        return urlinfo;
    }

    /**
     * Define el valor de la propiedad urlinfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlinfo(String value) {
        this.urlinfo = value;
    }

    /**
     * Obtiene el valor de la propiedad urladicional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrladicional() {
        return urladicional;
    }

    /**
     * Define el valor de la propiedad urladicional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrladicional(String value) {
        this.urladicional = value;
    }

    /**
     * Obtiene el valor de la propiedad emailcontacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailcontacto() {
        return emailcontacto;
    }

    /**
     * Define el valor de la propiedad emailcontacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailcontacto(String value) {
        this.emailcontacto = value;
    }

}
