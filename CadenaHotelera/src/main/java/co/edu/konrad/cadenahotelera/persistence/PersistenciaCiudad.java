/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.cadenahotelera.persistence;

import co.edu.konrad.cadenahotelera.entities.EntidadCiudad;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Manejador de la entidad Ciudad
 *
 * @author Bryan
 */
@Stateless
public class PersistenciaCiudad {

    @PersistenceContext(unitName = "cadenaHoteleraPU")
    protected EntityManager em;

    /**
     * Método que retorna una lista con todas las tuplas que contiene la entidad
     * Ciudad.
     *
     * @return una lista
     */
    public List<EntidadCiudad> findAll() {
        Query ciudades = em.createQuery("select a from EntidadCiudad a");
        return ciudades.getResultList();
    }

    /**
     * Encontrar una ciudad por su código.
     *
     * @param codigoCiudad
     * @return la ciudad encontrada
     */
    public EntidadCiudad find(long codigoCiudad) {
        EntidadCiudad ciudadEncontrada = em.find(EntidadCiudad.class, codigoCiudad);
        return ciudadEncontrada;
    }

    /**
     * Método que crea una nueva ciudad
     *
     * @param ciudadCrear
     * @return ciudad creada
     */
    public EntidadCiudad create(EntidadCiudad ciudadCrear) {
        em.persist(ciudadCrear);
        return ciudadCrear;
    }

    /**
     * Método que acualiza una ciudad existente
     *
     * @param ciudadActualizar
     * @return ciudad actualizada
     */
    public EntidadCiudad Update(EntidadCiudad ciudadActualizar) {
        return em.merge(ciudadActualizar);
    }

    /**
     * Elimina una ciudad que posea cierto código
     *
     * @param codigoCiudad
     */
    public void delete(long codigoCiudad) {
        EntidadCiudad ciudadEliminar = em.find(EntidadCiudad.class, codigoCiudad);
        em.remove(ciudadEliminar);
    }
}
