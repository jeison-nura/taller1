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

/**
 *
 * @author jeison
 */
@Entity
public class EstadoHabitacionEntity {
    /**
     * Atributo estático para el manejo de versiones de la entidad
     */
    private final static long serialVersionUID= 1L;
    
    /**
     * llave principal de la entidad estadohabitacion
     */
    @Id
    @Column(name = "cod_estado", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo_estado;
    
    /**
     * variable con nombre del estado
     */
    @Column(name = "nom_estado", nullable = false)
    private String nombre_estado;

    public long getCodigo_estado() {
        return codigo_estado;
    }

    public void setCodigo_estado(long codigo_estado) {
        this.codigo_estado = codigo_estado;
    }

    public String getNombre_estado() {
        return nombre_estado;
    }

    public void setNombre_estado(String nombre_estado) {
        this.nombre_estado = nombre_estado;
    }
    
    
}
