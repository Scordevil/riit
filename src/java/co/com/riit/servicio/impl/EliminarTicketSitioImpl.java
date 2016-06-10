/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio.impl;

import co.com.riit.modelo.dto.TicketSitio_TO;
import co.com.riit.persistencia.dao.TicketSitioDAO;
import co.com.riit.persistencia.dao.impl.TicketSitioDAOImpl;
import co.com.riit.servicio.EliminarTicketSitio;
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
@Path("/eliminarTicketSitio")
public class EliminarTicketSitioImpl implements EliminarTicketSitio{
    
    @GET
    @Produces({"application/json"})
    @Override
    public TicketSitio_TO eliminarTicketSitio(@QueryParam("idTicket") int idTicket) throws Exception {
        TicketSitio_TO ticket = new TicketSitio_TO(idTicket);
        TicketSitioDAO ticketDao = new TicketSitioDAOImpl();
        return ticketDao.eliminarTicketSitio(ticket);
    }
    
}
