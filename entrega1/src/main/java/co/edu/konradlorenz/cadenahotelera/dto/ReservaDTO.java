/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konradlorenz.cadenahotelera.dto;

import co.edu.konradlorenz.cadenahotelera.entities.ReservaEntity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author CISCO
 */
public class ReservaDTO {

    private Long id;
    private Long cod_usuario;
    private Long cod_ciudad;
    private Long cod_hotel;
    private Long cod_habitacion;
    private Long cod_f_pago;
    private Date f_entrada;
    private Date f_salida;

    public ReservaDTO() {
    }

    public ReservaDTO(ReservaEntity reservaEntity) {
        this.id = reservaEntity.getCodigo_reserva();
        this.cod_usuario = reservaEntity.getUsuarioEntity().getCodigo_usuario();
        this.cod_ciudad = reservaEntity.getCiudadEntity().getCodigo_ciudad();
        this.cod_hotel = reservaEntity.getHotelEntity().getCodigo_hotel();
        this.cod_habitacion = reservaEntity.getHabitacionEntity().getCodigo_habitacion();
        this.cod_f_pago = reservaEntity.getMetodoPagoEntity().getCodigo_forma_pago();
        this.f_entrada = reservaEntity.getFecha_entrada();
        this.f_salida = reservaEntity.getFecha_salida();

    }

    public ReservaEntity toEntity() {
        ReservaEntity reservaEntity = new ReservaEntity();
        reservaEntity.setCodigo_reserva(id);
        reservaEntity.getUsuarioEntity().setCodigo_usuario(cod_usuario);
        reservaEntity.getCiudadEntity().setCodigo_ciudad(cod_ciudad);
        reservaEntity.getHotelEntity().setCodigo_hotel(cod_hotel);
        reservaEntity.getHabitacionEntity().setCodigo_habitacion(cod_habitacion);
        reservaEntity.getMetodoPagoEntity().setCodigo_forma_pago(cod_f_pago);
        reservaEntity.setFecha_entrada(f_entrada);
        reservaEntity.setFecha_salida(f_salida);
        return reservaEntity;
    }

    public static List<ReservaDTO> toReservaList(List<ReservaEntity> reservaEntitys) {
        List<ReservaDTO> reservaDTOs = new ArrayList<>();
        for (int i = 0; i < reservaEntitys.size(); i++) {
            reservaDTOs.add(new ReservaDTO(reservaEntitys.get(i)));
        }
        return reservaDTOs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(Long cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public Long getCod_ciudad() {
        return cod_ciudad;
    }

    public void setCod_ciudad(Long cod_ciudad) {
        this.cod_ciudad = cod_ciudad;
    }

    public Long getCod_hotel() {
        return cod_hotel;
    }

    public void setCod_hotel(Long cod_hotel) {
        this.cod_hotel = cod_hotel;
    }

    public Long getCod_habitacion() {
        return cod_habitacion;
    }

    public void setCod_habitacion(Long cod_habitacion) {
        this.cod_habitacion = cod_habitacion;
    }

    public Long getCod_f_pago() {
        return cod_f_pago;
    }

    public void setCod_f_pago(Long cod_f_pago) {
        this.cod_f_pago = cod_f_pago;
    }

    public Date getF_entrada() {
        return f_entrada;
    }

    public void setF_entrada(Date f_entrada) {
        this.f_entrada = f_entrada;
    }

    public Date getF_salida() {
        return f_salida;
    }

    public void setF_salida(Date f_salida) {
        this.f_salida = f_salida;
    }

}
