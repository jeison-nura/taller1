/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.cadenahotelera.persistence;

import co.edu.konrad.cadenahotelera.entities.EntidadReserva;
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
public class PersistenciaReserva {

    @PersistenceContext(unitName = "cadenaHoteleraPU")
    protected EntityManager em;

    /**
     * Método que retorna una lista con todas las tuplas de la entidad Reserva
     *
     * @return una lista
     */
    public List<EntidadReserva> findAll() {
        Query reservas = em.createQuery("select a from EntidadReserva a");
        return reservas.getResultList();
    }

    /**
     * Método que busca una reserva dependiendo de su código.
     *
     * @param codigo
     * @return reserva encontrada.
     */
    public EntidadReserva find(long codigo) {
        EntidadReserva reservaEncontrada = em.find(EntidadReserva.class, codigo);
        return reservaEncontrada;
    }

    /**
     * Crea una nueva reserva
     *
     * @param reservaCrear
     * @return reserva creada.
     */
    public EntidadReserva create(EntidadReserva reservaCrear) {
        em.persist(reservaCrear);
        return reservaCrear;
    }

    /**
     * Método que actualiza los datos de una reserva.
     *
     * @param reservaActualizar
     * @return reserva actualizada
     */
    public EntidadReserva update(EntidadReserva reservaActualizar) {
        return em.merge(reservaActualizar);
    }

    /**
     * Método que elimina una reserva existente gracias a su código
     *
     * @param codigoReserva
     */
    public void delete(long codigoReserva) {
        EntidadReserva reservaEncontrada = em.find(EntidadReserva.class, codigoReserva);
        em.remove(reservaEncontrada);
    }

}
