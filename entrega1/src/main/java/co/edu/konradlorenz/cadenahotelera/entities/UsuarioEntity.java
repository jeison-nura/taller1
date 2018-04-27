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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author jeison
 */
@Entity
public class UsuarioEntity implements Serializable {

    /**
     * Atributo estático para el manejo de versiones de la entidad
     */
    private final static long serialVersionUID = 1L;

    /**
     * llave primaria del entity usuario variable que almacena el codigo del
     * usuario
     */
    @Id
    @Column(name = "cod_usuario", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codido_usuario;

    @ManyToOne
    @JoinColumn(name = "cod_t_usuario")
    private TipoUsuarioEntity tipoUsuarioEntity;

    @ManyToOne
    @JoinColumn(name = "cod_ciudad")
    private CiudadEntity ciudadEntity;
    /**
     * variable que captura el nombre del usuario
     */
    @Column(name = "nom_usuario", nullable = false)
    private String nombre_usuario;

    /**
     * variable que captura el apellido del usuario
     */
    @Column(name = "ape_usuario", nullable = false)
    private String apellido_usuario;

    /**
     * variable que captura el tipo de usuario
     */
    @Column(name = "cod_t_usuario", nullable = false)
    private long codigo_tipo_usuario;

    /**
     * variable que captura el correo del usuario
     */
    @Column(name = "correo", nullable = false)
    private String correo;

    public long getCodigo_usuario() {
        return codido_usuario;
    }

    public void setCodigo_usuario(long codido_usuario) {
        this.codido_usuario = codido_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getApellido_usuario() {
        return apellido_usuario;
    }

    public void setApellido_usuario(String apellido_usuario) {
        this.apellido_usuario = apellido_usuario;
    }

    public long getCodigo_tipo_usuario() {
        return codigo_tipo_usuario;
    }

    public void setCodigo_tipo_usuario(long codigo_tipo_usuario) {
        this.codigo_tipo_usuario = codigo_tipo_usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public TipoUsuarioEntity getTipoUsuarioEntity() {
        return tipoUsuarioEntity;
    }

    public void setTipoUsuarioEntity(TipoUsuarioEntity tipoUsuarioEntity) {
        this.tipoUsuarioEntity = tipoUsuarioEntity;
    }

    public CiudadEntity getCiudadEntity() {
        return ciudadEntity;
    }

    public void setCiudadEntity(CiudadEntity ciudadEntity) {
        this.ciudadEntity = ciudadEntity;
    }

}
