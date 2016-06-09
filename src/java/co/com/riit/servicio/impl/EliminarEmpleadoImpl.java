/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio.impl;

import co.com.riit.modelo.dto.Empleado_TO;
import co.com.riit.persistencia.dao.EmpleadoDAO;
import co.com.riit.persistencia.dao.impl.EmpleadoDAOImpl;
import co.com.riit.servicio.EliminarEmpleado;
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
@Path("/eliminarEmpleado")
public class EliminarEmpleadoImpl implements EliminarEmpleado {

    @GET
    @Produces({"application/json"})
    @Override
    public Empleado_TO eliminarEmpleado(@QueryParam("idEmpleado") int idEmpleado) throws Exception {
        Empleado_TO empleado = new Empleado_TO(idEmpleado);
        EmpleadoDAO empleadoDao = new EmpleadoDAOImpl();
        return empleadoDao.eliminarEmpleado(empleado);
    }
}
