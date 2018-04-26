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
import javax.persistence.ManyToMany;

/**
 *
 * @author jeison
 */
@Entity
public class HabitacionEntity {
    
     /**
     * Atributo estático para el manejo de versiones de la entidad
     */
    private final static long serialVersionUID= 1L;
    
    /**
     * llave principal de la entidad habitacion
     */
    @Id
    @Column(name = "cod_habitacion", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo_habitacion;
    
    @ManyToMany
    @JoinColumn(name="cod_hotel")
    private HotelEntity hotelentity;
    
    /**
     * codigo del hotel
     */
    @Column(name = "cod_hotel", nullable = false)
    private long codigo_hotel;
    
    /**
     * variable numero de habitacion
     */
    @Column(name = "num_hotel", unique = true)
    private long numero_habitacion;
    
    /**
     * variable con el estado de la habitacion
     */
    @Column(name = "cod_estado", nullable = false)
    private long codigo_estado;
    
    /**
     * codigo con el tipo de habitacion
     */
    @Column(name = "cod_t_habitacion", nullable = false)
    private long codigo_tipo_habitacion;
    
    /**
     * variable con el codigo precio habitacion
     */
    @Column(name = "cod_p_habitacion", nullable = false)
    private long codigo_precio_habitacion;
    
    /**
     * variable con codigo del servicio
     */
    @Column(name = "cod_d_servicio", nullable = false)
    private long codigo_del_servicio;

    public long getCodigo_habitacion() {
        return codigo_habitacion;
    }

    public void setCodigo_habitacion(long codigo_habitacion) {
        this.codigo_habitacion = codigo_habitacion;
    }

    public long getCodigo_hotel() {
        return codigo_hotel;
    }

    public void setCodigo_hotel(long codigo_hotel) {
        this.codigo_hotel = codigo_hotel;
    }

    public long getNumero_habitacion() {
        return numero_habitacion;
    }

    public void setNumero_habitacion(long numero_habitacion) {
        this.numero_habitacion = numero_habitacion;
    }

    public long getCodigo_estado() {
        return codigo_estado;
    }

    public void setCodigo_estado(long codigo_estado) {
        this.codigo_estado = codigo_estado;
    }

    public long getCodigo_tipo_habitacion() {
        return codigo_tipo_habitacion;
    }

    public void setCodigo_tipo_habitacion(long codigo_tipo_habitacion) {
        this.codigo_tipo_habitacion = codigo_tipo_habitacion;
    }

    public long getCodigo_precio_habitacion() {
        return codigo_precio_habitacion;
    }

    public void setCodigo_precio_habitacion(long codigo_precio_habitacion) {
        this.codigo_precio_habitacion = codigo_precio_habitacion;
    }

    public long getCodigo_del_servicio() {
        return codigo_del_servicio;
    }

    public void setCodigo_del_servicio(long codigo_del_servicio) {
        this.codigo_del_servicio = codigo_del_servicio;
    }
    
    
}
