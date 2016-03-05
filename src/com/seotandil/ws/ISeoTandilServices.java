package com.seotandil.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.seotandil.dto.Edge;
import com.seotandil.dto.Node;
import com.seotandil.dto.Segmento;

@WebService
public interface ISeoTandilServices {

	@WebMethod
	public List<Segmento> obtenerSegmentos();
	
	@WebMethod
	public List<Node> obtenerNodes();
	
	@WebMethod
	public List<Edge> obtenerEdges();
	
	@WebMethod
	Segmento obtenerSegmento(int idEdge, boolean lado);
	
	@WebMethod
	public void guardarSegmento(Segmento segmento);
	
	@WebMethod
	public void eliminarSegmento(Segmento segmento);
	
	@WebMethod
	public String httpRequest(String patente,Segmento segmento);
}
