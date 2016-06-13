/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author VaioDevelopment
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(co.com.riit.servicio.impl.ConsultarClienteImpl.class);
        resources.add(co.com.riit.servicio.impl.ConsultarClientesImpl.class);
        resources.add(co.com.riit.servicio.impl.ConsultarClientesSegunAsesorImpl.class);
        resources.add(co.com.riit.servicio.impl.ConsultarDatosSesionUsuarioImpl.class);
        resources.add(co.com.riit.servicio.impl.ConsultarEmpleadoImpl.class);
        resources.add(co.com.riit.servicio.impl.ConsultarEmpleadosImpl.class);
        resources.add(co.com.riit.servicio.impl.ConsultarEmpleadosSegunClienteImpl.class);
        resources.add(co.com.riit.servicio.impl.ConsultarInformacionClienteSegunEmpleadoImpl.class);
        resources.add(co.com.riit.servicio.impl.ConsultarOportunidadImpl.class);
        resources.add(co.com.riit.servicio.impl.ConsultarOportunidadesImpl.class);
        resources.add(co.com.riit.servicio.impl.ConsultarTicketImpl.class);
        resources.add(co.com.riit.servicio.impl.ConsultarTicketSitioImpl.class);
        resources.add(co.com.riit.servicio.impl.ConsultarTicketsImpl.class);
        resources.add(co.com.riit.servicio.impl.ConsultarTicketsSitioImpl.class);
        resources.add(co.com.riit.servicio.impl.ConsultarUsuarioImpl.class);
        resources.add(co.com.riit.servicio.impl.ConsultarUsuariosImpl.class);
        resources.add(co.com.riit.servicio.impl.EditarClienteImpl.class);
        resources.add(co.com.riit.servicio.impl.EditarEmpleadoImpl.class);
        resources.add(co.com.riit.servicio.impl.EditarOportunidadImpl.class);
        resources.add(co.com.riit.servicio.impl.EditarTicketImpl.class);
        resources.add(co.com.riit.servicio.impl.EditarTicketSitioImpl.class);
        resources.add(co.com.riit.servicio.impl.EditarUsuarioImpl.class);
        resources.add(co.com.riit.servicio.impl.EliminarEmpleadoImpl.class);
        resources.add(co.com.riit.servicio.impl.EliminarOportunidadImpl.class);
        resources.add(co.com.riit.servicio.impl.EliminarTicketImpl.class);
        resources.add(co.com.riit.servicio.impl.EliminarTicketSitioImpl.class);
        resources.add(co.com.riit.servicio.impl.RegistrarClienteImpl.class);
        resources.add(co.com.riit.servicio.impl.RegistrarEmpleadoImpl.class);
        resources.add(co.com.riit.servicio.impl.RegistrarOportunidadImpl.class);
        resources.add(co.com.riit.servicio.impl.RegistrarTicketImpl.class);
        resources.add(co.com.riit.servicio.impl.RegistrarTicketSitioImpl.class);
        resources.add(co.com.riit.servicio.impl.RegistrarUsuarioImpl.class);
    }
    
}
