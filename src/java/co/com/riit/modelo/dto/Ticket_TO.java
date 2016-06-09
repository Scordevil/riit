/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.modelo.dto;

import java.sql.Time;
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
    private Oportunidad_TO oportunidad;

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
    private Time horaInicio;

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
    private Time horaCierre;

    /**
     *
     * Columna idEstado
     */
    private Estado_TO estado;

    /**
     *
     * Columna cotizacion
     */
    private String cotizacion;

    //Constructores
    public Ticket_TO() {
    }

    public Ticket_TO(int idTicket) {
        this.idTicket = idTicket;
    }

    public Ticket_TO(Oportunidad_TO oportunidad, String consulta, Date fechaInicio, Time horaInicio, String solucion, Date fechaCierre, Time horaCierre, Estado_TO estado, String cotizacion) {
        this.oportunidad = oportunidad;
        this.consulta = consulta;
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.solucion = solucion;
        this.fechaCierre = fechaCierre;
        this.horaCierre = horaCierre;
        this.estado = estado;
        this.cotizacion = cotizacion;
    }

    public Ticket_TO(int idTicket, Oportunidad_TO oportunidad, String consulta, Date fechaInicio, Time horaInicio, String solucion, Date fechaCierre, Time horaCierre, Estado_TO estado, String cotizacion) {
        this.idTicket = idTicket;
        this.oportunidad = oportunidad;
        this.consulta = consulta;
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.solucion = solucion;
        this.fechaCierre = fechaCierre;
        this.horaCierre = horaCierre;
        this.estado = estado;
        this.cotizacion = cotizacion;
    }

    //Getters and Setters
    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public Oportunidad_TO getOportunidad() {
        return oportunidad;
    }

    public void setOportunidad(Oportunidad_TO oportunidad) {
        this.oportunidad = oportunidad;
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

    public Estado_TO getEstado() {
        return estado;
    }

    public void setEstado(Estado_TO estado) {
        this.estado = estado;
    }

    public String getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(String cotizacion) {
        this.cotizacion = cotizacion;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(Time horaCierre) {
        this.horaCierre = horaCierre;
    }

    
    @Override
    public String toString() {
        return "Ticket_TO{" + "idTicket=" + idTicket + ", idOportunidad=" + oportunidad.getIdOportunidad() + ", consulta=" + consulta + ", fechaInicio=" + fechaInicio + ", horaInicio=" + horaInicio + ", solucion=" + solucion + ", fechaCierre=" + fechaCierre + ", horaCierre=" + horaCierre + ", idEstado=" + estado.getIdEstado() + ", cotizacion=" + cotizacion + '}';
    }

}
