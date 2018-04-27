/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konradlorenz.edu.resources;

import co.konradlorenz.edu.co.dto.serviciodto;
import co.konradlorenz.edu.co.entities.ServicioEntity;
import co.konradlorenz.edu.logic.servicioLogic;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author jeison
 */
@Path("/servicios")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class servicioResources {
    @Inject
    private servicioLogic serviciologic;

  
    
    @GET
    public List<serviciodto> getservicioList() {
        List<ServicioEntity> servicios = serviciologic.obtenerservicio();
        serviciodto servicio = new serviciodto();
        return servicio.toservList(servicios);
    }
    
    
    @GET
    @Path("{id: \\d+}")
    public serviciodto getservicio(@PathParam("id") Long id) {
        ServicioEntity servicio = serviciologic.obtenerservicio(id);
        if (servicio == null) {
            throw new RuntimeException("El servicio SOlicitado no existe");
        }
        return new serviciodto(servicio);

    }
    
    
    @POST
    public serviciodto createservicio(serviciodto servicio){
        return new serviciodto(serviciologic.crearservicio(servicio.toEntity()));
    }
    
    
   
    @PUT
    @Path("{id: \\d+}")
    public serviciodto updateservicio(@PathParam("id") Long id, serviciodto servicio){
        ServicioEntity entity= serviciologic.obtenerservicio(id);
        if(entity == null){
            throw new RuntimeException("el servicio solicitado no existe");
        }
        return new serviciodto(serviciologic.ectualizarservicio(servicio.toEntity(), id));
    }
    
    
    @DELETE
    @Path("{id: \\d+}")
    public void deleteservicio(@PathParam("id") Long id){
        ServicioEntity entity = serviciologic.obtenerservicio(id);
        if(entity == null){
            throw new RuntimeException("el servicio solicitado no existe");
        }
        serviciologic.eliminarservicio(id);
    }
}
