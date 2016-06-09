/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio.impl;

import co.com.riit.modelo.dto.Usuario_TO;
import co.com.riit.persistencia.dao.UsuarioDAO;
import co.com.riit.persistencia.dao.impl.UsuarioDAOImpl;
import co.com.riit.servicio.ConsultarUsuarios;
import java.util.ArrayList;
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
@Path("/consultarUsuarios")
public class ConsultarUsuariosImpl implements ConsultarUsuarios{

    @GET
    @Produces({"application/json"})
    @Override
    public List<Usuario_TO> consultarUsuario() throws Exception {
        List<Usuario_TO> usuarios = new ArrayList<>();
        UsuarioDAO usuarioDao = new UsuarioDAOImpl();
        return usuarioDao.consultarUsuarios();        
    }
    
}
