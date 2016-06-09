/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio;

import co.com.riit.modelo.dto.Oportunidad_TO;
import java.util.Date;

/**
 *
 * @author Desarrollo_Planit
 */
public interface RegistrarOportunidad {
    
    public Oportunidad_TO registrarOportunidad(int idEmpleado, int idUsuario, Date fecha, int idCategoriaOportunidad) throws Exception;
    
}
