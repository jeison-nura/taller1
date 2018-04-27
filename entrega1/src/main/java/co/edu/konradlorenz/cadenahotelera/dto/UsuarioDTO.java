/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konradlorenz.cadenahotelera.dto;

import co.edu.konradlorenz.cadenahotelera.entities.UsuarioEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeison
 */
public class UsuarioDTO {

    private Long id;

    private String nombreUsuario;

    private String ApellidoUsuario;

    private Long cod_t_usuario;

    private String correo;

    /**
     * Constructor por defecto
     */
    public UsuarioDTO() {
    }

    /**
     * Constructor manejando como parametro la entidad para realizar la
     * conversión
     *
     * @param curso - entidad
     */
    public UsuarioDTO(UsuarioEntity usuarioEntity) {
        this.id = usuarioEntity.getCodigo_usuario();
        this.nombreUsuario = usuarioEntity.getNombre_usuario();
        this.ApellidoUsuario = usuarioEntity.getApellido_usuario();
        this.cod_t_usuario = usuarioEntity.getCodigo_tipo_usuario();
        this.correo = usuarioEntity.getCorreo();
    }

    /**
     * Metodo que realiza la conversión de objeto a entidad
     *
     * @return entidad
     */
    public UsuarioEntity toEntity() {
        UsuarioEntity usuarioEntity = new UsuarioEntity();
        usuarioEntity.setCodigo_usuario(this.id);
        usuarioEntity.setNombre_usuario(this.nombreUsuario);
        usuarioEntity.setApellido_usuario(this.ApellidoUsuario);
        usuarioEntity.setCodigo_tipo_usuario(this.cod_t_usuario);
        usuarioEntity.setCorreo(this.correo);
        return usuarioEntity;
    }

    public static List<UsuarioDTO> toUsuarioList(List<UsuarioEntity> usuarioEntitys) {
        List<UsuarioDTO> usuarioDTOs = new ArrayList<>();
        for (int i = 0; i < usuarioEntitys.size(); i++) {
            usuarioDTOs.add(new UsuarioDTO(usuarioEntitys.get(i)));

        }

        return usuarioDTOs;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return ApellidoUsuario;
    }

    public void setApellidoUsuario(String ApellidoUsuario) {
        this.ApellidoUsuario = ApellidoUsuario;
    }

    public Long getCod_t_usuario() {
        return cod_t_usuario;
    }

    public void setCod_t_usuario(Long cod_t_usuario) {
        this.cod_t_usuario = cod_t_usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
