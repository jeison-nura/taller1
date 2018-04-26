/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konradlorenz.edu.co.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author jeison
 */
@Entity
public class HabitacionPreciohEntity {
    private final static long serialVersionUID=1L;
    
    @Id 
    @Column(name="codigopreciohabitacion", unique=true, nullable=false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long codigopreciohabitacion;
    
    @ManyToOne
    @JoinColumn(name="cod_p_habitacion")
    private HabitacionEntity habitacionEntity;
    
    @ManyToOne
    @JoinColumn(name="cod_p_habitacion")
    private HabitacionPreciohEntity habitacionprecioentity;

    public Long getCodigopreciohabitacion() {
        return codigopreciohabitacion;
    }

    public void setCodigopreciohabitacion(Long codigopreciohabitacion) {
        this.codigopreciohabitacion = codigopreciohabitacion;
    }

    public HabitacionEntity getHabitacionEntity() {
        return habitacionEntity;
    }

    public void setHabitacionEntity(HabitacionEntity habitacionEntity) {
        this.habitacionEntity = habitacionEntity;
    }

    public HabitacionPreciohEntity getHabitacionprecioentity() {
        return habitacionprecioentity;
    }

    public void setHabitacionprecioentity(HabitacionPreciohEntity habitacionprecioentity) {
        this.habitacionprecioentity = habitacionprecioentity;
    }
    
   
}
