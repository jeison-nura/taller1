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
public class HabitacionTipohabitacion {
    private final static long serialVersionUID=1L;
    
    @Id 
    @Column(name="codigohabitaciont", unique=true, nullable=false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long codigohabitaciont;
    
    @ManyToOne
    @JoinColumn(name="cod_t_habitacion")
    private HotelEntity hotelentity;
    
    @ManyToOne
    @JoinColumn(name="cod_t_habitacion")
    private TipoHabitacionEntity tipohabitacionentity;

    public Long getCodigohabitaciont() {
        return codigohabitaciont;
    }

    public void setCodigohabitaciont(Long codigohabitaciont) {
        this.codigohabitaciont = codigohabitaciont;
    }

    public HotelEntity getHotelentity() {
        return hotelentity;
    }

    public void setHotelentity(HotelEntity hotelentity) {
        this.hotelentity = hotelentity;
    }

    public TipoHabitacionEntity getTipohabitacionentity() {
        return tipohabitacionentity;
    }

    public void setTipohabitacionentity(TipoHabitacionEntity tipohabitacionentity) {
        this.tipohabitacionentity = tipohabitacionentity;
    }
    
    
}
