/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.persistencia.dao;

import co.com.riit.modelo.dto.Cliente_TO;
import co.com.riit.modelo.dto.Empleado_TO;
import java.util.List;

/**
 *
 * @author Desarrollo_Planit
 */
public interface EmpleadoDAO {

    public Empleado_TO registrarEmpleado(Empleado_TO empleado) throws Exception;

    public Empleado_TO editarEmpleado(Empleado_TO empleado) throws Exception;

    public Empleado_TO eliminarEmpleado(Empleado_TO empleado) throws Exception;

    public List<Empleado_TO> consultarEmpleados() throws Exception;

    public List<Empleado_TO> consultarEmpleadosSegunCliente(Cliente_TO cliente) throws Exception;

    public Empleado_TO consultarEmpleado(Empleado_TO empleado) throws Exception;
}
