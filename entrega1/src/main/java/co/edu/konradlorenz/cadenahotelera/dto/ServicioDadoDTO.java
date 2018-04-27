/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. crrgir
 */
package co.edu.konradlorenz.cadenahotelera.dto;

import co.edu.konradlorenz.cadenahotelera.entities.HabitacionEntity;
import co.edu.konradlorenz.cadenahotelera.entities.ServicioDadoEntity;
import co.edu.konradlorenz.cadenahotelera.entities.ServicioEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EnriqueS
 */
public class ServicioDadoDTO {

    private Long id;
    private Long cod_habitacion;
    private Long servicio;

    public ServicioDadoDTO() {
    }

    public ServicioDadoDTO(ServicioDadoEntity servicioDadoEntity) {
        this.id = servicioDadoEntity.getCodigo_servicio_dado();
        if(servicioDadoEntity.getHabitacionEntity()!=null){
            
            HabitacionEntity he = new HabitacionEntity();
            he.setCodigo_estado(servicioDadoEntity.getHabitacionEntity().getCodigo_estado());
            
            he.setCodigo_hotel(servicioDadoEntity.getHabitacionEntity().getCodigo_hotel());
            he.setCodigo_tipo_habitacion(servicioDadoEntity.getHabitacionEntity().getCodigo_tipo_habitacion());
            he.setNumero_habitacion(servicioDadoEntity.getHabitacionEntity().getNumero_habitacion());
        this.cod_habitacion = servicioDadoEntity.getHabitacionEntity().getCodigo_habitacion();
        
        
        }if(servicioDadoEntity.getServicioEntity()!=null){
        ServicioEntity sr = new ServicioEntity();
            sr.setNombre_servicio(servicioDadoEntity.getServicioEntity().getNombre_servicio());
            sr.setCosto(servicioDadoEntity.getServicioEntity().getCosto());
            this.servicio = servicioDadoEntity.getServicioEntity().getCodigo_servicio();
        }

    }

    public ServicioDadoEntity toEntity() {
        ServicioDadoEntity servicioDadoEntity = new ServicioDadoEntity();
        servicioDadoEntity.setCodigo_servicio_dado(id);
        servicioDadoEntity.getHabitacionEntity().setCodigo_habitacion(cod_habitacion);
        servicioDadoEntity.getServicioEntity().setCodigo_servicio(servicio);
        return servicioDadoEntity;
    }

    public static List<ServicioDadoDTO> toServicioDadoList(List<ServicioDadoEntity> servicioDadoEntitys) {
        List<ServicioDadoDTO> servicioDTOs = new ArrayList<>();
        for (int i = 0; i < servicioDadoEntitys.size(); i++) {
            servicioDTOs.add(new ServicioDadoDTO(servicioDadoEntitys.get(i)));
        }
        return servicioDTOs;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCod_habitacion() {
        return cod_habitacion;
    }

    public void setCod_habitacion(Long cod_habitacion) {
        this.cod_habitacion = cod_habitacion;
    }

    public Long getServicio() {
        return servicio;
    }

    public void setServicio(Long servicio) {
        this.servicio = servicio;
    }

}
