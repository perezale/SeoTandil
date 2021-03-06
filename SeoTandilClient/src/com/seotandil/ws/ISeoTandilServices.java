package com.seotandil.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.4
 * 2015-04-25T18:52:03.683-03:00
 * Generated source version: 3.0.4
 * 
 */
@WebService(targetNamespace = "http://ws.seotandil.com/", name = "ISeoTandilServices")
@XmlSeeAlso({ObjectFactory.class})
public interface ISeoTandilServices {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "httpRequest", targetNamespace = "http://ws.seotandil.com/", className = "com.seotandil.ws.HttpRequest")
    @WebMethod
    @ResponseWrapper(localName = "httpRequestResponse", targetNamespace = "http://ws.seotandil.com/", className = "com.seotandil.ws.HttpRequestResponse")
    public java.lang.String httpRequest(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        com.seotandil.ws.Segmento arg1
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "obtenerSegmentos", targetNamespace = "http://ws.seotandil.com/", className = "com.seotandil.ws.ObtenerSegmentos")
    @WebMethod
    @ResponseWrapper(localName = "obtenerSegmentosResponse", targetNamespace = "http://ws.seotandil.com/", className = "com.seotandil.ws.ObtenerSegmentosResponse")
    public java.util.List<com.seotandil.ws.Segmento> obtenerSegmentos();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "obtenerSegmento", targetNamespace = "http://ws.seotandil.com/", className = "com.seotandil.ws.ObtenerSegmento")
    @WebMethod
    @ResponseWrapper(localName = "obtenerSegmentoResponse", targetNamespace = "http://ws.seotandil.com/", className = "com.seotandil.ws.ObtenerSegmentoResponse")
    public com.seotandil.ws.Segmento obtenerSegmento(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        boolean arg1
    );

    @RequestWrapper(localName = "eliminarSegmento", targetNamespace = "http://ws.seotandil.com/", className = "com.seotandil.ws.EliminarSegmento")
    @WebMethod
    @ResponseWrapper(localName = "eliminarSegmentoResponse", targetNamespace = "http://ws.seotandil.com/", className = "com.seotandil.ws.EliminarSegmentoResponse")
    public void eliminarSegmento(
        @WebParam(name = "arg0", targetNamespace = "")
        com.seotandil.ws.Segmento arg0
    );

    @RequestWrapper(localName = "guardarSegmento", targetNamespace = "http://ws.seotandil.com/", className = "com.seotandil.ws.GuardarSegmento")
    @WebMethod
    @ResponseWrapper(localName = "guardarSegmentoResponse", targetNamespace = "http://ws.seotandil.com/", className = "com.seotandil.ws.GuardarSegmentoResponse")
    public void guardarSegmento(
        @WebParam(name = "arg0", targetNamespace = "")
        com.seotandil.ws.Segmento arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "obtenerEdges", targetNamespace = "http://ws.seotandil.com/", className = "com.seotandil.ws.ObtenerEdges")
    @WebMethod
    @ResponseWrapper(localName = "obtenerEdgesResponse", targetNamespace = "http://ws.seotandil.com/", className = "com.seotandil.ws.ObtenerEdgesResponse")
    public java.util.List<com.seotandil.ws.Edge> obtenerEdges();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "obtenerNodes", targetNamespace = "http://ws.seotandil.com/", className = "com.seotandil.ws.ObtenerNodes")
    @WebMethod
    @ResponseWrapper(localName = "obtenerNodesResponse", targetNamespace = "http://ws.seotandil.com/", className = "com.seotandil.ws.ObtenerNodesResponse")
    public java.util.List<com.seotandil.ws.Node> obtenerNodes();
}
