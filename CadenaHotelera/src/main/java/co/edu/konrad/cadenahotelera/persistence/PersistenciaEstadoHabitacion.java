/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.cadenahotelera.persistence;

import co.edu.konrad.cadenahotelera.entities.EntidadEstadoHabitacion;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.eclipse.persistence.internal.jpa.parsing.EscapeNode;

/**
 *
 * @author Bryan
 */
@Stateless
public class PersistenciaEstadoHabitacion {

    @PersistenceContext(unitName = "cadenaHoteleraPU")
    protected EntityManager em;

    /**
     * Método que retorna una lista con todas las tuplas de la tabla
     * EstadoHabitacion
     *
     * @return lista con los estados
     */
    public List<EntidadEstadoHabitacion> findAll() {
        Query estados = em.createQuery("select a from EntidadEstadoHabitacion a");
        return estados.getResultList();
    }

    /**
     * Entidad que encuentra un tipo de estado por código
     *
     * @param codigoEstado
     * @return el tipo de estado encontrado
     */
    public EntidadEstadoHabitacion find(long codigoEstado) {
        EntidadEstadoHabitacion estadoHabitacion = em.find(EntidadEstadoHabitacion.class, codigoEstado);
        return estadoHabitacion;
    }

    /**
     * Crear un nuevo estado para las habitaciones
     *
     * @param estadoCrear
     * @return estado creado.
     */
    public EntidadEstadoHabitacion create(EntidadEstadoHabitacion estadoCrear) {
        em.persist(estadoCrear);
        return estadoCrear;
    }

    /**
     * Actualiza un estado de habitacion
     *
     * @param estado
     * @return el estado actualizado
     */
    public EntidadEstadoHabitacion update(EntidadEstadoHabitacion estado) {
        return em.merge(estado);
    }

    /**
     * Elimina un estado de habitacion
     *
     * @param codigo
     */
    public void delete(long codigo) {
        EntidadEstadoHabitacion estado = em.find(EntidadEstadoHabitacion.class, codigo);
        em.remove(estado);
    }
}
