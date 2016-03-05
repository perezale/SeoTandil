package com.seotandil.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.seotandil.ws.Segmento;
import com.seotandil.ws.WsAdapter;

@ManagedBean(name="segmentoBean")
@ViewScoped
public class SegmentoBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private static WsAdapter wsAdapter = new WsAdapter();

	List<Segmento> segmentos;
	
	public SegmentoBean(){
		segmentos = wsAdapter.obtenerSegmentos();		
	}

	public List<Segmento> getSegmentos() {
		return segmentos;
	}

	public void setSegmentos(List<Segmento> segmentos) {
		this.segmentos = segmentos;
	}
	
	
	
}
