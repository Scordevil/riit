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
    private Rol_TO rol;

    /**
     *
     * Columna idEstado
     */
    private Estado_TO estado;

    //Constructores
    public Usuario_TO() {
    }

    public Usuario_TO(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario_TO(String nombre, String email, String celular, String contrasena, Rol_TO rol, Estado_TO estado) {
        this.nombre = nombre;
        this.email = email;
        this.celular = celular;
        this.contrasena = contrasena;
        this.rol = rol;
        this.estado = estado;
    }
    
    

    public Usuario_TO(int idUsuario, String nombre, String email, String celular, String contrasena, Rol_TO rol, Estado_TO estado) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
        this.celular = celular;
        this.contrasena = contrasena;
        this.rol = rol;
        this.estado = estado;
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

    public Rol_TO getRol() {
        return rol;
    }

    public void setRol(Rol_TO rol) {
        this.rol = rol;
    }

    public Estado_TO getEstado() {
        return estado;
    }

    public void setEstado(Estado_TO estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Usuario_TO{" + "idUsuario=" + idUsuario + ", nombre=" + nombre + ", email=" + email + ", celular=" + celular + ", contrasena=" + contrasena + ", rol=" + rol + ", estado=" + estado + '}';
    }



}
