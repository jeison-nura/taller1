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
 * Clase que modela la entidad Estado_Habitacion
 *
 * @author Bryan
 */
@Entity(name = "ESTADO_HABITACION")
public class EntidadEstadoHabitacion implements Serializable {

    //Atributo que administra el control de versiones de la entidad
    private static final long serialVersionUID = 1L;

    //Atributo que almacena la llave primaria de la entidad
    @Id
    @Column(name = "codigo_estado", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigoEstado;

    //Atributo que almacena el nombre del tipo de estado de la habitación
    @Column(name = "nombre_estado", nullable = false)
    private String nombreEstado;

    public int getCodigoEstado() {
        return codigoEstado;
    }

    public void setCodigoEstado(int codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

}
