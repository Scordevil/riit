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
import co.com.riit.servicio.ConsultarEmpleadosSegunCliente;
import java.util.List;
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
@Path("/consultarEmpleadosSegunCliente")
public class ConsultarEmpleadosSegunClienteImpl implements ConsultarEmpleadosSegunCliente{

    @GET
    @Produces({"application/json"})
    @Override
    public List<Empleado_TO> consultarEmpleadosSegunCliente(@QueryParam("idCliente") int idCliente) throws Exception {
        Cliente_TO cliente = new Cliente_TO(idCliente);
        EmpleadoDAO empleadoDao = new EmpleadoDAOImpl();
        return empleadoDao.consultarEmpleadosSegunCliente(cliente);
    }
    
}
