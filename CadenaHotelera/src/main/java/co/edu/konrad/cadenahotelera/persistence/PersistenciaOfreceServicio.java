/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.cadenahotelera.persistence;

import co.edu.konrad.cadenahotelera.entities.EntidadOfreceServicio;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Manejador de la entidad Ofrece_Servicio
 *
 * @author Bryan
 */
@Stateless
public class PersistenciaOfreceServicio {

    @PersistenceContext(unitName = "cadenaHoteleraPU")
    protected EntityManager em;

    /**
     * Devuelve una lista con todas las tuplas de la entidad Ofrece_Servicio
     *
     * @return una lista.
     */
    public List<EntidadOfreceServicio> findAll() {
        Query servicios = em.createQuery("select a from EntidadOfreceServicio a");
        return servicios.getResultList();
    }

    /**
     * Encuentra un servicio ofrecido dependiendo del codigo ingresado
     *
     * @param codigo
     * @return tupla encontrada
     */
    public EntidadOfreceServicio find(long codigo) {
        EntidadOfreceServicio servicios = em.find(EntidadOfreceServicio.class, codigo);
        return servicios;
    }

    /**
     * Crea un nuevo servicio prestado
     *
     * @param servicio
     * @return servicio prestado
     */
    public EntidadOfreceServicio create(EntidadOfreceServicio servicio) {
        em.persist(servicio);
        return servicio;
    }

    /**
     * Actualiza un servicio existente
     *
     * @param servicio
     * @return servicio actualizado.
     */
    public EntidadOfreceServicio update(EntidadOfreceServicio servicio) {
        return em.merge(servicio);
    }

    /**
     * Elimina un servicio dado
     *
     * @param codigo
     */
    public void delete(long codigo) {
        EntidadOfreceServicio servicio = em.find(EntidadOfreceServicio.class, codigo);
        em.remove(servicio);
    }
}
