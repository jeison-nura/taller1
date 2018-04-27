/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konradlorenz.edu.resources;

import co.konradlorenz.edu.co.dto.TiposUsuarioDto;
import co.konradlorenz.edu.co.entities.TipoUsuarioEntity;
import co.konradlorenz.edu.logic.tipoUsuarioLogic;
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
public class TipoUsuarioResources {
    @Inject
    private tipoUsuarioLogic tusuariologic;

  
    
    @GET
    public List<TiposUsuarioDto> gettusuario() {
        List<TipoUsuarioEntity> tusu = tusuariologic.obtenertusuario();
        TiposUsuarioDto tusua = new TiposUsuarioDto();
        return tusua.totusuList(tusu);
    }
    
    
    @GET
    @Path("{id: \\d+}")
    public TiposUsuarioDto gettusu(@PathParam("id") Long id) {
        TipoUsuarioEntity tusu = tusuariologic.obtenertusuario(id);
        if (tusu == null) {
            throw new RuntimeException("El tipo de usuario SOlicitado no existe");
        }
        return new TiposUsuarioDto(tusu);

    }
    
    
    @POST
    public TiposUsuarioDto createtusu(TiposUsuarioDto tusu){
        return new TiposUsuarioDto(tusuariologic.creartusuario(tusu.toEntity()));
    }
    
    
   
    @PUT
    @Path("{id: \\d+}")
    public TiposUsuarioDto updatetusu(@PathParam("id") Long id, TiposUsuarioDto tusu){
        TipoUsuarioEntity entity= tusuariologic.obtenertusuario(id);
        if(entity == null){
            throw new RuntimeException("el tipo de usuario solicitado no existe");
        }
        return new TiposUsuarioDto(tusuariologic.ectualizartusu(tusu.toEntity(), id));
    }
    
    
    @DELETE
    @Path("{id: \\d+}")
    public void deletetusu(@PathParam("id") Long id){
        TipoUsuarioEntity entity = tusuariologic.obtenertusuario(id);
        if(entity == null){
            throw new RuntimeException("el tipo de usuario solicitado no existe");
        }
        tusuariologic.eliminartusu(id);
    }
}
