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
public class CiudadEntity {
    
     /**
     * Atributo estático para el manejo de versiones de la entidad
     */
    private final static long serialVersionUID= 1L;
    
    /**
     * llave primaria del entity ciudad
     * variable que captura el codigo de ciudad
     */
    @Id
    @Column(name = "cod_ciudad", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo_ciudad;
    
    /**
     * variable que guarda el nombre de ciudad
     */
    @Column(name = "nom_ciudad", nullable = false)
    private String nombre_ciudad;

    public long getCodigo_ciudad() {
        return codigo_ciudad;
    }

    public void setCodigo_ciudad(long codigo_ciudad) {
        this.codigo_ciudad = codigo_ciudad;
    }

    public String getNombre_ciudad() {
        return nombre_ciudad;
    }

    public void setNombre_ciudad(String nombre_ciudad) {
        this.nombre_ciudad = nombre_ciudad;
    }
    
    
}

