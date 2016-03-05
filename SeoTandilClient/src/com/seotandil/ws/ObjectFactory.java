
package com.seotandil.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.seotandil.ws package. 
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

    private final static QName _EliminarSegmento_QNAME = new QName("http://ws.seotandil.com/", "eliminarSegmento");
    private final static QName _EliminarSegmentoResponse_QNAME = new QName("http://ws.seotandil.com/", "eliminarSegmentoResponse");
    private final static QName _GuardarSegmento_QNAME = new QName("http://ws.seotandil.com/", "guardarSegmento");
    private final static QName _GuardarSegmentoResponse_QNAME = new QName("http://ws.seotandil.com/", "guardarSegmentoResponse");
    private final static QName _HttpRequest_QNAME = new QName("http://ws.seotandil.com/", "httpRequest");
    private final static QName _HttpRequestResponse_QNAME = new QName("http://ws.seotandil.com/", "httpRequestResponse");
    private final static QName _ObtenerEdges_QNAME = new QName("http://ws.seotandil.com/", "obtenerEdges");
    private final static QName _ObtenerEdgesResponse_QNAME = new QName("http://ws.seotandil.com/", "obtenerEdgesResponse");
    private final static QName _ObtenerNodes_QNAME = new QName("http://ws.seotandil.com/", "obtenerNodes");
    private final static QName _ObtenerNodesResponse_QNAME = new QName("http://ws.seotandil.com/", "obtenerNodesResponse");
    private final static QName _ObtenerSegmento_QNAME = new QName("http://ws.seotandil.com/", "obtenerSegmento");
    private final static QName _ObtenerSegmentoResponse_QNAME = new QName("http://ws.seotandil.com/", "obtenerSegmentoResponse");
    private final static QName _ObtenerSegmentos_QNAME = new QName("http://ws.seotandil.com/", "obtenerSegmentos");
    private final static QName _ObtenerSegmentosResponse_QNAME = new QName("http://ws.seotandil.com/", "obtenerSegmentosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.seotandil.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EliminarSegmento }
     * 
     */
    public EliminarSegmento createEliminarSegmento() {
        return new EliminarSegmento();
    }

    /**
     * Create an instance of {@link EliminarSegmentoResponse }
     * 
     */
    public EliminarSegmentoResponse createEliminarSegmentoResponse() {
        return new EliminarSegmentoResponse();
    }

    /**
     * Create an instance of {@link GuardarSegmento }
     * 
     */
    public GuardarSegmento createGuardarSegmento() {
        return new GuardarSegmento();
    }

    /**
     * Create an instance of {@link GuardarSegmentoResponse }
     * 
     */
    public GuardarSegmentoResponse createGuardarSegmentoResponse() {
        return new GuardarSegmentoResponse();
    }

    /**
     * Create an instance of {@link HttpRequest }
     * 
     */
    public HttpRequest createHttpRequest() {
        return new HttpRequest();
    }

    /**
     * Create an instance of {@link HttpRequestResponse }
     * 
     */
    public HttpRequestResponse createHttpRequestResponse() {
        return new HttpRequestResponse();
    }

    /**
     * Create an instance of {@link ObtenerEdges }
     * 
     */
    public ObtenerEdges createObtenerEdges() {
        return new ObtenerEdges();
    }

    /**
     * Create an instance of {@link ObtenerEdgesResponse }
     * 
     */
    public ObtenerEdgesResponse createObtenerEdgesResponse() {
        return new ObtenerEdgesResponse();
    }

    /**
     * Create an instance of {@link ObtenerNodes }
     * 
     */
    public ObtenerNodes createObtenerNodes() {
        return new ObtenerNodes();
    }

    /**
     * Create an instance of {@link ObtenerNodesResponse }
     * 
     */
    public ObtenerNodesResponse createObtenerNodesResponse() {
        return new ObtenerNodesResponse();
    }

    /**
     * Create an instance of {@link ObtenerSegmento }
     * 
     */
    public ObtenerSegmento createObtenerSegmento() {
        return new ObtenerSegmento();
    }

    /**
     * Create an instance of {@link ObtenerSegmentoResponse }
     * 
     */
    public ObtenerSegmentoResponse createObtenerSegmentoResponse() {
        return new ObtenerSegmentoResponse();
    }

    /**
     * Create an instance of {@link ObtenerSegmentos }
     * 
     */
    public ObtenerSegmentos createObtenerSegmentos() {
        return new ObtenerSegmentos();
    }

    /**
     * Create an instance of {@link ObtenerSegmentosResponse }
     * 
     */
    public ObtenerSegmentosResponse createObtenerSegmentosResponse() {
        return new ObtenerSegmentosResponse();
    }

    /**
     * Create an instance of {@link Segmento }
     * 
     */
    public Segmento createSegmento() {
        return new Segmento();
    }

    /**
     * Create an instance of {@link Edge }
     * 
     */
    public Edge createEdge() {
        return new Edge();
    }

    /**
     * Create an instance of {@link Node }
     * 
     */
    public Node createNode() {
        return new Node();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarSegmento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.seotandil.com/", name = "eliminarSegmento")
    public JAXBElement<EliminarSegmento> createEliminarSegmento(EliminarSegmento value) {
        return new JAXBElement<EliminarSegmento>(_EliminarSegmento_QNAME, EliminarSegmento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarSegmentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.seotandil.com/", name = "eliminarSegmentoResponse")
    public JAXBElement<EliminarSegmentoResponse> createEliminarSegmentoResponse(EliminarSegmentoResponse value) {
        return new JAXBElement<EliminarSegmentoResponse>(_EliminarSegmentoResponse_QNAME, EliminarSegmentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarSegmento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.seotandil.com/", name = "guardarSegmento")
    public JAXBElement<GuardarSegmento> createGuardarSegmento(GuardarSegmento value) {
        return new JAXBElement<GuardarSegmento>(_GuardarSegmento_QNAME, GuardarSegmento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarSegmentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.seotandil.com/", name = "guardarSegmentoResponse")
    public JAXBElement<GuardarSegmentoResponse> createGuardarSegmentoResponse(GuardarSegmentoResponse value) {
        return new JAXBElement<GuardarSegmentoResponse>(_GuardarSegmentoResponse_QNAME, GuardarSegmentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HttpRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.seotandil.com/", name = "httpRequest")
    public JAXBElement<HttpRequest> createHttpRequest(HttpRequest value) {
        return new JAXBElement<HttpRequest>(_HttpRequest_QNAME, HttpRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HttpRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.seotandil.com/", name = "httpRequestResponse")
    public JAXBElement<HttpRequestResponse> createHttpRequestResponse(HttpRequestResponse value) {
        return new JAXBElement<HttpRequestResponse>(_HttpRequestResponse_QNAME, HttpRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerEdges }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.seotandil.com/", name = "obtenerEdges")
    public JAXBElement<ObtenerEdges> createObtenerEdges(ObtenerEdges value) {
        return new JAXBElement<ObtenerEdges>(_ObtenerEdges_QNAME, ObtenerEdges.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerEdgesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.seotandil.com/", name = "obtenerEdgesResponse")
    public JAXBElement<ObtenerEdgesResponse> createObtenerEdgesResponse(ObtenerEdgesResponse value) {
        return new JAXBElement<ObtenerEdgesResponse>(_ObtenerEdgesResponse_QNAME, ObtenerEdgesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerNodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.seotandil.com/", name = "obtenerNodes")
    public JAXBElement<ObtenerNodes> createObtenerNodes(ObtenerNodes value) {
        return new JAXBElement<ObtenerNodes>(_ObtenerNodes_QNAME, ObtenerNodes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerNodesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.seotandil.com/", name = "obtenerNodesResponse")
    public JAXBElement<ObtenerNodesResponse> createObtenerNodesResponse(ObtenerNodesResponse value) {
        return new JAXBElement<ObtenerNodesResponse>(_ObtenerNodesResponse_QNAME, ObtenerNodesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerSegmento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.seotandil.com/", name = "obtenerSegmento")
    public JAXBElement<ObtenerSegmento> createObtenerSegmento(ObtenerSegmento value) {
        return new JAXBElement<ObtenerSegmento>(_ObtenerSegmento_QNAME, ObtenerSegmento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerSegmentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.seotandil.com/", name = "obtenerSegmentoResponse")
    public JAXBElement<ObtenerSegmentoResponse> createObtenerSegmentoResponse(ObtenerSegmentoResponse value) {
        return new JAXBElement<ObtenerSegmentoResponse>(_ObtenerSegmentoResponse_QNAME, ObtenerSegmentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerSegmentos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.seotandil.com/", name = "obtenerSegmentos")
    public JAXBElement<ObtenerSegmentos> createObtenerSegmentos(ObtenerSegmentos value) {
        return new JAXBElement<ObtenerSegmentos>(_ObtenerSegmentos_QNAME, ObtenerSegmentos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerSegmentosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.seotandil.com/", name = "obtenerSegmentosResponse")
    public JAXBElement<ObtenerSegmentosResponse> createObtenerSegmentosResponse(ObtenerSegmentosResponse value) {
        return new JAXBElement<ObtenerSegmentosResponse>(_ObtenerSegmentosResponse_QNAME, ObtenerSegmentosResponse.class, null, value);
    }

}
