/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio;

import co.com.riit.modelo.dto.Usuario_TO;

/**
 *
 * @author Desarrollo_Planit
 */
public interface EditarUsuario {
   
    public Usuario_TO editarUsuario(int idUsuario, String nombre, String email, String celular, int idRol, int idEstado) throws Exception;
}
