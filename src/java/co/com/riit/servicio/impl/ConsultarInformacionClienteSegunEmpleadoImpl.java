/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio.impl;

import co.com.riit.modelo.dto.Cliente_TO;
import co.com.riit.modelo.dto.Empleado_TO;
import co.com.riit.persistencia.dao.ClienteDAO;
import co.com.riit.persistencia.dao.impl.ClienteDAOImpl;
import co.com.riit.servicio.ConsultarInformacionClienteSegunEmpleado;
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
@Path("/consultarInformacionCliente")
public class ConsultarInformacionClienteSegunEmpleadoImpl  implements ConsultarInformacionClienteSegunEmpleado{

    @GET
    @Produces({"application/json"})
    @Override
    public Cliente_TO consultarInformacionCliente(@QueryParam("idEmpleado") int idEmpleado) throws Exception {
        Empleado_TO empleado = new Empleado_TO(idEmpleado);
        ClienteDAO clienteDao = new ClienteDAOImpl();
        return clienteDao.consultarInformacionClienteSegunEmpleado(empleado);
    }
    
}
