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
public class HabitacionEntity implements Serializable {

    /**
     * Atributo estático para el manejo de versiones de la entidad
     */
    private final static long serialVersionUID = 1L;

    /**
     * llave principal de la entidad habitacion
     */
    @Id
    @Column(name = "cod_habitacion", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo_habitacion;

    /**
     * codigo del hotel
     */
    @Column(name = "cod_hotel", nullable = false)
    private long codigo_hotel;

    /**
     * variable numero de habitacion
     */
    @Column(name = "num_habitacion", unique = true)
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

    @ManyToOne
    @JoinColumn(name = "cod_hotel")
    private HotelEntity hotelentity;

    @ManyToOne
    @JoinColumn(name = "cod_t_habitacion")
    private TipoHabitacionEntity tipoHabitacionEntity;

    @ManyToOne
    @JoinColumn(name = "cod_estado")
    private EstadoHabitacionEntity estadoHabitacionEntity;

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

    public HotelEntity getHotelentity() {
        return hotelentity;
    }

    public void setHotelentity(HotelEntity hotelentity) {
        this.hotelentity = hotelentity;
    }

    public TipoHabitacionEntity getTipoHabitacionEntity() {
        return tipoHabitacionEntity;
    }

    public void setTipoHabitacionEntity(TipoHabitacionEntity tipoHabitacionEntity) {
        this.tipoHabitacionEntity = tipoHabitacionEntity;
    }

    public EstadoHabitacionEntity getEstadoHabitacionEntity() {
        return estadoHabitacionEntity;
    }

    public void setEstadoHabitacionEntity(EstadoHabitacionEntity estadoHabitacionEntity) {
        this.estadoHabitacionEntity = estadoHabitacionEntity;
    }

}
