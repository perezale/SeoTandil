package com.seotandil.beans;

import java.util.List;

import math.geom2d.line.Line2D;

import org.primefaces.model.map.LatLng;

import com.seotandil.dto.SeoPolyline;
import com.seotandil.ws.Edge;
import com.seotandil.ws.Segmento;

public class Comun {

	public static String ObtenerColor(int c) {
		
		Clasificacion clasificaciones[]=Clasificacion.values();
		
		
		
		switch (clasificaciones[c]) {
		case LIBRE:
			return "#";
		case MEDIDO:
			return "#f99c3e";
		case PROHIBIDO:
			return "#f93e3e";
		case PERMITIDO:
			return "#3e9cf9";
		default:
			return "#000000";
		}
	}

	public static boolean existe(Segmento s, List<Segmento> segmentos) {
		Edge edge_linea = s.getEdge();
		for (Segmento seg : segmentos) {
			Edge arco_seg = seg.getEdge();
			if (edge_linea.getIdEdge() == arco_seg.getIdEdge()
					&& s.isLado() == seg.isLado())
				return true;
		}
		return false;
	}

	public static SeoPolyline ObtenerSeoPolyline(Segmento s) {
		Edge edge = s.getEdge();
		double delta = 0.000055;

		Float[] coord1 = new Float[] { edge.getNodeFrom().getLongitud(),
				edge.getNodeFrom().getLatitud() };
		Float[] coord2 = new Float[] { edge.getNodeFrom().getLongitud(),
				edge.getNodeFrom().getLatitud() };

		// Traslacion
		Line2D line = new Line2D(coord1[0], coord1[1], coord2[0], coord2[1]);
		Line2D trasladada;

		if (s.isLado()) {
			trasladada = line.parallel(delta);
		} else {
			trasladada = line.parallel(-delta);
		}

		SeoPolyline geoLine = new SeoPolyline();
		geoLine.setStrokeWeight(6);
		geoLine.setStrokeColor(Comun.ObtenerColor(s.getClasificacion()));
		//geoLine.setStrokeColor("#ffff22");
		geoLine.setStrokeOpacity(0.7);

		LatLng punto_trans1 = new LatLng((float) trasladada.getY1(),
				(float) trasladada.getX1());
		LatLng punto_trans2 = new LatLng((float) trasladada.getY2(),
				(float) trasladada.getX2());

		geoLine.getPaths().add(punto_trans1);
		geoLine.getPaths().add(punto_trans2);

		geoLine.setSegmento(s);

		return geoLine;

	}
}
