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
public class DarServicioEntity {
    
     /**
     * Atributo estático para el manejo de versiones de la entidad
     */
    private final static long serialVersionUID= 1L;
    
    @Id
    @Column(name = "cod_dar_servicio", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo_servicio_dado;
    
    @ManyToOne
    @JoinColumn(name="cod_d_servicio")
    private HabitacionEntity habitacionentity;
    
    @ManyToOne
    @JoinColumn(name="cod_servicio")
    private ServicioEntity servicioentity;
    
    
}
