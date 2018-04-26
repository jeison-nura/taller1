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
import javax.persistence.ManyToOne;

/**
 *
 * @author jeison
 */
@Entity
public class MetodoPagoEntity {
    
     /**
     * Atributo estático para el manejo de versiones de la entidad
     */
    private final static long serialVersionUID= 1L;
    
    /**
     * llave primaria de la entidad metododepago
     */
    @Id
    @Column(name = "cod_f_pago", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo_forma_pago;
    
    /**
     * variable con el nombre de la forma de pago
     */
    @Column(name = "nom_f_pago", nullable = false)
    private String nombre_forma_pago;
    
    @ManyToOne
    @JoinColumn(name="cod_f_pago")
    private ReservaEntity reservaentity;

    public long getCodigo_forma_pago() {
        return codigo_forma_pago;
    }

    public void setCodigo_forma_pago(long codigo_forma_pago) {
        this.codigo_forma_pago = codigo_forma_pago;
    }

    public String getNombre_forma_pago() {
        return nombre_forma_pago;
    }

    public void setNombre_forma_pago(String nombre_forma_pago) {
        this.nombre_forma_pago = nombre_forma_pago;
    }
    
    
}
