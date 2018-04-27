/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konradlorenz.edu.resources;

import co.konradlorenz.edu.co.dto.TipoHabitacionDto;
import co.konradlorenz.edu.co.entities.TipoHabitacionEntity;
import co.konradlorenz.edu.logic.TipoHabitacionLogic;
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
@Path("/tipohabitacion")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TipoHabitacionResources {
    @Inject
    private TipoHabitacionLogic thabitacionlogic;

  
    
    @GET
    public List<TipoHabitacionDto> getthabiList() {
        List<TipoHabitacionEntity> thabi = thabitacionlogic.obtenerthabitacion();
        TipoHabitacionDto thabit = new TipoHabitacionDto();
        return thabit.tothabiList(thabi);
    }
    
    
    @GET
    @Path("{id: \\d+}")
    public TipoHabitacionDto getthabi(@PathParam("id") Long id) {
        TipoHabitacionEntity thabi = thabitacionlogic.obtenerthabitacion(id);
        if (thabi == null) {
            throw new RuntimeException("El tipo de habitacion SOlicitado no existe");
        }
        return new TipoHabitacionDto(thabi);

    }
    
    
    @POST
    public TipoHabitacionDto createthabi(TipoHabitacionDto thabi){
        return new TipoHabitacionDto(thabitacionlogic.crearthabitacion(thabi.toEntity()));
    }
    
    
   
    @PUT
    @Path("{id: \\d+}")
    public TipoHabitacionDto updatethabi(@PathParam("id") Long id, TipoHabitacionDto thabi){
        TipoHabitacionEntity entity= thabitacionlogic.obtenerthabitacion(id);
        if(entity == null){
            throw new RuntimeException("el tipo de habitacion solicitado no existe");
        }
        return new TipoHabitacionDto(thabitacionlogic.ectualizarthabi(thabi.toEntity(), id));
    }
    
    
    @DELETE
    @Path("{id: \\d+}")
    public void deletethabi(@PathParam("id") Long id){
        TipoHabitacionEntity entity = thabitacionlogic.obtenerthabitacion(id);
        if(entity == null){
            throw new RuntimeException("el tipo de habitacion solicitado no existe");
        }
        thabitacionlogic.eliminarthabi(id);
    }
}
