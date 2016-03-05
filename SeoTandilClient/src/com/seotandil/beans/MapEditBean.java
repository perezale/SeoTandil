package com.seotandil.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import math.geom2d.line.Line2D;

import org.primefaces.event.map.OverlaySelectEvent;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;



import com.seotandil.dto.SeoPolyline;
import com.seotandil.ws.Edge;
import com.seotandil.ws.Segmento;
import com.seotandil.ws.WsAdapter;


@ManagedBean(name="mapEditView")
@ViewScoped
public class MapEditBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private static WsAdapter wsAdapter = new WsAdapter();

	
	MapModel model;
	List<Segmento> segmentos;
	List<Segmento> segmentos_filtered;
	Segmento segmento;	
	
	List<Edge> edges;
	
	String calle_seleccionada ="";
	Boolean lado = null;
	String cod_calle;
	Integer altura ;
	int clasificacion;
	Clasificacion currentClasification;
	
	Clasificacion[] clasificaciones = new Clasificacion[]{
												Clasificacion.LIBRE,
												Clasificacion.MEDIDO,
												Clasificacion.PROHIBIDO,
												Clasificacion.PERMITIDO
											};
		
	public MapEditBean(){		
		segmento = new Segmento();
		
		segmentos = wsAdapter.obtenerSegmentos();
		edges= wsAdapter.obtenerEdges();
		
		List<SeoPolyline> seo=crearSeoPolyline(edges);
	
		model = new DefaultMapModel();
		
		CargarSegmentosSinClasificar(seo, segmentos);
		CargarSegmentosClasificados(segmentos);				
	}

	public void CargarSegmentosSinClasificar(List<SeoPolyline> lineas, List<Segmento> segmentos_clasificados){ 		
		for(SeoPolyline linea:lineas)
		{
			if(!Comun.existe(linea.getSegmento(), segmentos_clasificados)){ 
				model.addOverlay(linea);
			}
		}
	}
	
	public void CargarSegmentosClasificados(List<Segmento> segmentos_clasificados){ 
		for(Segmento s : segmentos_clasificados){
			List<SeoPolyline> polys = crearSeoPolyline(Arrays.asList(new Edge[]{s.getEdge()}));
			//model.addOverlay(Comun.ObtenerSeoPolyline(s)); 
			for(SeoPolyline line : polys){
				int clasif = s.getClasificacion();
				String color = Comun.ObtenerColor(clasif);
				line.setSegmento(s);
				line.setStrokeColor(color);
				model.addOverlay(line);
			}
		}		
	}
	
	public Clasificacion[] getClasificaciones() {
		return clasificaciones;
	}

	public void setClasificaciones(Clasificacion[] clasificaciones) {
		this.clasificaciones = clasificaciones;
	}

	public List<Segmento> getSegmentos() {
		return segmentos;
	}

	public void setSegmentos(List<Segmento> segmentos) {
		this.segmentos = segmentos;
	}

	public Segmento getSegmento() {
		return segmento;
	}

	public void setSegmento(Segmento segmento) {
		this.segmento = segmento;
	}

	public List<Segmento> getSegmentos_filtered() {
		return segmentos_filtered;
	}

	public void setSegmentos_filtered(List<Segmento> segmentos_filtered) {
		this.segmentos_filtered = segmentos_filtered;
	}	
	

	public String getCalle_seleccionada() {
		return calle_seleccionada;
	}

	public void setCalle_seleccionada(String calle_seleccionada) {
		this.calle_seleccionada = calle_seleccionada;
	}

	public String getCod_calle() {
		return getCodCalle();
	}

	public void setCod_calle(String cod_calle) {
		this.cod_calle = cod_calle;
	}
	
	public Integer getAltura(){
		return this.altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	/* Logica adicional para el filtrado */
	public List<String> getDistinctStreetNames(){
		Set<String> calles = new HashSet<String>();
		for(Edge e : edges){
			calles.add(e.getStreetName());
		}
		return Arrays.asList(calles.toArray(new String[]{}));
	
	}
	
	public String getCodCalle(){
		for(Segmento s : segmentos){
			if(s.getEdge().getStreetName().equals(calle_seleccionada))
				return s.getCodCalle();
		}
		return "";
	}	
	
	private List<SeoPolyline> crearSeoPolyline(List<Edge> edges)
	{
		List<SeoPolyline> result= new ArrayList<SeoPolyline>();
		for(Edge edge : edges)
		{
			double delta=0.000055;
			Float[] coord1 = new Float[]{edge.getNodeFrom().getLongitud(),edge.getNodeFrom().getLatitud()};
			Float[] coord2 = new Float[]{edge.getNodeTo().getLongitud(),edge.getNodeTo().getLatitud()};
			
			//float pendiente=(edge.getNode_from().getLatitud()-edge.getNode_to().getLatitud())/(edge.getNode_from().getLongitud()-edge.getNode_to().getLongitud());
			//Traslacion
			Line2D line = new Line2D(coord1[0], coord1[1], coord2[0], coord2[1]);
			
			//Lado true = derecha
			//Lado false = izquierda
			Line2D trasladadaIzq;
			Line2D trasladadaDer;
				
			trasladadaDer = line.parallel(delta);
			trasladadaIzq = line.parallel(-delta);
			
			
//			SeoPolyline geo = new SeoPolyline();
			
			SeoPolyline geoDer = new SeoPolyline();
			geoDer.setStrokeWeight(5);
			geoDer.setStrokeColor("#333333");
			geoDer.setStrokeOpacity(0.7);
			SeoPolyline geoIzq = new SeoPolyline();
			geoIzq.setStrokeWeight(5);
			geoIzq.setStrokeColor("#333333");
	        geoIzq.setStrokeOpacity(0.7);
			
//			LatLng punto_trans1 = new LatLng((float)trans.getX1(),(float)trans.getY1());
//			LatLng punto_trans2 = new LatLng((float)trans.getX2(),(float)trans.getY2());
			
			LatLng punto_trans1Der = new LatLng((float)trasladadaDer.getY1(),(float)trasladadaDer.getX1());
			LatLng punto_trans2Der = new LatLng((float)trasladadaDer.getY2(),(float)trasladadaDer.getX2());
			
			LatLng punto_trans1Izq = new LatLng((float)trasladadaIzq.getY1(),(float)trasladadaIzq.getX1());
			LatLng punto_trans2Izq = new LatLng((float)trasladadaIzq.getY2(),(float)trasladadaIzq.getX2());
			
//			geo.getPaths().add(punto_trans1);
//			geo.getPaths().add(punto_trans2);
			
			geoDer.getPaths().add(punto_trans1Der);
			geoDer.getPaths().add(punto_trans2Der);
			
			geoIzq.getPaths().add(punto_trans1Izq);
			geoIzq.getPaths().add(punto_trans2Izq);
			
			Segmento segDer=new Segmento();
			segDer.setLado(true);
			segDer.setEdge(edge);
			geoDer.setSegmento(segDer);	
			
			
			Segmento segIzq=new Segmento();
			segIzq.setLado(false);
			segIzq.setEdge(edge);
			geoIzq.setSegmento(segIzq);
			
			result.add(geoDer);
			result.add(geoIzq);
			
//			result.add(geo);
			
		}
		
		return result;
	}
	
	public String matchLado(Boolean lado){
		if(lado == null){
			return "";
		}
		if(lado)
			return "Derecha";
		else return "Izquierda";
	}
	
	public void onPolylineSelect(OverlaySelectEvent event){
		SeoPolyline segmento_line = (SeoPolyline)event.getOverlay();		
				
		Integer id_edge = segmento_line.getSegmento().getEdge().getIdEdge();
		lado =segmento_line.getSegmento().isLado();				
				
		
		calle_seleccionada = segmento_line.getSegmento().getEdge().getStreetName();
		altura = segmento_line.getSegmento().getAltura();
		//clasificacion = segmento_line.getSegmento().getClasificacion();
		currentClasification = clasificaciones[segmento_line.getSegmento().getClasificacion()];
		
		segmento = segmento_line.getSegmento();		
		
		String detail = "Edge: "+ id_edge + " calle "+ segmento.getEdge().getStreetName();					
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Segmento seleccionado", detail));
		
		
		//Preparacion del DTO
		
		
	}
	

	public MapModel getModel() {
		return model;
	}

	public void setModel(MapModel model) {
		this.model = model;
	}


	public Clasificacion getClasification() {
		return clasificaciones[segmento.getClasificacion()];
	}

//	/**
//	 * @param clasificacion the clasificacion to set
//	 */
//	public void setClasificacion(int clasificacion) {
//		this.clasificacion = clasificacion;
//	}

	public Boolean getLado() {
		return lado;
	}

	public void setLado(Boolean lado) {
		this.lado = lado;
	}

	public void guardarSegmento(){
		segmento.setAltura(this.altura);
		segmento.setClasificacion(Arrays.asList(clasificaciones).indexOf(this.currentClasification));
		segmento.setCodCalle(this.cod_calle);			
		
		Segmento existeSegmento = wsAdapter.obtenerSegmento(segmento.getEdge().getIdEdge(),segmento.isLado() );
		if(existeSegmento != null){ 
			wsAdapter.eliminarSegmento(existeSegmento);
		}		
		
		if(!clasificaciones[segmento.getClasificacion()].equals(Clasificacion.LIBRE))
			wsAdapter.guardarSegmento(segmento);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Marker Selected", "Se grabo el segmento"));
		
		UpdateView();
	}


	/**
	 * @return the currentClasification
	 */
	public Clasificacion getCurrentClasification() {
		return currentClasification;
	}

	/**
	 * @param currentClasification the currentClasification to set
	 */
	public void setCurrentClasification(Clasificacion currentClasification) {
		this.currentClasification = currentClasification;
	}

	private void UpdateView() {		
		segmentos = wsAdapter.obtenerSegmentos();
		List<SeoPolyline> seo=crearSeoPolyline(edges);
		model = new DefaultMapModel();
		CargarSegmentosSinClasificar(seo, segmentos);
		CargarSegmentosClasificados(segmentos);
		
	}

}
