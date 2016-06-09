/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.persistencia.dao;

import co.com.riit.modelo.dto.Usuario_TO;
import java.util.List;

/**
 *
 * @author Desarrollo_Planit
 */
public interface UsuarioDAO {
    
    public Usuario_TO registrarUsuario(Usuario_TO usuario) throws Exception;
    public Usuario_TO editarUsuario(Usuario_TO usuario) throws Exception;
    public Usuario_TO consultarUsuario(Usuario_TO usuario) throws Exception;
    public List<Usuario_TO> consultarUsuarios() throws Exception;
    
}
