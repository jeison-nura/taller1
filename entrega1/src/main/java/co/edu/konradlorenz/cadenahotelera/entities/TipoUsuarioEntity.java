/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konradlorenz.cadenahotelera.entities;

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
public class TipoUsuarioEntity implements Serializable {

    /**
     * Atributo estático para el manejo de versiones de la entidad
     */
    private final static long serialVersionUID = 1L;

    /**
     * llave primaria de la entidad tipo de usuario
     */
    @Id
    @Column(name = "cod_t_usuario", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo_tipo_usuario;

    /**
     * variable que almacena el nombre del tipo de usuario
     */
    @Column(name = "nom_t_usuario", nullable = false)
    private String nombre_tipo_usuario;

    public long getCodigo_tipo_usuario() {
        return codigo_tipo_usuario;
    }

    public void setCodido_tipo_usuario(long codido_tipo_usuario) {
        this.codigo_tipo_usuario = codido_tipo_usuario;
    }

    public String getNombre_tipo_usuario() {
        return nombre_tipo_usuario;
    }

    public void setNombre_tipo_usuario(String nombre_tipo_usuario) {
        this.nombre_tipo_usuario = nombre_tipo_usuario;
    }

}
