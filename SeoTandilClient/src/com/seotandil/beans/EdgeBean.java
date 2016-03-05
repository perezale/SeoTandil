package com.seotandil.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.seotandil.ws.Edge;
import com.seotandil.ws.WsAdapter;

@ManagedBean(name="edgeBean")
@ViewScoped
public class EdgeBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private List<Edge> edges;
	
	private static WsAdapter wsAdapter = new WsAdapter();
	
	public List<Edge> getEdges() {
		return edges;
	}	

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}

	public EdgeBean(){
		
		edges = wsAdapter.obtenerEdges();		
	}
	

}
