/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.cadenahotelera.persistence;

import co.edu.konrad.cadenahotelera.entities.EntidadMetodoPago;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Manejador de la entidad Método de pago
 *
 * @author Bryan
 */
@Stateless
public class PersistenciaMetodoPago {

    @PersistenceContext(unitName = "cadenaHoteleraPU")
    protected EntityManager em;

    /**
     * Método que retorna una lista con todos los datos de la tabla Metodo Pago.
     *
     * @return lista con todas las tuplas
     */
    public List<EntidadMetodoPago> findAll() {
        Query metodosPago = em.createQuery("select a from EntidadMetodoPago a");
        return metodosPago.getResultList();
    }

    /**
     * Busca un método de pago dependiendo del codigo ingresado.
     *
     * @param codigo
     * @return metodo de pago encontrado
     */
    public EntidadMetodoPago find(long codigo) {
        EntidadMetodoPago metodo = em.find(EntidadMetodoPago.class, codigo);
        return metodo;
    }

    /**
     * Método que crea un nuevo método de pago.
     *
     * @param metodoCrear
     * @return
     */
    public EntidadMetodoPago create(EntidadMetodoPago metodoCrear) {
        em.persist(metodoCrear);
        return metodoCrear;
    }

    /**
     * Método que actualiza los datos de un metodo de pago existente.
     *
     * @param metodoActualizar
     * @return método de pago actualizado
     */
    public EntidadMetodoPago update(EntidadMetodoPago metodoActualizar) {
        return em.merge(metodoActualizar);
    }

    /**
     * Elimina un método de pago existente dependiendo del código ingresado.
     *
     * @param codigo
     */
    public void delete(long codigo) {
        EntidadMetodoPago metodoEliminar = em.find(EntidadMetodoPago.class, codigo);
        em.remove(metodoEliminar);
    }

}
