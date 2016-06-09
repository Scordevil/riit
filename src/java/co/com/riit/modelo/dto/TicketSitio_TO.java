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
 * Objeto de negocios que modelo un ticketSitio
 *
 * Tabla Relacionada ticketSitio
 *
 * @author Planit
 */
@XmlRootElement
public class TicketSitio_TO {

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
     * Columna diagnostico
     */
    private String diagnostico;

    /**
     *
     * Columna solucion
     */
    private String solucion;

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
     * Columna foto1
     */
    private String foto1;

    /**
     *
     * Columna foto2
     */
    private String foto2;

    /**
     *
     * Columna foto13
     */
    private String foto3;

    /**
     *
     * Columna foto4
     */
    private String foto4;

    /**
     *
     * Columna foto5
     */
    private String foto5;

    //Constructores
    public TicketSitio_TO() {
    }

    public TicketSitio_TO(Oportunidad_TO oportunidad, String consulta, String diagnostico, String solucion, Date fechaInicio, Time horaInicio, Date fechaCierre, Time horaCierre, Estado_TO estado, String foto1, String foto2, String foto3, String foto4, String foto5) {
        this.oportunidad = oportunidad;
        this.consulta = consulta;
        this.diagnostico = diagnostico;
        this.solucion = solucion;
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.fechaCierre = fechaCierre;
        this.horaCierre = horaCierre;
        this.estado = estado;
        this.foto1 = foto1;
        this.foto2 = foto2;
        this.foto3 = foto3;
        this.foto4 = foto4;
        this.foto5 = foto5;
    }

    public TicketSitio_TO(int idTicket, Oportunidad_TO oportunidad, String consulta, String diagnostico, String solucion, Date fechaInicio, Time horaInicio, Date fechaCierre, Time horaCierre, Estado_TO estado, String foto1, String foto2, String foto3, String foto4, String foto5) {
        this.idTicket = idTicket;
        this.oportunidad = oportunidad;
        this.consulta = consulta;
        this.diagnostico = diagnostico;
        this.solucion = solucion;
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.fechaCierre = fechaCierre;
        this.horaCierre = horaCierre;
        this.estado = estado;
        this.foto1 = foto1;
        this.foto2 = foto2;
        this.foto3 = foto3;
        this.foto4 = foto4;
        this.foto5 = foto5;
    }

    
    
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

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
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

    public String getFoto1() {
        return foto1;
    }

    public void setFoto1(String foto1) {
        this.foto1 = foto1;
    }

    public String getFoto2() {
        return foto2;
    }

    public void setFoto2(String foto2) {
        this.foto2 = foto2;
    }

    public String getFoto3() {
        return foto3;
    }

    public void setFoto3(String foto3) {
        this.foto3 = foto3;
    }

    public String getFoto4() {
        return foto4;
    }

    public void setFoto4(String foto4) {
        this.foto4 = foto4;
    }

    public String getFoto5() {
        return foto5;
    }

    //Getters and Setters
    public void setFoto5(String foto5) {    
        this.foto5 = foto5;
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
        return "TicketSitio_TO{" + "idTicket=" + idTicket + ", idOportunidad=" + oportunidad.getIdOportunidad() + ", consulta=" + consulta + ", diagnostico=" + diagnostico + ", solucion=" + solucion + ", fechaInicio=" + fechaInicio + ", horaInicio=" + horaInicio + ", fechaCierre=" + fechaCierre + ", horaCierre=" + horaCierre + ", idEstado=" + estado.getIdEstado() + ", foto1=" + foto1 + ", foto2=" + foto2 + ", foto3=" + foto3 + ", foto4=" + foto4 + ", foto5=" + foto5 + '}';
    }

}
