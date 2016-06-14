/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.modelo.dto;

import java.util.logging.Logger;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * Objeto de negocios que modelo un Ciudad
 *
 * Tabla Relacionada Ciudad
 *
 * @author Planit
 */
@XmlRootElement
public class Ciudad_TO {

    /**
     *
     * Columna idCiudad
     */
    private int idCiudad;

    /**
     *
     * Columna nombre
     */
    private String nombre;

    /**
     *
     * Columna idPais
     */
    private int idPais;

    //Constructores
    public Ciudad_TO() {
    }

    public Ciudad_TO(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public Ciudad_TO(int idCiudad, String nombre, int idPais) {
        this.idCiudad = idCiudad;
        this.nombre = nombre;
        this.idPais = idPais;
    }

    public Ciudad_TO(int idCiudad, String nombre) {
        this.idCiudad = idCiudad;
        this.nombre = nombre;
    }
    
    

    //Getters and Setters
    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    @Override
    public String toString() {
        return "Ciudad_TO{" + "idCiudad=" + idCiudad + ", nombre=" + nombre + ", idPais=" + idPais + '}';
    }

}
