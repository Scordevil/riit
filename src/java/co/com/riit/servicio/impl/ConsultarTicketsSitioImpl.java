/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio.impl;

import co.com.riit.modelo.dto.TicketSitio_TO;
import co.com.riit.persistencia.dao.TicketSitioDAO;
import co.com.riit.persistencia.dao.impl.TicketSitioDAOImpl;
import co.com.riit.servicio.ConsultarTicketsSitio;
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
@Path("/consultarTicketsSitio")
public class ConsultarTicketsSitioImpl implements ConsultarTicketsSitio{

    @GET
    @Produces({"application/json"})
    @Override
    public List<TicketSitio_TO> consultarTicketsSitio() throws Exception {
        TicketSitioDAO ticketDao = new TicketSitioDAOImpl();
        return ticketDao.consultarTicketsSitio();
    }
    
}
