/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio.impl;

import co.com.riit.modelo.dto.Cliente_TO;
import co.com.riit.persistencia.dao.ClienteDAO;
import co.com.riit.persistencia.dao.impl.ClienteDAOImpl;
import co.com.riit.servicio.ConsultarCliente;
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
@Path("/consultarCliente")
public class ConsultarClienteImpl implements ConsultarCliente {

    @GET
    @Produces({"applicaton/json"})
    @Override
    public Cliente_TO consultarCliente(@QueryParam("idCliente") int idCliente) throws Exception {
        Cliente_TO cliente = new Cliente_TO(idCliente);
        ClienteDAO clienteDao = new ClienteDAOImpl();
        return clienteDao.consultarCliente(cliente);
    }

}
