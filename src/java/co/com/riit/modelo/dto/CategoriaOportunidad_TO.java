/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.modelo.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * Objeto de negocios que modelo un CategoriaOportunidad
 *
 * Tabla Relacionada CategoriaOportunidad
 *
 * @author Planit
 */
@XmlRootElement
public class CategoriaOportunidad_TO {

    /**
     *
     * Columna idCategoriaOportunidad
     */
    private int idCategoriaOportunidad;

    /**
     *
     * Columna nombre
     */
    private String nombre;

    //Constructores
    public CategoriaOportunidad_TO() {        
        
    }

    public CategoriaOportunidad_TO(int idCategoriaOportunidad) {
        this.idCategoriaOportunidad = idCategoriaOportunidad;
    }

    
    public CategoriaOportunidad_TO(int idCategoriaOportunidad, String nombre) {
        this.idCategoriaOportunidad = idCategoriaOportunidad;
        this.nombre = nombre;
    }

   //Getters and Setters
    public int getIdCategoriaOportunidad() {
        return idCategoriaOportunidad;
    }

    public void setIdCategoriaOportunidad(int idCategoriaOportunidad) {
        this.idCategoriaOportunidad = idCategoriaOportunidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "CategoriaOportunidad_TO{" + "idCategoriaOportunidad=" + idCategoriaOportunidad + ", nombre=" + nombre + '}';
    }

}
