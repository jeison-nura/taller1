/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konradlorenz.edu.persistence;


import co.konradlorenz.edu.co.entities.TipoPrecioHabitacionEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author jeison
 */
@Stateless
public class TipoPrecioHabitacionPersistence {
     @PersistenceContext(unitName = "reservasPU")
    protected EntityManager em;
    
     /**
     * Obtener la lista con los datos de la tabla tipohabitacion
     * @return Lista de datos de la tabla usuario
     */
    public List<TipoPrecioHabitacionEntity> findAll(){
        Query todos = em.createQuery("select e from TipoPrecioHabitacionEntity e");
        return todos.getResultList();
    }
    
     /**
     * Encontrar una tupla especifica de la tabla tipopreciohabitacion
     * @param id que se desea buscar
     * @return tphabitacion
     */
    public TipoPrecioHabitacionEntity find(Long id){
        TipoPrecioHabitacionEntity tphabitacion = em.find(TipoPrecioHabitacionEntity.class, id);
        return tphabitacion;
    }
    
    /**
     * Creacion de un nuevo tipohabitacion
     * @param tphabitacion
     * @return nuevo tipohabitacion creado
     */
    public TipoPrecioHabitacionEntity create(TipoPrecioHabitacionEntity tphabitacion){
        em.persist(tphabitacion);
        return tphabitacion;
    }
    
    /**
     * Actualizacion de una tupla de la tabla tipopreciohabitacion
     * @param tphabitacionActualizar
     * @return tphabitacion actualizado
     */
    public TipoPrecioHabitacionEntity update (TipoPrecioHabitacionEntity tphabitacionActualizar){
        return em.merge(tphabitacionActualizar);
    }
    
    /**
     * Elimina una tupla curso de la tabla tipopreciohabitacion
     * @param id 
     */
    public void delete (Long id){
        TipoPrecioHabitacionEntity tphabitacionDelete = em.find(TipoPrecioHabitacionEntity.class, id);
        em.remove(tphabitacionDelete);
    }
}
