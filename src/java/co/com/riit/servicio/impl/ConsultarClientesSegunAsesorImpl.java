/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio.impl;

import co.com.riit.modelo.dto.Cliente_TO;
import co.com.riit.modelo.dto.Usuario_TO;
import co.com.riit.persistencia.dao.ClienteDAO;
import co.com.riit.persistencia.dao.impl.ClienteDAOImpl;
import co.com.riit.servicio.ConsultarClientesSegunAsesor;
import java.util.List;
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
@Path("/consultarClientesSegunAsesor")
public class ConsultarClientesSegunAsesorImpl implements ConsultarClientesSegunAsesor{

    @GET
    @Produces({"application/json"})
    @Override
    public List<Cliente_TO> consultarClientesSegunAsesor(@QueryParam("idUsuario") int idUsuario) throws Exception {
        Usuario_TO asesor = new Usuario_TO(idUsuario);
        ClienteDAO clienteDao = new ClienteDAOImpl();
        return clienteDao.consultarClientesSegunAsesor(asesor);
    }
    
}
