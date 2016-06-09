/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio.impl;

import co.com.riit.modelo.dto.Usuario_TO;
import co.com.riit.persistencia.dao.UsuarioDAO;
import co.com.riit.persistencia.dao.impl.UsuarioDAOImpl;
import co.com.riit.servicio.ConsultarUsuario;
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
@Path("/consultarUsuario")
public class ConsultarUsuarioImpl implements ConsultarUsuario{

    @GET
    @Produces({"application/json"})
    @Override
    public Usuario_TO consultarUsuario(@QueryParam("idUsuario") int idUsuario) throws Exception {
        Usuario_TO usuario = new Usuario_TO(idUsuario);
        UsuarioDAO usuarioDao = new UsuarioDAOImpl();
        return usuarioDao.consultarUsuario(usuario);
    }    
}
