package com.seotandil.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.seotandil.ws.Node;
import com.seotandil.ws.WsAdapter;

@ManagedBean(name="nodeBean")
@ViewScoped
public class NodeBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private static WsAdapter wsAdapter = new WsAdapter();

	private List<Node> nodes;
	
	public NodeBean(){
		nodes = wsAdapter.obtenerNodes();		
	}
	
	public List<Node> getNodes() {
		return nodes;
	}

	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}
	

	
}
