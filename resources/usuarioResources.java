/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konradlorenz.edu.resources;

import co.konradlorenz.edu.co.dto.Usuariodto;
import co.konradlorenz.edu.co.entities.UsuarioEntity;
import co.konradlorenz.edu.logic.UsuarioLogic;
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
@Path("/usuarios")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class usuarioResources {
    @Inject
    private UsuarioLogic usuariologic;

  
    
    @GET
    public List<Usuariodto> getusuarioList() {
        List<UsuarioEntity> estudiantes = usuariologic.obtenerusuarios();
        Usuariodto usuario = new Usuariodto();
        return usuario.tousuList(estudiantes);
    }
    
    
    @GET
    @Path("{id: \\d+}")
    public Usuariodto getusuario(@PathParam("id") Long id) {
        UsuarioEntity usuario = usuariologic.obtenerusuario(id);
        if (usuario == null) {
            throw new RuntimeException("El usuario SOlicitado no existe");
        }
        return new Usuariodto(usuario);

    }
    
    
    @POST
    public Usuariodto createusuario(Usuariodto usuario){
        return new Usuariodto(usuariologic.crearusuario(usuario.toEntity()));
    }
    
    
   
    @PUT
    @Path("{id: \\d+}")
    public Usuariodto updateusuario(@PathParam("id") Long id, Usuariodto usuario){
        UsuarioEntity entity= usuariologic.obtenerusuario(id);
        if(entity == null){
            throw new RuntimeException("el usuario solicitado no existe");
        }
        return new Usuariodto(usuariologic.ectualizarusuario(usuario.toEntity(), id));
    }
    
    
    @DELETE
    @Path("{id: \\d+}")
    public void deleteusuario(@PathParam("id") Long id){
        UsuarioEntity entity = usuariologic.obtenerusuario(id);
        if(entity == null){
            throw new RuntimeException("el usuario solicitado no existe");
        }
        usuariologic.eliminarusuario(id);
    }
}
