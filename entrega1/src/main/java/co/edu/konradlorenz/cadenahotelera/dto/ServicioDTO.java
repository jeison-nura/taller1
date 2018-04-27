/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konradlorenz.cadenahotelera.dto;

import co.edu.konradlorenz.cadenahotelera.entities.ServicioEntity;
import co.edu.konradlorenz.cadenahotelera.entities.TipoHabitacionEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeison
 */
public class ServicioDTO {

    private Long id;

    private String nombre_servicio;

    private Long precio;

    /**
     * Constructor por defecto
     */
    public ServicioDTO() {
    }

    /**
     * Constructor manejando como parametro la entidad para realizar la
     * conversión
     *
     * @param servicioEntity
     * @param curso - entidad
     */
    public ServicioDTO(ServicioEntity servicioEntity) {
        this.id = servicioEntity.getCodigo_servicio();
        this.nombre_servicio = servicioEntity.getNombre_servicio();
        this.precio = servicioEntity.getCosto();

    }

    /**
     * Metodo que realiza la conversión de objeto a entidad
     *
     * @return entidad
     */
    public ServicioEntity toEntity() {
        ServicioEntity servicioEntity = new ServicioEntity();
        servicioEntity.setCodigo_servicio(this.id);
        servicioEntity.setNombre_servicio(this.nombre_servicio);
        servicioEntity.setCosto(this.precio);
        return servicioEntity;
    }

    public static List<ServicioDTO> toServicioList(List<ServicioEntity> servicioEntitys) {

        List<ServicioDTO> servicioDTOs = new ArrayList<>();
        for (int i = 0; i < servicioEntitys.size(); i++) {
            servicioDTOs.add(new ServicioDTO(servicioEntitys.get(i)));
        }
        return servicioDTOs;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
