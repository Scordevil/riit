/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.persistencia.dao.impl;

import co.com.riit.conexion.ConexionSQL;
import co.com.riit.modelo.dto.Estado_TO;
import co.com.riit.modelo.dto.Rol_TO;
import co.com.riit.modelo.dto.Usuario_TO;
import co.com.riit.persistencia.dao.UsuarioDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Desarrollo_Planit
 */
public class UsuarioDAOImpl implements UsuarioDAO {

    private final Statement st = ConexionSQL.conexion();

    @Override
    public Usuario_TO registrarUsuario(Usuario_TO usuario) throws Exception {
        Usuario_TO nuevousuario = new Usuario_TO();
        try {
            try {
                String sql = "INSERT INTO usuario (nombre, email, celular, contrasena, idRol, idEstado) "
                        + "VALUES('" + usuario.getNombre() + "', "
                        + "'" + usuario.getEmail() + "', "
                        + "'" + usuario.getCelular() + "', "
                        + "'" + usuario.getContrasena() + "', "
                        + "'" + usuario.getRol().getIdRol() + "', "
                        + "'" + usuario.getEstado().getIdEstado() + "')";
                st.execute(sql);
            } catch (SQLException e) {
                nuevousuario = new Usuario_TO();
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return nuevousuario;
    }

    @Override
    public Usuario_TO editarUsuario(Usuario_TO usuario) throws Exception {
        Usuario_TO nuevousuario = new Usuario_TO();
        try {
            try {
                String sql = "UPDATE usuario SET nombre='" + usuario.getNombre() + "', "
                        + "email='" + usuario.getEmail() + "', "
                        + "celular='" + usuario.getCelular() + "', "
                        + "contrasena='" + usuario.getContrasena() + "', "
                        + "idRol='" + usuario.getRol().getIdRol() + "', "
                        + "idEstado='" + usuario.getEstado().getIdEstado() + "' "
                        + "WHERE idUsuario = '" + usuario.getIdUsuario() + "'";
                st.execute(sql);
            } catch (SQLException e) {
                nuevousuario = new Usuario_TO();
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return nuevousuario;
    }

    @Override
    public Usuario_TO consultarUsuario(Usuario_TO usuario) throws Exception {
        Usuario_TO nuevousuario = new Usuario_TO();
        try {
            try {
                String sql = "SELECT idUsuario, nombre, email, celular, contrasena, idRol, idEstado "
                        + "FROM usuario WHERE idUsuario = '" + usuario.getIdUsuario() + "'";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    nuevousuario = new Usuario_TO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), new Rol_TO(rs.getInt(6)), new Estado_TO(rs.getInt(7)));
                }
            } catch (SQLException e) {
                nuevousuario = new Usuario_TO();
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return nuevousuario;
    }

    @Override
    public List<Usuario_TO> consultarUsuarios() throws Exception {
        List<Usuario_TO> usuarios = new ArrayList<>();
        try {
            try {
                String sql = "SELECT idUsuario, nombre, email, celular, contrasena, idRol, idEstado "
                        + "FROM usuario";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    usuarios.add(new Usuario_TO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), new Rol_TO(rs.getInt(6)), new Estado_TO(rs.getInt(7))));
                }
            } catch (SQLException e) {
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return usuarios;
    }

}
