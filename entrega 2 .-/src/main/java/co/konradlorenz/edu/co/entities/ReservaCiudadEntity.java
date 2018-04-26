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
public class ReservaCiudadEntity {
    @Id 
    @Column(name="codigoreservaciudad", unique=true, nullable=false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long codigoreservaciudad;
    
    @ManyToOne
    @JoinColumn(name="cod_ciudad")
    private CiudadEntity ciudadentity;
    
    @ManyToOne
    @JoinColumn(name="cod_ciudad")
    private ReservaEntity reservaentity;

    public Long getCodigoreservaciudad() {
        return codigoreservaciudad;
    }

    public void setCodigoreservaciudad(Long codigoreservaciudad) {
        this.codigoreservaciudad = codigoreservaciudad;
    }

    public CiudadEntity getCiudadentity() {
        return ciudadentity;
    }

    public void setCiudadentity(CiudadEntity ciudadentity) {
        this.ciudadentity = ciudadentity;
    }

    public ReservaEntity getReservaentity() {
        return reservaentity;
    }

    public void setReservaentity(ReservaEntity reservaentity) {
        this.reservaentity = reservaentity;
    }
    
    
}
