/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio.impl;

import co.com.riit.modelo.dto.Estado_TO;
import co.com.riit.modelo.dto.Rol_TO;
import co.com.riit.modelo.dto.Usuario_TO;
import co.com.riit.persistencia.dao.UsuarioDAO;
import co.com.riit.persistencia.dao.impl.UsuarioDAOImpl;
import co.com.riit.servicio.RegistrarUsuario;
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
@Path("/registrarUsuario")
public class RegistrarUsuarioImpl implements RegistrarUsuario{

    @GET
    @Produces({"application/json"})
    @Override
    public Usuario_TO registrarUsuario(@QueryParam("nombre") String nombre,
            @QueryParam("email") String email, 
            @QueryParam("celular") String celular, 
            @QueryParam("contrasena") String contrasena, 
            @QueryParam("idRol") int idRol,
            @QueryParam("idEstado") int idEstado) throws Exception {
        
        Usuario_TO usuario = new Usuario_TO(nombre, email, celular, contrasena, new Rol_TO(idRol), new Estado_TO(idEstado));
        UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
        return usuarioDAO.registrarUsuario(usuario);
    }
    
}
