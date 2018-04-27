/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konradlorenz.edu.co.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author jeison
 */
@Entity
public class ReservaEntity implements Serializable {

    /**
     * Atributo estático para el manejo de versiones de la entidad
     */
    private final static long serialVersionUID = 1L;

    /**
     * llave primaria de la entidad ReservaEntity
     */
    @Id
    @Column(name = "cod_reserva", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo_reserva;

    @ManyToOne
    @JoinColumn(name = "cod_usuario")
    private UsuarioEntity usuarioEntity;

    @ManyToOne
    @JoinColumn(name = "cod_ciudad")
    private CiudadEntity ciudadEntity;

    @ManyToOne
    @JoinColumn(name = "cod_hotel")
    private HotelEntity hotelEntity;

    @ManyToOne
    @JoinColumn(name = "cod_habitacion")
    private HabitacionEntity habitacionEntity;

    @ManyToOne
    @JoinColumn(name = "cod_f_pago")
    private MetodoPagoEntity metodoPagoEntity;

    /**
     * variable con el codigo del habitacion
     */
    @Column(name = "cod_habitacion", nullable = false)
    private long codigo_habitacion;

    /**
     * variable con el codigo de forma de pago
     */
    @Column(name = "cod_f_pago", nullable = false)
    private long forma_de_pago;

    /**
     * variable fecha de entrada del usuario
     */
    @Column(name = "f_entrada", nullable = false)
    private String fecha_entrada;

    /**
     * variable con la fecha salida del usuario
     */
    @Column(name = "f_salida", nullable = false)
    private String fecha_salida;

    public long getCodigo_reserva() {
        return codigo_reserva;
    }

    public void setCodigo_reserva(long codigo_reserva) {
        this.codigo_reserva = codigo_reserva;
    }

    public long getCodigo_habitacion() {
        return codigo_habitacion;
    }

    public void setCodigo_habitacion(long codigo_habitacion) {
        this.codigo_habitacion = codigo_habitacion;
    }

    public long getForma_de_pago() {
        return forma_de_pago;
    }

    public void setForma_de_pago(long forma_de_pago) {
        this.forma_de_pago = forma_de_pago;
    }

    public String getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(String fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public UsuarioEntity getUsuarioEntity() {
        return usuarioEntity;
    }

    public void setUsuarioEntity(UsuarioEntity usuarioEntity) {
        this.usuarioEntity = usuarioEntity;
    }

    public CiudadEntity getCiudadEntity() {
        return ciudadEntity;
    }

    public void setCiudadEntity(CiudadEntity ciudadEntity) {
        this.ciudadEntity = ciudadEntity;
    }

    public HotelEntity getHotelEntity() {
        return hotelEntity;
    }

    public void setHotelEntity(HotelEntity hotelEntity) {
        this.hotelEntity = hotelEntity;
    }

    public HabitacionEntity getHabitacionEntity() {
        return habitacionEntity;
    }

    public void setHabitacionEntity(HabitacionEntity habitacionEntity) {
        this.habitacionEntity = habitacionEntity;
    }

    public MetodoPagoEntity getMetodoPagoEntity() {
        return metodoPagoEntity;
    }

    public void setMetodoPagoEntity(MetodoPagoEntity metodoPagoEntity) {
        this.metodoPagoEntity = metodoPagoEntity;
    }

}
