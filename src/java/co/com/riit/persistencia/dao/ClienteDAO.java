/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.persistencia.dao;

import co.com.riit.modelo.dto.Cliente_TO;
import co.com.riit.modelo.dto.Empleado_TO;
import co.com.riit.modelo.dto.Usuario_TO;
import java.util.List;

/**
 *
 * @author Desarrollo_Planit
 */
public interface ClienteDAO {

    public Cliente_TO registrarUsuario(Cliente_TO cliente) throws Exception;

    public Cliente_TO editarUsuario(Cliente_TO cliente) throws Exception;

    public List<Cliente_TO> consultarClientes() throws Exception;

    public List<Cliente_TO> consultarClientesSegunAsesor(Usuario_TO usuario) throws Exception;

    public Cliente_TO consultarCliente(Cliente_TO cliente) throws Exception;
    
    public Cliente_TO consultarInformacionClienteSegunEmpleado(Empleado_TO empleado) throws Exception;
}
