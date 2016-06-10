/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio.impl;

import co.com.riit.modelo.dto.Ticket_TO;
import co.com.riit.persistencia.dao.TicketDAO;
import co.com.riit.persistencia.dao.impl.TicketDAOImpl;
import co.com.riit.servicio.ConsultarTickets;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author Desarrollo_Planit
 */
@Stateless
@Path("/consultarTickets")
public class ConsultarTicketsImpl implements ConsultarTickets{

    @GET
    @Produces({"application/json"})
    @Override
    public List<Ticket_TO> consultarTickets() throws Exception {
        TicketDAO ticketDao = new TicketDAOImpl();
        return ticketDao.consultarTickets();
    }    
}
