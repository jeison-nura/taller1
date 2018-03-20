/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konradlorenz.edu.co.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author jeison
 */
@Entity
public class ServicioEntity {
     /**
     * Atributo estático para el manejo de versiones de la entidad
     */
    private final static long serialVersionUID= 1L;
    
    
    /**
     * llave primaria se la entidad servicio
     */
    @Id
    @Column(name = "cod_servicio", unique = true)
    private long codigo_servicio;
    
    /**
     * variable que almacena el nombre del servicio
     */
    @Column(name = "nom_servicio", nullable = false)
    private String nombre_servicio;
    
    /**
     * variable que almacena el costo del servicio
     */
    @Column(name = "costo", nullable = false)
    private long costo;

    public long getCodigo_servicio() {
        return codigo_servicio;
    }

    public void setCodigo_servicio(long codigo_servicio) {
        this.codigo_servicio = codigo_servicio;
    }

    public String getNombre_servicio() {
        return nombre_servicio;
    }

    public void setNombre_servicio(String nombre_servicio) {
        this.nombre_servicio = nombre_servicio;
    }

    public long getCosto() {
        return costo;
    }

    public void setCosto(long costo) {
        this.costo = costo;
    }
    
    
}
