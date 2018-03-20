/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.cadenahotelera.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Clase que modela la entidad Tipo_Usuario
 *
 * @author Bryan
 */
@Entity(name = "TIPO_USUARIO")
public class EntidadTipoUsuario implements Serializable {

    //Atributo estático manejador de las versiones de la tabla.
    private static final long serialVersionUID = 1L;

    //Variable que almacena la llave primaria de la entidad tipo_usuario
    @Id
    @Column(name = "codigo_tipo_usuario", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo_tipo_usuario;

    //Variable que aloja el nombre del tipo de usuario
    @Column(name = "nombre_tipo_usuario", nullable = false)
    private String nombreTipoUsuario;

    public int getCodigo_tipo_usuario() {
        return codigo_tipo_usuario;
    }

    public void setCodigo_tipo_usuario(int codigo_tipo_usuario) {
        this.codigo_tipo_usuario = codigo_tipo_usuario;
    }

    public String getNombreTipoUsuario() {
        return nombreTipoUsuario;
    }

    public void setNombreTipoUsuario(String nombreTipoUsuario) {
        this.nombreTipoUsuario = nombreTipoUsuario;
    }

}
