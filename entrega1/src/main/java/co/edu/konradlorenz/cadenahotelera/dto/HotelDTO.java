/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konradlorenz.cadenahotelera.dto;

import co.edu.konradlorenz.cadenahotelera.entities.HabitacionEntity;
import co.edu.konradlorenz.cadenahotelera.entities.HotelEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CISCO
 */
public class HotelDTO {

    private Long id;
    private String nom_hotel;
    private long num_habitaciones;
    private Long cod_ciudad;
    private long val_estrellas;

    public HotelDTO() {
    }

    public HotelDTO(HotelEntity hotelEntity) {
        this.id = hotelEntity.getCodigo_hotel();
        this.cod_ciudad = hotelEntity.getCodigo_ciudad();
        this.nom_hotel = hotelEntity.getNombre_hotel();
        this.num_habitaciones = hotelEntity.getNumero_habitaciones();
        this.val_estrellas = hotelEntity.getValoracion_hotel();

    }

    public HotelEntity toEntity() {
        HotelEntity hotelEntity = new HotelEntity();
        hotelEntity.setCodigo_ciudad(cod_ciudad);
        hotelEntity.setCodigo_hotel(id);
        hotelEntity.setNombre_hotel(nom_hotel);
        hotelEntity.setNumero_habitaciones(num_habitaciones);
        hotelEntity.setValoracion_hotel(val_estrellas);
        return hotelEntity;

    }

    public static List<HotelDTO> toHotelList(List<HotelEntity> hotelList) {

        List<HotelDTO> listaHotelDTO = new ArrayList<>();

        for (int i = 0; i < hotelList.size(); i++) {

            listaHotelDTO.add(new HotelDTO(hotelList.get(i)));

        }
        return listaHotelDTO;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom_hotel() {
        return nom_hotel;
    }

    public void setNom_hotel(String nom_hotel) {
        this.nom_hotel = nom_hotel;
    }

    public long getNum_habitaciones() {
        return num_habitaciones;
    }

    public void setNum_habitaciones(long num_habitaciones) {
        this.num_habitaciones = num_habitaciones;
    }

    public Long getCod_ciudad() {
        return cod_ciudad;
    }

    public void setCod_ciudad(Long cod_ciudad) {
        this.cod_ciudad = cod_ciudad;
    }

    public long getVal_estrellas() {
        return val_estrellas;
    }

    public void setVal_estrellas(long val_estrellas) {
        this.val_estrellas = val_estrellas;
    }

}
