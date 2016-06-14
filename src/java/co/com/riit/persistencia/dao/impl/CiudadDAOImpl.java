/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.persistencia.dao.impl;

import co.com.riit.conexion.ConexionSQL;
import co.com.riit.modelo.dto.Ciudad_TO;
import co.com.riit.persistencia.dao.CiudadDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * Interfaz que contiene los metodos de persistencia relacionados con la entidad
 * Ciudad
 *
 * @author SISTEMAS
 */
public class CiudadDAOImpl implements CiudadDAO {

    private final Statement st = ConexionSQL.conexion();

    /**
     *
     * METODOS PARA CONSULTAR CIUDADES
     *
     * @return @throws Exception
     */
    @Override
    public List<Ciudad_TO> consultarCiudades() throws Exception {

        List<Ciudad_TO> ciudades = new ArrayList<>();
        try {
            try {

                String sql = "SELECT idciudad, nombre FROM ciudad; ";
                
                ResultSet rs = null;
                rs = st.executeQuery(sql);

                while (rs.next()) {
                    ciudades.add(new Ciudad_TO(rs.getInt(1), rs.getString(2)));

                }

            } catch (SQLException r) {
                throw r;
            }

            ConexionSQL.CerrarConexion();

        } catch (Exception e) {
            throw e;
        }
        return ciudades;

    }

}
