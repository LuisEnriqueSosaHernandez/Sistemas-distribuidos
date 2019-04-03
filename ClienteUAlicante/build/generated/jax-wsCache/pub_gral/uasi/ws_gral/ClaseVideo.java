
package uasi.ws_gral;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClaseVideo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClaseVideo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idfoto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imagen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resumen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombrevideo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tamano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="palabras_clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha_publicado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_lugar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="menu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ramava" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idtipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechanum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoria_itunesu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orden_itunesu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tamano_videomovil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="videomovil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaseVideo", propOrder = {
    "idfoto",
    "id",
    "imagen",
    "titulo",
    "autor",
    "resumen",
    "nombrevideo",
    "codec",
    "tamano",
    "duracion",
    "palabrasClave",
    "fechaPublicado",
    "zona",
    "idLugar",
    "menu",
    "rama",
    "ramava",
    "idtipo",
    "fechanum",
    "categoriaItunesu",
    "ordenItunesu",
    "tamanoVideomovil",
    "videomovil"
})
public class ClaseVideo {

    protected String idfoto;
    protected String id;
    protected String imagen;
    protected String titulo;
    protected String autor;
    protected String resumen;
    protected String nombrevideo;
    protected String codec;
    protected String tamano;
    protected String duracion;
    @XmlElement(name = "palabras_clave")
    protected String palabrasClave;
    @XmlElement(name = "fecha_publicado")
    protected String fechaPublicado;
    protected String zona;
    @XmlElement(name = "id_lugar")
    protected String idLugar;
    protected String menu;
    protected String rama;
    protected String ramava;
    protected String idtipo;
    protected String fechanum;
    @XmlElement(name = "categoria_itunesu")
    protected String categoriaItunesu;
    @XmlElement(name = "orden_itunesu")
    protected String ordenItunesu;
    @XmlElement(name = "tamano_videomovil")
    protected String tamanoVideomovil;
    protected String videomovil;

    /**
     * Obtiene el valor de la propiedad idfoto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdfoto() {
        return idfoto;
    }

    /**
     * Define el valor de la propiedad idfoto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdfoto(String value) {
        this.idfoto = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad imagen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Define el valor de la propiedad imagen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagen(String value) {
        this.imagen = value;
    }

    /**
     * Obtiene el valor de la propiedad titulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define el valor de la propiedad titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

    /**
     * Obtiene el valor de la propiedad autor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Define el valor de la propiedad autor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutor(String value) {
        this.autor = value;
    }

    /**
     * Obtiene el valor de la propiedad resumen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResumen() {
        return resumen;
    }

    /**
     * Define el valor de la propiedad resumen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResumen(String value) {
        this.resumen = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrevideo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrevideo() {
        return nombrevideo;
    }

    /**
     * Define el valor de la propiedad nombrevideo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrevideo(String value) {
        this.nombrevideo = value;
    }

    /**
     * Obtiene el valor de la propiedad codec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodec() {
        return codec;
    }

    /**
     * Define el valor de la propiedad codec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodec(String value) {
        this.codec = value;
    }

    /**
     * Obtiene el valor de la propiedad tamano.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTamano() {
        return tamano;
    }

    /**
     * Define el valor de la propiedad tamano.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTamano(String value) {
        this.tamano = value;
    }

    /**
     * Obtiene el valor de la propiedad duracion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuracion() {
        return duracion;
    }

    /**
     * Define el valor de la propiedad duracion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuracion(String value) {
        this.duracion = value;
    }

    /**
     * Obtiene el valor de la propiedad palabrasClave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPalabrasClave() {
        return palabrasClave;
    }

    /**
     * Define el valor de la propiedad palabrasClave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPalabrasClave(String value) {
        this.palabrasClave = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPublicado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPublicado() {
        return fechaPublicado;
    }

    /**
     * Define el valor de la propiedad fechaPublicado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPublicado(String value) {
        this.fechaPublicado = value;
    }

    /**
     * Obtiene el valor de la propiedad zona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZona() {
        return zona;
    }

    /**
     * Define el valor de la propiedad zona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZona(String value) {
        this.zona = value;
    }

    /**
     * Obtiene el valor de la propiedad idLugar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdLugar() {
        return idLugar;
    }

    /**
     * Define el valor de la propiedad idLugar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdLugar(String value) {
        this.idLugar = value;
    }

    /**
     * Obtiene el valor de la propiedad menu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMenu() {
        return menu;
    }

    /**
     * Define el valor de la propiedad menu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMenu(String value) {
        this.menu = value;
    }

    /**
     * Obtiene el valor de la propiedad rama.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRama() {
        return rama;
    }

    /**
     * Define el valor de la propiedad rama.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRama(String value) {
        this.rama = value;
    }

    /**
     * Obtiene el valor de la propiedad ramava.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRamava() {
        return ramava;
    }

    /**
     * Define el valor de la propiedad ramava.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRamava(String value) {
        this.ramava = value;
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
     * Obtiene el valor de la propiedad fechanum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechanum() {
        return fechanum;
    }

    /**
     * Define el valor de la propiedad fechanum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechanum(String value) {
        this.fechanum = value;
    }

    /**
     * Obtiene el valor de la propiedad categoriaItunesu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoriaItunesu() {
        return categoriaItunesu;
    }

    /**
     * Define el valor de la propiedad categoriaItunesu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoriaItunesu(String value) {
        this.categoriaItunesu = value;
    }

    /**
     * Obtiene el valor de la propiedad ordenItunesu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdenItunesu() {
        return ordenItunesu;
    }

    /**
     * Define el valor de la propiedad ordenItunesu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdenItunesu(String value) {
        this.ordenItunesu = value;
    }

    /**
     * Obtiene el valor de la propiedad tamanoVideomovil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTamanoVideomovil() {
        return tamanoVideomovil;
    }

    /**
     * Define el valor de la propiedad tamanoVideomovil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTamanoVideomovil(String value) {
        this.tamanoVideomovil = value;
    }

    /**
     * Obtiene el valor de la propiedad videomovil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideomovil() {
        return videomovil;
    }

    /**
     * Define el valor de la propiedad videomovil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideomovil(String value) {
        this.videomovil = value;
    }

}
