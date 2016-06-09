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
    private Empleado_TO empleado;

    /**
     *
     * Columna idUsuario
     */
    private Usuario_TO usuario;

    /**
     *
     * Columna fecha
     */
    private Date fecha;

    /**
     *
     * Columna idCategoriaOportunidad
     */
    private CategoriaOportunidad_TO categoriaOportunidad;

    //Constructores
    public Oportunidad_TO() {
    }

    public Oportunidad_TO(int idOportunidad) {
        this.idOportunidad = idOportunidad;
    }

    public Oportunidad_TO(Empleado_TO empleado, Usuario_TO usuario, Date fecha, CategoriaOportunidad_TO categoriaOportunidad) {
        this.empleado = empleado;
        this.usuario = usuario;
        this.fecha = fecha;
        this.categoriaOportunidad = categoriaOportunidad;
    }

    
    public Oportunidad_TO(int idOportunidad, Empleado_TO empleado, Usuario_TO usuario, Date fecha, CategoriaOportunidad_TO categoriaOportunidad) {
        this.idOportunidad = idOportunidad;
        this.empleado = empleado;
        this.usuario = usuario;
        this.fecha = fecha;
        this.categoriaOportunidad = categoriaOportunidad;
    }

    

    //Getters and Setters
    public int getIdOportunidad() {
        return idOportunidad;
    }

    public void setIdOportunidad(int idOportunidad) {
        this.idOportunidad = idOportunidad;
    }

    public Empleado_TO getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado_TO empleado) {
        this.empleado = empleado;
    }

    public Usuario_TO getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario_TO usuario) {
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public CategoriaOportunidad_TO getCategoriaOportunidad() {
        return categoriaOportunidad;
    }

    public void setCategoriaOportunidad(CategoriaOportunidad_TO categoriaOportunidad) {
        this.categoriaOportunidad = categoriaOportunidad;
    }

    
    @Override
    public String toString() {
        return "Oportunidad_TO{" + "idOportunidad=" + idOportunidad + ", idEmpleado=" + empleado.getIdEmpleado() + ", idUsuario=" + usuario.getIdUsuario() + ", fecha=" + fecha + ", idCategoriaOportunidad=" + categoriaOportunidad.getIdCategoriaOportunidad() + '}';
    }

}
