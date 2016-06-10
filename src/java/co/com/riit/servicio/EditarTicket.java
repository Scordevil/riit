/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio;

import co.com.riit.modelo.dto.Ticket_TO;

/**
 *
 * @author Desarrollo_Planit
 */
public interface EditarTicket {

    public Ticket_TO editarTicket(int idTicket, int idOportunidad, String consulta, String fechaInicio, String horaInicio, String solucion, String fechaCierre, String horaCierre, int idEstado, String Cotizacion) throws Exception;
}
