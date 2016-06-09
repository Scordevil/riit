/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.modelo.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * Objeto de negocios que modelo un Cliente
 *
 * Tabla Relacionada Cliente
 *
 * @author Planit
 */
@XmlRootElement
public class Cliente_TO {

    /**
     *
     * Columna idCliente
     */
    private int idCliente;

    /**
     *
     * Columna razonSocial
     */
    private String razonSocial;

    /**
     *
     * Columna nit
     */
    private String nit;

    /**
     *
     * Columna paginaWeb
     */
    private String paginaWeb;

    /**
     *
     * Columna email
     */
    private String email;

    /**
     *
     * Columna telefono
     */
    private String telefono;

    /**
     *
     * Columna movil
     */
    private String movil;

    /**
     *
     * Columna idCiudad
     */
    private Ciudad_TO ciudad;

    /**
     *
     * Columna direccion
     */
    private String direccion;

    /**
     *
     * Columna idAsesor
     */
    private Usuario_TO asesor;

    //Constructores
    public Cliente_TO() {
    }

    public Cliente_TO(int idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente_TO(String razonSocial, String nit, String paginaWeb, String email, String telefono, String movil, Ciudad_TO ciudad, String direccion, Usuario_TO asesor) {
        this.razonSocial = razonSocial;
        this.nit = nit;
        this.paginaWeb = paginaWeb;
        this.email = email;
        this.telefono = telefono;
        this.movil = movil;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.asesor = asesor;
    }

    
    public Cliente_TO(int idCliente, String razonSocial, String nit, String paginaWeb, String email, String telefono, String movil, Ciudad_TO ciudad, String direccion, Usuario_TO asesor) {
        this.idCliente = idCliente;
        this.razonSocial = razonSocial;
        this.nit = nit;
        this.paginaWeb = paginaWeb;
        this.email = email;
        this.telefono = telefono;
        this.movil = movil;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.asesor = asesor;
    }

    
    //Getters and Setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Ciudad_TO getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad_TO ciudad) {
        this.ciudad = ciudad;
    }

    public Usuario_TO getAsesor() {
        return asesor;
    }

    public void setAsesor(Usuario_TO asesor) {
        this.asesor = asesor;
    }

    

    @Override
    public String toString() {
        return "Cliente_TO{" + "idCliente=" + idCliente + ", razonSocial=" + razonSocial + ", nit=" + nit + ", paginaWeb=" + paginaWeb + ", email=" + email + ", telefono=" + telefono + ", movil=" + movil + ", idCiudad=" + ciudad.getIdPais() + ", direccion=" + direccion + ", idAsesor=" + asesor.getIdUsuario() + '}';
    }

}
