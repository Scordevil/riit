/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio.impl;

import co.com.riit.modelo.dto.Empleado_TO;
import co.com.riit.persistencia.dao.EmpleadoDAO;
import co.com.riit.persistencia.dao.impl.EmpleadoDAOImpl;
import co.com.riit.servicio.ConsultarEmpleados;
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
@Path("/consultarEmpleados")
public class ConsultarEmpleadosImpl implements ConsultarEmpleados{

    @GET
    @Produces({"application/json"})
    @Override
    public List<Empleado_TO> consultarEmpleados() throws Exception {
        EmpleadoDAO empleadoDao = new EmpleadoDAOImpl();
        return empleadoDao.consultarEmpleados();
    }    
}
