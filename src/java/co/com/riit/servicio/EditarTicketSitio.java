/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio;

import co.com.riit.modelo.dto.TicketSitio_TO;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Desarrollo_Planit
 */
public interface EditarTicketSitio {
    
     public TicketSitio_TO editarTicketSitio(int idTicket, int idOportunidad, String consulta, String diagnostico, String solucion, String fechaInicio, String horaInicio, String fechaCierre, String horaCierre, int idEstado, String foto1, String foto2, String foto3, String foto4, String foto5) throws Exception;

}
