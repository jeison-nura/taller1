/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konradlorenz.edu.co.dto;

import co.konradlorenz.edu.co.entities.TipoHabitacionEntity;
import co.konradlorenz.edu.co.entities.TipoUsuarioEntity;
import co.konradlorenz.edu.co.entities.UsuarioEntity;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.List;

/**
 *
 * @author jeison
 */
public class TiposUsuarioDto {
    private Long cod_t_usuario;
    
    private String nombre_t_Usuario;    


    /**
     * Constructor por defecto
     */
    public TiposUsuarioDto() {
    }
    
    /**
     * Constructor manejando como parametro la entidad para realizar la conversión
     * @param curso - entidad
     */
    public TiposUsuarioDto(TipoUsuarioEntity tusuario){
        this.cod_t_usuario = tusuario.getCodigo_tipo_usuario();
        this.nombre_t_Usuario = tusuario.getNombre_tipo_usuario();
       
    }
    
    /**
     * Metodo que realiza la conversión de objeto a entidad
     * @return entidad
     */
    public TipoUsuarioEntity toEntity(){
        TipoUsuarioEntity tusuario = new TipoUsuarioEntity();
        tusuario.setCodido_tipo_usuario(this.cod_t_usuario);
        tusuario.setNombre_tipo_usuario(this.nombre_t_Usuario);
        return tusuario;
    }
    
    public List<TiposUsuarioDto> totusuList(List<TipoUsuarioEntity> tusuList){
        List<TiposUsuarioDto> listatusuDTO = new VirtualFlow.ArrayLinkedList<>();
        for (int i = 0; i < tusuList.size(); i++) {            
            listatusuDTO.add(new TiposUsuarioDto(tusuList.get(i)));
        }
        return listatusuDTO;        
    }

    public Long getCod_t_usuario() {
        return cod_t_usuario;
    }

    public void setCod_t_usuario(Long cod_t_usuario) {
        this.cod_t_usuario = cod_t_usuario;
    }

    public String getNombre_t_Usuario() {
        return nombre_t_Usuario;
    }

    public void setNombre_t_Usuario(String nombre_t_Usuario) {
        this.nombre_t_Usuario = nombre_t_Usuario;
    }
    
}
