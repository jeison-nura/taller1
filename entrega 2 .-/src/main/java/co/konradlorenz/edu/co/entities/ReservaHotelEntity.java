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
public class ReservaHotelEntity {
    @Id 
    @Column(name="codigoreservahotel", unique=true, nullable=false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long codigoreservahotel;
    
    @ManyToOne
    @JoinColumn(name="cod_hotel")
    private HotelEntity hotelentity;
    
    @ManyToOne
    @JoinColumn(name="cod_hotel")
    private ReservaEntity reservaentity;

    public Long getCodigoreservahotel() {
        return codigoreservahotel;
    }

    public void setCodigoreservahotel(Long codigoreservahotel) {
        this.codigoreservahotel = codigoreservahotel;
    }



    public HotelEntity getHotelentity() {
        return hotelentity;
    }

    public void setHotelentity(HotelEntity hotelentity) {
        this.hotelentity = hotelentity;
    }

    public ReservaEntity getReservaentity() {
        return reservaentity;
    }

    public void setReservaentity(ReservaEntity reservaentity) {
        this.reservaentity = reservaentity;
    }
    
    
}
