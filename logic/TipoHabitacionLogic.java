/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konradlorenz.edu.logic;

import co.konradlorenz.edu.co.entities.ServicioEntity;
import co.konradlorenz.edu.co.entities.TipoHabitacionEntity;
import co.konradlorenz.edu.persistence.ServicioPersistence;
import co.konradlorenz.edu.persistence.TipoHabitacionPersistence;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author jeison
 */
public class TipoHabitacionLogic {
     @Inject
    private TipoHabitacionPersistence tipohabitacionpersistence;
    
    
   
    public List<TipoHabitacionEntity> obtenerhabitacion(){
        List<TipoHabitacionEntity> thabi = tipohabitacionpersistence.findAll();
        return thabi;
    }
    
    
    
    public TipoHabitacionEntity obtenerthabitacion(long id){
        TipoHabitacionEntity thabi = tipohabitacionpersistence.find(id);
        if(thabi == null){
            throw new IllegalArgumentException("tipo de habitacion solicitado no existe.");
        }
        return thabi;
    }
    
    
    public TipoHabitacionEntity crearthabitacion(TipoHabitacionEntity thabiEntity){
        tipohabitacionpersistence.create(thabiEntity);
        return thabiEntity;
    }
    
    
    
    public TipoHabitacionEntity ectualizarthabi(TipoHabitacionEntity thabiEntity, long id){
        TipoHabitacionEntity thabi = tipohabitacionpersistence.update(thabiEntity);
        return thabi;
    }
    
    
   
    public void eliminarthabi(long id){
        tipohabitacionpersistence.delete(id);
    }
}
