/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konradlorenz.edu.co.dto;

import co.konradlorenz.edu.co.entities.TipoUsuarioEntity;
import co.konradlorenz.edu.co.entities.UsuarioEntity;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.List;

/**
 *
 * @author jeison
 */
public class Usuariodto {
    private Long cod_usuario;
    
    private String nombreUsuario;
    
    private String ApellidoUsuario;
    
    private Long cod_t_usuario;
    
    private String correo;

    /**
     * Constructor por defecto
     */
    public Usuariodto() {
    }
    
    /**
     * Constructor manejando como parametro la entidad para realizar la conversión
     * @param curso - entidad
     */
    public Usuariodto(UsuarioEntity usuario){
        this.cod_usuario = usuario.getCodido_usuario();
        this.nombreUsuario = usuario.getNombre_usuario();
        this.ApellidoUsuario = usuario.getApellido_usuario();
        this.cod_t_usuario = usuario.getCodigo_tipo_usuario();
        this.correo = usuario.getCorreo();
    }
    
    /**
     * Metodo que realiza la conversión de objeto a entidad
     * @return entidad
     */
    public UsuarioEntity toEntity(){
        UsuarioEntity usuario = new UsuarioEntity();
        usuario.setCodido_usuario(this.cod_usuario);
        usuario.setNombre_usuario(this.nombreUsuario);
        usuario.setApellido_usuario(this.ApellidoUsuario);
        usuario.setCodigo_tipo_usuario(this.cod_t_usuario);
        usuario.setCorreo(this.correo);
        return usuario;
    }
    
    public List<Usuariodto> tousuList(List<UsuarioEntity> usuList){
        List<Usuariodto> listausuDTO = new VirtualFlow.ArrayLinkedList<>();
        for (int i = 0; i < usuList.size(); i++) {            
            listausuDTO.add(new Usuariodto(usuList.get(i)));
        }
        return listausuDTO;        
    }

    public Long getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(Long cod_usuario) {
        this.cod_usuario = cod_usuario;
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
