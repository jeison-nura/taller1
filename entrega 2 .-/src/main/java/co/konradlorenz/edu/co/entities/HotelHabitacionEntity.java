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
public class HotelHabitacionEntity {
    private final static long serialVersionUID=1L;
    
    @Id 
    @Column(name="codigoHotel", unique=true, nullable=false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long codigohotel;
    
    @ManyToOne
    @JoinColumn(name="cod_hotel")
    private HotelEntity hotelentity;
    
    @ManyToOne
    @JoinColumn(name="cod_hotel")
    private HabitacionEntity habitacion;

    public Long getCodigohotel() {
        return codigohotel;
    }

    public void setCodigohotel(Long codigohotel) {
        this.codigohotel = codigohotel;
    }

    public HotelEntity getHotelentity() {
        return hotelentity;
    }

    public void setHotelentity(HotelEntity hotelentity) {
        this.hotelentity = hotelentity;
    }

    public HabitacionEntity getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(HabitacionEntity habitacion) {
        this.habitacion = habitacion;
    }
    
    
}
