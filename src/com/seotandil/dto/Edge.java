package com.seotandil.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Edge implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue
	private int id_edge;
	@ManyToOne
	@JoinColumn(name="node_from")
	private Node node_from;
	@ManyToOne
	@JoinColumn(name="node_to")
	private Node node_to;
	@Column
	private String street_name;
	@Column
	private boolean one_way;
	@Column
	private boolean is_wrong_way;
	@Column
	private double length_km;
	
	public int getId_edge() {
		return id_edge;
	}
	public void setId_edge(int id_edge) {
		this.id_edge = id_edge;
	}
	public Node getNode_from() {
		return node_from;
	}
	public void setNode_from(Node node_from) {
		this.node_from = node_from;
	}
	public Node getNode_to() {
		return node_to;
	}
	public void setNode_to(Node node_to) {
		this.node_to = node_to;
	}
	public String getStreet_name() {
		return street_name;
	}
	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}
	public boolean isOne_way() {
		return one_way;
	}
	public void setOne_way(boolean one_way) {
		this.one_way = one_way;
	}
	public boolean isIs_wrong_way() {
		return is_wrong_way;
	}
	public void setIs_wrong_way(boolean is_wrong_way) {
		this.is_wrong_way = is_wrong_way;
	}
	public double getLength_km() {
		return length_km;
	}
	public void setLength_km(double length_km) {
		this.length_km = length_km;
	}

	
	
}
