/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konradlorenz.edu.co.dto;

import co.konradlorenz.edu.co.entities.TipoHabitacionEntity;
import co.konradlorenz.edu.co.entities.TipoUsuarioEntity;

/**
 *
 * @author jeison
 */
public class TipoHabitacionDto {
    private Long cod_t_habitacion;
    
    private String nombre_t_habitacion;

    private double precio;


    /**
     * Constructor por defecto
     */
    public TipoHabitacionDto() {
    }
    
    /**
     * Constructor manejando como parametro la entidad para realizar la conversión
     * @param curso - entidad
     */
    public TipoHabitacionDto(TipoHabitacionEntity thabitacion){
        this.cod_t_habitacion = thabitacion.getCodigo_tipo_habitacion();
        this.nombre_t_habitacion = thabitacion.getNombre_tipo_habitacion();
        this.precio = thabitacion.getPrecio_tipo_habitacion();
       
    }
    
    /**
     * Metodo que realiza la conversión de objeto a entidad
     * @return entidad
     */
    public TipoHabitacionEntity toEntity(){
        TipoHabitacionEntity thabitacion = new TipoHabitacionEntity();
        thabitacion.setCodigo_tipo_habitacion(this.cod_t_habitacion);
        thabitacion.setNombre_tipo_habitacion(this.nombre_t_habitacion);
        thabitacion.setPrecio_tipo_habitacion(this.precio);
        return thabitacion;
    }
}
