/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.modelo.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * Objeto de negocios que modelo un Empleado
 *
 * Tabla Relacionada Empleado
 *
 * @author Planit
 */
@XmlRootElement
public class Empleado_TO {

    /**
     *
     * Columna idEmpleado
     */
    private int idEmpleado;

    /**
     *
     * Columna idCliente
     */
    private int idCliente;

    /**
     *
     * Columna nombre
     */
    private String nombre;

    /**
     *
     * Columna cargo
     */
    private String cargo;

    /**
     *
     * Columna movil
     */
    private String movil;

    /**
     *
     * Columna correo
     */
    private String correo;

    //Constructores
    public Empleado_TO() {
    }

    public Empleado_TO(int idEmpleado, int idCliente, String nombre, String cargo, String movil, String correo) {
        this.idEmpleado = idEmpleado;
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.cargo = cargo;
        this.movil = movil;
        this.correo = correo;
    }

    //Getters and Setters
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Empleado_TO{" + "idEmpleado=" + idEmpleado + ", idCliente=" + idCliente + ", nombre=" + nombre + ", cargo=" + cargo + ", movil=" + movil + ", correo=" + correo + '}';
    }

}
