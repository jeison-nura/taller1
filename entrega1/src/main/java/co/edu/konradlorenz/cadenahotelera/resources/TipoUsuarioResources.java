/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konradlorenz.cadenahotelera.resources;

import co.edu.konradlorenz.cadenahotelera.dto.TiposUsuarioDTO;
import co.edu.konradlorenz.cadenahotelera.entities.TipoUsuarioEntity;
import co.edu.konradlorenz.cadenahotelera.logic.TipoUsuarioLogic;
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
    private TipoUsuarioLogic tusuariologic;

    @GET
    public List<TiposUsuarioDTO> gettusuario() {
        List<TipoUsuarioEntity> tusu = tusuariologic.obtenertusuario();
        TiposUsuarioDTO tusua = new TiposUsuarioDTO();
        return tusua.toTipoUsuarioList(tusu);
    }

    @GET
    @Path("{id: \\d+}")
    public TiposUsuarioDTO gettusu(@PathParam("id") Long id) {
        TipoUsuarioEntity tusu = tusuariologic.obtenertusuario(id);
        if (tusu == null) {
            throw new RuntimeException("El tipo de usuario SOlicitado no existe");
        }
        return new TiposUsuarioDTO(tusu);

    }

    @POST
    public TiposUsuarioDTO createtusu(TiposUsuarioDTO tusu) {
        return new TiposUsuarioDTO(tusuariologic.creartusuario(tusu.toEntity()));
    }

    @PUT
    @Path("{id: \\d+}")
    public TiposUsuarioDTO updatetusu(@PathParam("id") Long id, TiposUsuarioDTO tusu) {
        TipoUsuarioEntity entity = tusuariologic.obtenertusuario(id);
        if (entity == null) {
            throw new RuntimeException("el tipo de usuario solicitado no existe");
        }
        return new TiposUsuarioDTO(tusuariologic.actualizartusu(tusu.toEntity(), id));
    }

    @DELETE
    @Path("{id: \\d+}")
    public void deletetusu(@PathParam("id") Long id) {
        TipoUsuarioEntity entity = tusuariologic.obtenertusuario(id);
        if (entity == null) {
            throw new RuntimeException("el tipo de usuario solicitado no existe");
        }
        tusuariologic.eliminartusu(id);
    }
}
