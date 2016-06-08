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
 * Objeto de negocios que modelo un ticket
 *
 * Tabla Relacionada ticket
 *
 * @author Planit
 */
@XmlRootElement
public class Ticket_TO {

    /**
     *
     * Columna idTicket
     */
    private int idTicket;

    /**
     *
     * Columna idOportunidad
     */
    private int idOportunidad;

    /**
     *
     * Columna consulta
     */
    private String consulta;

    /**
     *
     * Columna fechaInicio
     */
    private Date fechaInicio;

    /**
     *
     * Columna horaInicio
     */
    private String horaInicio;

    /**
     *
     * Columna solucion
     */
    private String solucion;

    /**
     *
     * Columna fechaCierre
     */
    private Date fechaCierre;

    /**
     *
     * Columna horaCierre
     */
    private String horaCierre;

    /**
     *
     * Columna idEstado
     */
    private int idEstado;

    /**
     *
     * Columna cotizacion
     */
    private String cotizacion;

    //Constructores
    public Ticket_TO() {
    }

    public Ticket_TO(int idTicket, int idOportunidad, String consulta, Date fechaInicio, String horaInicio, String solucion, Date fechaCierre, String horaCierre, int idEstado, String cotizacion) {
        this.idTicket = idTicket;
        this.idOportunidad = idOportunidad;
        this.consulta = consulta;
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.solucion = solucion;
        this.fechaCierre = fechaCierre;
        this.horaCierre = horaCierre;
        this.idEstado = idEstado;
        this.cotizacion = cotizacion;
    }

    //Getters and Setters
    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public int getIdOportunidad() {
        return idOportunidad;
    }

    public void setIdOportunidad(int idOportunidad) {
        this.idOportunidad = idOportunidad;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public String getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(String horaCierre) {
        this.horaCierre = horaCierre;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(String cotizacion) {
        this.cotizacion = cotizacion;
    }

    @Override
    public String toString() {
        return "Ticket_TO{" + "idTicket=" + idTicket + ", idOportunidad=" + idOportunidad + ", consulta=" + consulta + ", fechaInicio=" + fechaInicio + ", horaInicio=" + horaInicio + ", solucion=" + solucion + ", fechaCierre=" + fechaCierre + ", horaCierre=" + horaCierre + ", idEstado=" + idEstado + ", cotizacion=" + cotizacion + '}';
    }

}
