/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konradlorenz.edu.co.dto;

import co.konradlorenz.edu.co.entities.ServicioEntity;
import co.konradlorenz.edu.co.entities.TipoHabitacionEntity;
import co.konradlorenz.edu.co.entities.TipoUsuarioEntity;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.List;

/**
 *
 * @author jeison
 */
public class serviciodto {
    private Long cod_servicio;
    
    private String nombre_servicio;

    private Long precio;


    /**
     * Constructor por defecto
     */
    public serviciodto() {
    }
    
    /**
     * Constructor manejando como parametro la entidad para realizar la conversión
     * @param curso - entidad
     */
    public serviciodto(ServicioEntity servicio){
        this.cod_servicio = servicio.getCodigo_servicio();
        this.nombre_servicio =  servicio.getNombre_servicio();
        this.precio = servicio.getCosto();
       
    }
    
    /**
     * Metodo que realiza la conversión de objeto a entidad
     * @return entidad
     */
    public ServicioEntity toEntity(){
        ServicioEntity servicio = new ServicioEntity();
        servicio.setCodigo_servicio(this.cod_servicio);
        servicio.setNombre_servicio(this.nombre_servicio);
        servicio.setCosto(this.precio);
        return servicio;
    }
    
    public List<serviciodto> toservList(List<ServicioEntity> servList){
        List<serviciodto> listaservDTO = new VirtualFlow.ArrayLinkedList<>();
        for (int i = 0; i < servList.size(); i++) {            
            listaservDTO.add(new serviciodto(servList.get(i)));
        }
        return listaservDTO;        
    }

    public Long getCod_servicio() {
        return cod_servicio;
    }

    public void setCod_servicio(Long cod_servicio) {
        this.cod_servicio = cod_servicio;
    }

    public String getNombre_servicio() {
        return nombre_servicio;
    }

    public void setNombre_servicio(String nombre_servicio) {
        this.nombre_servicio = nombre_servicio;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }
    
    
}
