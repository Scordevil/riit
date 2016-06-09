/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.persistencia.dao;

import co.com.riit.modelo.dto.Ticket_TO;
import java.util.List;

/**
 *
 * @author Desarrollo_Planit
 */
public interface TicketDAO {
    
    public Ticket_TO registrarTicket(Ticket_TO ticket) throws Exception;
    
    public Ticket_TO editarTicket(Ticket_TO ticket) throws Exception;
    
    public Ticket_TO eliminarTicket(Ticket_TO ticket) throws Exception;
    
    public List<Ticket_TO> consultarTicket() throws Exception;
    
    public Ticket_TO consultarTicket(Ticket_TO ticket) throws Exception;
}
