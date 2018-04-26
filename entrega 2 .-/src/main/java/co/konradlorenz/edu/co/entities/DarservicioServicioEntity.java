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
import javax.persistence.ManyToOne;

/**
 *
 * @author jeison
 */
@Entity
public class DarservicioServicioEntity {
    private final static long serialVersionUID=1L;
    
    @Id 
    @Column(name="codigoserviciodado", unique=true, nullable=false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long codigoserviciodado;
    
    @ManyToOne
    @JoinColumn(name="cod_servicio")
    private ServicioEntity servicioentity;
    
    @ManyToOne
    @JoinColumn(name="cod_servicio")
    private DarServicioEntity darServicioEntity;
    
    @Column
    private long cod_dar_servicio;
}
