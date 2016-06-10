/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio;

import co.com.riit.modelo.dto.TicketSitio_TO;

/**
 *
 * @author Desarrollo_Planit
 */
public interface EliminarTicketSitio {

    public TicketSitio_TO eliminarTicketSitio(int idTicket) throws Exception;
}
