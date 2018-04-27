/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konradlorenz.cadenahotelera.dto;

import co.edu.konradlorenz.cadenahotelera.entities.TipoHabitacionEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeison
 */
public class TipoHabitacionDTO {

    private Long id;

    private String nombre_t_habitacion;

    private double precio;

    /**
     * Constructor por defecto
     */
    public TipoHabitacionDTO() {
    }

    /**
     * Constructor manejando como parametro la entidad para realizar la
     * conversión
     *
     * @param tipoHabitacionEntity
     * @param curso - entidad
     */
    public TipoHabitacionDTO(TipoHabitacionEntity tipoHabitacionEntity) {
        this.id = tipoHabitacionEntity.getCodigo_tipo_habitacion();
        this.nombre_t_habitacion = tipoHabitacionEntity.getNombre_tipo_habitacion();
        this.precio = tipoHabitacionEntity.getPrecio_tipo_habitacion();

    }

    /**
     * Metodo que realiza la conversión de objeto a entidad
     *
     * @return entidad
     */
    public TipoHabitacionEntity toEntity() {
        TipoHabitacionEntity tipoHabitacionEntity = new TipoHabitacionEntity();
        tipoHabitacionEntity.setCodigo_tipo_habitacion(this.id);
        tipoHabitacionEntity.setNombre_tipo_habitacion(this.nombre_t_habitacion);
        tipoHabitacionEntity.setPrecio_tipo_habitacion(this.precio);
        return tipoHabitacionEntity;
    }

    public static List<TipoHabitacionDTO> toTipoHabitacionList(List<TipoHabitacionEntity> tipoHabitacionList) {

        List<TipoHabitacionDTO> listaTipoHabitacionDTO = new ArrayList<>();

        for (int i = 0; i < tipoHabitacionList.size(); i++) {
            listaTipoHabitacionDTO.add(new TipoHabitacionDTO(tipoHabitacionList.get(i)));

        }
        return listaTipoHabitacionDTO;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_t_habitacion() {
        return nombre_t_habitacion;
    }

    public void setNombre_t_habitacion(String nombre_t_habitacion) {
        this.nombre_t_habitacion = nombre_t_habitacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
