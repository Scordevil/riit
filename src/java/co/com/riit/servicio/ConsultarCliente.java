/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio;

import co.com.riit.modelo.dto.Cliente_TO;

/**
 *
 * @author Desarrollo_Planit
 */
public interface ConsultarCliente {
    
    public Cliente_TO consultarCliente(int idCliente) throws Exception;
    
}
