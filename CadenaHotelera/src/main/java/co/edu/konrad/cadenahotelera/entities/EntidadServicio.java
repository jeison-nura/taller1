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
 * Clase que modela la entidad Servicio
 *
 * @author Bryan
 */
@Entity(name = "SERVICIO")
public class EntidadServicio implements Serializable {

    //Atributo estático manejador de las versiones de la entidad.
    private static final long serialVersionUID = 1L;

    //Atributo que almacena la llave primaria de la entidad.
    @Id
    @Column(name = "codigo_servicio", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigoServicio;

    //Atributo que guarda el nombre del servicio
    @Column(name = "nombre_servicio", nullable = false)
    private String nombreServicio;

    public int getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(int codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

}
