/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.persistencia.dao.impl;

import co.com.riit.conexion.ConexionSQL;
import co.com.riit.modelo.dto.CategoriaOportunidad_TO;
import co.com.riit.modelo.dto.Empleado_TO;
import co.com.riit.modelo.dto.Oportunidad_TO;
import co.com.riit.modelo.dto.Usuario_TO;
import co.com.riit.persistencia.dao.OportunidadDAO;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Desarrollo_Planit
 */
public class OportunidadDAOImpl implements OportunidadDAO {

    private final Statement st = ConexionSQL.conexion();

    @Override
    public Oportunidad_TO registrarOportunidad(Oportunidad_TO oportunidad) throws Exception {
        Oportunidad_TO nuevaoportunidad = new Oportunidad_TO();
        try {
            try {
                String sql = "INSERT INTO oportunidad (idEmpleado, idUsuario, fecha, idCategoriaOportunidad) "
                        + "VALUES ('" + oportunidad.getEmpleado().getIdEmpleado() + "', "
                        + "'" + oportunidad.getUsuario().getIdUsuario() + "', "
                        + "'" + oportunidad.getFecha() + "', "
                        + "'" + oportunidad.getCategoriaOportunidad().getIdCategoriaOportunidad() + "')";
                st.execute(sql);
            } catch (Exception e) {
                nuevaoportunidad = new Oportunidad_TO();
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return nuevaoportunidad;
    }

    @Override
    public Oportunidad_TO editarOportunidad(Oportunidad_TO oportunidad) throws Exception {
        Oportunidad_TO nuevaoportunidad = new Oportunidad_TO();
        try {
            try {
                String sql = "UPDATE oportunidad SET idEmpleado = '" + oportunidad.getEmpleado().getIdEmpleado() + "',"
                        + " idUsuario = '" + oportunidad.getUsuario().getIdUsuario() + "',"
                        + " fecha = '" + oportunidad.getFecha() + "',"
                        + " idCategoriaOportunidad = '" + oportunidad.getCategoriaOportunidad().getIdCategoriaOportunidad() + "'"
                        + " WHERE idOportunidad = '" + oportunidad.getIdOportunidad() + "'";
                st.execute(sql);
            } catch (Exception e) {
                nuevaoportunidad = new Oportunidad_TO();
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return nuevaoportunidad;
    }

    @Override
    public Oportunidad_TO eliminarOportunidad(Oportunidad_TO oportunidad) throws Exception {
        Oportunidad_TO nuevaoportunidad = new Oportunidad_TO();
        try {
            try {
                String sql = "DELETE FROM oportunidad "
                        + "WHERE idOportunidad = '" + oportunidad.getIdOportunidad() + "'";
                st.execute(sql);
            } catch (Exception e) {
                nuevaoportunidad = new Oportunidad_TO();
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return nuevaoportunidad;
    }

    @Override
    public List<Oportunidad_TO> consultarOportunidades() throws Exception {
        List<Oportunidad_TO> oportunidades = new ArrayList<>();
        try {
            try {
                String sql = "SELECT idOportunidad, idEmpleado, idUsuario, fecha, idCategoriaOportunidad "
                        + "FROM oportunidad ";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    oportunidades.add(new Oportunidad_TO(rs.getInt(1),
                            new Empleado_TO(rs.getInt(2)),
                            new Usuario_TO(rs.getInt(3)),
                            rs.getDate(4),
                            new CategoriaOportunidad_TO(rs.getInt(2))));
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return oportunidades;
    }

    @Override
    public List<Oportunidad_TO> consultarOportunidad(Oportunidad_TO oportunidad) throws Exception {
        List<Oportunidad_TO> oportunidades = new ArrayList<>();
        try {
            try {
                String sql = "SELECT idOportunidad, idEmpleado, idUsuario, fecha, idCategoriaOportunidad "
                        + "FROM oportunidad "
                        + "WHERE idOportunidad = '" + oportunidad.getIdOportunidad() + "'";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    oportunidades.add(new Oportunidad_TO(rs.getInt(1),
                            new Empleado_TO(rs.getInt(2)),
                            new Usuario_TO(rs.getInt(3)),
                            rs.getDate(4),
                            new CategoriaOportunidad_TO(rs.getInt(2))));
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return oportunidades;
    }

}
