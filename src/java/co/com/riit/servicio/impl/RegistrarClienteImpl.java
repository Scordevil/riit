/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio.impl;

import co.com.riit.modelo.dto.Ciudad_TO;
import co.com.riit.modelo.dto.Cliente_TO;
import co.com.riit.modelo.dto.Usuario_TO;
import co.com.riit.persistencia.dao.ClienteDAO;
import co.com.riit.persistencia.dao.impl.ClienteDAOImpl;
import co.com.riit.servicio.RegistrarCliente;
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
@Path("/registrarCliente")
public class RegistrarClienteImpl implements RegistrarCliente {

    @GET
    @Produces({"application/json"})
    @Override
    public Cliente_TO registrarCliente(@QueryParam("razonSocial") String razonSocial,
            @QueryParam("nit") String nit,
            @QueryParam("paginaWeb") String paginaWeb,
            @QueryParam("email") String email,
            @QueryParam("telefono") String telefono,
            @QueryParam("movil") String movil,
            @QueryParam("idCiudad") int idCiudad,
            @QueryParam("direccion") String direccion,
            @QueryParam("idUsuario") int idAsesor) throws Exception {
        Cliente_TO cliente = new Cliente_TO(razonSocial, nit, paginaWeb, email, telefono, movil, new Ciudad_TO(idCiudad), direccion, new Usuario_TO(idAsesor));
        ClienteDAO clienteDao = new ClienteDAOImpl();
        return clienteDao.registrarUsuario(cliente);
    }

}
