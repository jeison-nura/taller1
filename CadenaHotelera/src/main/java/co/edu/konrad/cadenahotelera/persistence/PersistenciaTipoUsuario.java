/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.cadenahotelera.persistence;

import co.edu.konrad.cadenahotelera.entities.EntidadTipoUsuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Manejador de la entidad Tipo Usuario
 *
 * @author Bryan
 */
@Stateless
public class PersistenciaTipoUsuario {

    @PersistenceContext(unitName = "cadenaHoteleraPU")
    protected EntityManager em;

    /**
     * Método que brinda todas las tuplas de la tabla Tipo Usuario.
     *
     * @return lista con los tipos de usuarios.
     */
    public List<EntidadTipoUsuario> findAll() {
        Query tiposUsuario = em.createQuery("select a from EntidadTipoUsuario a");
        return tiposUsuario.getResultList();
    }

    /**
     * Busca un tipo de usuario gracias a su codigo.
     *
     * @param codigoTipoUsuario
     * @return el tipo de usuario encontrado.
     */
    public EntidadTipoUsuario find(long codigoTipoUsuario) {
        EntidadTipoUsuario tipoUsuarioEncontrado = em.find(EntidadTipoUsuario.class, codigoTipoUsuario);
        return tipoUsuarioEncontrado;
    }

    /**
     * Crea un nuevo tipo de usuario
     *
     * @param usuarioCrear
     * @return tipo de usuario creado
     */
    public EntidadTipoUsuario create(EntidadTipoUsuario usuarioCrear) {
        em.persist(usuarioCrear);
        return usuarioCrear;
    }

    /**
     * Actualiza la información de un tipo de usuario ya creado.
     *
     * @param tipoUsuarioActualizar
     * @return tipo de usuario actualizado
     */
    public EntidadTipoUsuario update(EntidadTipoUsuario tipoUsuarioActualizar) {
        return em.merge(tipoUsuarioActualizar);
    }

    /**
     * Elimina un tipo de usuario existente
     *
     * @param codigoTipoUsuario
     */
    public void delete(long codigoTipoUsuario) {
        EntidadTipoUsuario usuarioEncontrado = em.find(EntidadTipoUsuario.class, codigoTipoUsuario);
        em.remove(usuarioEncontrado);
    }

}
