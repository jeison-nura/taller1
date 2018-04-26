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
public class HabitacionEstadohEntity {
     private final static long serialVersionUID=1L;
    
    @Id 
    @Column(name="codigohabitacion", unique=true, nullable=false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long codigohabitacion;
    
    @ManyToOne
    @JoinColumn(name="cod_estado")
    private HabitacionEntity habitacionentity;
    
    @ManyToOne
    @JoinColumn(name="cod_estado")
    private EstadoHabitacionEntity estadohabitacionentity;

    public Long getCodigohabitacion() {
        return codigohabitacion;
    }

    public void setCodigohabitacion(Long codigohabitacion) {
        this.codigohabitacion = codigohabitacion;
    }

    public HabitacionEntity getHabitacionentity() {
        return habitacionentity;
    }

    public void setHabitacionentity(HabitacionEntity habitacionentity) {
        this.habitacionentity = habitacionentity;
    }

    public EstadoHabitacionEntity getEstadohabitacionentity() {
        return estadohabitacionentity;
    }

    public void setEstadohabitacionentity(EstadoHabitacionEntity estadohabitacionentity) {
        this.estadohabitacionentity = estadohabitacionentity;
    }
    
    
}
