/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.cadenahotelera.persistence;

import co.edu.konrad.cadenahotelera.entities.EntidadTipoHabitacion;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Manejador de la entidad Tipo Habitacion
 *
 * @author Bryan
 */
@Stateless
public class PersistenciaTipoHabitacion {

    @PersistenceContext(name = "cadenaHoteleraPU")
    protected EntityManager em;

    /**
     * Método que retorna una lista con todas las tuplas de tipos de
     * habitaciones
     *
     * @return una lista
     */
    public List<EntidadTipoHabitacion> findAll() {
        Query tipoHabitaciones = em.createQuery("select a from EntidadTipoHabitacion a");
        return tipoHabitaciones.getResultList();
    }

    /**
     * Método que retorna un tipo de habitación según el código ingresado.
     *
     * @param codigo
     * @return habitación encontrada.
     */
    public EntidadTipoHabitacion find(long codigo) {
        EntidadTipoHabitacion habitacionEncontrada = em.find(EntidadTipoHabitacion.class, codigo);
        return habitacionEncontrada;
    }

    /**
     * Crea un nuevo tipo de habitación
     *
     * @param tipoHabitacionCrear
     * @return el nuevo tipo de habitación creado.
     */
    public EntidadTipoHabitacion create(EntidadTipoHabitacion tipoHabitacionCrear) {
        em.persist(tipoHabitacionCrear);
        return tipoHabitacionCrear;
    }

    /**
     * Actualiza un tipo de habitación ya existente.
     *
     * @param tipoActualizar
     * @return tipo de habitacion actualizado.
     */
    public EntidadTipoHabitacion update(EntidadTipoHabitacion tipoActualizar) {
        return em.merge(tipoActualizar);
    }

    public void delete(long codigo) {
        EntidadTipoHabitacion tipoEliminar = em.find(EntidadTipoHabitacion.class, codigo);
        em.remove(tipoEliminar); 
    }

}
