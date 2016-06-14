/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio.impl;

import co.com.riit.modelo.dto.Ciudad_TO;
import co.com.riit.persistencia.dao.impl.CiudadDAOImpl;
import co.com.riit.servicio.ConsultarCiudades;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author SISTEMAS
 */
@Stateless
@Path("/consultarCiudades")
public class ConsultarCiudadesImpl implements ConsultarCiudades {

    @GET
    @Produces({"application/json"})
    @Override
    public List<Ciudad_TO> consultarCiudades() throws Exception {

        CiudadDAOImpl ciudadDAO = new CiudadDAOImpl();
        List<Ciudad_TO> ciudades = new ArrayList<>();
        try {
            ciudades = ciudadDAO.consultarCiudades();
        } catch (Exception e) {
            throw e;
        }
        return ciudades;
    }

}
