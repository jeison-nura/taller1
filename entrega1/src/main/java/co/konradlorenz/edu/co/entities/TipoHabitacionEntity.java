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

/**
 *
 * @author jeison
 */
@Entity
public class TipoHabitacionEntity implements Serializable {

    /**
     * Atributo estático para el manejo de versiones de la entidad
     */
    private final static long serialVersionUID = 1L;

    /**
     * llave principal del tipo de habitacion
     */
    @Id
    @Column(name = "cod_t_habitacion", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo_tipo_habitacion;

    /**
     * nombre del tipo de habitacion
     */
    @Column(name = "nom_t_habitacion", nullable = false)
    private String nombre_tipo_habitacion;

    /**
     * precio del tipo de habitacion
     */
    @Column(name = "precio_t_habitacion", nullable = false)
    private double precio_tipo_habitacion;

    public long getCodigo_tipo_habitacion() {
        return codigo_tipo_habitacion;
    }

    public void setCodigo_tipo_habitacion(long codigo_tipo_habitacion) {
        this.codigo_tipo_habitacion = codigo_tipo_habitacion;
    }

    public String getNombre_tipo_habitacion() {
        return nombre_tipo_habitacion;
    }

    public void setNombre_tipo_habitacion(String nombre_tipo_habitacion) {
        this.nombre_tipo_habitacion = nombre_tipo_habitacion;
    }

    public double getPrecio_tipo_habitacion() {
        return precio_tipo_habitacion;
    }

    public void setPrecio_tipo_habitacion(double precio_tipo_habitacion) {
        this.precio_tipo_habitacion = precio_tipo_habitacion;
    }

}
