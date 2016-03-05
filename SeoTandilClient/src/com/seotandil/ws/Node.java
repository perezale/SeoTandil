
package com.seotandil.ws;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para node complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="node"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_node" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="latitud" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="longitud" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "node", propOrder = {
    "idNode",
    "latitud",
    "longitud"
})
public class Node implements Serializable{

    @XmlElement(name = "id_node")
    protected int idNode;
    protected float latitud;
    protected float longitud;

    /**
     * Obtiene el valor de la propiedad idNode.
     * 
     */
    public int getIdNode() {
        return idNode;
    }

    /**
     * Define el valor de la propiedad idNode.
     * 
     */
    public void setIdNode(int value) {
        this.idNode = value;
    }

    /**
     * Obtiene el valor de la propiedad latitud.
     * 
     */
    public float getLatitud() {
        return latitud;
    }

    /**
     * Define el valor de la propiedad latitud.
     * 
     */
    public void setLatitud(float value) {
        this.latitud = value;
    }

    /**
     * Obtiene el valor de la propiedad longitud.
     * 
     */
    public float getLongitud() {
        return longitud;
    }

    /**
     * Define el valor de la propiedad longitud.
     * 
     */
    public void setLongitud(float value) {
        this.longitud = value;
    }

}
