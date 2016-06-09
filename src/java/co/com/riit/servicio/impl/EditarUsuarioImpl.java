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
import co.com.riit.servicio.EditarUsuario;
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
@Path("/editarUsuario")
public class EditarUsuarioImpl implements EditarUsuario {

    @GET
    @Produces({"application/json"})
    @Override
    public Usuario_TO editarUsuario(@QueryParam("idUsuario") int idUsuario,
            @QueryParam("nombre") String nombre,
            @QueryParam("email") String email,
            @QueryParam("celular") String celular,
            @QueryParam("contrasena") String contrasena,
            @QueryParam("idRol") int idRol,
            @QueryParam("idEstado") int idEstado) throws Exception {

        Usuario_TO usuario = new Usuario_TO(idUsuario, nombre, email, celular, contrasena, new Rol_TO(idRol), new Estado_TO(idEstado));
        UsuarioDAO usuarioDao = new UsuarioDAOImpl();
        return usuarioDao.editarUsuario(usuario);
    }
}
