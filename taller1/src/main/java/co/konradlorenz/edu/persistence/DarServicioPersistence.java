/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konradlorenz.edu.persistence;


import co.konradlorenz.edu.co.entities.DarServicioEntity;
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
public class DarServicioPersistence {
     @PersistenceContext(unitName = "reservasPU")
    protected EntityManager em;
    
     /**
     * Obtener la lista con los datos de la tabla Darservicio
     * @return Lista de datos de la tabla DarServicio
     */
    public List<DarServicioEntity> findAll(){
        Query todos = em.createQuery("select e from DarServicioEntity e");
        return todos.getResultList();
    }
    
     /**
     * Encontrar una tupla especifica de la tabla Darservicio
     * @param id que se desea buscar
     * @return darservicioEntity
     */
    public DarServicioEntity find(Long id){
        DarServicioEntity drservicio = em.find(DarServicioEntity.class, id);
        return drservicio;
    }
    
    /**
     * Creacion de un nuevo Darservicio
     * @param drservicio
     * @return nuevo drservicio creado
     */
    public DarServicioEntity create(DarServicioEntity drservicio){
        em.persist(drservicio);
        return drservicio;
    }
    
    /**
     * Actualizacion de una tupla de la tabla Darservicio
     * @param drservicioActualizar
     * @return darservicio actualizado
     */
    public DarServicioEntity update (DarServicioEntity drservicioActualizar){
        return em.merge(drservicioActualizar);
    }
    
    /**
     * Elimina una tupla de la tabla Darservicio
     * @param id 
     */
    public void delete (Long id){
        DarServicioEntity drservicioDelete = em.find(DarServicioEntity.class, id);
        em.remove(drservicioDelete);
    }
}
