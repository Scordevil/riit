/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.persistencia.dao;

import co.com.riit.modelo.dto.Oportunidad_TO;
import java.util.List;

/**
 *
 * @author Desarrollo_Planit
 */
public interface OportunidadDAO {

    public Oportunidad_TO registrarOportunidad(Oportunidad_TO oportunidad) throws Exception;

    public Oportunidad_TO editarOportunidad(Oportunidad_TO oportunidad) throws Exception;

    public Oportunidad_TO eliminarOportunidad(Oportunidad_TO oportunidad) throws Exception;

    public List<Oportunidad_TO> consultarOportunidades() throws Exception;

    public List<Oportunidad_TO> consultarOportunidad(Oportunidad_TO oportunidad) throws Exception;
}
