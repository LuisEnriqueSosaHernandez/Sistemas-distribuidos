
package itver.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the itver.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DivResponse_QNAME = new QName("http://ws.itver/", "divResponse");
    private final static QName _Mult_QNAME = new QName("http://ws.itver/", "mult");
    private final static QName _Div_QNAME = new QName("http://ws.itver/", "div");
    private final static QName _Suma_QNAME = new QName("http://ws.itver/", "suma");
    private final static QName _SumaResponse_QNAME = new QName("http://ws.itver/", "sumaResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://ws.itver/", "helloResponse");
    private final static QName _Pot_QNAME = new QName("http://ws.itver/", "pot");
    private final static QName _Hello_QNAME = new QName("http://ws.itver/", "hello");
    private final static QName _Resta_QNAME = new QName("http://ws.itver/", "resta");
    private final static QName _MultResponse_QNAME = new QName("http://ws.itver/", "multResponse");
    private final static QName _PotResponse_QNAME = new QName("http://ws.itver/", "potResponse");
    private final static QName _RestaResponse_QNAME = new QName("http://ws.itver/", "restaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: itver.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Div }
     * 
     */
    public Div createDiv() {
        return new Div();
    }

    /**
     * Create an instance of {@link Suma }
     * 
     */
    public Suma createSuma() {
        return new Suma();
    }

    /**
     * Create an instance of {@link SumaResponse }
     * 
     */
    public SumaResponse createSumaResponse() {
        return new SumaResponse();
    }

    /**
     * Create an instance of {@link DivResponse }
     * 
     */
    public DivResponse createDivResponse() {
        return new DivResponse();
    }

    /**
     * Create an instance of {@link Mult }
     * 
     */
    public Mult createMult() {
        return new Mult();
    }

    /**
     * Create an instance of {@link Pot }
     * 
     */
    public Pot createPot() {
        return new Pot();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link MultResponse }
     * 
     */
    public MultResponse createMultResponse() {
        return new MultResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link Resta }
     * 
     */
    public Resta createResta() {
        return new Resta();
    }

    /**
     * Create an instance of {@link PotResponse }
     * 
     */
    public PotResponse createPotResponse() {
        return new PotResponse();
    }

    /**
     * Create an instance of {@link RestaResponse }
     * 
     */
    public RestaResponse createRestaResponse() {
        return new RestaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.itver/", name = "divResponse")
    public JAXBElement<DivResponse> createDivResponse(DivResponse value) {
        return new JAXBElement<DivResponse>(_DivResponse_QNAME, DivResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.itver/", name = "mult")
    public JAXBElement<Mult> createMult(Mult value) {
        return new JAXBElement<Mult>(_Mult_QNAME, Mult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Div }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.itver/", name = "div")
    public JAXBElement<Div> createDiv(Div value) {
        return new JAXBElement<Div>(_Div_QNAME, Div.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Suma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.itver/", name = "suma")
    public JAXBElement<Suma> createSuma(Suma value) {
        return new JAXBElement<Suma>(_Suma_QNAME, Suma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.itver/", name = "sumaResponse")
    public JAXBElement<SumaResponse> createSumaResponse(SumaResponse value) {
        return new JAXBElement<SumaResponse>(_SumaResponse_QNAME, SumaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.itver/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.itver/", name = "pot")
    public JAXBElement<Pot> createPot(Pot value) {
        return new JAXBElement<Pot>(_Pot_QNAME, Pot.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.itver/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Resta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.itver/", name = "resta")
    public JAXBElement<Resta> createResta(Resta value) {
        return new JAXBElement<Resta>(_Resta_QNAME, Resta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.itver/", name = "multResponse")
    public JAXBElement<MultResponse> createMultResponse(MultResponse value) {
        return new JAXBElement<MultResponse>(_MultResponse_QNAME, MultResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PotResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.itver/", name = "potResponse")
    public JAXBElement<PotResponse> createPotResponse(PotResponse value) {
        return new JAXBElement<PotResponse>(_PotResponse_QNAME, PotResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.itver/", name = "restaResponse")
    public JAXBElement<RestaResponse> createRestaResponse(RestaResponse value) {
        return new JAXBElement<RestaResponse>(_RestaResponse_QNAME, RestaResponse.class, null, value);
    }

}
