/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.modelo.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * Objeto de negocios que modelo un Area
 *
 * Tabla Relacionada area
 *
 * @author Planit
 */
@XmlRootElement
public class Area_TO {

    /**
     *
     * Columna idarea
     */
    private int idArea;

    /**
     *
     * Columna nombre
     */
    private String nombre;

    // Constructores
    
    public Area_TO() {
    }

    public Area_TO(int idArea, String nombre) {
        this.idArea = idArea;
        this.nombre = nombre;
    }
    
    // Getters and Setters

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Area_TO{" + "idArea=" + idArea + ", nombre=" + nombre + '}';
    }
    
    
    
    

}
