/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konradlorenz.edu.co.entities;

import java.io.Serializable;
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
public class UsuarioCiudadEntity implements Serializable{
    
    private final static long serialVersionUID=1L;
    
    @Id 
    @Column(name="codigoCiudad", unique=true, nullable=false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long codigoCiudad;
    
    @ManyToOne
    @JoinColumn(name="cod_ciudad")
    private UsuarioEntity usuarioEntity;
    
    @ManyToOne
    @JoinColumn(name="cod_ciudad")
    private CiudadEntity ciudadEntity;
    
    @Column
    private String nom_ciudad;

    public Long getCodigoCiudad() {
        return codigoCiudad;
    }

    public void setCodigoCiudad(Long codigoCiudad) {
        this.codigoCiudad = codigoCiudad;
    }

    public UsuarioEntity getUsuarioEntity() {
        return usuarioEntity;
    }

    public void setUsuarioEntity(UsuarioEntity usuarioEntity) {
        this.usuarioEntity = usuarioEntity;
    }

    public CiudadEntity getCiudadEntity() {
        return ciudadEntity;
    }

    public void setCiudadEntity(CiudadEntity ciudadEntity) {
        this.ciudadEntity = ciudadEntity;
    }

    public String getNom_ciudad() {
        return nom_ciudad;
    }

    public void setNom_ciudad(String nom_ciudad) {
        this.nom_ciudad = nom_ciudad;
    }
    
    
}
