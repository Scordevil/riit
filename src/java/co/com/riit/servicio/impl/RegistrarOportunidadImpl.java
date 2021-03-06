/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio.impl;

import co.com.riit.modelo.dto.CategoriaOportunidad_TO;
import co.com.riit.modelo.dto.Empleado_TO;
import co.com.riit.modelo.dto.Oportunidad_TO;
import co.com.riit.modelo.dto.Usuario_TO;
import co.com.riit.persistencia.dao.OportunidadDAO;
import co.com.riit.persistencia.dao.impl.OportunidadDAOImpl;
import co.com.riit.servicio.RegistrarOportunidad;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
@Path("/registrarOportunidad")
public class RegistrarOportunidadImpl implements RegistrarOportunidad {

    @GET
    @Produces({"application/json"})
    @Override
    public Oportunidad_TO registrarOportunidad(@QueryParam("idEmpleado") int idEmpleado,
            @QueryParam("idUsuario") int idUsuario,
            @QueryParam("fecha") String fecha,
            @QueryParam("idCategoriaOportunidad") int idCategoriaOportunidad) throws Exception {

        SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy-MM-dd");
        Date f = new Date();
        try {
            f = formatoDeFecha.parse(fecha);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Oportunidad_TO oportunidad = new Oportunidad_TO(new Empleado_TO(idEmpleado), new Usuario_TO(idUsuario), f, new CategoriaOportunidad_TO(idCategoriaOportunidad));
        OportunidadDAO oportunidadDao = new OportunidadDAOImpl();
        return oportunidadDao.registrarOportunidad(oportunidad);
    }
}
