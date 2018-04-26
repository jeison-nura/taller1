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
import javax.persistence.OneToOne;

/**
 *
 * @author jeison
 */
@Entity
public class TipoPrecioHabitacionEntity {
    
     /**
     * Atributo estático para el manejo de versiones de la entidad
     */
    private final static long serialVersionUID= 1L;
    
     /**
     * llave primaria del entity tipo de habitacion
     * variable que captura el codigo de ciudad
     */
    @Id
    @Column(name = "cod_p_habitacion", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo_precio_habitacion;
    
    
    @OneToOne
    @JoinColumn(name="cod_p_habitacion")
    private HabitacionEntity habitacionentity;
    /**
     *variable que guarda el valor de la habitacion
     */
    @Column(name = "valor", nullable = false)
    private long costo_habitacion;

    public long getCodigo_precio_habitacion() {
        return codigo_precio_habitacion;
    }

    public void setCodigo_precio_habitacion(long codigo_precio_habitacion) {
        this.codigo_precio_habitacion = codigo_precio_habitacion;
    }

    public long getCosto_habitacion() {
        return costo_habitacion;
    }

    public void setCosto_habitacion(long costo_habitacion) {
        this.costo_habitacion = costo_habitacion;
    }
    
    
}


