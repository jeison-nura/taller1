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
public class HabitacionServicioEntity {
    private final static long serialVersionUID=1L;
    
    @Id 
    @Column(name="codigoserviciodisponible", unique=true, nullable=false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long codigoserviciodado;
    
    @ManyToOne
    @JoinColumn(name="cod_d_servicio")
    private HabitacionEntity habitacionEntity;
    
    @ManyToOne
    @JoinColumn(name="cod_d_servicio")
    private DarServicioEntity darServicioEntity;
    
    @Column
    private long cod_dar_servicio;

    public Long getCodigoserviciodado() {
        return codigoserviciodado;
    }

    public void setCodigoserviciodado(Long codigoserviciodado) {
        this.codigoserviciodado = codigoserviciodado;
    }

    public HabitacionEntity getHabitacionEntity() {
        return habitacionEntity;
    }

    public void setHabitacionEntity(HabitacionEntity habitacionEntity) {
        this.habitacionEntity = habitacionEntity;
    }

    public DarServicioEntity getDarServicioEntity() {
        return darServicioEntity;
    }

    public void setDarServicioEntity(DarServicioEntity darServicioEntity) {
        this.darServicioEntity = darServicioEntity;
    }

    public long getCod_dar_servicio() {
        return cod_dar_servicio;
    }

    public void setCod_dar_servicio(long cod_dar_servicio) {
        this.cod_dar_servicio = cod_dar_servicio;
    }
    
    
}
