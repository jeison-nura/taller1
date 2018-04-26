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
public class CiudadHotelEntity {
     private final static long serialVersionUID=1L;
    
    @Id 
    @Column(name="codigoCiudad", unique=true, nullable=false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long codigoCiudad;
    
    @ManyToOne
    @JoinColumn(name="cod_ciudad")
    private HotelEntity hotelentity;
    
    @ManyToOne
    @JoinColumn(name="cod_ciudad")
    private CiudadEntity ciudadentity;    
    
    @Column
    private String nom_ciudad;

    public Long getCodigoCiudad() {
        return codigoCiudad;
    }

    public void setCodigoCiudad(Long codigoCiudad) {
        this.codigoCiudad = codigoCiudad;
    }

    public HotelEntity getHotelentity() {
        return hotelentity;
    }

    public void setHotelentity(HotelEntity hotelentity) {
        this.hotelentity = hotelentity;
    }

    public CiudadEntity getCiudadentity() {
        return ciudadentity;
    }

    public void setCiudadentity(CiudadEntity ciudadentity) {
        this.ciudadentity = ciudadentity;
    }

    public String getNom_ciudad() {
        return nom_ciudad;
    }

    public void setNom_ciudad(String nom_ciudad) {
        this.nom_ciudad = nom_ciudad;
    }
    
    
      
      
}
