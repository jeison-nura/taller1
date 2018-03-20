/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.cadenahotelera.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Clase que modela la entidad Reserva
 *
 * @author Bryan
 */
@Entity(name = "RESERVA")
public class EntidadReserva implements Serializable {

    //Atributo estático manejador de las versiones de la entidad.
    private static final long serialVersionUID = 1L;

    //Llave primaria de la entidad Reserva
    @Id
    @Column(name = "codigo_reserva", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigoReserva;

    //Variable que almacena el código del usuario
    @Column(name = "codigo_usuario", nullable = false)
    private int codigoUsuario;

    //Variable que almacena el código de la ciudad
    @Column(name = "codigo_ciudad", nullable = false)
    private int codigoCiudad;

    //Variable que almacena el código del hotel
    @Column(name = "codigo_hotel", nullable = false)
    private int codigoHotel;

    //Variable que almacena el código de la habitacion
    @Column(name = "codigo_habitacion", nullable = false)
    private int codigoHabitacion;

    //Variable que almacena el código del metodo de pago
    @Column(name = "codigo_metodo_pago", nullable = false)
    private int codigoMetodoPago;

    //Variable que almacena la fecha de entrada
    @Column(name = "fecha_entrada", nullable = false)
    private LocalDateTime fechaEntrada;

    //Variable que almacena la fecha de salida
    @Column(name = "fecha_salida", nullable = false)
    private LocalDateTime fechaSalida;

    public int getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(int codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public int getCodigoCiudad() {
        return codigoCiudad;
    }

    public void setCodigoCiudad(int codigoCiudad) {
        this.codigoCiudad = codigoCiudad;
    }

    public int getCodigoHotel() {
        return codigoHotel;
    }

    public void setCodigoHotel(int codigoHotel) {
        this.codigoHotel = codigoHotel;
    }

    public int getCodigoHabitacion() {
        return codigoHabitacion;
    }

    public void setCodigoHabitacion(int codigoHabitacion) {
        this.codigoHabitacion = codigoHabitacion;
    }

    public int getCodigoMetodoPago() {
        return codigoMetodoPago;
    }

    public void setCodigoMetodoPago(int codigoMetodoPago) {
        this.codigoMetodoPago = codigoMetodoPago;
    }

    public LocalDateTime getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDateTime fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

}
