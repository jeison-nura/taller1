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
public class reservaUsuarioEntity {
    @Id 
    @Column(name="codigoreservausuario", unique=true, nullable=false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long codigoreservausuario;
    
    @ManyToOne
    @JoinColumn(name="cod_usuario")
    private UsuarioEntity usuarioentity;
    
    @ManyToOne
    @JoinColumn(name="cod_usuario")
    private ReservaEntity reservaentity;

    public Long getCodigoreservausuario() {
        return codigoreservausuario;
    }

    public void setCodigoreservausuario(Long codigoreservausuario) {
        this.codigoreservausuario = codigoreservausuario;
    }

    public UsuarioEntity getUsuarioentity() {
        return usuarioentity;
    }

    public void setUsuarioentity(UsuarioEntity usuarioentity) {
        this.usuarioentity = usuarioentity;
    }

    public ReservaEntity getReservaentity() {
        return reservaentity;
    }

    public void setReservaentity(ReservaEntity reservaentity) {
        this.reservaentity = reservaentity;
    }
    
    
}
