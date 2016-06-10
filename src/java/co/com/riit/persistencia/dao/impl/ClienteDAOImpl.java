/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.persistencia.dao.impl;

import co.com.riit.conexion.ConexionSQL;
import co.com.riit.modelo.dto.Ciudad_TO;
import co.com.riit.modelo.dto.Cliente_TO;
import co.com.riit.modelo.dto.Usuario_TO;
import co.com.riit.persistencia.dao.ClienteDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Desarrollo_Planit
 */
public class ClienteDAOImpl implements ClienteDAO {

    private final Statement st = ConexionSQL.conexion();

    @Override
    public Cliente_TO registrarUsuario(Cliente_TO cliente) throws Exception {
        Cliente_TO nuevoCliente = new Cliente_TO();
        try {
            try {
                String sql = "INSERT INTO cliente (razonSocial, nit, paginaWeb, email, telefono, movil, idCiudad, direccion, idAsesor)"
                        + " VALUES('" + cliente.getRazonSocial() + "', "
                        + "'" + cliente.getNit() + "', "
                        + "'" + cliente.getPaginaWeb() + "', "
                        + "'" + cliente.getEmail() + "', "
                        + "'" + cliente.getTelefono() + "', "
                        + "'" + cliente.getMovil() + "', "
                        + "'" + cliente.getCiudad().getIdCiudad() + "', "
                        + "'" + cliente.getDireccion() + "', "
                        + "'" + cliente.getAsesor().getIdUsuario() + "')";
                st.execute(sql);
            } catch (SQLException e) {
                nuevoCliente = new Cliente_TO();
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return nuevoCliente;
    }

    @Override
    public Cliente_TO editarUsuario(Cliente_TO cliente) throws Exception {
        Cliente_TO nuevoCliente = new Cliente_TO();
        try {
            try {
                String sql = "UPDATE cliente SET razonSocial = '" + cliente.getRazonSocial() + "', nit = '" + cliente.getNit() + "', "
                        + "paginaWeb = '" + cliente.getPaginaWeb() + "', email = '" + cliente.getEmail() + "', telefono = '" + cliente.getTelefono() + "', "
                        + "movil = '" + cliente.getMovil() + "', idCiudad = '" + cliente.getCiudad().getIdCiudad() + "', direccion = '" + cliente.getDireccion() + "', "
                        + "idAsesor ='" + cliente.getAsesor().getIdUsuario() + "' "
                        + "WHERE idCliente = '" + cliente.getIdCliente() + "'";
                st.execute(sql);
            } catch (SQLException e) {
                nuevoCliente = new Cliente_TO();
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return nuevoCliente;
    }

    @Override
    public List<Cliente_TO> consultarClientes() throws Exception {
        List<Cliente_TO> clientes = new ArrayList();
        try {
            try {
                String sql = "SELECT idCliente, razonSocial, nit, paginaWeb, email, telefono, movil, idCiudad, direccion, idAsesor"
                        + " FROM cliente";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    clientes.add(new Cliente_TO(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getString(7),
                            new Ciudad_TO(rs.getInt(8)),
                            rs.getString(9),
                            new Usuario_TO(rs.getInt(10))));
                }
            } catch (SQLException e) {
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return clientes;
    }

    @Override
    public List<Cliente_TO> consultarClientesSegunAsesor(Usuario_TO usuario) throws Exception {
        List<Cliente_TO> clientes = new ArrayList();
        try {
            try {
                String sql = "SELECT idCliente, razonSocial, nit, paginaWeb, email, telefono, movil, idCiudad, direccion, idAsesor"
                        + " FROM cliente"
                        + " WHERE idAsesor = '" + usuario.getIdUsuario() + "'";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    clientes.add(new Cliente_TO(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getString(7),
                            new Ciudad_TO(rs.getInt(8)),
                            rs.getString(9),
                            new Usuario_TO(rs.getInt(10))));
                }
            } catch (SQLException e) {
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return clientes;

    }

    @Override
    public Cliente_TO consultarCliente(Cliente_TO cliente) throws Exception {
        Cliente_TO nuevocliente = new Cliente_TO();
        try {
            try {
                String sql = "SELECT idCliente, razonSocial, nit, paginaWeb, email, telefono, movil, idCiudad, direccion, idAsesor"
                        + " FROM cliente"
                        + " WHERE idCliente = '" + cliente.getIdCliente() + "'";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    nuevocliente = new Cliente_TO(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getString(7),
                            new Ciudad_TO(rs.getInt(8)),
                            rs.getString(9),
                            new Usuario_TO(rs.getInt(10)));
                }
            } catch (SQLException e) {
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return cliente;
    }

}
