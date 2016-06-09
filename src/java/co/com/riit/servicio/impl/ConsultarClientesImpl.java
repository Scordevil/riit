/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio.impl;

import co.com.riit.modelo.dto.Cliente_TO;
import co.com.riit.persistencia.dao.ClienteDAO;
import co.com.riit.persistencia.dao.impl.ClienteDAOImpl;
import co.com.riit.servicio.consultarClientes;
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
@Path("/consultarClientes")
public class ConsultarClientesImpl implements consultarClientes{

    @GET
    @Produces({"application/json"})
    @Override
    public List<Cliente_TO> consultarClientes() throws Exception {
        ClienteDAO clienteDao = new ClienteDAOImpl();
        return clienteDao.consultarClientes();
    }     
}
