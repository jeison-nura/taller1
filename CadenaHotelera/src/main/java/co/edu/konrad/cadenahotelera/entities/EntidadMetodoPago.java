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
 * Clase que modela la entidad Metodo de Pago
 *
 * @author Bryan
 */
@Entity(name = "METODO_PAGO")
public class EntidadMetodoPago implements Serializable {

    //Atributo manejador de versiones
    private final static long serialVersionUID = 1L;

    //Atributo que almacena la llave primaria de la entidad Método de pago
    @Id
    @Column(name = "codigo_metodo_pago")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigoMetodoPago;

    //Atributo que almacena el nombre del método de pago.
    @Column(name = "nombre_metodo_pago")
    private String nombreMetodoPago;

    public int getCodigoMetodoPago() {
        return codigoMetodoPago;
    }

    public void setCodigoMetodoPago(int codigoMetodoPago) {
        this.codigoMetodoPago = codigoMetodoPago;
    }

    public String getNombreMetodoPago() {
        return nombreMetodoPago;
    }

    public void setNombreMetodoPago(String nombreMetodoPago) {
        this.nombreMetodoPago = nombreMetodoPago;
    }

}
