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
 * Clase que modela la entidad Usuario
 *
 * @author Bryan
 */
@Entity(name = "USUARIO")
public class EntidadUsuario implements Serializable {

    //Atributo estático que administra las versiones de la entidad.
    private static final long serialVersionUID = 1L;

    //Atributo que almacena la llave primaria de la entidad.
    @Id
    @Column(name = "codigo_usuario", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigoUsuario;

    //Atributo que guarda el nombre del usuario.
    @Column(name = "nombre_usuario", nullable = false)
    private String nombreUsuario;

    //Atributo que guarda el apellido del usuario.
    @Column(name = "apellido_usuario", nullable = false)
    private String apellidoUsuario;

    //Atributo que guarda el número de cédula del usuario.
    @Column(name = "cedula_usuario", nullable = false)
    private int cedulaUsuario;

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public int getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setCedulaUsuario(int cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

}
