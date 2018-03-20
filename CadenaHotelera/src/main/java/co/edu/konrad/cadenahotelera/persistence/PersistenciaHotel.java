/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.cadenahotelera.persistence;

import co.edu.konrad.cadenahotelera.entities.EntidadHotel;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Manejador de la entidad Hotel
 *
 * @author Bryan
 */
@Stateless
public class PersistenciaHotel {

    @PersistenceContext(unitName = "cadenaHoteleraPU")
    protected EntityManager em;

    /**
     * Método que retorna una lista con todas las tuplas de la tabla Hotel.
     *
     * @return List.
     */
    public List<EntidadHotel> findAll() {
        Query hoteles = em.createQuery("select a from EntidadHotel a");
        return hoteles.getResultList();
    }

    /**
     * Busca un hotel por su codigo
     *
     * @param codigo del hotel
     * @return hotel encontrado.
     */
    public EntidadHotel find(long codigo) {
        EntidadHotel hotelEncontrado = em.find(EntidadHotel.class, codigo);
        return hotelEncontrado;
    }

    /**
     * Crea un nuevo hotel.
     *
     * @param hotelCrear
     * @return hotel creado.
     */
    public EntidadHotel Create(EntidadHotel hotelCrear) {
        em.persist(hotelCrear);
        return hotelCrear;
    }

    /**
     * Actualiza un hotel dado.
     *
     * @param hotelActualizar
     * @return hotel actualizado.
     */
    public EntidadHotel update(EntidadHotel hotelActualizar) {
        return em.merge(hotelActualizar);
    }

    /**
     * Elimina un hotel dependiendo de su codigo.
     *
     * @param codigoHotelEliminar
     */
    public void delete(long codigoHotelEliminar) {
        EntidadHotel hotelEncontrado = em.find(EntidadHotel.class, codigoHotelEliminar);
        em.remove(hotelEncontrado);
    }
}
