/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konradlorenz.edu.persistence;

import co.konradlorenz.edu.co.entities.UsuarioEntity;
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
public class UsuarioPersistence {
    
    @PersistenceContext(unitName = "reservasPU")
    protected EntityManager em;
    
     /**
     * Obtener la lista con los datos de la tabla Curso
     * @return Lista de datos de la tabla Curso
     */
    public List<UsuarioEntity> findAll(){
        Query todos = em.createQuery("select e from UsuarioEntity e");
        return todos.getResultList();
    }
    
     /**
     * Encontrar una tupla especifica de la tabla Curso
     * @param id que se desea buscar
     * @return cursoEntity
     */
    public UsuarioEntity find(Long id){
        UsuarioEntity curso = em.find(UsuarioEntity.class, id);
        return curso;
    }
    
    /**
     * Creacion de un nuevo curso
     * @param curso
     * @return nuevo curso creado
     */
    public UsuarioEntity create(UsuarioEntity curso){
        em.persist(curso);
        return curso;
    }
    
    /**
     * Actualizacion de una tupla de la tabla Curso
     * @param cursoActualizar
     * @return curso actualizado
     */
    public UsuarioEntity update (UsuarioEntity cursoActualizar){
        return em.merge(cursoActualizar);
    }
    
    /**
     * Elimina una tupla curso de la tabla
     * @param id 
     */
    public void delete (Long id){
        UsuarioEntity cursoDelete = em.find(UsuarioEntity.class, id);
        em.remove(cursoDelete);
    }
}
