/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.cadenahotelera.persistence;

import co.edu.konrad.cadenahotelera.entities.EntidadServicio;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Bryan
 */
@Stateless
public class PersistenciaServicio {

    @PersistenceContext(unitName = "cadenaHoteleraPU")
    protected EntityManager em;

    /**
     * Retorna una lista con las tuplas de la entidad Servicio
     *
     * @return una lista.
     */
    public List<EntidadServicio> findAll() {
        Query servicios = em.createQuery("select a from EntidadServicio a");
        return servicios.getResultList();
    }

    /**
     * Retorna un servicio dependiendo del código ingresado.
     *
     * @param codigoServicio
     * @return servicio encontrado.
     */
    public EntidadServicio find(long codigoServicio) {
        EntidadServicio servicioEncontrado = em.find(EntidadServicio.class, codigoServicio);
        return servicioEncontrado;
    }

    /**
     * Crea un nuevo servicio
     *
     * @param servicioCrear
     * @return servicio creado
     */
    public EntidadServicio create(EntidadServicio servicioCrear) {
        em.persist(servicioCrear);
        return servicioCrear;
    }

    /**
     * Actualiza los datos de un servicio existente
     *
     * @param servicioActualizar
     * @return servicio actualizado
     */
    public EntidadServicio update(EntidadServicio servicioActualizar) {
        return em.merge(servicioActualizar);
    }

    /**
     * Elimina un servicio almacenado.
     *
     * @param codigoServicio
     */
    public void delete(long codigoServicio) {
        EntidadServicio servicioEncontrado = em.find(EntidadServicio.class, codigoServicio);
        em.remove(servicioEncontrado);
    }

}
