/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio.impl;

import co.com.riit.modelo.dto.Oportunidad_TO;
import co.com.riit.persistencia.dao.OportunidadDAO;
import co.com.riit.persistencia.dao.impl.OportunidadDAOImpl;
import co.com.riit.servicio.ConsultarOportunidad;
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
@Path("/consultarOportunidad")
public class ConsultarOportunidadImpl implements ConsultarOportunidad{

    @GET
    @Produces({"application/json"})
    @Override
    public Oportunidad_TO consultarOportunidad(@QueryParam("idOportunidad") int idOportunidad) throws Exception {
        Oportunidad_TO oportunidad = new Oportunidad_TO(idOportunidad);
        OportunidadDAO oportunidadDao = new OportunidadDAOImpl();
        return oportunidadDao.consultarOportunidad(oportunidad);
    }
    
}
