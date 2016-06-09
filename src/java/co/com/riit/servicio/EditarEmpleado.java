/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio;

import co.com.riit.modelo.dto.Empleado_TO;

/**
 *
 * @author Desarrollo_Planit
 */
public interface EditarEmpleado {
    
    public Empleado_TO editarEmpleado(int idEmpleado, int idCliente, String nombre, String cargo, String movil, String correo) throws Exception;
    
}
