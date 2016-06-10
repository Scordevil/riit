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
public interface ConsultarOportunidad {
  
    public Oportunidad_TO consultarOportunidad(int idOportunidad) throws Exception;
}
