/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.cadenahotelera.persistence;

import co.edu.konrad.cadenahotelera.entities.EntidadHabitacion;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Manejador de la entidad Habitación.
 *
 * @author Bryan
 */
@Stateless
public class PersistenciaHabitacion {

    @PersistenceContext(unitName = "cadenaHoteleraPU")
    protected EntityManager em;

    /**
     * Método que retorna una lista con todas las habitaciones existentes.
     *
     * @return una lista con todos los datos de las habitaciones
     */
    public List<EntidadHabitacion> findAll() {
        Query habitaciones = em.createQuery("select a from EntidadHabitacion a");
        return habitaciones.getResultList();
    }

    /**
     * Método que busca una tupla por el código de la habitación.
     *
     * @param codigo
     * @return el objeto que se deseaba buscar.
     */
    public EntidadHabitacion find(long codigo) {
        EntidadHabitacion habitacion = em.find(EntidadHabitacion.class, codigo);
        return habitacion;
    }

    /**
     * Método que crea una nueva habitación.
     *
     * @param habitacionNueva
     * @return
     */
    public EntidadHabitacion create(EntidadHabitacion habitacionNueva) {
        em.persist(habitacionNueva);
        return habitacionNueva;
    }

    /**
     * Actualiza los datos de una habitación.
     *
     * @param habitacionActualizar
     * @return
     */
    public EntidadHabitacion update(EntidadHabitacion habitacionActualizar) {
        return em.merge(habitacionActualizar);
    }

    /**
     * Elimina una tupla dependiendo del código de la habitación.
     *
     * @param codigo
     */
    public void delete(long codigo) {
        EntidadHabitacion habitacionEliminar = em.find(EntidadHabitacion.class, codigo);
        em.remove(habitacionEliminar);
    }

}
