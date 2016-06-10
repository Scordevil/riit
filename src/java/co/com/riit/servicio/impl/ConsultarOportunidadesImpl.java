/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio.impl;

import co.com.riit.modelo.dto.Oportunidad_TO;
import co.com.riit.persistencia.dao.OportunidadDAO;
import co.com.riit.persistencia.dao.impl.OportunidadDAOImpl;
import co.com.riit.servicio.ConsultarOportunidades;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author Desarrollo_Planit
 */
@Stateless
@Path("/consultarOportunidades")
public class ConsultarOportunidadesImpl implements ConsultarOportunidades {

    @GET
    @Produces({"application/json"})
    @Override
    public List<Oportunidad_TO> consultarOportunidades() throws Exception {
        OportunidadDAO oportunidadDao = new OportunidadDAOImpl();
        return oportunidadDao.consultarOportunidades();
    }
}
