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
import javax.persistence.OneToMany;

/**
 *
 * @author jeison
 */
@Entity
public class t_usuario_UsuarioEntity implements Serializable{
     private final static long serialVersionUID=1L;
    
    /**
     * Atributo que maneja el id de la tabla
     */
    @Id 
    @Column(name="cod_t_usuario", unique=true, nullable=false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long cod_t_usuario;
    
    /**
     * Atributo que maneja la relacion con la tabla Usuario
     * 
     */
    @ManyToOne
    @JoinColumn(name="cod_usuario")
    private UsuarioEntity usuarioEntity;
          
    @ManyToOne
    @JoinColumn
    private TipoUsuarioEntity t_usuario;
    
    @Column
    private String nom_t_usuario;

    public Long getCod_t_usuario() {
        return cod_t_usuario;
    }

    public void setCod_t_usuario(Long cod_t_usuario) {
        this.cod_t_usuario = cod_t_usuario;
    }

    public UsuarioEntity getUsuarioEntity() {
        return usuarioEntity;
    }

    public void setUsuarioEntity(UsuarioEntity usuarioEntity) {
        this.usuarioEntity = usuarioEntity;
    }

    public TipoUsuarioEntity getT_usuario() {
        return t_usuario;
    }

    public void setT_usuario(TipoUsuarioEntity t_usuario) {
        this.t_usuario = t_usuario;
    }

    public String getNom_t_usuario() {
        return nom_t_usuario;
    }

    public void setNom_t_usuario(String nom_t_usuario) {
        this.nom_t_usuario = nom_t_usuario;
    }
    
    
}
