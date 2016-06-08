/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.modelo.dto;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * Objeto de negocios que modelo un Oportunidad
 *
 * Tabla Relacionada Oportunidad
 *
 * @author Planit
 */
@XmlRootElement
public class Oportunidad_TO {

    /**
     *
     * Columna idOportunidad
     */
    private int idOportunidad;

    /**
     *
     * Columna idEmpleado
     */
    private int idEmpleado;

    /**
     *
     * Columna idUsuario
     */
    private int idUsuario;

    /**
     *
     * Columna fecha
     */
    private Date fecha;

    /**
     *
     * Columna idCategoriaOportunidad
     */
    private int idCategoriaOportunidad;

    //Constructores
    public Oportunidad_TO() {
    }

    public Oportunidad_TO(int idOportunidad, int idEmpleado, int idUsuario, Date fecha, int idCategoriaOportunidad) {
        this.idOportunidad = idOportunidad;
        this.idEmpleado = idEmpleado;
        this.idUsuario = idUsuario;
        this.fecha = fecha;
        this.idCategoriaOportunidad = idCategoriaOportunidad;
    }

    //Getters and Setters
    public int getIdOportunidad() {
        return idOportunidad;
    }

    public void setIdOportunidad(int idOportunidad) {
        this.idOportunidad = idOportunidad;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdCategoriaOportunidad() {
        return idCategoriaOportunidad;
    }

    public void setIdCategoriaOportunidad(int idCategoriaOportunidad) {
        this.idCategoriaOportunidad = idCategoriaOportunidad;
    }

    @Override
    public String toString() {
        return "Oportunidad_TO{" + "idOportunidad=" + idOportunidad + ", idEmpleado=" + idEmpleado + ", idUsuario=" + idUsuario + ", fecha=" + fecha + ", idCategoriaOportunidad=" + idCategoriaOportunidad + '}';
    }

}
