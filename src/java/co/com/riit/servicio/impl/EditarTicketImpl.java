/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio.impl;

import co.com.riit.modelo.dto.Estado_TO;
import co.com.riit.modelo.dto.Oportunidad_TO;
import co.com.riit.modelo.dto.Ticket_TO;
import co.com.riit.persistencia.dao.TicketDAO;
import co.com.riit.persistencia.dao.impl.TicketDAOImpl;
import co.com.riit.servicio.EditarTicket;
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
@Path("/editarTicket")
public class EditarTicketImpl implements EditarTicket {

    @GET
    @Produces("application/json")
    @Override
    public Ticket_TO editarTicket(@QueryParam("idTicket") int idTicket,
            @QueryParam("idOportunidad") int idOportunidad,
            @QueryParam("consulta") String consulta,
            @QueryParam("fechaInicio") String fechaInicio,
            @QueryParam("horaInicio") String horaInicio,
            @QueryParam("solucion") String solucion,
            @QueryParam("fechaCierre") String fechaCierre,
            @QueryParam("horaCierre") String horaCierre,
            @QueryParam("idEstado") int idEstado,
            @QueryParam("cotizacion") String Cotizacion) throws Exception {
        
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
        
        Ticket_TO ticket = new Ticket_TO(idTicket, new Oportunidad_TO(idOportunidad), consulta, fi, new Time(hi.getTime()), solucion, fc, new Time(hc.getTime()), new Estado_TO(idEstado), Cotizacion);
        TicketDAO ticketDao = new TicketDAOImpl();
        return ticketDao.editarTicket(ticket);
        
    }

}
