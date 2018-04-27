/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konradlorenz.cadenahotelera.dto;

import co.edu.konradlorenz.cadenahotelera.entities.HabitacionEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CISCO
 */
public class HabitacionDTO {

    private Long id;
    private Long cod_hotel;
    private Long num_habitacion;
    private Long cod_estado;
    private Long cod_t_habitacion;

    public HabitacionDTO() {
    }

    public HabitacionDTO(HabitacionEntity habitacionEntity) {

        this.id = habitacionEntity.getCodigo_habitacion();
        this.cod_estado = habitacionEntity.getCodigo_estado();
        this.cod_hotel = habitacionEntity.getCodigo_hotel();
        this.cod_t_habitacion = habitacionEntity.getCodigo_tipo_habitacion();
        this.num_habitacion = habitacionEntity.getNumero_habitacion();

    }

    public HabitacionEntity toEntity() {
        HabitacionEntity habitacionEntity = new HabitacionEntity();
        habitacionEntity.setCodigo_habitacion(id);
        habitacionEntity.setCodigo_hotel(cod_hotel);
        habitacionEntity.setNumero_habitacion(num_habitacion);
        habitacionEntity.setCodigo_estado(cod_estado);
        habitacionEntity.setCodigo_tipo_habitacion(cod_t_habitacion);
        return habitacionEntity;

    }

    public static List<HabitacionDTO> toHabitacionList(List<HabitacionEntity> habitacionList) {

        List<HabitacionDTO> listaHabitacionDTO = new ArrayList<>();

        for (int i = 0; i < habitacionList.size(); i++) {

            listaHabitacionDTO.add(new HabitacionDTO(habitacionList.get(i)));
        }

        return listaHabitacionDTO;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCod_hotel() {
        return cod_hotel;
    }

    public void setCod_hotel(Long cod_hotel) {
        this.cod_hotel = cod_hotel;
    }

    public Long getNum_habitacion() {
        return num_habitacion;
    }

    public void setNum_habitacion(Long num_habitacion) {
        this.num_habitacion = num_habitacion;
    }

    public Long getCod_estado() {
        return cod_estado;
    }

    public void setCod_estado(Long cod_estado) {
        this.cod_estado = cod_estado;
    }

    public Long getCod_t_habitacion() {
        return cod_t_habitacion;
    }

    public void setCod_t_habitacion(Long cod_t_habitacion) {
        this.cod_t_habitacion = cod_t_habitacion;
    }

}
