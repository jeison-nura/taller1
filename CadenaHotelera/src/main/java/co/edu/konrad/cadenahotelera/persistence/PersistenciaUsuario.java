/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.cadenahotelera.persistence;

import co.edu.konrad.cadenahotelera.entities.EntidadUsuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Manejador de la entidad Curso.
 *
 * @author Bryan
 */
@Stateless
public class PersistenciaUsuario {
    
    @PersistenceContext(unitName = "cadenaHoteleraPU")
    protected EntityManager em;

    /**
     * Método que obtiene una lista con todos los datos de la entidad Usuario
     * 
     * @return Una lista con todos los datos de la entidad Usuario
     */
    public List<EntidadUsuario> findAll() {
        Query usuarios = em.createQuery("select a from UserEntity a");
        return usuarios.getResultList();
    }

    /**
     * Encuentra un usuario gracias a su código en la entidad.
     *
     * @param id que se desea buscar
     * @return usuario encontrado.
     */
    public EntidadUsuario find(long id) {
        EntidadUsuario usuario = em.find(EntidadUsuario.class, id);
        return usuario;
    }

    /**
     * Crea un usuario nuevo.
     *
     * @param user
     * @return usuario creado.
     */
    public EntidadUsuario create(EntidadUsuario userCreate) {
        em.persist(userCreate);
        return userCreate;
    }

    /**
     * Actualiza un usuario existente.
     *
     * @param userUpdate
     * @return usuario actualizado.
     */
    public EntidadUsuario update(EntidadUsuario userUpdate) {
        return em.merge(userUpdate);
    }
    
    /**
     * Elimina un usuario específico gracias a su código.
     * @param id 
     */
    public void delete(long codigo) {
        EntidadUsuario userDelete = em.find(EntidadUsuario.class, codigo);
        em.remove(userDelete);
    }
}
