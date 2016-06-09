/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.servicio;

import co.com.riit.modelo.dto.Oportunidad_TO;

/**
 *
 * @author Desarrollo_Planit
 */
public interface EliminarOportunidad {

    public Oportunidad_TO eliminarOportunidad(int idOportunidad) throws Exception;

}
