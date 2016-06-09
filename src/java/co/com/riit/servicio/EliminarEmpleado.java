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
public interface EliminarEmpleado {
    
    public Empleado_TO eliminarEmpleado(int idEmpleado) throws Exception;
        
}
