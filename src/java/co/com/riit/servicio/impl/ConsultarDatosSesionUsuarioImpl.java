/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio.impl;

import co.com.riit.modelo.dto.Usuario_TO;
import co.com.riit.persistencia.dao.UsuarioDAO;
import co.com.riit.persistencia.dao.impl.UsuarioDAOImpl;
import co.com.riit.servicio.ConsultarDatosSesionUsuario;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Stateless
@Path("/consultarDatosSesion")
public class ConsultarDatosSesionUsuarioImpl implements ConsultarDatosSesionUsuario {

    @GET
    @Produces({"application/json"})
    @Override
    public Usuario_TO consultarDatosSesionUsuario(@QueryParam("email") String email, @QueryParam("contrasena") String contrasena) throws Exception {
        Usuario_TO sesion = new Usuario_TO();
        sesion.setEmail(email);
        sesion.setContrasena(contrasena);
        UsuarioDAO usuarioDao = new UsuarioDAOImpl();
        return usuarioDao.consultarDatosSesionUsuario(sesion);
    }
}
