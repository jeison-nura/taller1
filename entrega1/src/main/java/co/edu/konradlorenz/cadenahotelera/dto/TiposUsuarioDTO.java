/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konradlorenz.cadenahotelera.dto;

import co.edu.konradlorenz.cadenahotelera.entities.TipoUsuarioEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeison
 */
public class TiposUsuarioDTO {

    private Long id;

    private String nombre_t_Usuario;

    /**
     * Constructor por defecto
     */
    public TiposUsuarioDTO() {
    }

    /**
     * Constructor manejando como parametro la entidad para realizar la
     * conversión
     *
     * @param tipoUsuarioEntity
     * @param curso - entidad
     */
    public TiposUsuarioDTO(TipoUsuarioEntity tipoUsuarioEntity) {
        this.id = tipoUsuarioEntity.getCodigo_tipo_usuario();
        this.nombre_t_Usuario = tipoUsuarioEntity.getNombre_tipo_usuario();

    }

    /**
     * Metodo que realiza la conversión de objeto a entidad
     *
     * @return entidad
     */
    public TipoUsuarioEntity toEntity() {
        TipoUsuarioEntity tipoUsuarioEntity = new TipoUsuarioEntity();
        tipoUsuarioEntity.setCodido_tipo_usuario(this.id);
        tipoUsuarioEntity.setNombre_tipo_usuario(this.nombre_t_Usuario);
        return tipoUsuarioEntity;
    }

    public static List<TiposUsuarioDTO> toTipoUsuarioList(List<TipoUsuarioEntity> tipoUsuarioEntitys) {
        List<TiposUsuarioDTO> tiposUsuarioDTOs = new ArrayList<>();

        for (int i = 0; i < tipoUsuarioEntitys.size(); i++) {

            tiposUsuarioDTOs.add(new TiposUsuarioDTO(tipoUsuarioEntitys.get(i)));

        }
        return tiposUsuarioDTOs;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_t_Usuario() {
        return nombre_t_Usuario;
    }

    public void setNombre_t_Usuario(String nombre_t_Usuario) {
        this.nombre_t_Usuario = nombre_t_Usuario;
    }

}
