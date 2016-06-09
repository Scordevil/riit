/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio.impl;

import co.com.riit.modelo.dto.Cliente_TO;
import co.com.riit.modelo.dto.Empleado_TO;
import co.com.riit.persistencia.dao.EmpleadoDAO;
import co.com.riit.persistencia.dao.impl.EmpleadoDAOImpl;
import co.com.riit.servicio.EditarEmpleado;
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
@Path("/editarEmpleado")
public class EditarEmpleadoImpl implements EditarEmpleado{

    @GET
    @Produces({"application/json"})
    @Override
    public Empleado_TO editarEmpleado(@QueryParam("idEmpleado") int idEmpleado, 
            @QueryParam("idCliente") int idCliente, 
            @QueryParam("nombre") String nombre, 
            @QueryParam("cargo") String cargo, 
            @QueryParam("movil") String movil, 
            @QueryParam("correo") String correo) throws Exception {
        Empleado_TO empleado = new Empleado_TO(idEmpleado, new Cliente_TO(idCliente), nombre, cargo, movil, correo);
        EmpleadoDAO empleadoDao = new EmpleadoDAOImpl();
        return empleadoDao.editarEmpleado(empleado);
    }
    
}
