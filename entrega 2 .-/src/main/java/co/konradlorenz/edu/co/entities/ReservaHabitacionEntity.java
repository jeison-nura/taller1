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
public class ReservaHabitacionEntity {
    @Id 
    @Column(name="codigoreservah", unique=true, nullable=false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long codigoreservah;
    
    @ManyToOne
    @JoinColumn(name="cod_habitacion")
    private HabitacionEntity habitacionentity;
    
    @ManyToOne
    @JoinColumn(name="cod_habitacion")
    private ReservaEntity reservaentity;

    public Long getCodigoreservah() {
        return codigoreservah;
    }

    public void setCodigoreservah(Long codigoreservah) {
        this.codigoreservah = codigoreservah;
    }

    public HabitacionEntity getHabitacionentity() {
        return habitacionentity;
    }

    public void setHabitacionentity(HabitacionEntity habitacionentity) {
        this.habitacionentity = habitacionentity;
    }

    public ReservaEntity getReservaentity() {
        return reservaentity;
    }

    public void setReservaentity(ReservaEntity reservaentity) {
        this.reservaentity = reservaentity;
    }
    
    
}
