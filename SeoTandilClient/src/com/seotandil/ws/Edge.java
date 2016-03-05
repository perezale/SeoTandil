
package com.seotandil.ws;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para edge complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="edge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_edge" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="is_wrong_way" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="length_km" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="node_from" type="{http://ws.seotandil.com/}node" minOccurs="0"/&gt;
 *         &lt;element name="node_to" type="{http://ws.seotandil.com/}node" minOccurs="0"/&gt;
 *         &lt;element name="one_way" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="street_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "edge", propOrder = {
    "idEdge",
    "isWrongWay",
    "lengthKm",
    "nodeFrom",
    "nodeTo",
    "oneWay",
    "streetName"
})
public class Edge implements Serializable{

    @XmlElement(name = "id_edge")
    protected int idEdge;
    @XmlElement(name = "is_wrong_way")
    protected boolean isWrongWay;
    @XmlElement(name = "length_km")
    protected double lengthKm;
    @XmlElement(name = "node_from")
    protected Node nodeFrom;
    @XmlElement(name = "node_to")
    protected Node nodeTo;
    @XmlElement(name = "one_way")
    protected boolean oneWay;
    @XmlElement(name = "street_name")
    protected String streetName;

    /**
     * Obtiene el valor de la propiedad idEdge.
     * 
     */
    public int getIdEdge() {
        return idEdge;
    }

    /**
     * Define el valor de la propiedad idEdge.
     * 
     */
    public void setIdEdge(int value) {
        this.idEdge = value;
    }

    /**
     * Obtiene el valor de la propiedad isWrongWay.
     * 
     */
    public boolean isIsWrongWay() {
        return isWrongWay;
    }

    /**
     * Define el valor de la propiedad isWrongWay.
     * 
     */
    public void setIsWrongWay(boolean value) {
        this.isWrongWay = value;
    }

    /**
     * Obtiene el valor de la propiedad lengthKm.
     * 
     */
    public double getLengthKm() {
        return lengthKm;
    }

    /**
     * Define el valor de la propiedad lengthKm.
     * 
     */
    public void setLengthKm(double value) {
        this.lengthKm = value;
    }

    /**
     * Obtiene el valor de la propiedad nodeFrom.
     * 
     * @return
     *     possible object is
     *     {@link Node }
     *     
     */
    public Node getNodeFrom() {
        return nodeFrom;
    }

    /**
     * Define el valor de la propiedad nodeFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link Node }
     *     
     */
    public void setNodeFrom(Node value) {
        this.nodeFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad nodeTo.
     * 
     * @return
     *     possible object is
     *     {@link Node }
     *     
     */
    public Node getNodeTo() {
        return nodeTo;
    }

    /**
     * Define el valor de la propiedad nodeTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Node }
     *     
     */
    public void setNodeTo(Node value) {
        this.nodeTo = value;
    }

    /**
     * Obtiene el valor de la propiedad oneWay.
     * 
     */
    public boolean isOneWay() {
        return oneWay;
    }

    /**
     * Define el valor de la propiedad oneWay.
     * 
     */
    public void setOneWay(boolean value) {
        this.oneWay = value;
    }

    /**
     * Obtiene el valor de la propiedad streetName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Define el valor de la propiedad streetName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

}
