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
 * Clase para modelar la entidad Hotel.
 *
 * @author Bryan
 */
@Entity(name = "HOTEL")
public class EntidadHotel implements Serializable {

    //Atributo estático manejador de las versiones.
    private static final long serialVersionUID = 1L;

    //Atributo que almacena la llave primaria de la entidad Hotel
    @Id
    @Column(name = "codigo_hotel", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigoHotel;

    //Variable que aloja el nombre del hotel
    @Column(name = "nombre_hotel", nullable = false)
    private String nombreHotel;

    //Atributo que aloja la cantidad de habitaciones disponibles en el hotel.
    @Column(name = "cantidad_habitaciones_disponibles", nullable = false)
    private int cantidadHabitacionesDisponibles;

    //Ciudad a la que pertenece el hotel.
    @Column(name = "codigo_ciudad", nullable = false)
    private int codigoCiudad;

    public int getCodigoHotel() {
        return codigoHotel;
    }

    public void setCodigoHotel(int codigoHotel) {
        this.codigoHotel = codigoHotel;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitacionesDisponibles;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitacionesDisponibles = cantidadHabitaciones;
    }

    public int getCodigoCiudad() {
        return codigoCiudad;
    }

    public void setCodigoCiudad(int codigoCiudad) {
        this.codigoCiudad = codigoCiudad;
    }

}
