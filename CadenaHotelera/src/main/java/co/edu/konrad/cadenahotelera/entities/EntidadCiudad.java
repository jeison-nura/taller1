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
 * Clase que modela la entidad Ciudad
 *
 * @author Bryan
 */
@Entity(name = "CIUDAD")
public class EntidadCiudad implements Serializable {

    //Atributo que maneja las versiones de la entidad.
    private static final long serialVersionUID = 1L;

    //Atributo que almacena la llave primaria de la entidad Ciudad.
    @Id
    @Column(name = "codigo_ciudad", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigoCiudad;

    //Atributo que guarda el nombre de la ciudad.
    @Column(name = "nombre_ciudad", nullable = false)
    private String nombreCiudad;

    public int getCodigoCiudad() {
        return codigoCiudad;
    }

    public void setCodigoCiudad(int codigoCiudad) {
        this.codigoCiudad = codigoCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

}
