package com.seotandil.ws;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para segmento complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="segmento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="altura" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="clasificacion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cod_calle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="edge" type="{http://ws.seotandil.com/}edge" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lado" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "segmento", propOrder = { "altura", "clasificacion",
		"codCalle", "edge", "id", "lado" })
public class Segmento implements Serializable{

	

	protected Integer altura;
	protected int clasificacion;
	@XmlElement(name = "cod_calle")
	protected String codCalle;
	protected Edge edge;
	protected int id;
	protected boolean lado;

	/**
	 * Obtiene el valor de la propiedad altura.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getAltura() {
		return altura;
	}

	/**
	 * Define el valor de la propiedad altura.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setAltura(Integer value) {
		this.altura = value;
	}

	/**
	 * Obtiene el valor de la propiedad clasificacion.
	 * 
	 */
	public int getClasificacion() {
		return clasificacion;
	}

	/**
	 * Define el valor de la propiedad clasificacion.
	 * 
	 */
	public void setClasificacion(int value) {
		this.clasificacion = value;
	}

	/**
	 * Obtiene el valor de la propiedad codCalle.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodCalle() {
		return codCalle;
	}

	/**
	 * Define el valor de la propiedad codCalle.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodCalle(String value) {
		this.codCalle = value;
	}

	/**
	 * Obtiene el valor de la propiedad edge.
	 * 
	 * @return possible object is {@link Edge }
	 * 
	 */
	public Edge getEdge() {
		return edge;
	}

	/**
	 * Define el valor de la propiedad edge.
	 * 
	 * @param value
	 *            allowed object is {@link Edge }
	 * 
	 */
	public void setEdge(Edge value) {
		this.edge = value;
	}

	/**
	 * Obtiene el valor de la propiedad id.
	 * 
	 */
	public int getId() {
		return id;
	}

	/**
	 * Define el valor de la propiedad id.
	 * 
	 */
	public void setId(int value) {
		this.id = value;
	}

	/**
	 * Obtiene el valor de la propiedad lado.
	 * 
	 */
	public boolean isLado() {
		return lado;
	}

	/**
	 * Define el valor de la propiedad lado.
	 * 
	 */
	public void setLado(boolean value) {
		this.lado = value;
	}

}
