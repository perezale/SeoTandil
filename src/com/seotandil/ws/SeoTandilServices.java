package com.seotandil.ws;

import java.net.URLEncoder;
import java.util.List;
import java.util.Random;

import javax.jws.WebService;

import com.seotandil.db.ConnectionPool;
import com.seotandil.db.DAOFacade;
import com.seotandil.dto.Edge;
import com.seotandil.dto.Node;
import com.seotandil.dto.Segmento;
import commons.MyHttpRequest;

@WebService(targetNamespace = "http://ws.seotandil.com/", endpointInterface = "com.seotandil.ws.ISeoTandilServices", portName = "SeoTandilServicesPort", serviceName = "SeoTandilServicesService")
public class SeoTandilServices implements ISeoTandilServices {

	@Override
	public List<Segmento> obtenerSegmentos() {
		DAOFacade dao = new DAOFacade(ConnectionPool.getSessionFactory());
		return dao.obtenerSegmentos();
	}

	@Override
	public List<Node> obtenerNodes() {
		DAOFacade dao = new DAOFacade(ConnectionPool.getSessionFactory());
		return dao.obtenerNodes();
	}

	@Override
	public List<Edge> obtenerEdges() {
		DAOFacade dao = new DAOFacade(ConnectionPool.getSessionFactory());
		return dao.obtenerEdges();
	}

	@Override
	public Segmento obtenerSegmento(int idEdge, boolean lado) {
		DAOFacade dao = new DAOFacade(ConnectionPool.getSessionFactory());
		return dao.obtenerSegmento(idEdge,lado);
	}

	@Override
	public void guardarSegmento(Segmento segmento) {
		DAOFacade dao = new DAOFacade(ConnectionPool.getSessionFactory());
		dao.guardarSegmento(segmento);
	}

	@Override
	public void eliminarSegmento(Segmento segmento) {
		DAOFacade dao = new DAOFacade(ConnectionPool.getSessionFactory());
		dao.eliminarSegmento(segmento);
	}

	@Override
	public String httpRequest(String patente, Segmento segmento) {
String charset = "ISO-8859-1";
		
		String servicio = "http://servicio.smsmasivos.com.ar/enviar_sms.asp";
		
		String usuario = "SMSDEMO72175";
		String clave = "SMSDEMO72175665";
		
		String destino = "2235198905";
		String texto = patente+"    "+segmento.getCod_calle()+":"+segmento.getAltura();
		
		// test: Si es un 1 el SMS no se envía y se simula la respuesta del server. Si quita el parámetro, se envía el SMS
		String test = "1";  
		
		String queryString = "";
		
		try {
			
			queryString = "?api=1";
			queryString += "&usuario="+ URLEncoder.encode(usuario, charset);
			queryString += "&clave="+ URLEncoder.encode(clave, charset);
			queryString += "&tos="+ URLEncoder.encode(destino, charset);
			queryString += "&texto="+ URLEncoder.encode(texto, charset);
			queryString += "&test="+ test;
			
			// Este Random evita que las URL entren en Caché
			queryString += "&random="+ URLEncoder.encode(new Random().nextInt(9999999) +"", charset);
					
			String resultado = MyHttpRequest.httpRequest(servicio, queryString);
			
			if( (resultado!=null) && (resultado.equals("OK")) ){
				System.out.println("Envío Exitoso");
			}else{
				System.out.println("Error al envíar el SMS");
			}
			
		} catch (Exception e) {
			System.out.println("Error desconocido: "+ e.getMessage());
			return "ERROR";
		}	
		return "OK";
	}
	
	
	
	

}
