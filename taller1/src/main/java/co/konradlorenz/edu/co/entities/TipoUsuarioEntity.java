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

/**
 *
 * @author jeison
 */
@Entity
public class TipoUsuarioEntity implements Serializable{
    
    
    /**
     * Atributo estático para el manejo de versiones de la entidad
     */
    private final static long serialVersionUID= 1L;
    
    /**
     * llave primaria de la entidad tipo de usuario
     */
    @Id
    @Column(name = "cod_t_usuario", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cod_t_usuario;
    
    /**
     * variable que almacena el nombre del tipo de usuario
     */
    @Column(name = "nom_t_usuario", nullable = false)
    private String nombre_t_usuario;

    public long getCod_t_usuario() {
        return cod_t_usuario;
    }

    public void setCod_t_usuario(long cod_t_usuario) {
        this.cod_t_usuario = cod_t_usuario;
    }

    public String getNombre_t_usuario() {
        return nombre_t_usuario;
    }

    public void setNombre_t_usuario(String nombre_t_usuario) {
        this.nombre_t_usuario = nombre_t_usuario;
    }
    
    
}
