/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio.impl;

import co.com.riit.modelo.dto.Ticket_TO;
import co.com.riit.persistencia.dao.TicketDAO;
import co.com.riit.persistencia.dao.impl.TicketDAOImpl;
import co.com.riit.servicio.EliminarTicket;
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
@Path("/eliminarTicket")
public class EliminarTicketImpl implements EliminarTicket{

    @GET
    @Produces({"application/json"})
    @Override
    public Ticket_TO eliminarTicket(@QueryParam("idTicket") int idTicket) throws Exception {
        Ticket_TO ticket = new Ticket_TO(idTicket);
        TicketDAO ticketDao = new TicketDAOImpl();
        return ticketDao.eliminarTicket(ticket);
    }
    
}
