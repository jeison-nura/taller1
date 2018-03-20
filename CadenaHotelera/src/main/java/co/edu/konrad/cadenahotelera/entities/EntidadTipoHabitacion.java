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
 * Clase que modela la entidad Tipo_Habitacion
 *
 * @author Bryan
 */
@Entity(name = "TIPO_HABITACION")
public class EntidadTipoHabitacion implements Serializable {

    //Atributo estático manejador de las versiones de la clase.
    private static final long serialVersionUID = 1L;

    //Atributo que aloja la llave primaria de la entidad Tipo Habitacion
    @Id
    @Column(name = "codigo_tipo_habitacion", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigoTipoHabitacion;

    //Variable que almacena el nombre del tipo de la habitacion.
    @Column(name = "nombre_tipo_habitacion", nullable = false)
    private String nombreTipoHabitacion;

    //Variable que almacena la capacidad de personas en x tipo de habitacion
    @Column(name = "capacidad_personas", nullable = false)
    private int capacidadPersonas;

    //Variable que indica el precio de x habitacion.
    @Column(name = "precio_habitacion", nullable = false)
    private int precioHabitacion;

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(int capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }

    public int getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(int precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public int getCodigoTipoHabitacion() {
        return codigoTipoHabitacion;
    }

    public void setCodigoTipoHabitacion(int codigoTipoHabitacion) {
        this.codigoTipoHabitacion = codigoTipoHabitacion;
    }

    public String getNombreTipoHabitacion() {
        return nombreTipoHabitacion;
    }

    public void setNombreTipoHabitacion(String nombreTipoHabitacion) {
        this.nombreTipoHabitacion = nombreTipoHabitacion;
    }

}
