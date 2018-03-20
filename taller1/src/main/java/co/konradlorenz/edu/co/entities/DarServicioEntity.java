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
public class DarServicioEntity {
    
     /**
     * Atributo estático para el manejo de versiones de la entidad
     */
    private final static long serialVersionUID= 1L;
    
    @Id
    @Column(name = "cod_dar_servicio", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo_servicio_dado;
    
    /**
     * campo enlace con el codigo de servicio de la habitacion
     */
    @Column(name = "cod_d_servicio", nullable = false)
    private long codigo_del_servicio;
    
    /**
     * variable que conecta con el servicio
     */
    @Column(name = "cod_servicio", nullable = false)
    private long codigo_servicio;

    public long getCodigo_servicio_dado() {
        return codigo_servicio_dado;
    }

    public void setCodigo_servicio_dado(long codigo_servicio_dado) {
        this.codigo_servicio_dado = codigo_servicio_dado;
    }

    public long getCodigo_del_servicio() {
        return codigo_del_servicio;
    }

    public void setCodigo_del_servicio(long codigo_del_servicio) {
        this.codigo_del_servicio = codigo_del_servicio;
    }

    public long getCodigo_servicio() {
        return codigo_servicio;
    }

    public void setCodigo_servicio(long codigo_servicio) {
        this.codigo_servicio = codigo_servicio;
    }
    
    
}
