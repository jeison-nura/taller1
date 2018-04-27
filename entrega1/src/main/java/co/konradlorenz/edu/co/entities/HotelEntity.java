/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konradlorenz.edu.co.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author jeison
 */
@Entity
public class HotelEntity implements Serializable {

    /**
     * Atributo estático para el manejo de versiones de la entidad
     */
    private final static long serialVersionUID = 1L;

    /**
     * llave primaria de la entidad hotel
     */
    @Id
    @Column(name = "cod_hotel", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo_hotel;

    @ManyToOne
    @JoinColumn(name = "cod_ciudad")
    private CiudadEntity ciudadEntity;

    /**
     * variable del nombre de la ciudad
     */
    @Column(name = "nom_hotel", nullable = false)
    private String nombre_hotel;

    /**
     * variable que contiene el numero de habitaciones
     */
    @Column(name = "num_habitaciones", nullable = false)
    private long numero_habitaciones;

    /**
     * variable que enlaza la ciudad donde se encuentra el hotel
     */
    @Column(name = "cod_ciudad", nullable = false)
    private long codigo_ciudad;

    /**
     * variableq ue guarda la calificacion del hotel
     */
    @Column(name = "val_estrellas", nullable = false)
    private long valoracion_hotel;

    public long getCodigo_hotel() {
        return codigo_hotel;
    }

    public void setCodigo_hotel(long codigo_hotel) {
        this.codigo_hotel = codigo_hotel;
    }

    public String getNombre_hotel() {
        return nombre_hotel;
    }

    public void setNombre_hotel(String nombre_hotel) {
        this.nombre_hotel = nombre_hotel;
    }

    public long getNumero_habitaciones() {
        return numero_habitaciones;
    }

    public void setNumero_habitaciones(long numero_habitaciones) {
        this.numero_habitaciones = numero_habitaciones;
    }

    public long getCodigo_ciudad() {
        return codigo_ciudad;
    }

    public void setCodigo_ciudad(long codigo_ciudad) {
        this.codigo_ciudad = codigo_ciudad;
    }

    public long getValoracion_hotel() {
        return valoracion_hotel;
    }

    public void setValoracion_hotel(long valoracion_hotel) {
        this.valoracion_hotel = valoracion_hotel;
    }

    public CiudadEntity getCiudadEntity() {
        return ciudadEntity;
    }

    public void setCiudadEntity(CiudadEntity ciudadEntity) {
        this.ciudadEntity = ciudadEntity;
    }

}
