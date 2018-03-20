/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.cadenahotelera.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Clase que modela la entidad habitacion.
 *
 * @author Bryan
 */
@Entity(name = "HABITACION")
public class EntidadHabitacion implements Serializable {

    //Atributo estático que maneja las versiones
    public static final long serialVersionUID = 1L;

    //Atributo que indica la llave primaria de la entidad
    @Id
    @Column(name = "codigo_habitacion", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigoHabitacion;

    //Atributo que contiene el número de la habitación
    @Column(name = "numero_habitacion", nullable = false)
    private int numeroHabitacion;

    //Atributo que contiene el código del tipo de la habitación
    @Column(name = "codigo_tipo_habitacion", nullable = false)
    private String codigoTipoHabitacion;

    //Atributo que almacena el codigo del hotel al que corresponde.
    @Column(name = "codigo_hotel", nullable = false)
    private int codigoHotel;

    //Atributo que indica el estado de la habitación.
    @Column(name = "codigo_estado", nullable = false)
    private int codigoEstado;

    public int getCodigoHabitacion() {
        return codigoHabitacion;
    }

    public void setCodigoHabitacion(int codigoHabitacion) {
        this.codigoHabitacion = codigoHabitacion;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getCodigoTipoHabitacion() {
        return codigoTipoHabitacion;
    }

    public void setCodigoTipoHabitacion(String codigoTipoHabitacion) {
        this.codigoTipoHabitacion = codigoTipoHabitacion;
    }

    public int getCodigoHotel() {
        return codigoHotel;
    }

    public void setCodigoHotel(int codigoHotel) {
        this.codigoHotel = codigoHotel;
    }

    public int getCodigoEstado() {
        return codigoEstado;
    }

    public void setCodigoEstado(int codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

}
