/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.modelo.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * Objeto de negocios que modelo un Usuario
 *
 * Tabla Relacionada Usuario
 *
 * @author Planit
 */
@XmlRootElement
public class Usuario_TO {

    /**
     *
     * Columna idUsuario
     */
    private int idUsuario;

    /**
     *
     * Columna nombre
     */
    private String nombre;

    /**
     *
     * Columna email
     */
    private String email;

    /**
     *
     * Columna celular
     */
    private String celular;

    /**
     *
     * Columna contrasena
     */
    private String contrasena;

    /**
     *
     * Columna idRol
     */
    private int idRol;

    /**
     *
     * Columna idEstado
     */
    private int idEstado;

    //Constructores
    public Usuario_TO() {
    }

    public Usuario_TO(int idUsuario, String nombre, String email, String celular, String contrasena, int idRol, int idEstado) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
        this.celular = celular;
        this.contrasena = contrasena;
        this.idRol = idRol;
        this.idEstado = idEstado;
    }

    //Getters and Setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    @Override
    public String toString() {
        return "Usuario_TO{" + "idUsuario=" + idUsuario + ", nombre=" + nombre + ", email=" + email + ", celular=" + celular + ", contrasena=" + contrasena + ", idRol=" + idRol + ", idEstado=" + idEstado + '}';
    }

}
