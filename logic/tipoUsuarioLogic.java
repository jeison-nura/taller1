/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konradlorenz.edu.logic;

import co.konradlorenz.edu.co.entities.TipoHabitacionEntity;
import co.konradlorenz.edu.co.entities.TipoUsuarioEntity;
import co.konradlorenz.edu.persistence.TipoHabitacionPersistence;
import co.konradlorenz.edu.persistence.TipoUsuarioPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author jeison
 */
@Stateless
public class tipoUsuarioLogic {
     @Inject
    private TipoUsuarioPersistence tipousuariopersistence;
    
    
   
    public List<TipoUsuarioEntity> obtenertusuario(){
        List<TipoUsuarioEntity> tusu = tipousuariopersistence.findAll();
        return tusu;
    }
    
    
    
    public TipoUsuarioEntity obtenertusuario(long id){
        TipoUsuarioEntity tusu = tipousuariopersistence.find(id);
        if(tusu == null){
            throw new IllegalArgumentException("tipo de usuario solicitado no existe.");
        }
        return tusu;
    }
    
    
    public TipoUsuarioEntity creartusuario(TipoUsuarioEntity tusuEntity){
        tipousuariopersistence.create(tusuEntity);
        return tusuEntity;
    }
    
    
    
    public TipoUsuarioEntity ectualizartusu(TipoUsuarioEntity tusuEntity, long id){
        TipoUsuarioEntity tusu = tipousuariopersistence.update(tusuEntity);
        return tusu;
    }
    
    
   
    public void eliminartusu(long id){
        tipousuariopersistence.delete(id);
    }
}
