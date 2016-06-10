/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio.impl;

import co.com.riit.modelo.dto.Estado_TO;
import co.com.riit.modelo.dto.Oportunidad_TO;
import co.com.riit.modelo.dto.TicketSitio_TO;
import co.com.riit.persistencia.dao.TicketSitioDAO;
import co.com.riit.persistencia.dao.impl.TicketSitioDAOImpl;
import co.com.riit.servicio.RegistrarTicketSitio;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 *
 * @author Desarrollo_Planit
 */
@Stateless
@Path("/registrarTicketSitio")
public class RegistrarTicketSitioImpl implements RegistrarTicketSitio {

    @GET
    @Produces({"application/json"})
    @Override
    public TicketSitio_TO registrarTicketSitio(@QueryParam("idOportunidad") int idOportunidad, 
            @QueryParam("consulta") String consulta, 
            @QueryParam("diagnostico") String diagnostico, 
            @QueryParam("solucion") String solucion, 
            @QueryParam("fechaInicio") String fechaInicio, 
            @QueryParam("horaInicio") String horaInicio, 
            @QueryParam("fechaCierre") String fechaCierre, 
            @QueryParam("horaCierre") String horaCierre, 
            @QueryParam("idEstado") int idEstado, 
            @QueryParam("foto1") String foto1, 
            @QueryParam("foto2") String foto2, 
            @QueryParam("foto3") String foto3,
            @QueryParam("foto4") String foto4, 
            @QueryParam("foto5") String foto5) throws Exception {
        
         SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatoDeHora = new SimpleDateFormat("hh:mm:ss");
        
        Date fi = new Date();
        Date fc = new Date();
        Date hi = new Date();
        Date hc = new Date();
        
        try {
            fi = formatoDeFecha.parse(fechaInicio);
            fc = formatoDeFecha.parse(fechaCierre);
            hi = formatoDeHora.parse(horaInicio);
            hc = formatoDeHora.parse(horaCierre);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        TicketSitio_TO ticket = new TicketSitio_TO(new Oportunidad_TO(idOportunidad), consulta, diagnostico, solucion, fi, new Time(hi.getTime()), fc, new Time(hc.getTime()), new  Estado_TO(idEstado), foto1, foto2, foto3, foto4, foto5);
        TicketSitioDAO ticketDao = new TicketSitioDAOImpl();
        return ticketDao.registrarTicketSitio(ticket);
    }
}
