package com.seotandil.ws;

import java.util.List;



public class WsAdapter {

	private static SeoTandilServices portWs=new SeoTandilServices();
	
	public List<Segmento> obtenerSegmentos(){
		ISeoTandilServices seoTandilServicesPort = portWs.getSeoTandilServicesPort();		
		return seoTandilServicesPort.obtenerSegmentos();
	}
	
	
	public List<Node> obtenerNodes() {
	
		return portWs.getSeoTandilServicesPort().obtenerNodes();
	}

	
	public List<Edge> obtenerEdges() {
	
		return portWs.getSeoTandilServicesPort().obtenerEdges();
	}

	
	public Segmento obtenerSegmento(int idEdge, boolean lado) {
	
		return portWs.getSeoTandilServicesPort().obtenerSegmento(idEdge,lado);
	}

	
	public void guardarSegmento(Segmento segmento) {
	
		portWs.getSeoTandilServicesPort().guardarSegmento(segmento);
	}

	
	public void eliminarSegmento(Segmento segmento) {
	
		portWs.getSeoTandilServicesPort().eliminarSegmento(segmento);
	}
	
	public String httpRequest(String patente,Segmento segmento) {
		return portWs.getSeoTandilServicesPort().httpRequest(patente,segmento);
	}

	
}
