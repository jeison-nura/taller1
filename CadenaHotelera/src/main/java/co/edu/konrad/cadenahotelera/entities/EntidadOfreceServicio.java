/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.cadenahotelera.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Clase que modela la entidad Ofrece_Servicio
 *
 * @author Bryan
 */
@Entity(name = "OFRECE_SERVICIO")
public class EntidadOfreceServicio implements Serializable {

    //Atributo estático manejador de las versiones de la entidad.
    private static final long serialVersionUID = 1L;

    /**
     * Llave compuesta entre codigo_tipo_habitacion y codigo_servicio
     */
    @Id
    @Column(name = "codigo_tipo_habitacion")
    private int codigoTipoHabitacion;

    @Id
    @Column(name = "codigo_servicio")
    private int codigoServicio;

    public int getCodigoTipoHabitacion() {
        return codigoTipoHabitacion;
    }

    public void setCodigoTipoHabitacion(int codigoTipoHabitacion) {
        this.codigoTipoHabitacion = codigoTipoHabitacion;
    }

    public int getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(int codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

}
