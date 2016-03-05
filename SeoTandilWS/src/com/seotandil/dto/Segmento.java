package com.seotandil.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Segmento implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public enum Clasificacion {
	    LIBRE,MEDIDO,PROHIBIDO,PERMITIDO 
	}

	@Id
	@GeneratedValue
	private int id;	

	//Lado true = derecha
	//Lado false = izquierda
	@Column
	private boolean lado;
	@Column
	private int clasificacion;
	@Column
	private String cod_calle;
	@Column
	private Integer altura;
	
//	@Column(nullable = true)
	@ManyToOne
	@JoinColumn(name="edge")
	private Edge edge;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isLado() {
		return lado;
	}
	public void setLado(boolean lado) {
		this.lado = lado;
	}
	public int getClasificacion() {
		return clasificacion;
	}
	public Segmento.Clasificacion getClasificacionEnum(){
		return Segmento.Clasificacion.values()[this.getClasificacion()];
	}
	
	public void setClasificacion(int clasificacion) {
		this.clasificacion = clasificacion;
	}
	public void setClasificacion(Clasificacion c){		
		switch(c){
			case LIBRE: this.clasificacion = 0;
						break;
			case MEDIDO: this.clasificacion = 1;
						break;
			case PROHIBIDO: this.clasificacion = 2;
						break;
			case PERMITIDO: this.clasificacion = 3;
						break;
			default: this.clasificacion = 0;
		}
	}
	public Edge getEdge() {
		return edge;
	}
	public void setEdge(Edge edge) {
		this.edge = edge;
	}
	public String getCod_calle() {
		return cod_calle;
	}
	public void setCod_calle(String cod_calle) {
		this.cod_calle = cod_calle;
	}
	public Integer getAltura() {
		return altura;
	}
	public void setAltura(Integer altura) {
		this.altura = altura;
	}
	
	

	

}
