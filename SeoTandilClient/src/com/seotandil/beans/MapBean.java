package com.seotandil.beans;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import math.geom2d.line.Line2D;

import com.geotools.geojava2json.GeoFeature;
import com.geotools.geojava2json.GeoLayer;
import com.geotools.geojava2json.GeoPolyline;

import com.seotandil.ws.Segmento;
import com.seotandil.ws.WsAdapter;

@ManagedBean(name ="mapaBean")
@ViewScoped
public class MapBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String geojson = "test";
	private static WsAdapter wsAdapter = new WsAdapter();
	
	public MapBean(){
				
		List<GeoPolyline> segmentos=crearGeoPolyline(wsAdapter.obtenerSegmentos());
		
		//		//Test Java2GeoJson
//		Float[] coord1 = new Float[]{-37.3274841308594f,-59.1160850524902f};
//		Float[] coord2 = new Float[]{-37.3197746276855f,-59.105339050293f};
//		GeoPolyline segmento = new GeoPolyline(Arrays.asList(new Float[][]{coord1,coord2}));
		
		
		List<GeoFeature> features= new ArrayList<GeoFeature>();
		for(GeoPolyline seg:segmentos)
		{
			GeoFeature feature = new GeoFeature();
			feature.setGeometry(seg);	
			features.add(feature);
		}
		//Armo la capa
		GeoLayer capaSEO = new GeoLayer();
		capaSEO.setFeatures(features);
					
		geojson = capaSEO.toString();
		
	}
	
	private List<GeoPolyline> crearGeoPolyline(List<Segmento> segmentos)
	{
		List<GeoPolyline> result= new ArrayList<GeoPolyline>();
		for(Segmento seg : segmentos)
		{
			double delta=0.000055;
			Float[] coord1 = new Float[]{seg.getEdge().getNodeFrom().getLongitud(),seg.getEdge().getNodeFrom().getLatitud()};
			Float[] coord2 = new Float[]{seg.getEdge().getNodeTo().getLongitud(),seg.getEdge().getNodeTo().getLatitud()};
			
			float pendiente=(seg.getEdge().getNodeFrom().getLatitud()-seg.getEdge().getNodeTo().getLatitud())/(seg.getEdge().getNodeFrom().getLongitud()-seg.getEdge().getNodeTo().getLongitud());
			//Translacion
			Line2D segmento = new Line2D(coord1[0], coord1[1], coord2[0], coord2[1]);
			
			//Lado true = derecha
			// Lado false = izquierda
			Line2D trans;

			if(seg.isLado())
				trans = segmento.parallel(delta);
			else
				trans = segmento.parallel(-delta);
			
			//Vector2D direccion = segmento.direction();
			
			
			
//			GeoPolyline geo= new GeoPolyline(Arrays.asList(new Float[][]{coord1,coord2}));
//			result.add(geo);
			
			//Transformada
			Float[] punto_trans1 = new Float[]{(float)trans.getX1(),(float)trans.getY1()};
			Float[] punto_trans2 = new Float[]{(float)trans.getX2(),(float)trans.getY2()};
			GeoPolyline geo= new GeoPolyline(Arrays.asList(new Float[][]{punto_trans1,punto_trans2}));
			result.add(geo);
		}
		
		return result;
	}

	public String getGeojson() {
		return geojson;
	}

	public void setGeojson(String geojson) {
		this.geojson = geojson;
	}
	
	
	
	//VALUE DEL HIDDENINPUT DE PRIMEFACES:
	// <p:hiddenField value="#{mapaBean.geojson}" /> <---- algo asi
}
