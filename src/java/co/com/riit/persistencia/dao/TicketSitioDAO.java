/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.persistencia.dao;

import co.com.riit.modelo.dto.TicketSitio_TO;
import java.util.List;

/**
 *
 * @author Desarrollo_Planit
 */
public interface TicketSitioDAO {

    public TicketSitio_TO registrarTicketSitio(TicketSitio_TO ticket) throws Exception;

    public TicketSitio_TO editarTicketSitio(TicketSitio_TO ticket) throws Exception;

    public TicketSitio_TO eliminarTicketSitio(TicketSitio_TO ticket) throws Exception;

    public List<TicketSitio_TO> consultarTicketsSitio() throws Exception;

    public TicketSitio_TO consultarTicketSitio(TicketSitio_TO ticket) throws Exception;
}
