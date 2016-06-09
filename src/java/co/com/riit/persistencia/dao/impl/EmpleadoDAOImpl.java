/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.persistencia.dao.impl;

import co.com.riit.conexion.ConexionSQL;
import co.com.riit.modelo.dto.Cliente_TO;
import co.com.riit.modelo.dto.Empleado_TO;
import co.com.riit.persistencia.dao.EmpleadoDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Desarrollo_Planit
 */
public class EmpleadoDAOImpl implements EmpleadoDAO {

    private final Statement st = ConexionSQL.conexion();

    @Override
    public Empleado_TO registrarEmpleado(Empleado_TO empleado) throws Exception {
        Empleado_TO nuevoempleado = new Empleado_TO();
        try {
            try {
                String sql = "INSERT INTO empleado (idCliente, nombre, cargo, movil, correo) "
                        + "VALUES('" + empleado.getCliente().getIdCliente() + "', "
                        + "'" + empleado.getNombre() + "', "
                        + "'" + empleado.getCargo() + "', "
                        + "'" + empleado.getMovil() + "', "
                        + "'" + empleado.getCorreo() + "')";
                st.execute(sql);
            } catch (SQLException e) {
                nuevoempleado = new Empleado_TO();
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return empleado;
    }

    @Override
    public Empleado_TO editarEmpleado(Empleado_TO empleado) throws Exception {
        Empleado_TO nuevoempleado = new Empleado_TO();
        try {
            try {
                String sql = "UPDATE empleado SET idCliente = '" + empleado.getCliente().getIdCliente() + "', "
                        + "nombre = '" + empleado.getNombre() + "', "
                        + "cargo = '" + empleado.getCargo() + "', "
                        + "movil = '" + empleado.getMovil() + "', "
                        + "correo = '" + empleado.getCorreo() + "' "
                        + "WHERE idEmpleado = '" + empleado.getIdEmpleado() + "'";
                st.execute(sql);
            } catch (SQLException e) {
                nuevoempleado = new Empleado_TO();
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return empleado;
    }

    @Override
    public Empleado_TO eliminarEmpleado(Empleado_TO empleado) throws Exception {
        Empleado_TO nuevoempleado = new Empleado_TO();
        try {
            try {
                String sql = "DELETE FROM empleado WHERE idEmpleado = '" + empleado.getIdEmpleado() + "'";
                st.execute(sql);
            } catch (SQLException e) {
                nuevoempleado = new Empleado_TO();
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return empleado;
    }

    @Override
    public List<Empleado_TO> consultarEmpleados() throws Exception {
        List<Empleado_TO> empleados = new ArrayList<>();
        try {
            try {
                String sql = "SELECT idEmpleado, idCliente, nombre, cargo, movil, correo "
                        + "FROM empleado";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    empleados.add(new Empleado_TO(rs.getInt(1),
                            new Cliente_TO(rs.getInt(2)),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6)));
                }
            } catch (SQLException e) {
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return empleados;
    }

    @Override
    public List<Empleado_TO> consultarEmpleadosSegunCliente(Cliente_TO cliente) throws Exception {
        List<Empleado_TO> empleados = new ArrayList<>();
        try {
            try {
                String sql = "SELECT idEmpleado, idCliente, nombre, cargo, movil, correo "
                        + "FROM empleado "
                        + "WHERE idCliente = '" + cliente.getIdCliente() + "'";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    empleados.add(new Empleado_TO(rs.getInt(1),
                            new Cliente_TO(rs.getInt(2)),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6)));
                }
            } catch (SQLException e) {
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return empleados;
    }

    @Override
    public Empleado_TO consultarEmpleado(Empleado_TO empleado) throws Exception {
        Empleado_TO nuevoempleado = new Empleado_TO();
        try {
            try {
                String sql = "SELECT idEmpleado, idCliente, nombre, cargo, movil, correo "
                        + "FROM empleado "
                        + "WHERE idEmpleado = '" + empleado.getIdEmpleado() + "'";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    nuevoempleado = new Empleado_TO(rs.getInt(1),
                            new Cliente_TO(rs.getInt(2)),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6));
                }
            } catch (SQLException e) {
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return nuevoempleado;
    }

}
