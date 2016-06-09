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
    private Cliente_TO cliente;

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

    public Empleado_TO(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Empleado_TO(Cliente_TO cliente, String nombre, String cargo, String movil, String correo) {
        this.cliente = cliente;
        this.nombre = nombre;
        this.cargo = cargo;
        this.movil = movil;
        this.correo = correo;
    }
    
    

    public Empleado_TO(int idEmpleado, Cliente_TO cliente, String nombre, String cargo, String movil, String correo) {
        this.idEmpleado = idEmpleado;
        this.cliente = cliente;
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

    public Cliente_TO getCliente() {
        return cliente;
    }

    public void setCliente(Cliente_TO cliente) {
        this.cliente = cliente;
    }

    
    @Override
    public String toString() {
        return "Empleado_TO{" + "idEmpleado=" + idEmpleado + ", idCliente=" + cliente.getIdCliente() + ", nombre=" + nombre + ", cargo=" + cargo + ", movil=" + movil + ", correo=" + correo + '}';
    }

}
